public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Testando Retornos");

        double areaQuadrado = retorno.area(6);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = retorno.area(6, 7);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = retorno.area(5, 6, 7);
        System.out.println("Area do trapezio: " + areaTrapezio);
    }
}
