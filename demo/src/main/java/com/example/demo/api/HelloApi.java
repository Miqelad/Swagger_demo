package com.example.demo.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "Hello API", description = "Простые методы для демонстрации работы контроллера")
@RequestMapping("/api/hello")
public interface HelloApi {

    @Operation(summary = "Приветствие", description = "Возвращает приветствие для переданного имени")

    @GetMapping("/say")
    String sayHello(
            @Parameter(description = "Имя пользователя для приветствия", example = "Paata")
            @RequestParam String name);


    @Operation(summary = "Проверка сервера", description = "Проверяет, что сервер работает")
    @GetMapping("/ping")
    String ping();
}