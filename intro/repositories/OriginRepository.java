package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Origin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OriginRepository extends JpaRepository <Origin, Integer> {
}
