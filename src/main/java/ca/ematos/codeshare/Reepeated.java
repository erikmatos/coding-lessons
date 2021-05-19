package ca.ematos.codeshare;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Reepeated {

    public static void main(String[] arguments){
        System.out.println(m(Stream.of(
                 Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                   Arrays.asList(2, 4, 5, 7, 8, 9),
                   Arrays.asList(1, 3, 4, 7, 8, 10, 11) ).iterator()));
    }

    public static Set<Integer> m(Iterator<List<Integer>> iterator){

        Set<Integer> _repeated = new HashSet<>();

        while (iterator.hasNext()) {
            List<Integer> _items = iterator.next();

            if ( _repeated.isEmpty() ){
                _repeated.addAll(_items);
            } else {
                _repeated.retainAll(_items);
            }

        }
        return _repeated;
    }
}
