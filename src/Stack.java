import java.util.Arrays;
import java.util.EmptyStackException;


public class Stack {

    private int[]stos;
    private int pozycja =-1;
    private int size;


    public Stack(int size) {
        if(size<0){
            throw new IllegalArgumentException();
        }
        this.pozycja = pozycja;
        this.size = size;
        this.stos = new int[size];

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //push – dodaje przekazaną jako argument liczbę typu int do stosu, jeżeli jest w nim jesz-
    //cze miejsce – jeżeli nie, rzuca nowy zdefiniowany wyjątek rodzaju Unchecked o nazwie
    //StackFullException,
    public void push(int ilosc) throws StackFullException {
        pozycja += 1;
        if (pozycja >= stos.length) {
            throw new StackFullException();
        }
        stos[pozycja] = ilosc;



    }

    public int[] getStos() {
        return stos;
    }

    public void setStos(int[] stos) {
        this.stos = stos;
    }

    public int getPozycja() {
        return pozycja;
    }

    public void setPozycja(int pozycja) {
        this.pozycja = pozycja;
    }


    //top – zwraca ostatnio dodany do stosu element – jeżeli stos był pusty, rzuca wyjątek
    //typu StackEmptyException
    public int pop(){
        if (pozycja < 0)
            throw new StackEmptyException();
        pozycja -= 1;

        return stos[pozycja+1];
    }

    //clear - czyści stos
    public void clear(){
        stos = new int[stos.length];
        pozycja = -1;

    }

    //top – zwraca ostatnio dodany do stosu element – jeżeli stos był pusty, rzuca wyjątek
    //typu StackEmptyException
    public int top(){
        if (pozycja < 0)
            throw new StackEmptyException();
        return stos[pozycja - 1];
    }

    //size - pokazuje rozmiar stosu
    public int size() {
        return stos.length;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stos=" + Arrays.toString(stos) +
                '}';
    }
}
