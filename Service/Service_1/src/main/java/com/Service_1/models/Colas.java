package com.Service_1.models;

import java.util.ArrayList;
import java.util.List;

public class Colas {
    private List<Integer> elementos;
    public Colas() {
        this.elementos = new ArrayList<>();
    }
    public void insertar(int valor) {
        elementos.add(valor);
    }
    public Integer eliminar() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(0);
    }
    public List<Integer> getElementos() {
        return new ArrayList<>(elementos);
    }
    public void reiniciar() {
        this.elementos = new ArrayList<>();
    }
    
}