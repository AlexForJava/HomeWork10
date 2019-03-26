package com.gmail.chernii.oleksii;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Space on 25.03.2019.
 */
public class ListXML {
    public static final String FILE_NAME = "list.xml";

    public static void main(String[] args) {
        List<Map<List<Set<Integer>>, String>> list = createList();
        listToXML(list);
    }

    private static void listToXML(List<Map<List<Set<Integer>>, String>> list) {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(FILE_NAME))) {
            XMLEncoder xmlEncoder = new XMLEncoder(bufferedOutputStream);
            xmlEncoder.writeObject(list);
            xmlEncoder.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        return set;
    }

    private static List<Set<Integer>> createInnerList() {
        List<Set<Integer>> list = new ArrayList<>();
        list.add(createSet());
        list.add(createSet());
        return list;
    }

    private static Map<List<Set<Integer>>, String> createMap() {
        Map<List<Set<Integer>>, String> map = new HashMap<>();
        map.put(createInnerList(), "value");
        return map;
    }

    private static List<Map<List<Set<Integer>>, String>> createList() {
        List<Map<List<Set<Integer>>, String>> list = new ArrayList<>();
        list.add(createMap());
        list.add(createMap());
        return list;
    }

}
