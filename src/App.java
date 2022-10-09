import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      double nota1;
      double nota2;
      double nota3;
      double nota4;
      double soma;

      System.out.println ("informe a nota 1:");
      nota1 = ler.nextDouble();

     System.out.println ("informe a nota 2:");  
    nota2 = ler.nextDouble();

    System.out.println ("informe a nota 3:");
    nota3 = ler.nextDouble();

    System.out.println ("informe a nota 4:");
    nota4 = ler.nextDouble();
    ler.close();
    
    soma = (nota1 + nota2 + nota3 + nota4) /4;

    System.out.println ("A media foi:" +soma);


  }
}
