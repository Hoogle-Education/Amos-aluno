# Introdução ao java

## Código Base para um programa em Java

```java
public class Program{
  public static void main(String[] args){
    //seu código aqui
  }
}
```

A `main` é o ponto de entrada(*entrypoint*) do nosso código, todo nosso código inicial deve estar contido nela, para que o compilador busque e comece a executar a partir dela.

## Princípio da Saída

É o que já fazemos atraés do comando:

```java
  System.out.println("Hello World!");
```

## Variaveis no Java

Variáveis guardam informações para que possamos reutilizar ou operar ao longo do nosso código.

|Variável|Keyword(palavra-chave)|O que faz?|
|:--:|:--:|:--:|
|Inteiro|`int`|Guarda um número inteiro|
|Real|`float`|Guarda um número com ponto flutuante|
|Real|`double`|É um `float` com mais casas de precisão.|
|Caracter|`char`|Guarda um caracter|
|Frase|`String`|Guarda uma cadeia de caracteres|

# Princípio das Entradas

Para fazer entrada no Java, utilizamos uma variável do tipo `Scanner`. Ela deve ser criada da seguinte forma:

```java
  Scanner teclado = new Scanner(System.in);
```

|comando|dado registrado|
|:--:|:--:|
|`teclado.next()`|Puxa a próxima `String`, até ler um espaço ou um enter|
|`teclado.nextInt()`|Puxa o próximo dado do terminal no formato de número inteiro|
|`teclado.nextDouble()`|Puxa o próximo número real|
|`teclado.nextLine()`|Puxa toda a linha para a `String`|

### Não pode esquecer

A `Scanner` precisa ser puxada do pacote `java.util.Scanner`.


```java

import java.util.Scanner;

public class MyClass{
 // ...
}
```