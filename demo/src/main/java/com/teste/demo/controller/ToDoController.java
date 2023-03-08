package com.teste.demo.controller;

import com.teste.demo.api.Lista;
import com.teste.demo.api.ListaRepository;
import com.teste.demo.api.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ToDoController {
    @Autowired
    private ListaRepository listaRepository;

    @Autowired
    private ListaService listaService;

    @GetMapping("/todo")
    public List<Lista> listarToDo() {
        return listaRepository.findByDoneFalse();
    }

    @GetMapping("/todo/all")
    public List<Lista> listarTodos() {
        return listaRepository.findAll();
    }

    @PostMapping("/todo/add")
    public Lista adicionar(@RequestBody Lista item) {
        return listaRepository.save(item);
    }

    @PostMapping("/todo/add/{id}")
    public Lista changeStatus(@PathVariable Integer id) {
        return listaService.alteraDone(id);
    }

    @DeleteMapping("/todo/delete/{id}")
    public void delete(@PathVariable Integer id) {
        listaRepository.deleteById(id);
    }

}
