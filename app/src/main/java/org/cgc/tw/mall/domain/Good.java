package org.cgc.tw.mall.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String picture;
    private String title;
    private String description;
    private BigDecimal price;

    public Good(String title, String description, BigDecimal price,String picture) {
        this.picture = picture;
        this.title = title;
        this.description = description;
        this.price = price;
    }

}
