package rce.fema.gov.demorce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class health {
    @GetMapping("/health")
    public String health() {
        return "Health";
    }
}
