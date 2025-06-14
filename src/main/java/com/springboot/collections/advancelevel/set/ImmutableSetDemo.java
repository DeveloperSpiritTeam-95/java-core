package com.springboot.collections.advancelevel.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ImmutableSetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        // methods all are from collections methods like list

        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);

        // for thread safety
        Set<Integer> integers = Collections.synchronizedSet(set);
        // below one completely replace functionality for above one
        // above is externally synchronized  thread safe. below one internally thread safe.
        // we can give reference as Set or NavigableSet or ConcurrentSkipListSet
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        // another example for alternate way to create synchronized set creation but not recommended.

        Set<Integer> syncSet = Collections.synchronizedSet(new TreeSet<>()); // by default sorted.

        synchronized (syncSet) {
            for (Integer integer : syncSet) {
                //safe iterations
                System.out.println(integer);
            }
        }

        System.out.println("SynchronizedSet size: "+integers.size());
        System.out.println("SynchronizedSet: "+integers);


        // immutable set

        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(set);
        System.out.println("unmodifiableSet: "+unmodifiableSet);
        //unmodifiableSet.add(99);    // UnsupportedOperationException

        Set<Integer> unmodifiableSet2 = Set.of(1,2,3,4,9,8,7,6,5,14,30);
        System.out.println("unmodifiableSet2: "+unmodifiableSet2);
        //unmodifiableSet2.add(33);     // UnsupportedOperationException


    }
}
