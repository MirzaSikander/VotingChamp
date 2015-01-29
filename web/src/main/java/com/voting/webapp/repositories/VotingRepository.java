package com.voting.webapp.repositories;

import com.voting.webapp.models.Vote;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by ayazali on 1/29/15.
 */

@Transactional
public interface VotingRepository extends CrudRepository<Vote, Long> {
    Vote save(Vote vote);
}
