package com.cherry.server.infrastructure.adapter.output.persistence;

import com.cherry.server.application.ports.output.TournamentOutputPort;
import com.cherry.server.domain.model.Tournament;
import com.cherry.server.infrastructure.adapter.output.persistence.repository.TournamentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TournamentPersistenceAdapter implements TournamentOutputPort {
    private final TournamentRepository tournamentRepository;

    @Override
    public Tournament save(Tournament tournament) {
        assert (tournament!=null);
        return tournamentRepository.save(tournament);
    }

    @Override
    public Optional<Tournament> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Tournament> findByName(String name) {
        return Optional.empty();
    }
    //save entities
}
