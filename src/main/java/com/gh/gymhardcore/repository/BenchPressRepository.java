package com.gh.gymhardcore.repository;

import com.gh.gymhardcore.entity.BenchPress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenchPressRepository extends JpaRepository<BenchPress, Long> {
}
