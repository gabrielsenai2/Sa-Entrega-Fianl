package br.senai.repository;

import br.senai.model.Esqueceu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EsqueceuRepository  extends JpaRepository<Esqueceu, Long>{


    public Esqueceu findById(long id);

    public Esqueceu findByEmail(String email);

    public List<Esqueceu> findByEmailLike(String email);
}