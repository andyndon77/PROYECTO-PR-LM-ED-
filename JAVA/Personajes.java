public class Personajes
{


    protected String nombre;
    protected int vida = 100;
    protected int danyo;
    protected int numAtaque = 1;
    protected int numArmas;
    private boolean estaVivo;

    //constructor del heroe
    public Personajes(String nombre, int vida, int danyo, int numAtaque, int numArmas, boolean estaVivo)
    {
        this.nombre = nombre;
        this.vida = vida;
        this.danyo = danyo;
        this.numAtaque = numAtaque;
        this.numArmas = numArmas;
    }

    //constructor de los enemigos
    public Personajes(String nombre, int vida, int danyo, int numAtaque)
    {
        this.nombre = nombre;
        this.vida = vida;
        this.danyo = danyo;
        this.numAtaque = numAtaque;
    }
    // ------------ Setters / Getter--------------


    public String getNombre()
    {
        return nombre;
    }


    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }


    public int getVida()
    {
        return vida;
    }


    public void setVida(int vida)
    {
        this.vida = vida;
    }


    public int getDanyo()
    {
        return danyo;
    }


    public void setDanyo(int danyo)
    {
        this.danyo = danyo;
    }


    public int getNumAtaque()
    {
        return numAtaque;
    }


    public void setNumAtaque(int numAtaque)
    {
        this.numAtaque = numAtaque;
    }
    public int getnumArmas()
    {
        return numArmas;
    }

    public void setArmas(int numArmas)
    {
        this.numArmas = numArmas;
    }


    //------------------- Metodos de los personajes ---------------


    public int hacerDanyo(Personajes objetivo)
    {

        int total = danyo * getNumAtaque();
        objetivo.recibirDanyo(total);
        System.out.println(getNombre() + " le hace " + total + " de daño a " + objetivo.getNombre() + "Le quedan " + objetivo.getVida() + " puntos de vida");
        return total;

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

    public int Atacar(Personajes objetivo)
    {
        return hacerDanyo(objetivo);
    }

    public boolean estaVivo()
    {
        return vida > 0;
    }

}

