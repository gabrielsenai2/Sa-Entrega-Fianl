package br.senai.service;

import br.senai.model.Comentario;
import br.senai.model.Perfil;
import br.senai.repository.ComentarioRepository;
import br.senai.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilServiceImpl {

    @Autowired
    PerfilRepository perfilRepository;


}
