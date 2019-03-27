package com.gmail.chernii.oleksii;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Space on 27.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        List<Map<List<Set<Integer>>, String>> list = ListXML.createList();
        ListXML.listToXML(list);
    }
}
