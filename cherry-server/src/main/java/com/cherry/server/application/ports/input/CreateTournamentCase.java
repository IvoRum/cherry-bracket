package com.cherry.server.application.ports.input;

import com.cherry.server.domain.model.Tournament;

public interface CreateTournamentCase {
    Tournament createPrivate(final Tournament tournament);
    Tournament createPublic(final Tournament tournament);
}
