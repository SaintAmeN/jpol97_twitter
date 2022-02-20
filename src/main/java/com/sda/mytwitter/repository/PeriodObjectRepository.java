package com.sda.mytwitter.repository;

import com.sda.mytwitter.model.Heart;
import com.sda.mytwitter.model.PeriodObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodObjectRepository extends JpaRepository<PeriodObject, Long> {
}
