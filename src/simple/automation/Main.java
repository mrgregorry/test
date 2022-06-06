package simple.automation;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final User EXISTED_USER = new User("existed", "");
    private static final User NOY_EXISTED_USER = new User("wrong", "");

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три");
        Map<String, Integer> digestMap = new HashMap<>();
        digestMap.put("Один", 1);
        digestMap.put("Два", 2);
        digestMap.put("Три", 3);

        strings.forEach(str -> System.out.println(digestMap.get(str)));
        strings.stream().filter(el -> el.length() == 3).collect(Collectors.toList());
    }

}