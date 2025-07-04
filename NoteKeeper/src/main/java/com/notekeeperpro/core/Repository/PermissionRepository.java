package com.notekeeperpro.core.Repository;

import com.notekeeperpro.core.Model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepository{
    List<Permission> findBySharedWithId(Long userId);
    List<Permission> findByNoteId(Long noteId);
}
