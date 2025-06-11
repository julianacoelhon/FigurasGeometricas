import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setNome("Retângulo");
        retangulo.setBase(5.0);
        retangulo.setAltura(4.0);

        Triangulo triangulo = new Triangulo();
        triangulo.setNome("Triângulo");
        triangulo.setBase(6.0);
        triangulo.setAltura(3.0);

        Circulo circulo = new Circulo();
        circulo.setNome("Círculo");
        circulo.setRaio(2.5);

        // Adiciona as figuras geometricas em uma lista
        List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
        listaFigurasGeometricas.add(retangulo);
        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);

        // Mostra dados das figuras geometricas
        for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
            System.out.println(figuraGeometrica.getDescricao());
            System.out.printf("Área da figura: %.2f \n", figuraGeometrica.getArea());
        }
    }
}
