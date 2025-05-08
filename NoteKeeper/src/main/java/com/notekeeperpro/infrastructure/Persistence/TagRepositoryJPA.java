package com.notekeeperpro.infrastructure.Persistence;

import com.notekeeperpro.core.Model.Tag;
import com.notekeeperpro.core.Repository.TagRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepositoryJPA extends TagRepository, JpaRepository<Tag, Long> {
    Optional<Tag> findByName(String name);
}
