package com.proyecto.AustroMarket.Repository;

import com.proyecto.AustroMarket.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    public List<Product> findByName(String name);
    public List<Product> findByPrice(double price);
}
