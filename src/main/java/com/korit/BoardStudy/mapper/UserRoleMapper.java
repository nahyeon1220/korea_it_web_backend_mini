package com.korit.BoardStudy.mapper;

import com.korit.BoardStudy.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.aot.generate.InMemoryGeneratedFiles;

import java.util.Optional;

@Mapper
public interface UserRoleMapper {
    int addUserRole(UserRole userRole);
    Optional<UserRole> getUserByUserIdAndRoleId(Integer userId, Integer roleId);
    int updateRoleId(Integer userRoleId, Integer userId);
}

