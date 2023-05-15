package com.softdesign.votingsessions.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class VotingAgendaDTO {
    private String title;
    private LocalDateTime createdAt;
}
