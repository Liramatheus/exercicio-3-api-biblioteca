package com.suaapi.controller;

import com.suaapi.model.Livro;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private List<Livro> livros;

    public LivroController() {
        livros = new ArrayList<>();

        livros.add(new Livro(
                1,
                "Dom Casmurro",
                "Machado de Assis",
                1899
        ));

        livros.add(new Livro(
                2,
                "O Cortiço",
                "Aluísio Azevedo",
                1890
        ));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Livro> listarLivros() {
        return livros;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        livro.setId(livros.size() + 1);
        livros.add(livro);

        return livro;
    }
}
