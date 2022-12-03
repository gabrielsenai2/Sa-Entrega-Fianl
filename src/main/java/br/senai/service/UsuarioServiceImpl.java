package br.senai.service;


import br.senai.model.Usuario;
import br.senai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll(Sort.by("nome"));
    }

    @Override
    public Optional<Usuario> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Usuario create(Usuario newUsuario) {
        return null;
    }

    @Override
    public Usuario update(Usuario updatedUsuario, long id) {
        return null;
    }

    @Override
    public Usuario findByNome(String nome) {
        return null;
    }

    @Override
    public Usuario findByUserNameAndSenha(String userName, String senha) {
        return usuarioRepository.findByUserNameAndSenha(userName, senha);
    }

    @Override
    public Usuario findById(Long id) {
        Optional listUsuario = usuarioRepository.findById(id);
        if (!listUsuario.isEmpty()) {
            return (Usuario) listUsuario.get();

        } else {

            return (Usuario) listUsuario.get();

        }


    }

    @Override
    public Usuario save(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(long id) {

    }


    @Override
    public void deleteById(long id) {

    }
}
