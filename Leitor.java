import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Leitor {

    
    public static void main(String[] args) {
        String entrada = "teste.txt";
        File arquivo = new File(entrada);
        Scanner sc;
        try {
            sc = new Scanner(arquivo);
            while(sc.hasNext()){
                String temp = sc.nextLine();
                String[] frase = temp.split("\\.");
                for(String a : frase){
                    System.out.println(a);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("arquivo invalido");
        }
        
    }
}