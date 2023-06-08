# Operadores Lógicos

Introdução:

```java
boolean poDeCafe = true, agua = true;

if(poDeCafe == true){
  if(agua == true){
    System.out.println("posso fazer café");
  }
}
```

Mehoria:
```java
boolean poDeCafe = true, agua = true;

if(poDeCafe == true && agua == true ){
  System.out.println("posso fazer café");
}
```

## Os operadores

**1. "and" (`&&`):** Precisamos que uma condição **e** outra sejam verdade para que retorne verdade.

**2. "or" (`||`):** Precisamos que apenas um destes seja verdade para que a condição seja executada.

## Estudando todas as possibilidades

Tabela verdade.

|**A**|`and`|**B**|**Result**|
|:-:|:-:|:-:|:-:|
|`True`|`and`|`True`|`True`|
|`False`|`and`|`True`|`False`|
|`True`|`and`|`False`|`False`|
|`False`|`and`|`False`|`False`|

|**A**|`or`|**B**|**Result**|
|:-:|:-:|:-:|:-:|
|`True`|`and`|`True`|`True`|
|`False`|`and`|`True`|`True`|
|`True`|`and`|`False`|`True`|
|`False`|`and`|`False`|`False`|

# Operadores Aritméticos

Operadores aritméticos servem para otimizar a nossa escrita de algumas expressões aritméticas.

**Aritmética:** ligada ao estudo das operações básicas entre os números.

## Operadores com `=`

```java
int a = 1;
a = a + 1;  // a = 1 + 1
System.out.println(a); // a = 2
```

poderíamos substituir
```java
  a += 1; // a = a + 1
```

O código acima funciona pois apenas um operador `=` deve ser lido como **recebe/receba/atribua** e quando temos `==` estamos fazendo referência a comparação entre duas variáveis. 

Temos também alguns operadores que se misturam com o `=`:

|Operador|Expressão|Simplificação|Significado|
|:-:|:-:|:-:|:-:|
|`+=`|`a += b`|`a = a + b`|Some em `a` o valor de `b`|
|`-=`|`a -= b`|`a = a - b`|Retire de `a` o valor de `b`|
|`*=`|`a *= b`|`a = a*b`|Multiplique `a` por `b`|
|`/=`|`a /= b`|`a = a/b`|`a` recebe `a` dividido por `b`|

## Operador diferente `!`

O operador geral de negação enquanto estamos programando é `!`, então temos:

```
!true -> false
!false -> true
!= -> diferente -> não igual
```

## Operador Ternário `?`

`int a = (2 > 1) ?  5 : 2`

equivalente a:

```java
if( 2 > 1 ){
  a = 5;
} else {
  a = 2;
}
```
