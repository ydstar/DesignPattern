package com.yadong.pattern.creational.single;


import java.util.HashMap;
import java.util.Map;

/**
 *容器的单例模式
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (!singletonMap.containsKey(key)) {
            singletonMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
