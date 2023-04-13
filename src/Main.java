import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stack stos = new Stack(5);
        try {
            stos.push(1);
            stos.push(2);
            stos.push(3);
            stos.push(4);
            stos.push(5);
            System.out.println(stos);
            System.out.println(stos.pop());

            stos.clear();
            System.out.println("wyczyszczone");

            System.out.println(stos.size());

            stos.pop();
            stos.push(5);
            stos.push(2);
            stos.push(4);
        }catch (StackFullException e){
            System.out.println(e.getMessage());
        }
        catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }











    }
}