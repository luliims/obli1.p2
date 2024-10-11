/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Lula
 */
public class Jugada {
    private Interfaz interfaz;
    private Tablero tablero;

    public void tatetiPersonas(String j1, String j2) {
        int cont = 1;
        String ju1 = (interfaz).elegirLugar();
        (tablero).iluminar(ju1);
        (tablero).marcarX(ju1);
        cont++;
        while (/*!terminar || nadie ganó y hay jugadas posibles*/) {
            
        }   
    }

    public void tatetiCompu(Jugador j) {

        //terminar
    }

    public boolean validarJugada(String pos, int cont, Jugador j) { 
        boolean res = false;
        if (pos.equals("A1") || pos.equals("A2") || pos.equals("A3") || pos.equals("B1")
                || pos.equals("B2") || pos.equals("B3") || pos.equals("C1") || pos.equals("C2") || pos.equals("C3")) {
            res = true;
        }
        if (pos.equals("X")) {
            terminar(cont);
            res = true;
        }
        if (pos.equals("M")){
            jugadaMagica(j);
            res = true;
        }
        return res;
    }

    public void terminar(int quien) {
       //si quien es par pierde j2, si es impar j1
       if(quien%2==1){ //pierde j1
           //(jugador). //falta saber quienes son j1 y j2
       } else{ //pierde j2
           
       }
    }
    
    public String jugadaAnt(String act){
        String aux = act;
        return aux;
    }
    
    public void jugadaMagica(Jugador j){
        String pos = (interfaz).elegirLugar();
        
    }
}
