package com.softdesign.votingsessions.dto;

import com.softdesign.votingsessions.domain.Session;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class VotingAgendaDTO {
    private Long id;
    private String title;
    private LocalDateTime createdAt;
    private Session session;
}
