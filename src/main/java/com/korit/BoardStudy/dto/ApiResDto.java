package com.korit.BoardStudy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResDto<T> {
    private String status;
    private String message;
    private T data;
}
