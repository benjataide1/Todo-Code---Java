public class Christmas_tree_Exercise_4 {
    public static void main(String[] args) {

        int height = 4;
        var star = "*";

        for (int num = 1; num <= height; num++) {
            System.out.println(" ".repeat(height - num) + star);
            star += "**";
            if (num == height) {
                System.out.println(" ".repeat(height - 2) + "|||");
            }
        }
    }

}
