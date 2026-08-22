package com.conceptlens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ConceptController {

    @GetMapping("/api/concepts")
    public List<String> getConcepts() {
        return Arrays.asList("Variables", "Loops", "Arrays");
    }
}
