package io.exercise.shop.domain.entity.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("A")
@Getter @Setter
public class AlbumEntity extends ItemEntity{

    private String airtics;
    private String etc;
}
