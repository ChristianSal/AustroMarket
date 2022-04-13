package com.proyecto.AustroMarket.Repository;

import com.proyecto.AustroMarket.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
