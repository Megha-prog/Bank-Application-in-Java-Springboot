package com.javatechieguide.springboot_rest_api;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.Value;


@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountHolderName;
    private Double balance;



}
