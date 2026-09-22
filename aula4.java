import java.util.Scanner;

public class aula4 {
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a frequência: ");
        double frequencia = entrada.nextDouble();
        
        System.out.println("Digite a nota1: ");
        double nota1 = entrada.nextDouble(); 
        
        System.out.println("Digite a nota2: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a nota3: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;


    if(media >=70 &&frequencia >=75){
        System.out.println("Aprovado(a)");

    }else if(media >=40 && frequencia >=75){
        System.out.println("Elegível para AI.");
            }else{
                System.out.println("Reprovado(a)");
        
    }
  } 
 }

