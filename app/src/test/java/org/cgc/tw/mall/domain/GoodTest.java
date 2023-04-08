package org.cgc.tw.mall.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class GoodTest {

    @Test
    public void testGoodAttributes() {
        Good good = new Good();
        good.setPicture("picture1");
        good.setTitle("title1");
        good.setDescription("description1");
        good.setPrice(new BigDecimal("100.00"));

        Assertions.assertEquals("picture1", good.getPicture());
        Assertions.assertEquals("title1", good.getTitle());
        Assertions.assertEquals("description1", good.getDescription());
        Assertions.assertEquals(new BigDecimal("100.00"), good.getPrice());
    }
}
