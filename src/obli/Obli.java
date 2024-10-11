/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obli;

import java.util.Scanner;

/**
 *
 * @author Lula
 */
public class Obli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        private Interfaz interfaz; 
        private Sistema sistema;
        menu();
    }

    private static void menu() {
        Scanner in = new Scanner(System.in);
        String op = in.nextLine().toUpperCase();
        switch (op){
            case "A":
                registrarJugador();
                break;
            case "B":
                mostrarMatriz();
                elegirJugadores();
                break;
            case "C": 
                mostrarMatriz();
                ejegirJugador();
                break;
            case "D":
                ranking();
                break;
            case "E": 
                terminar();
                break;
        }
    }
    
}
