class Bate extends Armas
{
    private int danyoAdicional;
    
    public Bate(String nombre, int danyo, int durabilidad, int danyoAdicional)
    {
        super(nombre, danyo, durabilidad);
        this.danyoAdicional = 3;
    }

    public void setDanyoAdiocional(int danyoAdicional)
    {
        this.danyoAdicional = danyoAdicional;
    }

    public int getDanyoAdicional(int danyoAdicional)
    {
        return this.danyoAdicional;
    }

    public void Descripcion()
    {
        System.out.println("Este sera tu arma principal y la que mas te beneficiara.");
        System.out.println("Te bonificara mas el daño que otras armas, no la malgastes");
    }

    @Override
    public void setDanyo(int danyio)
    {
        super.setDanyo(getDanyo() + danyoAdicional);
    }
}