package com.blackcrow.springbootocean.repository;

import com.blackcrow.springbootocean.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
