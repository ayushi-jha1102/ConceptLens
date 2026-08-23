package com.conceptlens;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConceptService {

    private final ConceptRepository conceptRepository;

    public ConceptService(ConceptRepository conceptRepository) {
        this.conceptRepository = conceptRepository;
    }

    public List<Concept> getAllConcepts() {
        return conceptRepository.findAll();
    }
}
