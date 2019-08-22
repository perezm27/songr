package com.perezm27.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long>{
        public Song findByTitle(String title);
    }
