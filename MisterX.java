public class MisterX {
    public void MX() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == i || j == 6 && i == 0
                        || j == 5 && i == 1
                        || j == 4 && i == 2
                        || j == 2 && i == 4
                        || j == 1 && i == 5
                        || j == 0 && i == 6) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("Nice to meet you! I`m Mister X!");
    }
}
