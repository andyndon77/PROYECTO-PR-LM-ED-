class TripleT extends Personajes implements IAcciones
{
    protected Inventario inventario;

    public TripleT(String nombre, int vida, int danyo, int numAtaque, int numArmas, boolean estaVivo)
    {
        super(nombre, vida, danyo, numAtaque, numArmas, estaVivo);
        setDanyo(10);
        setVida(100);
        this.inventario = new Inventario(5, 3);
    }

    public void caminar()
    {
        System.out.println(getNombre() + " y Aleister caminan 100 metros");
    }

    public void atacar()
    {
        System.out.println(getNombre() + " es tu turno de atacar, aprovechalo");
    }
    public void serAtacado()
    {
        System.out.println(getNombre() + " has recibido un ataque enemigo");
    }
    
    public void muerto()
    {
        System.out.println(getNombre() + " ha muerto");
        System.out.println("El enemigo es demasiado fuerte para ti, eres débil.");
    }

    public void mostrarInventario()
    {
        inventario.mostrarInventario();
    }

    public boolean añadirArma(Armas arma)
    {
       return inventario.añadirArma(arma);
    }



    public boolean añadirPocion(Pocion pocion)
    {
        return inventario.añadirPocion(pocion);
    }
    
    public int Atacar(Personajes objetivo, Armas arma)
    {
        int total = danyo * numAtaque + arma.getDanyo();
        objetivo.recibirDanyo(total);
        System.out.println(getNombre() + " le hace " + total + " de daño a " + objetivo.getNombre()+ " con " + arma.getNombre() + ". Le quedan " + objetivo.getVida() + " puntos de vida");
        return total;
    }


    public int getNumArmas()
    { 
        return inventario.getNumArmas();
    }
    public Armas getArma(int i)
    {
        return inventario.getArma(i);
    }
    public int getNumPociones(){
        return inventario.getNumPociones(); 
    }
    public Pocion getPocion(int i)  
    { 
        return inventario.getPocion(i);
    }

}