# Estruturas de Seleção `if - else if - else`

## Estrutura `if` - *Se*

Testa se alguma coisa é verdade e se for verdade, executa o bloco de código da estrutura.

```java

if ( /*condição*/ ){
  //seu código se for verdade
}
```

Exemplo:
```java
double nota = 8.0

if (nota > 7.0) {
  System.out.println("Aluno aprovado!");
}

if(nota <= 7.0){
  System.out.println("Aluno em recuperação");
}
```
## Estruta `if-else` - *Se-Senão*

Melhorando e simplicando nosso exemplo anterior:
```java
double nota = 8.0

if (nota > 7.0) {
  System.out.println("Aluno aprovado!");
} else {
  System.out.println("Aluno em recuperação");
}
```

sintaxe:

```java
if ( /*condição*/ ){
  // código se for verdade
} else {
  // código se for falso
}
```

```java
if(nota > 7.0){
  System.out.println("Aluno aprovado!");
} else {
  if( nota >= 4.0 ) {
    System.out.println("Aluno em recuperação");
  } else {
    System.out.println("Aluno reprovado!");
  }
}
```

Este código pode ser melhorado:

## Estrutura `if-else if-else`

```java
if(nota > 7.0){
  System.out.println("Aluno aprovado!");
} else if ( nota >= 4.0 ) {
  System.out.println("Aluno em recuperação");
} else {
  System.out.println("Aluno reprovado!");
}
```

sintaxe:

```java
if(/*condição1*/){
  // código se a 1 for verdade
} else if (/*condição2*/) {
 // condição se a 2 for verdade
} else if (/*condição3*/) {
 // condição se a 3 for verdade
} else {
  // condições se todas forem falsas
}
```