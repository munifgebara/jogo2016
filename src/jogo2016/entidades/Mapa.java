package jogo2016.entidades;

import java.util.HashSet;
import java.util.Set;

public class Mapa {

    private String nome;
    public Set<Lugar> lugares;
    private Lugar lugarInicialDoHeroi;
    private Lugar lugarInicialDoBandido;

    public Mapa(String n) {
        lugares = new HashSet<>();
        nome = n;
    }

    public Lugar getLugarInicialDoHeroi() {
        return lugarInicialDoHeroi;
    }

    public void setLugarInicialDoHeroi(Lugar lu) {
        if (lugares.contains(lu)) {
            lugarInicialDoHeroi = lu;
        } else {
            throw new RuntimeException("Este lugar " + lu.nome + " nao pertence a " + this.nome);
        }
    }

    public Lugar getLugarInicialDoBandido() {
        return lugarInicialDoBandido;
    }

    public void setLugarInicialDoBandido(Lugar lu) {
        if (lugares.contains(lu)) {
            this.lugarInicialDoBandido = lu;
        } else {
            throw new RuntimeException("Este lugar " + lu.nome + " nao pertence a " + this.nome);
        }
    }

}
