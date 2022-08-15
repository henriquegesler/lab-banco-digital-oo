import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
    private static Scanner ler = new Scanner(System.in);

    public static void limpar(){
        ler.nextLine();
    }

    public static String lerString(){
        String s;
        s = ler.nextLine();
        return s;
    }

    public static float lerFloat(){
        float num = -1;
        while(num == -1){
            try{
                num = ler.nextFloat();
            }
            catch (InputMismatchException e){
                System.out.println("Favor digitar um numero valido (numeros positivos: inteiros ou decimais separados por ','):");
                ler.nextLine();
            }
        }
        return num;
    }

    public static int lerInt(){
        int num = -1;
        while(num == -1){
            try{
                num = ler.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Favor digitar um numero valido (numeros positivos e inteiros):");
                ler.nextLine();
            }
        }
        return num;
    }
}