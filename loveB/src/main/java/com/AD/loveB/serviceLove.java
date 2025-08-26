package com.AD.loveB;


import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class serviceLove {

    public int calculateLoveScore(String a, String b) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (char c : a.toCharArray()) m1.put(c, m1.getOrDefault(c, 0) + 1);
        for (char c : b.toCharArray()) m2.put(c, m2.getOrDefault(c, 0) + 1);

        int ans = 0;
        for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            char ch = entry.getKey();
            int z = entry.getValue();
            ans = ans * 10 + z + m2.getOrDefault(ch, 0);
        }

        Map<Integer, Integer> digitCount = new HashMap<>();
        int A = ans;
        while (A > 0) {
            int k = A % 10;
            digitCount.put(k, digitCount.getOrDefault(k, 0) + 1);
            A /= 10;
        }

        int Ans = 0;
        for (Map.Entry<Integer, Integer> entry : digitCount.entrySet()) {
            int z = entry.getKey() * entry.getValue();
            Ans = Ans * 10 + z;
        }

        int ANS = Ans;
        while (ANS > 100) {
            int k = ANS % 10;
            ANS = ANS / 10;
            ANS = ANS + k * 10;
        }

        return ANS;
    }
}