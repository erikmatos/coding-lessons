package ca.ematos.microsoft;

public class Debugging {

    public static void main(String[] args){
        int x = 6;

        System.out.println((x & 1) != 0);

        int[] a = {1, 2, 3, 4, 5};
        //System.out.println(solution(a));
    }

    static int solution(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
