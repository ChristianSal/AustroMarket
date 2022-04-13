package com.proyecto.AustroMarket.Repository;

import com.proyecto.AustroMarket.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
