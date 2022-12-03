package br.senai.service;

import br.senai.model.Comentario;
import br.senai.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    ComentarioRepository comentarioRepository;

    @Override
    public Comentario findById(Long id) {
        return null;
    }

    @Override
    public Comentario save(Comentario comentario) {
        try {
            return comentarioRepository.save(comentario);
        } catch (Exception e) {
            throw (e);
        }
    }


    public void deleteById(Long id) {
        try {
            comentarioRepository.deleteById(id);
        } catch (Exception e){
            throw e;
        }
    }
}