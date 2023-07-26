import java.util.*;
public class VideoGames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxHeight=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int cmd=-1;
        int i=0;
        boolean pick=false;
        while(cmd!=0){
            cmd=sc.nextInt();
            if(cmd==1){
                if(i>0) i--;
            }
            else if(cmd==2){
                if(i<arr.length-1) i++;

            }else if(cmd==3){
                if(pick==false){
                    pick=true;
                    if(arr[i]>0) arr[i]--;
                }
            }
            else if(cmd==4){
                if(pick==true){
                    if(arr[i]<maxHeight) arr[i]++;
                    pick=false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/* 1 : Move left

    2 : Move right

    3 : Pick up box

    4 : Drop box

    0 : Quit */