package io.exercise.shop.domain.entity;

import io.exercise.shop.domain.entity.item.ItemEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoryEntity {

    @Id @GeneratedValue
    @Column(name = "category_no")
    private Long categoryNo;

    @ManyToMany
    @JoinTable(name = "category_item_tb",
            joinColumns = @JoinColumn(name = "category_no"),
            inverseJoinColumns = @JoinColumn(name = "item_no")
    )
    private List<ItemEntity> itemEntityList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "parent_no")
    private CategoryEntity parentCategory;

    @OneToMany(mappedBy = "parentCategory")
    private List<CategoryEntity> childCategory = new ArrayList<>();
}
