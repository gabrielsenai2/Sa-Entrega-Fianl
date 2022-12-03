package br.senai.service;

import br.senai.model.Comentario;

import java.util.List;

public interface ComentarioService {




    public Comentario findById(Long id);
    public Comentario save(Comentario index);
    public void deleteById(Long id);


}