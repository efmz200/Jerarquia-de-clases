public class Triangulo extends Figura implements Comparable<Triangulo> {

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
    public int compareTo(Triangulo trianPorComparar) {
        double areaPorComparar = trianPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosPorComparar = trianPorComparar.cantLados();
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