package br.com.fiap.apitransactions.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Statistics {
    private double sum;
    private double avg;
    private double max;
    private double min;
    private long count;

}
