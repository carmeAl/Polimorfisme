import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Figura triangulo=new Triangulo(9.388,3.357);
        Figura circulo=new Circulo( 9.368);
        Figura rectangulo=new Rectangulo(6.689,1.161);
        Figura cuadrado=new Cuadrado(6.74,6.74);

        Figura[] List={triangulo,circulo,rectangulo,cuadrado};

        Arrays.sort(List, Comparator.comparing(Figura::area));

        double suma=0;
        for (Figura i : List) {
            System.out.print(i + " -> "+i.area()+"\n");
            suma=suma+ i.area();
        }
        System.out.print("La suma de las areas es: "+suma);
    }
}

abstract class Figura{
    public abstract double area();
}
class Triangulo extends Figura{
    private double b;
    private double h;
    public Triangulo(double b,double h){
        this.b=b;
        this.h=h;
    }
    public double area(){
        return (this.b*this.h/2);
    }
}
class Circulo extends Figura{
    private double r;
    public Circulo(double r){
        this.r=r;
    }
    public double area(){
        return (Math.PI*this.r*this.r);
    }
}
class Rectangulo extends Figura{
    private double l1;
    private double l2;
    public Rectangulo(double l1, double l2){
        this.l1=l1;
        this.l2=l2;
    }
    public double area(){
        return (this.l1*this.l2);
    }

}
class Cuadrado extends Rectangulo{
    public Cuadrado(double l1,double l2){
        super(l1,l2);
    }
}

