package com.ardaltinay.Priordery.entity;

import com.ardaltinay.Priordery.enums.Location;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "TABLES")
@AllArgsConstructor
@Getter
@Builder
public class Tables extends BaseEntity {
    private Short number;

    @Enumerated(value = EnumType.STRING)
    private Location location;

    @OneToOne(mappedBy = "table")
    private Order order;
}
