package com.softdesign.votingsessions.resources.votingagenda.responses;

import com.softdesign.votingsessions.domain.Session;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
@Getter
@RequiredArgsConstructor
public class VotingAgendaResponse {
    private Long id;
    private String title;
    private LocalDateTime createdAt;
    private Session session;
}
