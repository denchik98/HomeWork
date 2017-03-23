package Informatics.HeapPool;

import Informatics.ClassWork.Comparator.Heap;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HeapPool {
    private static Heap heap = new Heap();
    private static Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a != 0) {
            if (a == 1)
                System.out.println(minBall());
            if (a != 1)
                set.add(a);
            a = sc.nextInt();
        }
    }

    public static int minBall() {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int index = it.next();
            it.remove();
            return index;
        }
        return 0;
    }
}
