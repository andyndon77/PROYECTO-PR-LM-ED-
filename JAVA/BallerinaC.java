package JAVA;
import java.util.Random;

class BallerinaC extends Personajes
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
}    
