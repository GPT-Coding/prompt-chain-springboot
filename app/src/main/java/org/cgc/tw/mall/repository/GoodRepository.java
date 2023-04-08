package org.cgc.tw.mall.repository;

import org.cgc.tw.mall.domain.Good;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodRepository extends JpaRepository<Good, Long> {
}
