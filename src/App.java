import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);

        String wordSecret="elephant";
        boolean wordCorrect=false;

        int attemps=0;
        int attempsMax=3;

        char[] guessesWords= new char[wordSecret.length()];
        for (int i=0;i<guessesWords.length;i++){
            guessesWords[i]='_';
            
        }
        
        while (attemps<attempsMax){
            wordCorrect=false;
            System.out.println("Ingresa una letra :");
            char wordInput= scan.next().charAt(0);

            for(int i=0;i<wordSecret.length();i++){
                if(wordSecret.charAt(i)==wordInput){
                    guessesWords[i]=wordInput;
                    wordCorrect=true;
                }
                System.out.println(guessesWords[i]);

            }
            if(wordCorrect==false){
                attemps++;
                System.out.println("te quedan "+(attempsMax-attemps)+" Intentos");
            }
            if(String.valueOf(guessesWords).equals(wordSecret)){
                System.out.println("Correcto adivinaste la palabra");
                break;
            }

            
        } 
    }
}
