package hackerrank;

import java.util.*;

public class EqualArray14July {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int max=-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            max= Math.max(arr[i],max);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                ans+=max-arr[i];
            }
        }
        System.out.print(ans);
    }
    public static int maxPairs(List<Integer> s, int minDiff) {
        // Write your code here
        int cnt=0;
        Set<Integer> skill = new HashSet<Integer>();
        for(int i=0;i<s.size();i++)
            skill.add(s.get(i));
        ArrayList<Integer> skillLevel = new ArrayList<>(skill);

        for(int i=0;i<skillLevel.size()-1;i++){
            for(int j=i+1;j<skillLevel.size();j++){
                if(Math.abs(skillLevel.get(i)-skillLevel.get(j))>=minDiff)
                    cnt++;
            }
        }
        return cnt;
    }
}
