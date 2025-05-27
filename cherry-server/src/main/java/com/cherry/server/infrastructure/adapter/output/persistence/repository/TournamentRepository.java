package com.cherry.server.infrastructure.adapter.output.persistence.repository;

import com.cherry.server.infrastructure.adapter.output.persistence.entity.TournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends JpaRepository<TournamentEntity,Long>{
}
