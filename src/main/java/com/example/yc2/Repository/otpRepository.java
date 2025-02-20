package com.example.yc2.Repository;

import com.example.yc2.Model.otp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface otpRepository extends JpaRepository<otp, Long> {
    List<otp> findByEmailAndOtpCodeAndIsUsedFalse(String email, String otpCode);
}
