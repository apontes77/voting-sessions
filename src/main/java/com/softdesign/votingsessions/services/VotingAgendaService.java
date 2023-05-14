package com.softdesign.votingsessions.services;

import com.softdesign.votingsessions.mappers.VotingAgendaMapper;
import com.softdesign.votingsessions.domain.VotingAgenda;
import com.softdesign.votingsessions.dto.VotingAgendaDTO;
import com.softdesign.votingsessions.repository.VotingAgendaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotingAgendaService {
    private final VotingAgendaRepository votingAgendaRepository;

    private final VotingAgendaMapper mapper;

    public VotingAgendaService(VotingAgendaRepository scheduleRepository, VotingAgendaMapper mapper) {
        this.votingAgendaRepository = scheduleRepository;
        this.mapper = mapper;
    }

    public VotingAgenda registerVotingAgenda(VotingAgendaDTO votingAgendaDTO) {
        return votingAgendaRepository.save(mapper.toEntity(votingAgendaDTO));
    }

    public List<VotingAgenda> listVotingAgendas() {
        return votingAgendaRepository.findAll();
    }

    public VotingAgenda searchVotingAgendaById(Long votingAgendaId) {
        return votingAgendaRepository.findById(votingAgendaId)
                .orElseThrow(() -> new EntityNotFoundException("Voting Agenda not founded"));
    }
}