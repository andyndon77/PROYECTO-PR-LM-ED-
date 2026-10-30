package JAVA;
import java.util.Random;

class BallerinaC extends Personajes
{
    Random rd = new Random();

    public BallerinaC(String nombre, int vida, int danyo, int numAtaque, int numArmas)
    {
        super(nombre, vida, danyo, numAtaque, numArmas);
        setDanyo(10);
    }

    public int selectNumtAtack()
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
}    
