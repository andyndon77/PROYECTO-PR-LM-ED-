public class Pocion
{
    private int Cura;
    private int Cantidad;

    //----------------CONSTRUCTOR-------------

    public Pocion(int Cura, int Cantidad)
    {
        this.Cura = Cura;
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
        System.out.println("La pocion te cura " + getCura() + " puntos de salud");
        System.out.println("Te quedan un total de " + getCantidad() + " pociones");
    }
    
    public boolean UsarPocion(TripleT heroe)
    {
        if (Cantidad > 0)
        {
            Cantidad--;
            heroe.setVida(heroe.getVida() + getCura());
            if (heroe.getVida() > 100)
                {
                    heroe.setVida(100);
                    System.out.println(heroe.getNombre() + ", ahora tienes " + heroe.getVida() + " puntos de salud");
                    return true;
                }
            else
            {
                System.out.println("Vida: " + heroe.getVida() + " HP");
                return true;
            }
        }
        System.out.println("Te has quedado sin pociones de este tipo");
        return false;
    }
}
