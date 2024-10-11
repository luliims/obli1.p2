/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Lula
 */
public class Jugador {

    private String nombre;
    private int edad;
    private String alias; //puede ser de tipo alias
    private int puntaje; //puede ser de tipo ranking
    private boolean jugadaMagica;

    public Jugador(String nombre, int edad, String alias, int puntaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.alias = alias;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String unAlias) {
        alias = unAlias;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int unPuntaje) {
        puntaje = unPuntaje;
    }

    public boolean getJugadaMagica() {
        return jugadaMagica;
    }

    public void setJugadaMagica() {
        jugadaMagica = false;
    }
    @Override
    public boolean equals(Object obj) {
        return this.getAlias().equals(((Jugador) obj).getAlias());
    }
}
