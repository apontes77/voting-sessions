package com.softdesign.votingsessions.repository;

import com.softdesign.votingsessions.domain.VotingAgenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingAgendaRepository extends JpaRepository<VotingAgenda, Long> {
}