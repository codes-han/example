public class Task38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String last = countAndSay(n - 1);
        char[] s_arr = last.toCharArray();
        
        int num = s_arr[0] - '0';
        int count = 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < s_arr.length; i++) {
            if (s_arr[i] == s_arr[i - 1]) {
                count++;
            }else {
                ans.append(count);
                ans.append(num);
                num = s_arr[i] - '0';
                count = 1;
            }
        }
        ans.append(count);
        ans.append(num);
        return ans.toString();
    }
}

//class Main{
//    public static void main(String[] args) {
//        int n = 4;
//        Task38 ts = new Task38();
//        String ans = ts.countAndSay(n);
//        System.out.println(ans);
//    }
//}
