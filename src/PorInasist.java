public class PorInasist extends BonoPres {

    @Override
    public double calcBono(int inasistencia) {
        if(inasistencia == 0){
            return 100;
        }
        if(inasistencia == 1){
            return 50;
        }
        return 0;
    }

}
