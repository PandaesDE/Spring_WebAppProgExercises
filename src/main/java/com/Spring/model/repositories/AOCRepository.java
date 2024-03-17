package com.Spring.model.repositories;

import com.Spring.model.entities.AOCEntity;
import com.Spring.model.entities.AOCKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AOCRepository extends JpaRepository<AOCEntity, AOCKey> {

}
