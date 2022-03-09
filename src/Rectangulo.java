public class Rectangulo extends Figura implements Comparable<Rectangulo> {
    private double base;
    private double altura;

    public Rectangulo(double pBase, double pAltura){
        base   = pBase;
        altura = pAltura;
    }

    
    @Override
    public double calcularArea(){         
        return base * altura;     
    }

    @Override
    public int cantLados() {        
        return 4;
    }          

    @Override
    public int compareTo(Rectangulo rectPorComparar) {
        
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosPorComparar = rectPorComparar.cantLados();
        int misLados = cantLados();

        if((miArea==areaPorComparar)&&(ladosPorComparar==misLados)){
            return 0;
        }
        else if((miArea > areaPorComparar)&&(ladosPorComparar==misLados)){
            return 1;
        }
        else{
            return -1;
        }        
    }
      
}
