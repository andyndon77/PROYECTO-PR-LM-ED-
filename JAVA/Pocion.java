package JAVA;

public class Pocion
{
    private int Cura;
    private int Cantidad;

    //----------------CONSTRUCTOR-------------

    public Pocion(int Cura, int Cantidad)
    {
        this.Cura = 25;
        this.Cantidad = Cantidad;
    }
    
    //---------------------------GETTERE/SETTERS------------------
    public int getCura()
    {
        return Cura;
    }
    public void setCantidadCura(int Cura)
    {
        this.Cura = Cura;
    }

    public int getCantidad()
    {
        return Cantidad;
    }
    public void setCantidad(int cantidad)
    {
        Cantidad = cantidad;
    }

    //---------------------METODOS----------------
    public void MostrarPocion()
    {
        System.out.println("La pocion te cura" + Cura + " puntos de salud");
        System.out.println("Te quedan un total de " + Cantidad + " pociones");
    }
}
