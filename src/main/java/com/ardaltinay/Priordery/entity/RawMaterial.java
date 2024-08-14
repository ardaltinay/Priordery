package com.ardaltinay.Priordery.entity;

import com.ardaltinay.Priordery.enums.MaterialType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "RAW_MATERIALS")
@AllArgsConstructor
@Getter
@Builder
public class RawMaterial extends BaseEntity {
    private String name;
    private MaterialType materialType;

    @Temporal(TemporalType.DATE)
    private LocalDate productionDate;

    @Temporal(TemporalType.DATE)
    private LocalDate expirationDate;
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;
}
