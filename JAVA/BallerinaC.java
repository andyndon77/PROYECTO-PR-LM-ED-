import java.util.Random;
class BallerinaC extends Personajes implements IEnemigos
{
    Random rd = new Random();

    public BallerinaC(String nombre, int vida, int danyo, int numAtaque)
    {
        super(nombre, vida, danyo, numAtaque);
        setVida(60);
        setDanyo(15);
    }

    public int selectNumtAtack()    //Decido cauntos ataques hara ballerina
    {
        int ataque = rd.nextInt(100) + 1;

        if (ataque <= 60) {
            setNumAtaque(1);
        } else if (ataque < 90) {
            setNumAtaque(2);
        } else {
            setNumAtaque(3);
        }

        return getNumAtaque();
    }
    @Override
    public int Atacar(Personajes objevito)
    {
        selectNumtAtack();
        System.out.println("Ballerina gira y lanza " + getNumAtaque() + " patada/s");
        return super.Atacar(objevito);
    }

    public void Presentacion()
    {
        System.out.println("Buenos dias pequenyo. Veo que no estas aqui para hablar.");
        System.out.println("Me acompanyarias en este baile?");
    }

        public void Derrotado(Personajes TripleT)
    {
        System.out.println("Maldito" + TripleT.getNombre() + " TripleT.");
        System.out.println("Me habras podido vencer a mi, pero no a los Hermanos Garam");
    }

    public void enfurecerse()
    {
        System.out.println("Te voy a ensenyar el poder de mis patadas");
    }

    public void Victoria()
    {
        System.out.println("JO JO JO JO JO. No eres digno de bailar conmigo.");
    }
}    
