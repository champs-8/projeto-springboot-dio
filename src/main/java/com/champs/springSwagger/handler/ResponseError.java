package com.champs.springSwagger.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseError {
    private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 500;
    private String error;
}
