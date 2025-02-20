package com.example.yc2.Repository;

import com.example.yc2.Model.account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface accountRepository extends JpaRepository<account, Long> {
    Optional<account> findByEmail(String email);
    boolean existsByEmail(String email);
}
