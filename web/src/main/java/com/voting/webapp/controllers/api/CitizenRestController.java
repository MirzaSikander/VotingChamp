package com.voting.webapp.controllers.api;

import com.voting.webapp.models.Citizen;
import com.voting.webapp.repositories.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest Controller for operations related to citizens
 */
@RestController
//@RequestMapping(value = "/api/")
public class CitizenRestController {

    @Autowired
    CitizenRepository citizenRepository;

    @RequestMapping(value = "/hasVoted", method = RequestMethod.POST)
    public Citizen hasVoted(@RequestBody Citizen incomingCitizen) {

        Citizen citizen;

        List<Citizen> citizenList = citizenRepository.findByIdentifier(incomingCitizen.getIdentifier());

        if (citizenList.size() > 0) {
            citizen = citizenList.get(0);
        } else {
            citizen = new Citizen();
            citizen.setId(-1);
        }

        return citizen;
    }

    @RequestMapping(value = "/castVote", method = RequestMethod.POST)
    public Citizen castVote(@RequestBody Citizen incomingCitizen) {

        Citizen citizen;

        List<Citizen> citizenList = citizenRepository.findByIdentifier(incomingCitizen.getIdentifier());

        if (citizenList.size() > 0) {
            citizen = citizenList.get(0);
            citizen.setHasVoted(true);
            citizen = citizenRepository.save(citizen);
        } else {
            citizen = new Citizen();
            citizen.setId(-1);
        }

        return citizen;
    }
}
