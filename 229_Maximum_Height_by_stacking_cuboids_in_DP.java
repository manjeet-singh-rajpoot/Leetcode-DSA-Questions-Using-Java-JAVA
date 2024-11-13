import java.util.*;
public class raj {
    public static int maxHeight(int[][] cuboids) {
        // Sort each cuboid's dimensions
        for (int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }

        // Initialize DP array
        int[] dp = new int[cuboids.length];
        for (int i = 0; i < cuboids.length; ++i) {
            dp[i] = cuboids[i][2]; // Initial height
        }

        // Update DP array
        for (int i = 1; i < cuboids.length; i++) {
            for (int j = 0; j < i; j++) {
                if (cuboids[j][0] <= cuboids[i][0] &&
                    cuboids[j][1] <= cuboids[i][1] &&
                    cuboids[j][2] <= cuboids[i][2]) {
                    dp[i] = Math.max(dp[i], dp[j] + cuboids[i][2]);
                }
            }
        }

        // Return the maximum height
        return Arrays.stream(dp).max().getAsInt();
    }

public static void main(String[]args){
    int cuboid[][]={
        {50,45,20},
        {95,37,53},
        {45,23,12},
    };

    System.out.print(maxHeight(cuboid));

}
}