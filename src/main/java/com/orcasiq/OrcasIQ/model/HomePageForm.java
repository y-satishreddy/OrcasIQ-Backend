package com.orcasiq.OrcasIQ.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class HomePageForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mobileNo;
    private String email;
    private String message;
}
