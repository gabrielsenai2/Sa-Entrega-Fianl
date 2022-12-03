package br.senai.service;


import br.senai.model.Esqueceu;
import br.senai.repository.EsqueceuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EsqueceuServiceImpl implements EsqueceuService {

    @Autowired
    EsqueceuRepository EsqueceuRepository;

    @Override
    public List<Esqueceu> findAll() {
        return EsqueceuRepository.findAll(Sort.by("id"));
    }
    @Override
    public Optional<Esqueceu> findById(long id) {
        return Optional.empty();
    }
    @Override
    public Esqueceu create(Esqueceu newEsqueceu) {
        return null;
    }
    @Override
    public Esqueceu update(Esqueceu updatedEsqueceu, long id) {
        return null;
    }
    @Override
    public Esqueceu findByEmail(String email) {
        return null;
    }
    @Override
    public Esqueceu findById(Long id) {
        Optional listEsqueceu = EsqueceuRepository.findById(id);
        if (!listEsqueceu.isEmpty()) {
            return (Esqueceu) listEsqueceu.get();
        } else {
            return (Esqueceu) listEsqueceu.get();
        }
    }
    @Override
    public Esqueceu save(Esqueceu Esqueceu) {
        try {
            return EsqueceuRepository.save(Esqueceu);
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