import java.util.*;
public class FindLeastGreater {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        int []arr={2,6,9,1,3,2};
        int n=arr.length;
        ArrayList<Integer> ans=findLeastGreater2(arr,n);
        System.out.println(ans);
    }
    private static ArrayList<Integer> findLeastGreater2(int[] arr, int n) {
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            set.add(arr[i]);
            if(set.higher(arr[i])!=null) ans.add(set.higher(arr[i]));
            else ans.add(-1);
        }
        Collections.reverse(ans);
        return ans;
    }
    static Node succ;
    private static ArrayList<Integer> findLeastGreater(int[] arr, int n) {
        ArrayList<Integer> a=new ArrayList<>();
        int []ans=new int[n];
        Node root=null;
        for(int i=n-1;i>=0;i--){
             succ=null;
            root=insert(root,arr[i]);
            if(succ!=null){
               // ans.add(i,succ.data);
               ans[i]=succ.data;
            }else{
               // ans.add(i,-1);
               ans[i]=-1;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            a.add(ans[i]);
        }
        return a;
    }
    public static Node insert(Node root,int k){
        if(root==null){
            Node nn=new Node(k);
            return nn;
        }
        if(root.data>k){
            //System.out.print(k+ " ");
            succ=root;
            root.left=insert(root.left,k);
        }else if(root.data<k){
            root.right=insert(root.right,k);
        }else if(root.data==k){
            succ=insuc(root);
        }
        return root;
    }
    private static Node insuc(Node root) {
        Node s=root.right;
        while(s.left!=null){
            s=s.left;
        }
        return s;
    }
}
