
import java.util.Scanner;

public class Aula01{
  public static void main(String[] args){

    // abro um Scanner de entrada pro sistema (Terminal)
    Scanner in = new Scanner(System.in);

    String nome = in.nextLine();
    long telefone = in.nextLong();
    String serie = in.nextLine();
    
    double nota1 = 8.00;
    System.out.println("a nota esta ok!");
    double nota2 = 6.0;
    double media = ((nota1 + nota2)/2.0);
    
    System.out.println("---------------------");
    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + telefone);
    System.out.println("Série: " + serie);
    System.out.println("---------------------");
    System.out.println("Média = " + media);
    System.out.println("---------------------");    

    // fecho meu Scanner
    in.close();
  }

}