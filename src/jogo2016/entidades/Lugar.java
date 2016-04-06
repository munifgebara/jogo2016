package jogo2016.entidades;

import java.util.HashSet;
import java.util.Set;

public class Lugar {

    public String nome;
    public Set<Lugar> vizinhos;
    Set<Personagem> personagens;
    Set<Objeto> objetos;
    
    public Lugar(String n){
        vizinhos=new HashSet<>();
        nome=n;
    }
    
    public void adicionaVizinho(Lugar v){
        vizinhos.add(v);
        v.vizinhos.add(this);
    }

}
