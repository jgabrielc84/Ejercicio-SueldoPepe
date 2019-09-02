public class Empleado {

    private int inasistencia;
    private Categoria categoria;
    private BonoPres bonoP;
    private BonoRes bonoR;

    public void Empleado(int inasistencia, Categoria categoria, BonoPres bonoP, BonoRes bonoR) {
        this.inasistencia = inasistencia;
        this.categoria = categoria;
        this.bonoP = bonoP;
        this.bonoR = bonoR;
    }

    public void setInasistencia(int inasistencia) {
        this.inasistencia = inasistencia;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setBonoP(BonoPres bonoP) {
        this.bonoP = bonoP;
    }

    public void setBonoR(BonoRes bonoR) {
        this.bonoR = bonoR;
    }

    public double calcSueldo() {
        return this.categoria.getNeto() + this.bonoP.calcBono(this.inasistencia) + this.bonoR.calcBono(this.categoria.getNeto());
    }

}
