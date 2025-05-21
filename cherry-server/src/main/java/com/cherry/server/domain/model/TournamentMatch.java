package com.cherry.server.domain.model;

import java.util.Set;

public class TournamentMatch {
    private long id;
    private long tournamentId;
    private Set<TournamentPlayer> tournamentPlayers;
}
