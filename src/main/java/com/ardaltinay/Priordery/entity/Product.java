package com.ardaltinay.Priordery.entity;

import com.ardaltinay.Priordery.enums.ProductCategory;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "PRODUCTS")
@AllArgsConstructor
@Getter
@Builder
public class Product extends BaseEntity {
    private String name;
    private String barcode;
    private BigDecimal price;
    private Short count;

    @Enumerated(value = EnumType.STRING)
    private ProductCategory productCategory;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<RawMaterial> rawMaterials;
}
