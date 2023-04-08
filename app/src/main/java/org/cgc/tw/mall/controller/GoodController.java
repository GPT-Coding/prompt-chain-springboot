package org.cgc.tw.mall.controller;

import org.cgc.tw.mall.domain.Good;
import org.cgc.tw.mall.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodController {
    @Autowired
    private GoodService goodService;

    @GetMapping("/goods")
    public List<Good> getAllGoods() {
        return goodService.getAllGoods();
    }

    @PostMapping("/goods")
    public void addGood(@RequestBody Good good) {
        goodService.addGood(good);
    }
}
