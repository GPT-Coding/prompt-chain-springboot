package org.cgc.tw.mall.repository;

import org.cgc.tw.mall.domain.Good;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class GoodRepositoryTest {

    @Autowired
    private GoodRepository goodRepository;

    @Test
    public void testSaveAndGetAllGoods() {
        Good good1 = new Good();
        good1.setPicture("picture1");
        good1.setTitle("title1");
        good1.setDescription("description1");
        good1.setPrice(new BigDecimal("100.00"));

        Good good2 = new Good();
        good2.setPicture("picture2");
        good2.setTitle("title2");
        good2.setDescription("description2");
        good2.setPrice(new BigDecimal("200.00"));

        goodRepository.save(good1);
        goodRepository.save(good2);

        List<Good> goods = goodRepository.findAll();
        assertThat(goods).hasSize(2);
        assertThat(goods.get(0).getTitle()).isEqualTo(good1.getTitle());
        assertThat(goods.get(1).getTitle()).isEqualTo(good2.getTitle());
    }
}
