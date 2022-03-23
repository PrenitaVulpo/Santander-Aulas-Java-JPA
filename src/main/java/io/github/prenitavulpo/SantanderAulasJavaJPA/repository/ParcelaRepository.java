package io.github.prenitavulpo.SantanderAulasJavaJPA.repository;

import io.github.prenitavulpo.SantanderAulasJavaJPA.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelaRepository extends JpaRepository<Pessoa, Integer> {

}
