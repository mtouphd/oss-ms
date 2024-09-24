package org.mtou.java.oss.oss_billing.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Setter
@Getter
@Entity
@Table(name = "invoice_tb")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate invoiceDate;

    private BigDecimal amount;

    private Long customerId; // Référence du client sans relation directe

    private Long orderId; // Référence de la commande dans le Sales Service
}
