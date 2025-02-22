package com.javatechie.saga.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;   jdk8 only support
//import javax.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBalance {
    @Id
    private int userId;
    private int price;
}
