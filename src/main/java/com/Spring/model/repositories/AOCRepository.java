package com.Spring.model.repositories;

import com.Spring.model.entities.AOCEntity;
import com.Spring.model.entities.AOCKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AOCRepository extends JpaRepository<AOCEntity, AOCKey> {

    //https://docs.spring.io/spring-data/jpa/reference/repositories/query-methods-details.html
    @Query("SELECT e FROM AOCEntity e WHERE e.key.year = ?1 AND e.key.day = ?2")
    AOCEntity findByYearAndDay(int year, int day);

    //boolean existsByYearAndDay(int year, int day);
}
