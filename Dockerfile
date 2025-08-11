# ===== Stage 1: Build the JAR =====
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app

# Copy pom.xml first to cache dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the project and build
COPY src ./src
RUN mvn clean package -DskipTests

# ===== Stage 2: Run the JAR =====
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the jar without hardcoding the filename
COPY --from=builder /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
