import com.sun.nio.sctp.IllegalReceiveException;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadź rozmiar stosu: ");
            final int i = scanner.nextInt();

            Stack stos = new Stack(i);
            for(int l = 1; l<=i; l++){
                stos.push(l);
            }
            System.out.println(stos);

            while (true) {

                System.out.println("\n1. Push\n2. Pop\n3. Clear\n4. Top\n5. Size\n6. Tablica\n7. Wyjście");
                int in = scanner.nextInt();

                switch (in){
                    case 1:
                        System.out.println("Podaj liczbe dla dodania do stosu:");
                        int p = scanner.nextInt();
                        try{
                            if(stos.size()> i){
                                break;
                            }else {
                                stos.push(p);
                            }
                        }        catch (StackFullException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try{
                            System.out.println(stos.pop());
                        }        catch (StackEmptyException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                            stos.clear();
                            System.out.println("Stos został wyczyszczony");
                            break;
                    case 4:
                        try{
                            System.out.println("Ostatnio dodaną liczbą jest: " + stos.top());
                        } catch (StackEmptyException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Rozmiar sztosu jest równy: "+ stos.size());
                        break;
                    case 6:
                        System.out.println(stos);
                    case 7:
                        return;
                }

            }



            /*for(int i = 1; i<6; i++){
                stos.push(i);
            }

            System.out.println(stos);
            System.out.println(stos.pop());

            stos.clear();
            System.out.println("wyczyszczone");

            System.out.println(stos.size());

            stos.pop();
            stos.push(5);
            stos.push(2);
            stos.push(4);*/

        }catch (StackFullException e){
            System.out.println(e.getMessage());
        }
        catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("Podany rozmiar stosu jest mniejszy od zera");
        }











    }
}