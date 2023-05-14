package com.softdesign.votingsessions.resources;

import com.softdesign.votingsessions.domain.Schedule;
import com.softdesign.votingsessions.resources.requests.ScheduleRequest;
import com.softdesign.votingsessions.services.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public ResponseEntity<String> registerSchedule(@RequestBody ScheduleRequest scheduleRequest) {

        final Schedule schedule = Schedule.builder()
                .title(scheduleRequest.getTitle())
                .createdAt(scheduleRequest.getCreatedAt())
                .build();

        scheduleService.registerSchedule(schedule);

        return ResponseEntity.ok("Schedule created successfully");
    }
}
