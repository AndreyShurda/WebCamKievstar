package com.kievstar.repositories;

import com.kievstar.models.WebCamera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebCameraRepository extends JpaRepository<WebCamera, Long> {

    WebCamera findByAddress(String name);

}
