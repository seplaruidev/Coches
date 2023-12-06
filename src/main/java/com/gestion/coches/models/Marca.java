package com.gestion.coches.models;

import jakarta.persistence.*;

@Entity
@Table(name="marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column
    private String marca;

    @Column
    private String modelo;


}
