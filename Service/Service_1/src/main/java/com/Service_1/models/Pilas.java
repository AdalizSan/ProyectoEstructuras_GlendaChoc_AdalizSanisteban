package com.Service_1.models;

import java.util.ArrayList;
import java.util.List;

public class Pilas {
    private List<Integer> elementos;

    public Pilas() {
        this.elementos = new ArrayList<>();
    }
    public void insertar(int valor) {
        elementos.add(valor);
    }
    public Integer eliminar() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }
    public List<Integer> getElementos() {
        return new ArrayList<>(elementos);
    }
}