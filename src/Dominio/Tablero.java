/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Lula
 */
public class Tablero {

    public static void mostrarMatriz() {
        String[][] tablero = new String[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                tablero[i][j] = " ";
            }
        }

        for (int i = 0; i < 19; i++) {
            tablero[i][0] = " * ";
            tablero[i][6] = " * ";
            tablero[i][12] = " * ";
            tablero[i][18] = " * ";
        }
        for (int i = 0; i < 19; i++) {
            tablero[0][i] = " * ";
            tablero[6][i] = " * ";
            tablero[12][i] = " * ";
            tablero[18][i] = " * ";
        }

        for (int i = 1; i < 19; i += 6) {
            for (int j = 1; j < 19; j += 6) {
                for (int k = 0; k < 5; k++) {
                    tablero[i + k][j + 1] = "|";
                    tablero[i + k][j + 3] = "|";
                }

                for (int k = 0; k < 5; k++) {
                    tablero[i + 1][j + k] = "-";
                    tablero[i + 3][j + k] = "-";
                }
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public void iluminar(String pos) {
        //
    }
    public void marcarX(String pos) {
        //
    }
    public void marcarO(String pos) {
        //
    }
    
    public void miniMat(){
        String[][] tablerito = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 != 0 && j % 2 != 0){
                    tablerito[i][j] = "+";
                } else if (i % 2 == 0 && j % 2 != 0) {
                    tablerito[i][j] = "-"; 
                } else if (j % 2 == 0 && i % 2 != 0) {
                    tablerito[i][j] = "|";
                } else {
                    tablerito[i][j] = " ";
                }
            }
        }
    }
    
    public void granMat(){
        String[][] tablero = new String[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i%2 == 0 || j%2 == 0){
                    tablero[i][j] = "*";
                }
                else {
                    tablero[i][j] = " ";
                }
                
                if (tablero[i][j].equals(" ")){
                    tablero[i][j] = miniMat();
                }
            }
        }    
    }
}
