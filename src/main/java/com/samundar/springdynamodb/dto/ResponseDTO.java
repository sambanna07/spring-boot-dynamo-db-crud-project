package com.samundar.springdynamodb.dto;

public record ResponseDTO<T>(String message, T content) {
}
