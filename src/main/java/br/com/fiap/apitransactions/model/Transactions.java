package br.com.fiap.apitransactions.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Transactions {

    private double amount;
    private long timestamp;
    private Date creatAt;
}
