package org.mtou.java.oss.oss_billing.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Setter
@Getter
@Entity
@Table(name = "payment_tb")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate paymentDate;

    private BigDecimal amountPaid;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    private String paymentMethod; // Mode de paiement (carte, virement, etc.)

}