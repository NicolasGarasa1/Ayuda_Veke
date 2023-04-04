package Guia_Objetos_Figuras.Circulo;
import Guia_Objetos_Figuras.Figura.Figura;
public final class Circulo extends Figura {
    // ATRIBUTOS
    private double Radio;
    public static double Pi = 3.1415296;

    // CONSTRUCTOR
    public Circulo(){
        super();
    }
    public Circulo(String _Color){
        super(_Color);
    }
    public Circulo(String _Color, double _Radio){
        super(_Color);
        this.Radio = _Radio;
    }

    // METODOS
    public void Mostrar_Info(){
        System.out.print("\n Color:"+this.Color+".");
        System.out.print("\n Radio:"+this.Radio+".");
        System.out.print("\n Area:"+this.Retornar_Area()+".");
        System.out.print("\n Perimetro:"+this.Retornar_Perimetro()+".");
    }

    // OVERRIDE
    @Override
    public double Retornar_Perimetro(){
        return (this.Radio*2*3.1415926);
    }
    @Override
    public double Retornar_Area(){
        return (this.Radio*this.Radio*3.1415926);
    }

    // GETTERS AND SETTERS



}
