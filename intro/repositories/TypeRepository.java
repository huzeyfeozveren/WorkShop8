package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Integer> {
}
