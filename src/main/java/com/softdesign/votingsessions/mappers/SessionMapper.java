package com.softdesign.votingsessions.mappers;

import com.softdesign.votingsessions.domain.Session;
import com.softdesign.votingsessions.dto.SessionDTO;
import com.softdesign.votingsessions.resources.votingagenda.requests.SessionRequest;
import com.softdesign.votingsessions.resources.votingagenda.responses.SessionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionMapper {

    SessionMapper MAPPER = Mappers.getMapper(SessionMapper.class);

    SessionResponse toResponse(Session session);

    SessionDTO toDTO(SessionRequest request);

    Session toEntity(SessionDTO sessionDTO);
}
