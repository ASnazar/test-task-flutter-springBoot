package com.example.counter.service.impl;

import com.example.counter.model.Value;
import com.example.counter.repository.ValueRepository;
import com.example.counter.service.ValueService;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ValueServiceImpl implements ValueService {
    private ValueRepository valueRepository;

    public int getCounter() {
        Value counterEntity = valueRepository.findById(1L).orElse(new Value());
        return counterEntity.getValue();
    }

    public int incrementCounter() {
        Value counterEntity = valueRepository.findById(1L).orElse(new Value());
        int newValue = counterEntity.getValue() + 1;
        counterEntity.setValue(newValue);
        valueRepository.save(counterEntity);
        return newValue;
    }
}






