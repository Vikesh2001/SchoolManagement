package com.schoolmanagement.controller;

import com.schoolmanagement.dto.DesignBlueprint;
import com.schoolmanagement.service.BlueprintService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DesignController {

    private final BlueprintService blueprintService;

    public DesignController(BlueprintService blueprintService) {
        this.blueprintService = blueprintService;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "ok");
    }

    @GetMapping("/design")
    public DesignBlueprint design() {
        return blueprintService.getBlueprint();
    }
}
