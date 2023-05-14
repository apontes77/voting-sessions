package com.softdesign.votingsessions.resources.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class VoteRequest {
    private Long associateId;
    private Long scheduleId;
    private String vote;
}
