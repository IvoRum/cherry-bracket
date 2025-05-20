package com.cherry.server.application.ports.output;

import com.cherry.server.domain.model.Tournament;

import java.util.Optional;

public interface TournamentOutputPort {
    Tournament save(final Tournament tournament);
    Optional<Tournament> findById(final String id);
    Optional<Tournament> findByName(final String name);
}
