package com.example.HelloSpring.controller;

import com.example.HelloSpring.model.Musica;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MusicaController {
    List<Musica> musicas = new ArrayList<>();

    public MusicaController() {//construtor para cadastrar 3 músicas
        musicas.add(new Musica(1, "The Fate of Ophelia", "Pop", 4));
        musicas.add(new Musica(2, "Shake It Off", "Pop", 5));
        musicas.add(new Musica(3, "Lover", "Pop", 3));
    }

    @GetMapping("/todasmusicas")
    public List<Musica> retornarTodasMusicas(){
        return musicas;
    }

    @GetMapping("/primeiramusica")
    public Musica retornarPrimeiraMusica(){
        return musicas.get(0);
    }
}
