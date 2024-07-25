package com.ecommerce.EccomerceWebsite.repository;

import com.ecommerce.EccomerceWebsite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
