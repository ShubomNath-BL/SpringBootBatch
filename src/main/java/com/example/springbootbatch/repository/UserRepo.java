package com.example.springbootbatch.repository;

import com.example.springbootbatch.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Person, Integer> {
}
