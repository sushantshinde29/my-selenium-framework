package com.selenium.pom;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        String s= "Suseeeshant";

        char c;
        int count=0;
        Map<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            c= Character.toLowerCase(s.charAt(i));
           if(map.containsKey(c)){
               map.put(c, map.get(c)+1);
           }
           else{
               map.put(c, 1);
           }

        }
        List<Character> clist= map.keySet().stream()
                        .sorted((a, b)->{return a-b;})
                                .collect(Collectors.toList());
        clist.stream()
                .forEach(e-> System.out.println(e+": "+map.get(e)));

    }
}
