package com.borealcoding.store.infrastructure.specs;


import com.borealcoding.store.domain.entity.Item;
import com.borealcoding.store.infrastructure.specs.shared.EntitySpecification;
import com.borealcoding.store.infrastructure.specs.shared.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;
import java.util.List;

public class ItemSpecification extends EntitySpecification<Item> implements Specification<Item> {


    public ItemSpecification(List<SearchCriteria> criteria) {
        this.criteria = criteria;
    }



}