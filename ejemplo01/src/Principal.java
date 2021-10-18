//package ejemplo01;

public class Principal {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------
//creo el objeto "cuadrado" 
//--------------------------------------------------------------------------------
        Cuadrado cuadrado=new Cuadrado();//invoco la clase "cuadrado" y genero objeto
        cuadrado.lado=4;                 //Instancio el atributo "lado" con valor 
//--------------------------------------------------------------------------------
//calcular area
//--------------------------------------------------------------------------------
        int resultado_area=cuadrado.calcularArea();//declaro variable resultado_area
                                                   //como entero y cargo el valor de retorno
                                                   //del metodo "calculaArea"
//--------------------------------------------------------------------------------
//calcular perimetro
//--------------------------------------------------------------------------------
        int resultado_perimetro=cuadrado.calcularPerimetro();//declaro variable resultado_perimetro
                                                        //como entero y cargo el valor de retorno
                                                        //del metodo "calculaArea
        System.out.println("La superficie total del cuadrado es :" + resultado_area);
        System.out.println("El perimetro total del cuadrado es : " + resultado_perimetro);
    }
}