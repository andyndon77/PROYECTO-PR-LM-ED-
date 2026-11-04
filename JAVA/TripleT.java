package JAVA;

class TripleT extends Personajes implements IAcciones
{
    public TripleT(String nombre, int vida, int danyo, int numAtaque, int numArmas)
    {
        super(nombre, vida, danyo, numAtaque, numArmas);
        setDanyo(10);
        setVida(100);
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
}