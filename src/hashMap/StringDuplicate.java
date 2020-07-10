package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringDuplicate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        int one=1;
        for (int i = 0; i <s.length()-1 ; i++) {
            String sub = s.substring(i,i+2);
            if(map.containsKey(sub))
                map.put(sub,map.get(sub)+1);
            else
                map.put(sub,one);
        }
        int max=-1;
        String key;
        for(Integer i:map.values())
            if(max<i){
                max=i;
            }
        System.out.println(getKeyFromValue(map,max));
    }
    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}
//Input: 26
//
//Output: DD