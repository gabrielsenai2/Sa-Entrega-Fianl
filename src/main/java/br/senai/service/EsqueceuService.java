package br.senai.service;

import br.senai.model.Esqueceu;

import java.util.List;
import java.util.Optional;

public interface EsqueceuService {

    public List<Esqueceu> findAll();
    public Optional<Esqueceu> findById(long id);
    public Esqueceu create(Esqueceu newEsqueceu);
    public Esqueceu update(Esqueceu updatedEsqueceu, long id);

    Esqueceu findByEmail(String email);

    Esqueceu findById(Long id);

    Esqueceu save(Esqueceu esqueceu);

    public void delete(long id);


    void deleteById(long id);
}