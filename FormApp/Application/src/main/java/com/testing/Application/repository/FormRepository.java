package com.testing.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testing.Application.model.FormData;

public interface FormRepository extends JpaRepository<FormData, Long> {
}
