import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ArrayList implements SimpleList {
    public int array[];
    public int current_size = 0;
    public int size;
    public ArrayList() {
        array = new int [10];
    }
    public ArrayList(int capacity) {
        array = new int [capacity];
    }

    @Override
    public void add(int item) {
        array [current_size++] = item;
    }

    @Override
    public int remove(int idx) throws NoSuchElementException {
        for (int i = idx; i<current_size; i++) {
            array[i] = array[i + 1];
        }
        try {array[current_size] = Integer.parseInt(null);}
        catch (InputMismatchException e){
            System.err.println("Wrong input! Input only integer numbers please: " + e.getMessage());
        }

        current_size--;
        return 0;
    }

    @Override
    public int size() {
        return current_size;
    }

    @Override
    public int get(int idx) throws NoSuchElementException{
        try {return array[idx];}
        catch (InputMismatchException e){
            System.err.println("Wrong input! Input only integer numbers please: " + e.getMessage());
        }
        return array[idx];
    }
}
