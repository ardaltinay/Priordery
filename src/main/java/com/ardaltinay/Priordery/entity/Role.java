package com.ardaltinay.Priordery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "ROLES")
@Getter
@Setter
public class Role extends BaseEntity {
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
