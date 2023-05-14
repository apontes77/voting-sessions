package com.softdesign.votingsessions.resources.votingagenda.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class VotingAgendaRequest {

    private String title;

    private LocalDateTime createdAt;
}
