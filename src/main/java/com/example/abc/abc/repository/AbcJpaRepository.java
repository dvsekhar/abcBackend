package com.example.abc.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.abc.abc.model.Abc;

@Repository
public interface AbcJpaRepository extends JpaRepository<Abc, Integer> {
}
