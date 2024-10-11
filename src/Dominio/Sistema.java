/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author Lula
 */
public class Sistema {
    private ArrayList<Jugador> listaJugadores;
    private ArrayList<String> listaJugadas;
    
    public ArrayList<String> getListaJugadas(){
        return listaJugadas;
    }
    public void agregarPos(String pos){
        listaJugadas.add(pos);
    }
    public Sistema() {
        this.listaJugadores = new ArrayList<>();
        this.listaJugadas = new ArrayList<>();
    }
    
    
}
