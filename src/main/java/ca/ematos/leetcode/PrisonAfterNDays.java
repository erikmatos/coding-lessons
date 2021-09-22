package ca.ematos.leetcode;

import java.util.Arrays;

public class PrisonAfterNDays {

    public static void main(String[] args){
        int[] cells = {0,1,0,1,1,0,0,1};

        cells = prisonAfterNDays(cells, 7);
        Arrays.stream(cells).forEach(System.out::println);

        cells = new int[]{1,0,0,1,0,0,1,0};

        long ini = System.currentTimeMillis();
        cells = prisonAfterNDays(cells, 1_000_000_000);
        long end = System.currentTimeMillis();

        System.out.println("***************************");
        System.out.println(end-ini);
        Arrays.stream(cells).forEach(System.out::println);
    }

    public static int[] prisonAfterNDays(int[] cells, int n) {
        for (n = (n - 1) % 14 + 1; n > 0; --n) {
            int[] process = new int[8];

            for(int i = 1; i < 7; i++) {
                process[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            }
            cells = process;
            n--;
        }
        return cells;
    }

}
