package org.example;

import java.util.Iterator;

public class Biblioteca {

    public static Integer contarLivrosDisponiveisSetor(Setor setor) {
        int quantidade = 0;
        for (Livro livro : setor) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosSetor(Setor setor) {
        int quantidade = 0;
        for (Iterator livroIterator = setor.iterator(); livroIterator.hasNext(); ) {
            quantidade++;
            livroIterator.next();
        }
        return quantidade;
    }

}