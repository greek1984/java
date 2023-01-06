package org.example;
import java.util.HashMap;
import java.util.Map;

public class CountWord {
    public static void main(String[] args) {
        String[] fragment = {"But when the sun was sinking in the sea,\n" +
                "   He seized his harp, which he at times could string,\n" +
                "   And strike, albeit with untaught melody,\n" +
                "   When deemed he no strange ear was listening:\n" +
                "   And now his fingers o'er it he did fling,\n" +
                "   And tuned his farewell in the dim twilight,\n" +
                "   While flew the vessel on her snowy wing,\n" +
                "   And fleeting shores receded from his sight,\n" +
                "Thus to the elements he poured his last 'Good Night.'"
        };
        Map<String, Integer> map = new HashMap<>();
        for(String when: fragment) {
            map.put(when, map.getOrDefault(when, 0) + 1);
        }
        System.out.println(map);
    }
}
