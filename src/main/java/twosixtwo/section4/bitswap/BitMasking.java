package twosixtwo.section4.bitswap;

public class BitMasking {
    public static void main(String[] args) {
        String [] a = {"A","B","C","D"};
        int n = a.length;
        for(int i=0; i < (1<<n); i++) {
            String target = "";
            System.out.println(i + " : ");
            for(int j=0; j<n; j++){
                int i1 = i & (1 << j);
                if((i & (1 << j))==0){
                    target += (a[j] + " ");
                }
            }
            System.out.println(target);
        }
    }
}
