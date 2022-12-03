package br.senai.service;

import br.senai.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    public List<Usuario> findAll();
    public Optional<Usuario> findById(long id);
    public Usuario create(Usuario newUsuario);
    public Usuario update(Usuario updatedUsuario, long id);

    Usuario findByNome(String nome);

    public Usuario findByUserNameAndSenha(String userName, String senha);

    Usuario findById(Long id);

    Usuario save(Usuario usuario);

    public void delete(long id);


    void deleteById(long id);
}