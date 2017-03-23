package Informatics.SetOperations;

import java.util.HashSet;
import java.util.Set;

class SetOperations {
    public static <T> Set<T> intersect(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>();
        for (Object o : a) {
            if (b.contains(o))
                set.add((T) o);
        }
        return set;
    }

    public static <T> Set<? extends T> union(Set<? extends T> a, Set<? extends T> b) {
        Set<T> set = new HashSet<>(a);
        for (Object o : b) {
            if (!set.contains(b))
                set.add((T) o);
        }
        return set;
    }

    public static <T> Set<T> substraction(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>();
        for (Object o : a) {
            if (!b.contains(o))
                set.add((T) o);
        }
        return set;
    }
}
