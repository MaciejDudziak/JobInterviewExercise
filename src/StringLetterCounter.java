import java.util.Locale;

public class StringLetterCounter {
    public void howManyLetters(String word){
        for(int i = 97; i <123; i++){
            int counter = 0;
            for(int j = 0; j < word.length(); j++){
                if((int)word.toLowerCase().charAt(j) == i){
                    counter ++;
                }
            }
            if(counter > 0){
                System.out.println((char)i + " = " + counter);
            }
        }
    }

    public static void main(String[] args) {
        StringLetterCounter testowy = new StringLetterCounter();
        testowy.howManyLetters("ExampleStringForTestZZZzzZZZDAjmadx");
    }
}
