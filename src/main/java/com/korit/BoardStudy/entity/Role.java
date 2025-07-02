package com.korit.BoardStudy.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Role {
    private Integer roleId;
    private String roleName;
    private String roleNameKor;
}
