package com.orcasiq.OrcasIQ.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SubscribeForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
}
