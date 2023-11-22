package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Setor implements Iterable<Livro> {

    private List<Livro> livros = new ArrayList<Livro>();

    public Setor(Livro... livros) {
        this.livros = Arrays.asList(livros);
    }

    @Override
    public Iterator<Livro> iterator() {
        return livros.iterator();
    }

}