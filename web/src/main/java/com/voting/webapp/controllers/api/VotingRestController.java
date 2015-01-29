package com.voting.webapp.controllers.api;

import com.voting.webapp.models.Vote;
import com.voting.webapp.repositories.VotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Rest Controller for Casting a vote
 */

@RestController
public class VotingRestController {

    @Autowired
    VotingRepository votingRepository;

    @RequestMapping(value = "/vote", method = RequestMethod.POST)
    public Vote castVote(@RequestBody Vote vote) {

        Vote v = new Vote();
        v.setCandidateId(vote.getCandidateId());
        v = votingRepository.save(v);

        return v;
    }
}
