package org.cgc.tw.mall.service;

import org.cgc.tw.mall.domain.Good;
import org.cgc.tw.mall.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService {
    @Autowired
    private GoodRepository goodRepository;

    public List<Good> getAllGoods() {
        return goodRepository.findAll();
    }

    public void addGood(Good good) {
        goodRepository.save(good);
    }
}
