package com.softdesign.votingsessions.dto;

import com.softdesign.votingsessions.domain.Session;
import com.softdesign.votingsessions.domain.VotingAgenda;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class SessionDTO {
    private Integer timeSessionOpened;
    private Boolean opened;
    private VotingAgenda votingAgendaId;
}
