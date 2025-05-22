package com.cherry.server.domain.service;

import com.cherry.server.application.ports.input.CreateTournamentCase;
import com.cherry.server.application.ports.output.TournamentOutputPort;
import com.cherry.server.domain.model.Tournament;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TournamentService implements CreateTournamentCase {
    private final TournamentOutputPort tournamentOutputPort;

    @Override
    public Tournament createPrivate(Tournament tournament) {
        assert (tournament!=null);
        //1 validate input
        //2 call repositori to save
        tournamentOutputPort.save(tournament);
        return null;
    }

    @Override
    public Tournament createPublic(Tournament tournament) {
        return null;
    }
}
