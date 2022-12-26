package Backtracking;

public class OrderedStringOfNumbers {
    public static void main(String[] args) {
        String str = "IDIDI";
        permuteString(createStartString(str.length() + 1), "", str);

    }

    static boolean permuteString(String ques, String ans, String check) {

        if (ans.length() == (check.length() + 1))
            if (checkValid(check, ans)) {
                System.out.println(ans);
                return true;
            }

        for (int i = 0; i < ques.length(); i++) {
            boolean isDone = permuteString(ques.substring(0, i) + ques.substring(i + 1, ques.length()),
                    ans + ques.charAt(i), check);
            if (isDone)
               return true;
        }
        return false;
    }

    static boolean checkValid(String required, String created) {
        for (int i = 0; i < required.length(); i++) {
            if (required.charAt(i) == 'D') {
                if (!(created.charAt(i) > created.charAt(i + 1)))
                    return false;
            } else {
                if (!(created.charAt(i) < created.charAt(i + 1)))
                    return false;
            }
        }
        return true;
    }

    static String createStartString(int cnt) {
        String str = "";
        for (int i = 1; i <= cnt; i++) {
            str += i;
        }
        return str;
    }
}
