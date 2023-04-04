package Guia_Objetos_Figuras.Rectangulo;
import Guia_Objetos_Figuras.Figura.Figura;

public class Rectangulo extends Figura {
    // ATRIBUTOS
    protected double Altura;
    protected double Ancho;


    // CONSTRUCTORES
    public Rectangulo(){
        super();
    }
    public Rectangulo(String _Color){
        super(_Color);
    }
    public Rectangulo(double _Altura, double _Ancho, String _Color){
        super(_Color);
        this.Altura = _Altura;
        this.Ancho = _Ancho;
    }

    // METODOS
    public void MostrarInfo(){
        System.out.print("\n Color:"+this.Color+".");
        System.out.print("\n Altura:"+this.Altura+".");
        System.out.print("\n Ancho:"+this.Ancho+".");
        System.out.print("\n Area:"+this.Retornar_Area()+".");
        System.out.print("\n Perimetro:"+this.Retornar_Perimetro()+".");
    }
    public static void MostrarFormulaArea(){
        System.out.print("\n Area de un rectangulo: Alto por Ancho.");
    }

    // OVERRIDE
    @Override
    public double Retornar_Perimetro(){
        return (this.Altura*2+this.Ancho*2);
    }
    @Override
    public double Retornar_Area(){
        return (this.Altura*this.Ancho);
    }

    // GETTERS AND SETTERS

}
