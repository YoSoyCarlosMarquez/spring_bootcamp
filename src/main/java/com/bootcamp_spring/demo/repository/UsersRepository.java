package com.bootcamp_spring.demo.repository;

import com.bootcamp_spring.demo.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository
    extends JpaRepository<UsersEntity, Long> {
}
