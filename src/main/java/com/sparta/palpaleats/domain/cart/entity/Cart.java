package com.sparta.palpaleats.domain.cart.entity;

import com.sparta.palpaleats.domain.menu.entity.Menu;
import com.sparta.palpaleats.domain.order.entity.Order;
import com.sparta.palpaleats.domain.store.entity.Store;
import com.sparta.palpaleats.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantity;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @JoinColumn(name = "store_id", nullable = false)
    Store store;

}
