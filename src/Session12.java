public class Session12 {

    public static void main(String[] args) {

        Session12 session12 = new Session12();
        session12.multidimensionArray();

    }

    public void multidimensionArray() {
        int[] simpleArray = {34, 5, 45};
        int[][] multiArray = {{2, 4, 45}, simpleArray};
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++)
                System.out.print(" " + multiArray[i][j]);
        }
        System.out.print(" ");
    }

}


