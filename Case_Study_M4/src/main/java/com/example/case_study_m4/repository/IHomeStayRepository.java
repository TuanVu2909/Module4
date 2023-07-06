package com.example.case_study_m4.repository;

import com.example.case_study_m4.model.Home_Stay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHomeStayRepository extends JpaRepository<Home_Stay, Long> {
    @Query(value = "select home from home_stay home where (home.name like :name and home.price between :min and :max)" +
            " or (home.address like :name and home.price between :min and :max)",nativeQuery = true)
    List<Home_Stay> search(@Param("name") String name,
                           @Param("min") Long min,
                           @Param("max") Long max);
}
