package com.softdesign.votingsessions.resources.votingagenda;

import com.softdesign.votingsessions.mappers.VotingAgendaMapper;
import com.softdesign.votingsessions.domain.VotingAgenda;
import com.softdesign.votingsessions.resources.votingagenda.requests.VotingAgendaRequest;
import com.softdesign.votingsessions.resources.votingagenda.responses.VotingAgendaResponse;
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
    private final VotingAgendaMapper votingAgendaMapper;

    public VotingAgendaController(VotingAgendaService votingAgendaService, VotingAgendaMapper votingAgendaMapper) {
        this.votingAgendaService = votingAgendaService;
        this.votingAgendaMapper = votingAgendaMapper;
    }

    @PostMapping
    public ResponseEntity<VotingAgendaResponse> registerVotingAgenda(@RequestBody VotingAgendaRequest votingAgendaRequest) {
        final VotingAgenda votingAgenda = votingAgendaService.registerVotingAgenda(votingAgendaMapper.toDTO(votingAgendaRequest));
        return ResponseEntity.ok(votingAgendaMapper.toResponse(votingAgenda));
    }
}
