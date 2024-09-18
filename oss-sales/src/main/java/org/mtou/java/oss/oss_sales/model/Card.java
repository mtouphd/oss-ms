package org.mtou.java.oss.oss_sales.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Product> products;

    private Double totalAmount;

    // Getters and Setters
}