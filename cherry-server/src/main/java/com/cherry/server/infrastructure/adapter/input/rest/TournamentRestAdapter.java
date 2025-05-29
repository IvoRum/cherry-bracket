package com.cherry.server.infrastructure.adapter.input.rest;

import com.cherry.server.application.ports.input.CreateTournamentCase;
import com.cherry.server.domain.model.Tournament;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/tournament")
@RequiredArgsConstructor
@RestController
public class TournamentRestAdapter{
    private final CreateTournamentCase createTournamentCase;

    @PostMapping("/create/public")
    ResponseEntity<Tournament> save(@RequestBody Tournament tournament) {
        //createTournamentCase.createPublic(tournament);
        return new ResponseEntity<>(tournament, HttpStatus.CREATED);
    }
}


