package JAVA;

public class Personajes
{


    private String nombre;
    private int vida = 100;
    private int danyo;
    private int numAtaque = 1;
    private int numArmas;


    public Personajes(String nombre, int vida, int danyo, int numAtaque, int numArmas)
    {
        this.nombre = "Desconocido";
        this.vida = vida;
        this.danyo = danyo;
        this.numAtaque = numAtaque;
        this.numArmas = numArmas;
    }
    // ------------ Setters / Getter--------------


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getVida() {
        return vida;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }


    public int getDanyo() {
        return danyo;
    }


    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }


    public int getNumAtaque() {
        return numAtaque;
    }


    public void setNumAtaque(int numAtaque) {this.numAtaque = numAtaque;}
    public int getnumArmas() {
        return numArmas;
    }


    public void setArmas(int numArmas) {
        this.numArmas = numArmas;
    }


    //------------------- Metodos de los personajes ---------------


    public int hacerDaño(int vida, int danyo)
    {
        vida = this.vida - danyo;
        return this.vida;
    }


    public int recibirDaño(int vida, int danyo)
    {
        vida = vida - this.danyo;
        return vida;
    }

}

