package br.senai.repository;

import br.senai.model.Publicacao;
import br.senai.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacaoRepository extends JpaRepository <Publicacao, Long> {

    public Publicacao findById(String nome);
}
