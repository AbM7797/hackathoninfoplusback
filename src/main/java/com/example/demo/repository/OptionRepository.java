package com.example.demo.repository;

import com.example.demo.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OptionRepository extends JpaRepository<Option,Long> {
}
