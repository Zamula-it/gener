package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;

/**
 * Пример применения класса Pairs
 *
 * @author Michael S. Kirkpatrick
 * @version V1, 8/2017
 */

public class PairsDriver {

    public static void main(String[] args) {
        // TODO: раскомментируйте код и запустите
        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
        for (int i = 0; i < 15; i++) {
            pairs.addPair("A" + i, i);
        }
        for (Pair<String, Integer> pair : pairs) {
            System.out.println(pair.toString());
        }
        System.out.println();
        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair<String, Integer> pair = iterator.next();
            if ((pair.getSecond() % 2) == 0) {
                iterator.remove();
            }
        }
        for (Pair<String, Integer> pair : pairs) {
            System.out.println(pair.toString());
        }
        System.out.println();
        pairs.addPair("B", 10);
        for (Pair<String, Integer> pair : pairs) {
            System.out.println(pair.toString());
        }
        System.out.println();

    }
}