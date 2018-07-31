public class HouseRobber {

    public static int rob(int[] nums) {
        int ifRob = 0;
        int ifNoRob = 0;

        for (int num : nums) {
            int buff = ifNoRob;
            ifNoRob = Math.max(ifNoRob, ifRob);
            ifRob = buff + num;
        }
        return Math.max(ifNoRob, ifRob);
    }

    public static void main(String[] args) {

    }
}
