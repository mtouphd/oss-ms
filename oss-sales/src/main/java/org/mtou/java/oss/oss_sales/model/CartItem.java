package org.mtou.java.oss.oss_sales.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table(name = "cart_item_tb")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    private Long productId; // Référence du produit dans l'inventaire

    @Column(nullable = false)
    private Integer quantity;

}