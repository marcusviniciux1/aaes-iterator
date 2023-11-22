package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    @Test
    void deveContarLivrosDisponiveisSetor() {
        Setor setor = new Setor(
                new Livro("Livro A", true),
                new Livro("Livro B", true),
                new Livro("Livro C", false),
                new Livro("Livro D", true)
        );
        assertEquals(3, Biblioteca.contarLivrosDisponiveisSetor(setor));
    }

    @Test
    void deveContarTotalLivrosSetor() {
        Setor setor = new Setor(
                new Livro("Livro A", true),
                new Livro("Livro B", true),
                new Livro("Livro C", false),
                new Livro("Livro D", true)
        );
        assertEquals(4, Biblioteca.contarTotalLivrosSetor(setor));
    }
}