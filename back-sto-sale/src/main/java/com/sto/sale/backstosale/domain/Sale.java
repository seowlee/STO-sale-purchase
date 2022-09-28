package com.sto.sale.backstosale.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "sale")
@Entity
public class Sale {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long sale_id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sale_goods_id")
    @JsonIgnore
    private Product product;

    @Id
    private Long sale_goods_id;
    //    private Long sale_goods_id;
    @ColumnDefault("0")
    private Integer sale_cnt;
    @ColumnDefault("0.0")
    private Double sale_rate;

    //    @Builder
//    public Sale(Long sale_id, Product product, Integer sale_cnt, Double sale_rate) {
//        this.sale_id = sale_id;
//        this.product = product;
//        this.sale_cnt = sale_cnt;
//        this.sale_rate = sale_rate;
//    }
    @Builder
    public Sale(Product product, Integer sale_cnt, Double sale_rate) {
        this.product = product;
        this.sale_cnt = sale_cnt;
        this.sale_rate = sale_rate;
    }
}
