package com.softdesign.votingsessions.resources;

import com.softdesign.votingsessions.resources.requests.VoteRequest;
import com.softdesign.votingsessions.resources.responses.VoteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1/vote")
public class VoteController {

    @PostMapping
    public VoteResponse registerNewVote(@RequestBody VoteRequest voteRequest) {

        return null;
    }
}
