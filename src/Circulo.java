public class Circulo extends Figura implements Comparable<Circulo> {
    private double pi;
    private double radio;
        
    public Circulo(double radio){
        this.radio = radio; 
        pi= Math.PI;
    } 

    @Override
    public double calcularArea() {    
        double area;
        area= pi*(Math.pow(radio,2));
        return area;
    }

    @Override
    public int cantLados() {
        return 0;
    }

    public int compareTo(Circulo circulo2) {
        double areaPorComparar = circulo2.calcularArea();
        double miArea = calcularArea();
        int ladosPorComparar = circulo2.cantLados();
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
