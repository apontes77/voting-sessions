package com.softdesign.votingsessions.services;

import com.softdesign.votingsessions.domain.Session;
import com.softdesign.votingsessions.domain.VotingAgenda;
import com.softdesign.votingsessions.dto.SessionDTO;
import com.softdesign.votingsessions.dto.VotingAgendaDTO;
import com.softdesign.votingsessions.mappers.SessionMapper;
import com.softdesign.votingsessions.mappers.VotingAgendaMapper;
import com.softdesign.votingsessions.repository.SessionRepository;
import com.softdesign.votingsessions.repository.VotingAgendaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SessionService {
    private final SessionRepository sessionRepository;

    private final SessionMapper mapper;

    public Session registerVotingAgenda(SessionDTO sessionDTO) {
        sessionDTO.setOpened(true);
        return sessionRepository.save(mapper.toEntity(sessionDTO));
    }
}