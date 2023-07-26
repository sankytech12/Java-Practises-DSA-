public class DetectCap {
    public static void main(String[] args) {
        String s="GGGGGGGGg";
        boolean ans=solve(s);
        System.out.println(ans);
    }

    private static boolean solve(String s) {
        if(Character.isUpperCase(s.charAt(0))){
            boolean se=Character.isUpperCase(s.charAt(1));
            for (int i = 2; i < s.length(); i++) {
                boolean f=Character.isUpperCase(s.charAt(i));
                if(se!=f) return false;
            }
        }
        else{
            for (int i = 1; i < s.length(); i++) {
                if(Character.isUpperCase(s.charAt(i))) return false;
            }
        }
        return true;
    }
}
