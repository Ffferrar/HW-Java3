/**
 * Generic-class Optional-copy with private constructor
 * @version 7.0
 * @author Kozhanov Gleb
 */
public class Pair <T, S> {
    //private static Pair test;
    T first;
    S second;

    /**
     * Constructor
     * @param first first data from user
     * @param second second data from user
     */
    private Pair(T first, S second){
        this.first = first;
        this.second = second;
    }

    /**
     * Static factory method
     * @param first first data from user
     * @param second second data from user
     * @return instance of class
     */
    public static <T, S> Pair of(T first, S second){ // ВАЖНО: ЧТОБЮЫ СТАТИК НЕ КОНФЛИКТОВАЛ С GENERIC, НЕОБХОДИМИ ПРОПИСЫВАТЬ ТИПЫ ПЕРЕД СТАТИКОМ!!!!
        if (first == null){
            return new Pair (null, second);
        }
        if (second == null){
            return new Pair (first, null);
        }
        return new Pair (first, second);
    }

    public T getFirst(){
        return first;
    }
    public S getSecond(){
        return second;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair cow = (Pair) o;
        return (first == cow.first && second == cow.second);
    }

    @Override
    public int hashCode(){
        return 21*(first.hashCode()+second.hashCode());
    }

    @Override
    public String toString(){

        return "First:  " + first + "\nSecond: " + second;
    }
}
