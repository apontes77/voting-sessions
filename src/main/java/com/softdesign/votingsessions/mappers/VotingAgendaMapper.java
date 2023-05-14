package com.softdesign.votingsessions.mappers;

import com.softdesign.votingsessions.domain.VotingAgenda;
import com.softdesign.votingsessions.dto.VotingAgendaDTO;
import com.softdesign.votingsessions.resources.votingagenda.requests.VotingAgendaRequest;
import com.softdesign.votingsessions.resources.votingagenda.responses.VotingAgendaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VotingAgendaMapper {

    VotingAgendaMapper MAPPER = Mappers.getMapper(VotingAgendaMapper.class);

    VotingAgendaResponse toResponse(VotingAgenda votingAgenda);

    VotingAgendaDTO toDTO(VotingAgendaRequest request);

    VotingAgenda toEntity(VotingAgendaDTO votingAgendaDTO);
}
