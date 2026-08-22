package com.conceptlens;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ConceptService {

    public List<Concept> getAllConcepts() {
        return Arrays.asList(
            new Concept("Variables", "Containers for storing data values."),
            new Concept("Loops", "Used to execute a block of code repeatedly."),
            new Concept("Arrays", "Used to store multiple values in a single variable.")
        );
    }
}
