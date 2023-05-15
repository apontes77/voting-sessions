package com.softdesign.votingsessions.resources.votingagenda.responses;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SessionResponse {

    private Integer timeSessionOpened;
    private Boolean opened;
    private Long votingAgendaId;
}
