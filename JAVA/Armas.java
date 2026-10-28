package JAVA;

public class Armas
{
    //---------------------ATRIBUTOS----------------
    private String nombre;
    private int danyo;
    private int durabilidad;
   
    //--------------------CONTRUCTOR PIRNCIPAL---------------
    public Armas(String nombre, int danyo, int durabilidad)
    {
        this.nombre = nombre;
        this.danyo = danyo;
        this.durabilidad = durabilidad;
    }
   
    //-----------------------GETTERS / SETTERS---------------
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
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
   
    public int usarArma()
    {
        if (this.durabilidad > 0) 
        {
            this.durabilidad--;
        }
        if (this.durabilidad == 0)
        {
            System.out.println("Tu arma se ha roto");
        }
        return this.durabilidad;
}

}
