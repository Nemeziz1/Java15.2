package ru.netology.domain;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class FileOpenManager {

        private Map<String, String> map = new HashMap<>();

        public void registered(String ext, String name) {
            map.put(ext.toLowerCase(), name);
        }

        public String getName(String ext) {
            return map.get(ext.toLowerCase());
        }

        public List<String> getRegisteredBinding() {
            Set<String> keys = map.keySet();
            List<String> list = new ArrayList<>(keys);
            Comparator comparator = new Comparator();
            list.sort(comparator);
            return list;
        }

        public String remove(String ext)
        {
            return map.remove(ext.toLowerCase());
        }

        public Set<String> getAllBinding() {
           Collection<String> tmp = map.values();
            return new HashSet<>(tmp);
        }
}

