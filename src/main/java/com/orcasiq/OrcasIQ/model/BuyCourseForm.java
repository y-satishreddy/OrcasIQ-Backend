package com.orcasiq.OrcasIQ.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BuyCourseForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobile_no;
    private String email;
    private String course;
    private String experience;
    private String message;
}
