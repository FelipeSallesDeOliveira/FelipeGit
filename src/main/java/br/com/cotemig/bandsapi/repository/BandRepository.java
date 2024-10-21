package br.com.cotemig.bandsapi.repository;

import br.com.cotemig.bandsapi.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<Band, Long> {
}
