package com.dxc.roles.repository;

import com.dxc.roles.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(Long id);
    User findByUsername(String username);
}
