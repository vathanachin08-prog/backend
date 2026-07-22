package com.mobile.springbootjwtapi.repository;

import com.mobile.springbootjwtapi.models.OtpLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OtpLogRepository extends JpaRepository<OtpLog, Integer> {
    List<OtpLog> findAllByCreateByOrderByIdDesc(String phone);
}
