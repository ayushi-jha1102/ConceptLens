package com.conceptlens;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class ConceptRepository {

    public List<Concept> findAll() {
        return Arrays.asList(
            new Concept("Variables", "Containers for storing data values."),
            new Concept("Loops", "Used to execute a block of code repeatedly."),
            new Concept("Arrays", "Used to store multiple values in a single variable.")
        );
    }
}
