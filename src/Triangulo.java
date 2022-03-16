public class Triangulo extends Figura implements Comparable<Figura> {

    private double base;
    private double altura;
    public Triangulo(Double base, Double altura){
        this.base=base;
        this.altura=altura;    
    }
    @Override
    public double calcularArea() {
        double area = base * altura / 2;
        return area;
    }

    @Override
    public int cantLados() {
        return 3;
    }
    @Override
    public int compareTo(Figura trianPorComparar) {
        double areaPorComparar = trianPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosPorComparar = trianPorComparar.cantLados();
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