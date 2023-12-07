package com.sparta.palpaleats.global.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class CommonResponseDto {

    private String msg;
    private Integer statusCode;

    public CommonResponseDto(Integer statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }
}