package com.softdesign.votingsessions.services;

import com.softdesign.votingsessions.domain.Schedule;
import com.softdesign.votingsessions.repository.ScheduleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public void registerSchedule(Schedule Schedule) {
        scheduleRepository.save(Schedule);
    }

    public List<Schedule> listSchedules() {
        return scheduleRepository.findAll();
    }

    public Schedule searchScheduleById(Long ScheduleId) {
        return scheduleRepository.findById(ScheduleId)
                .orElseThrow(() -> new EntityNotFoundException("Schedule not found"));
    }
}