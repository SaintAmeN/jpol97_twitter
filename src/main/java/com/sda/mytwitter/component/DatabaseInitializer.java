package com.sda.mytwitter.component;

import com.sda.mytwitter.model.PeriodObject;
import com.sda.mytwitter.repository.PeriodObjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor // autowired
public class DatabaseInitializer implements ApplicationListener<ContextRefreshedEvent> {
    private final PeriodObjectRepository periodObjectRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        periodObjectRepository.save(new PeriodObject(null, LocalDateTime.of(2022, 3, 4, 12, 0, 30), LocalDateTime.of(2022, 3, 24, 13, 0, 30), null));
    }
}
