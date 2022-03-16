public class Rectangulo extends Figura implements Comparable<Figura> {
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
    public int compareTo(Figura rectPorComparar) {
        
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosPorComparar = rectPorComparar.cantLados();
        int misLados = cantLados();

        //el area es igual a la que se comprara y tiene los mismos lados
        if((miArea==areaPorComparar)&&(ladosPorComparar==misLados)){
            return 0;
        }
        //mi area es mayor que la que se compara y tiene los mismos lados
        else if((miArea > areaPorComparar)&&(ladosPorComparar==misLados)){
            return 1;
        }
        //mi area es menor que la que compara y tiene los mismos lados
        else if((miArea < areaPorComparar)&&(ladosPorComparar==misLados)){
            return -1;
        }
        // la cantidad de lados es diferente 
        else{
            return -2;
        }        
    }
      
}
