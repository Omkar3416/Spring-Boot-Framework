package com.ambienttranslator.sqlrealationshiponemany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="Orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    @Id
    private Long orderId;

    private LocalDate datePurchased;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    OrderStatus orderStatus;
}
