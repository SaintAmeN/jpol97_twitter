package com.sda.mytwitter.controller;

import com.sda.mytwitter.model.PeriodObject;
import com.sda.mytwitter.repository.PeriodObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final PeriodObjectRepository periodObjectRepository;

    @GetMapping("/po")
    public List<PeriodObject> getPeriodObjects(){
        return periodObjectRepository.findAll();
    }
}
