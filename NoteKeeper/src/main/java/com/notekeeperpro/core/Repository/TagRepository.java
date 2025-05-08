package com.notekeeperpro.core.Repository;

import com.notekeeperpro.core.Model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepository{
    Optional<Tag> findByName(String name);
}
