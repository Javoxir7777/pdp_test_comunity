package com.example.demo.repo;

import com.example.demo.entity.ItLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItLanguageRepo extends JpaRepository<ItLanguage, Integer> {
}
