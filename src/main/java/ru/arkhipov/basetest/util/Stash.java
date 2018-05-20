package ru.arkhipov.basetest.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aasx .
 */
public class Stash {

    private static List<String> stash = new ArrayList<>();

    public static boolean check(String key){
        return stash.contains(key);
    }

    public static void add(String value){
        stash.add(value);
    }

}
