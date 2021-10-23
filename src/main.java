public class main {
    public static void main(String[] args){
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.GetFirst(); // 1
        String s = pair.GetSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // True

        System.out.println(mustBeTrue + " " + mustAlsoBeTrue);
    }
}

