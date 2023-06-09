package com.vita.web.repository;

import com.vita.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    //JpaRepo gives us the methods

    Optional<Club> findByTitle(String url);
}
