package com.proyecto.AustroMarket.Repository;

import com.proyecto.AustroMarket.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
