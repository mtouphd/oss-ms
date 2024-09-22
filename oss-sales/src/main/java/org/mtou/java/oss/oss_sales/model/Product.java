package org.mtou.java.oss.oss_sales.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "product_tb")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Double price;
    private String description;

    @Column(nullable = false)
    private Integer stockQuantity;


}