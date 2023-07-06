package com.example.case_study_m4.repository;

import com.example.case_study_m4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findAllByUsername(String username);
}
