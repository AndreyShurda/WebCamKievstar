package com.kievstar.repositories;

import com.kievstar.models.MMS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MMSRepository extends JpaRepository<MMS, Long> {

}
