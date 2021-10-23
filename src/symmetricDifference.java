import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class symmetricDifference  {
    public static void main(String[] args) throws Exception{
        Set setA = new HashSet();
        Set setB = new HashSet();
        Set set = new HashSet();

        setA.add("element");
        setA.add("rock");
        setA.add("paper");

        setB.add("Scissors");
        setB.add("rock");

        set = symmetricDifference(setA, setB);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set set = new HashSet<>();
        Iterator iterator1 = set1.iterator();
        Iterator iterator2 = set2.iterator();

        while(iterator1.hasNext()){
            T element =(T) iterator1.next();
            set.add(element);
        }

        while(iterator2.hasNext()){
            T element =(T) iterator2.next();
            if (set.contains(element)) {
                set.remove(element);
            }
            else {
                set.add(element);
            }
        }

        return set;
    }
}
