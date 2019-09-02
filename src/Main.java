import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Categoria categoria = new Gerente();
        BonoPres bonoP = new PorInasist();
        BonoRes bonoR = new Porcentaje();

        Empleado empleado = new Empleado();
        empleado.setInasistencia(0);
        empleado.setCategoria(categoria);
        empleado.setBonoP(bonoP);
        empleado.setBonoR(bonoR);

        double sueldo = empleado.calcSueldo();

        //System.out.println("El sueldo del empleado es: " + sueldo);
        JOptionPane.showMessageDialog(null, "El sueldo del empleado es: " + sueldo);
    }
}
