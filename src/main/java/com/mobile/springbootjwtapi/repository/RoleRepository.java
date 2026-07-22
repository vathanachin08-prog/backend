package com.mobile.springbootjwtapi.repository;

import com.mobile.springbootjwtapi.models.Role;
import com.mobile.springbootjwtapi.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(UserRole name);
}
