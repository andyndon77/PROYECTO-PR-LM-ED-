package JAVA;

class Bate extends Armas
{
    
    public Bate(int numArma, String nombre, int danyo, int durabilidad)
    {
        super(numArma, nombre, danyo, durabilidad);
        setDanyo(15);
        setNumArma(1);
    }

    public void Descripcion()
    {
        System.out.println("Este sera tu arma principal y la que mas te beneficiara.");
        System.out.println("Te bonificara mas el daño que otras armas, no la malgastes");
    }

}