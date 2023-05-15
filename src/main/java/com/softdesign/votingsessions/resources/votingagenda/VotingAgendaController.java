package com.softdesign.votingsessions.resources.votingagenda;

import com.softdesign.votingsessions.domain.Session;
import com.softdesign.votingsessions.mappers.SessionMapper;
import com.softdesign.votingsessions.mappers.VotingAgendaMapper;
import com.softdesign.votingsessions.domain.VotingAgenda;
import com.softdesign.votingsessions.repository.SessionRepository;
import com.softdesign.votingsessions.resources.votingagenda.requests.SessionRequest;
import com.softdesign.votingsessions.resources.votingagenda.requests.VotingAgendaRequest;
import com.softdesign.votingsessions.resources.votingagenda.responses.SessionResponse;
import com.softdesign.votingsessions.resources.votingagenda.responses.VotingAgendaResponse;
import com.softdesign.votingsessions.services.SessionService;
import com.softdesign.votingsessions.services.VotingAgendaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/voting-agenda")
public class VotingAgendaController {

    private final VotingAgendaService votingAgendaService;

    private final SessionService sessionService;
    private final VotingAgendaMapper votingAgendaMapper;

    private final SessionMapper sessionMapper;
    public VotingAgendaController(VotingAgendaService votingAgendaService, SessionRepository sessionRepository, SessionService sessionService, VotingAgendaMapper votingAgendaMapper, SessionMapper sessionMapper) {
        this.votingAgendaService = votingAgendaService;
        this.sessionService = sessionService;
        this.votingAgendaMapper = votingAgendaMapper;
        this.sessionMapper = sessionMapper;
    }

    @PostMapping
    public ResponseEntity<VotingAgendaResponse> registerVotingAgenda(@RequestBody VotingAgendaRequest votingAgendaRequest) {
        final VotingAgenda votingAgenda = votingAgendaService.registerVotingAgenda(votingAgendaMapper.toDTO(votingAgendaRequest));
        return ResponseEntity.ok(votingAgendaMapper.toResponse(votingAgenda));
    }

    @PostMapping(value = "/{id}/session")
    public ResponseEntity<SessionResponse> createSession(@RequestBody SessionRequest sessionRequest) {
        VotingAgenda votingAgenda = votingAgendaService.searchVotingAgendaById(sessionRequest.getVotingAgendaId().getId());
        if(votingAgenda != null) {
            Session session = sessionService.registerVotingAgenda(sessionMapper.toDTO(sessionRequest));

            return ResponseEntity.ok(sessionMapper.toResponse(session));
        }
        return ResponseEntity.ofNullable(null);
    }
}
