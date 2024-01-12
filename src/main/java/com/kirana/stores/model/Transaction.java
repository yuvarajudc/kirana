package com.kirana.stores.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Document
@AllArgsConstructor
public class Transaction {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    private String type;
    private float amount;
    private LocalDateTime timeStamp;
    private String currency;
    private float amountToDollar;


}
