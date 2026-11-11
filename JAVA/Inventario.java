public class Inventario
{
    private Armas[] armas;
    private int numArmas;

    private Pocion[] pociones;
    private int numPociones;

    public Inventario(int capacidadArmas, int capacidadPciones)
    {
        armas = new Armas[capacidadArmas];
        numArmas = 0;
        pociones = new Pocion[capacidadPciones];
        numPociones = 0;
    }

    public boolean añadirArma(Armas arma)
    {
       if (numArmas >= armas.length)
        {
            System.out.println("No te caben mas Armas");
            return false;
        }
        armas[numArmas] = arma;
        numArmas++;
        return true;
    }

    public boolean añadirPocion(Pocion pocion)
    {
        if (numPociones >= pociones.length)
        {
            System.out.println("No te queda mas espacio para las pociones");
            return false;
        }
        pociones[numPociones] = pocion;
        numPociones++;
        return true;
    }

    //----------GETTER/SETTERS EXTERNOS-----------------
    public int getNumArmas()
    {
        return numArmas;
    }

    public Armas getArma(int i)
    {
        return armas[i];
    }

    public int getNumPociones()
    {
        return numPociones;
    }

    public Pocion getPocion(int i)
    {
        return pociones[i];
    }

    public void mostrarInventario()
    {
        System.out.println("--- TUS ARMAS ---");
        if (numArmas == 0) {
            System.out.println("No tienes armas en la mochila.");
        }
        else
        {
            for (int i = 0; i < numArmas; i++)
            {
                System.out.println((i + 1) + ". " + armas[i].getNombre()); 
            }
        }
        System.out.println("--- TUS POCIONES ---");
        if (numPociones == 0)
        {
            System.out.println("No tienes pociones.");
        }
        else
        {
            for (int i = 0; i < numPociones; i++)
            {
                System.out.println((i + 1) + ". Poción disponible");
                pociones[i].MostrarPocion();  
            }
        }
    }
    
    //metodo para revisar armas y ver con cual quiere atacar
    public void mostrarArmas()
    {
        System.out.println("-------------ARMAS--------------");
        if (numArmas == 0) {
            System.out.println("No tienes armas en la mochila.");
        } else {
            for (int i = 0; i < numArmas; i++)
            {
                System.out.println((i + 1) + ". " + armas[i].getNombre() + " (Daño: +" + armas[i].getDanyo() + " | Durabilidad: " + armas[i].getDurabilidad() + ")");
            }
        }
    }
    public void mostrarPociones()
    {
        System.out.println("----------------POCIONES--------------");
        if (numPociones == 0) {
            System.out.println("No tienes pociones.");
        } else {
            for (int i = 0; i < numPociones; i++) {
                System.out.print((i + 1) + ". ");
                pociones[i].MostrarPocion(); 
            }
        }
    }
}
