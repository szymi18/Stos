import java.util.Arrays;
import java.util.EmptyStackException;


public class Stack {

    private int []stos;
    private int pos =-1;
    private int size;

    public Stack(int size) {
        this.pos = pos;
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
        pos+=1;
        if (pos>=stos.length)
            throw new StackFullException();
        stos[pos]=ilosc;

    }

    public int[] getStos() {
        return stos;
    }

    public void setStos(int[] stos) {
        this.stos = stos;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }


    //top – zwraca ostatnio dodany do stosu element – jeżeli stos był pusty, rzuca wyjątek
    //typu StackEmptyException
    public int pop(){
        if (pos<0)
            throw new StackEmptyException();
        pos-=1;

        return stos[pos+1];
    }

    //clear - czyści stos
    public void clear(){
        stos = new int[stos.length];
        pos = -1;

    }

    //top – zwraca ostatnio dodany do stosu element – jeżeli stos był pusty, rzuca wyjątek
    //typu StackEmptyException
    public int top(){
        if (pos<0)
            throw new StackEmptyException();
        return stos[pos];
    }

    //size - pokazuje rozmiar stosu
    public int size() {
        return pos + 1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stos=" + Arrays.toString(stos) +
                '}';
    }
}
