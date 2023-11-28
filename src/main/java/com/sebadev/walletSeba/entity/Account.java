package com.sebadev.walletSeba.entity;

import com.sebadev.walletSeba.enums.Currency;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="currency", nullable = false)
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name="transaction_limit", nullable=false)
    private Double transactionLimit;

    @Column(name="balance", nullable = false)
    private Double balance;

    @Column(name="creation_date")
    private LocalDate creationDate;

    @Column(name="update_date")
    private LocalDate updateDate;

    @Column(name="delete_date")
    private LocalDate deleteDate;

    @Column(name="soft_delete")
    private Boolean softDelete;

    // Machear la relacion con la entidad User
    // private User user
}
