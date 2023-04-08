package org.cgc.tw.mall.service;

import org.cgc.tw.mall.domain.Good;
import org.cgc.tw.mall.repository.GoodRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class GoodServiceTest {

    @MockBean
    private GoodRepository goodRepository;

    @Autowired
    private GoodService goodService;

    @Test
    public void testFindAllGoods() {
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

        List<Good> goods = new ArrayList<>();
        goods.add(good1);
        goods.add(good2);

        when(goodRepository.findAll()).thenReturn(goods);

        List<Good> allGoods = goodService.getAllGoods();

        assertThat(allGoods).hasSize(2);
        assertThat(allGoods).contains(good1, good2);
    }
}
