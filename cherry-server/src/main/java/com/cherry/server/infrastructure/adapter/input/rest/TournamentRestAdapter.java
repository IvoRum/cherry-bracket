package com.cherry.server.infrastructure.adapter.input.rest;

import com.cherry.server.application.ports.input.CreateTournamentCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/tournament")
@RequiredArgsConstructor
public class TournamentRestAdapter implements CreateTournamentCase {
}
