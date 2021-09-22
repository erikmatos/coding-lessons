package ca.ematos.codility.assessments;

public class Islands {

    public static void main(String[] args){

        int[][] arr1 =
        {
            {1,1,1,1,0},
            {1,1,0,1,0},
            {1,1,0,0,0},
            {0,0,0,0,0}
        };

        int result = numIslands(arr1);
        System.out.println(result);
    }
    public static int numIslands(int[][] arr) {


        int xPivot = 0;
        int yPivot = 0;

        while (xPivot != -1 && xPivot < arr.length){




            while(yPivot != -1 && yPivot < arr[xPivot].length){



            }



        }


        boolean[][] checking = new boolean [arr.length][];

        for(int i = 0; i < arr.length-1; i++){

            if (checking[i] == null){
                checking[i] = new boolean[arr[i].length];
            }

            for(int j = 0; j < arr.length-1; j++){




                if (arr[i][j] == 1 ){
                    checking[i][j] = true;
                }






            }
        }


        return 1;
    }

}
