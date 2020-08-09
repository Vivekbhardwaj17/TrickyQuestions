package stringManupulation;

public class FindMatrix {
    public static void main(String[] args) {
        String[]G={"7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137"};
        String[]P={"9505",
                "3845",
                "3530"};
        System.out.println(gridSearch(G,P));
    }
    static String gridSearch(String[] G, String[] P) {
        char a = P[0].charAt(0);
        for(int i=0;i<=G.length-P.length;i++){
            for(int j=0;j<=G[i].length()-P[0].length();j++)
            {
                if(G[i].charAt(j)==a)
                {
                    if(G[i].substring(j,j+P[0].length()).equals(P[0]))
                    {
                        if(completecheck(G,P,i+1,j)==true)
                            return "YES";
                    }

                }
            }
        }
        return "NO";

    }
    static boolean completecheck(String[]G,String[]P,int x,int y){
        for (int i = 0; i < P.length - 1 ; i++) {
            if(!(G[x+i].substring(y,y+P[0].length())).equals(P[i+1]))
                return false;
        }
        return true;
    }
    static  boolean complete(String[]G,int x,int y, String[]P){
        for(int i=0;i<P.length;i++){
            for(int j=1;j<P[0].length();j++){
                if(G[i+x].charAt(y+j)!=P[i].charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean check(String[]G,int x,int y,String[]P){
        for(int i=0;i<P.length;i++){
            for(int j=0;j<P[0].length();j++){
                if(G[x+i].charAt(y+j)!=P[i].charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
