package JAVA;

public class Personajes
{


    protected String nombre;
    protected int vida = 100;
    protected int danyo;
    protected int numAtaque = 1;
    protected int numArmas;


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


    public int hacerDanyo(int vida, int danyo)
    {
        vida = vida - danyo;
        System.out.println("Le has hecho " + danyo + " de daño. Le quedan " + vida + " puntos de vida");
        return vida;

    }


    public int recibirDanyo(int danyo)
    {
        this.vida -= danyo;
        if(this.vida < 0)
        {
            this.vida = 0;
        }
        return this.vida;
    }

}

