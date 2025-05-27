package com.cherry.server.infrastructure.adapter.output.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Tournament")
class TournamentEntity {
    @Id
    private Long id;

}
