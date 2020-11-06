package ru.netology.domain;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class FileOpenManager {
        String key;
        String value;

        Map<String, String> map = new HashMap<>();

        public void getName() {
            map.get(key + map.get(key));
        }

        public void getRegisteredBinding() {
            Set<String> keys = map.keySet();
            for (String key : keys) {
                map.get(key);
            }
        }

        public void remove() {
            map.remove(key);
        }

        public void getAllBinding() {
            for (String key : map.values()) {
                map.get(key);
            }
        }
}

