import java.util.Scanner;

public class decisao {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int p = teclado.nextInt();
    int r = teclado.nextInt();

    if ( p == 0 ){
      System.out.println("C");
    } else if ( r == 0 ){
      System.out.println("B");
    }else {
      System.out.println("A");
    }

  }

}
