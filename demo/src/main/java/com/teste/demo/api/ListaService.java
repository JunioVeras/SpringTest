package com.teste.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListaService {
    @Autowired
    private ListaRepository listaRepository;

    public Lista alteraDone(Integer id)
    {
        Lista item = listaRepository.findById(id).get();
        item.setDone(!item.getDone());
        return listaRepository.save(item);
    }

}
