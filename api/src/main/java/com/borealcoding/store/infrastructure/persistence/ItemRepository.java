package com.borealcoding.store.infrastructure.persistence;


import com.borealcoding.store.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>,
                                        JpaSpecificationExecutor<Item> {
    List<Item> findAllByCategoryId(Long id);
}
