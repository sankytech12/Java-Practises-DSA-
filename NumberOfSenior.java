public class NumberOfSenior {
    public static void main(String[] args) {
        String details[]={"7868190130M7522","5303914400F9211","9273338290F4010"};
       
        System.out.println(solve(details));
    }

    private static int solve(String[] details) {
        int ans=0;
        int n=15;
        for (int i = 0; i < details.length; i++) {
            String age=details[i].substring(n-4, n-2);
            int a=Integer.parseInt(age);
            if(a>60) ans++;
        }
        return ans;
    }
}
