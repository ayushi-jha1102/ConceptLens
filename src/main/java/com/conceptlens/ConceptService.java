package com.conceptlens;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ConceptService {

    public List<String> getAllConcepts() {
        return Arrays.asList("Variables", "Loops", "Arrays");
    }
}
