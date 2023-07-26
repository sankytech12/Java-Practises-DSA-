public class RaceCar {
    public static void main(String[] args) {
        int target=3;
        int ans=solve(target,0,1);
        System.out.println(ans);
    }


    private static int solve(int target,int i,int speed) {
        if(i==target) return 1;
        if(i>tar)
        int A=1+solve(target, i+speed, speed*2);
        int B=0;
        if(speed>0) B=solve(target, i, -1);
        else B=1+solve(target, i, 1);
        return B+A;
    }
}
