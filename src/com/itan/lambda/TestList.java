package com.itan.lambda;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestList {
    @Test
    public void test(){
        String[] array = {"张无忌", "张三丰", "周芷若","赵敏"};
        Stream<String> stream = Stream.of(array);
        List<String> list = stream.limit(2).collect(Collectors.toList());
        for (String s : list) {
            System.out.println(s);
        }
    }

//    @Test
//    public void test(){
//        String[] array = {"张无忌", "张三丰", "周芷若","赵敏"};
//        Stream<String> stream = Stream.of(array);
//        stream.forEach(s -> System.out.println(s));
//    }
//    @Test
//    public void testGetStream(){
//        List<String> list = new ArrayList<>();
//        Stream<String> stream1 = list.stream();
//        Set<String> set = new HashSet<>();
//        Stream<String> stream2 = set.stream();
//    }
    @Test
    public void testGetStream(){
        String[] array = {"张无忌", "张翠山", "张三丰", "张一元"};
        Stream<String> stream = Stream.of(array);
    }
//    @Test
//    public void testGetStream(){
//        Map<String,Object> map = new HashMap<>();
//        Stream<String> stream1 = map.keySet().stream();
//        Stream<Object> stream2 = map.values().stream();
//    }
}
