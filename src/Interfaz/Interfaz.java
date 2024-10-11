/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Dominio.Jugada;
import Dominio.Jugador;
import Dominio.Sistema;
import java.util.Scanner;

/**
 *
 * @author Lula
 */
public class Interfaz {
    Jugada jugada = new Jugada();
    Sistema sistema = new Sistema();

    public Interfaz(Sistema sistema, Jugada jugada) {
        this.sistema = sistema;
        this.jugada = jugada;
    }

    
    public void registrarJugador(){
        Scanner in = new Scanner(System.in);
        Jugador j1  = new Jugador();
        System.out.print("nombre: ");
        System.out.println();
        String name = in.nextLine();
        j1.setNombre(name);
        
        System.out.print("edad: ");
        System.out.println();
        int age = in.nextInt();
        j1.setEdad(age);
        in.nextLine();
        
        System.out.print("alias: "); //chequear que no exista el alias con for
        System.out.println();
        String user = in.nextLine();
        j1.setAlias(user);
    }
    public void elegirJugadores(){ //hacer un for o indedxOf para encontrar que "numero" de jugador es
        Scanner in = new Scanner(System.in);
        String j1 = in.nextLine();
        while(!sistema.listaDeAlias.contains(j1)){
            System.out.println("No existe ese jugador");
            j1 = in.nextLine();
        }
        String j2 = in.nextLine();
        while(!j1.equals(j2) || !(sistema).listaDeAlias.contains(j2)){
            System.out.println("No existe ese jugador");
            j2 = in.nextLine();
        }
        (jugada).tatetiPersonas(j1, j2); //dar el jugador no el string
    }
    
    public void elegirJugador(){
        Scanner in = new Scanner(System.in);
        String j = in.nextLine();
        while(!Jugador.listaDeAlias.contains(j)){
            System.out.println("No existe ese jugador");
            j = in.nextLine();
        }
        (jugada).tatetiCompu(j);
    }
    
    public String elegirLugar(){ 
        Scanner in = new Scanner(System.in);
        String pos = in.nextLine();
        boolean val = (jugada).validarJugada(pos); //falta saber que jugador es and demais
        while(!val){
            pos = in.nextLine();
        }
        return pos;
        (sistema).agregarPos(pos);
        //hacer un case que a san las filas tanto, b las filas tanto y así y guardar un registro de la combinacion
    }
}
