package semav;

public class Main {

    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 6};
        System.out.println(missingNumber(num));
    }

    private static int missingNumber(int[] nums) {
        int result = Integer.MAX_VALUE;
        int[] counts = new int[7];

        for (int num : nums){
            counts[num]++;
        }

        for (int side = 1; side <= 6; side++) {
            int moveOnce = nums.length - counts[side];
            int moveTwice = counts[7-side];

            int totalMoves = moveOnce + moveTwice;
            result = Math.min(result, totalMoves);
        }

        return result;
    }

}
