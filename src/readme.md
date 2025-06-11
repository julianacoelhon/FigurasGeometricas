# Atividade Java - Figuras Geométricas

Este projeto foi desenvolvido como parte de uma atividade prática para a disciplina Programação Orientada a Objetos.

## Objetivo

Implementar os conceitos de **herança** e **polimorfismo** em Java, utilizando figuras geométricas como exemplo. As classe desenvoldias foram:

- 'FiguraGeometrica' (classe abstrata)
- 'Retangulo'
- 'Triangulo'
- 'Circulo'
- 'Main' (classe com 'main()' para testes)

## Funionalidades

Cada figura geométrica:
 - Recebe seus atributos (base, altura ou raio).
 - Calula sua área através de método sobrescrito 'getArea()'.
 - Fornece uma descrição personalizada através de 'getDescricao()'.

Todos os objetos foram tratados como do tipo 'FiguraGeometrica' através de **polimorfismo** em uma lista 'ArrayList<FiguraGeometrica>'.

## Saída esperada (exemplo)
    Retângulo - Base: 5.0, Altura: 4.0
    Área da figura: 20,00
    Triângulo - Base: 6.0, Altura: 3.0
    Área da figura: 9,00
    Círculo - Raio: 2.5
    Área da figura: 19,63

## Tecnologias

- Java 17
- IntelliJ IDEA
- Git e GitHub