package com.gh.gymhardcore.repository;

import com.gh.gymhardcore.entity.Chest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChestRepository extends JpaRepository<Chest,Long> {
}
