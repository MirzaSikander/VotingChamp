package com.voting.webapp.repositories;

import com.voting.webapp.models.Citizen;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Standard repository for data operations of citizen role within the system.
 */

@Transactional
public interface CitizenRepository extends CrudRepository<Citizen, Long> {

    Citizen save(Citizen vote);

    List<Citizen> findByIdentifier(String identifier);
}
