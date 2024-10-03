package com.example.bookingserver.infrastructure.persistence.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepository {
    void setTimeToLive(String key , Long time) ;
    void set(String key, int value);
    Integer get(String key);
    void delete(String key) ;
}
