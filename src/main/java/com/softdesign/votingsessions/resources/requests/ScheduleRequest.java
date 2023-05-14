package com.softdesign.votingsessions.resources.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class ScheduleRequest {

    private String title;

    private LocalDateTime createdAt;
}
