package com.softdesign.votingsessions.resources.votingagenda.requests;

import com.softdesign.votingsessions.domain.VotingAgenda;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SessionRequest {

    private Integer timeSessionOpened;
    private VotingAgenda votingAgendaId;
}
