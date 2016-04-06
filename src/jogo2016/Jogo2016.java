package jogo2016;

import java.util.HashSet;
import java.util.Set;
import jogo2016.entidades.Lugar;
import jogo2016.entidades.Mapa;

public class Jogo2016 {

    public static void main(String[] args) {
        System.out.println("Início do Jogo");

        Mapa novoMapa = new Mapa("Spring Field");

        Lugar l0 = new Lugar("Fafiman");
        Lugar l1 = new Lugar("Casa do Homer");
        Lugar l2 = new Lugar("Casa do Fladers");
        Lugar l3 = new Lugar("Bar do Moe");
        Lugar l4 = new Lugar("Colégio");
        Lugar l5 = new Lugar("Usina");

        l1.adicionaVizinho(l2);
        l2.adicionaVizinho(l3);
        l3.adicionaVizinho(l4);
        l4.adicionaVizinho(l5);
        
        novoMapa.lugares.add(l1);
        novoMapa.lugares.add(l2);
        novoMapa.lugares.add(l3);
        novoMapa.lugares.add(l4);
        novoMapa.lugares.add(l5);
        
        novoMapa.setLugarInicialDoBandido(l0);
        novoMapa.setLugarInicialDoHeroi(l1);
        
        System.out.println("O lugar inicial do Bandido é "+novoMapa.getLugarInicialDoBandido());
        System.out.println("O lugar inicial do Heroi é "+novoMapa.getLugarInicialDoHeroi());

    }

}
