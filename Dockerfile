# ===== Stage 1: Build the JAR =====
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app

# Copy pom.xml and download dependencies first (caches Maven layers)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the source code and build the jar
COPY src ./src
RUN mvn clean package -DskipTests

# ===== Stage 2: Run the JAR =====
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the jar from the build stage
COPY --from=builder /app/target/OrcasIQ-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
