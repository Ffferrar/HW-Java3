import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
// for pull request
public class main {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> three_numbers = new ArrayList<>();
        ArrayList<Integer> even_numbers = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();
        int a  = 0, b = 0, c = 0;

        int capacity = 3; //количество цифр
        scanList(numbers, capacity); //считали данные в лист

        for (int j=0; j<capacity; j++){
            int spec = 0; //маркер попадания числа в первые 2 списка
            int number = numbers.get(j);
            if (number % 3 == 0){
                three_numbers.add(a, number);
                a++;
                spec++;
            }
            if (number % 2 == 0) {
                even_numbers.add(b, number);
                b++;
                spec++;
            }
            if (spec == 0){
                others.add(c, number);
                c++;
            }
        }

        printList(three_numbers);
        printList(even_numbers);
        printList(others);

    }

    public static void scanList (ArrayList<Integer> add_numbers, int size) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        for (int i=0; i<size; i++){
            try {add_numbers.add( in.nextInt() );}
            catch (InputMismatchException e){
                System.err.println("Wrong input! Input only integer numbers please: " + e.getMessage());
                in.nextLine();
                i--;
            }
        }
    }

    public static void printList(ArrayList<Integer> list) {
        for (int k = 0; k < list.size(); k++) {
            System.out.print(list.get(k) + " ");
        }
        System.out.print("\n");
    }
}
