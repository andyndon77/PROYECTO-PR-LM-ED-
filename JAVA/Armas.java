package JAVA;

public class Armas
{
    //---------------------ATRIBUTOS----------------
    private int danyo;
    private int durabilidad;
   
    //--------------------CONTRUCTOR PIRNCIPAL---------------
    public Armas(int danyo, int durabilidad)
    {
        this.danyo = danyo;
        this.durabilidad = durabilidad;
    }
   
    //-----------------------GETTERS / SETTERS---------------
    public int getDanyo() {
        return danyo;
    }


    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }


    public int getDurabilidad() {
        return durabilidad;
    }


    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }


    //-----------------METODOS-------------
   
    public int DuracionArma(int durabilidad)
    {
        while(durabilidad != 0)
        {
            this.durabilidad = --durabilidad;
            return durabilidad;
        }
        System.out.print("Tu arma se ha roto");
        setDurabilidad(durabilidad);
        return durabilidad;
    }

}
