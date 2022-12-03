package br.senai.repository;

import br.senai.model.Perfil;
import br.senai.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {


    public Usuario findByNome(String nome);

    public Usuario findByEmail(String email);

    public Usuario findByUserNameAndSenha(String userName, String senha);

    public List<Usuario> findByEmailLike(String email);
}

