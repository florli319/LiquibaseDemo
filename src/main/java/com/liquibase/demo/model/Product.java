package com.example.demo.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;

    private String name;

    private Double stock;
}
