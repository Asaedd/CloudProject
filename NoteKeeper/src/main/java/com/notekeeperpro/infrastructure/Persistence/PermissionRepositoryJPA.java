package com.notekeeperpro.infrastructure.Persistence;

import com.notekeeperpro.core.Model.Permission;
import com.notekeeperpro.core.Repository.PermissionRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepositoryJPA extends  PermissionRepository ,JpaRepository<Permission, Long> {
    List<Permission> findBySharedWithId(Long userId);
    List<Permission> findByNoteId(Long noteId);
}
