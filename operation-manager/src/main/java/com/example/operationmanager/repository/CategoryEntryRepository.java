package com.example.operationmanager.repository;

import com.example.operationmanager.entity.CategoryEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryEntryRepository extends JpaRepository<CategoryEntry, UUID> {
}
