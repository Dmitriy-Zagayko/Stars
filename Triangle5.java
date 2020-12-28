public class Triangle5 {
    public void T5() {
        for (int i = 7; i > 0; i--) {
            for (int j = 7; j > 0; j--) {
                if (j == i && j < 5 || i == 1
                        || i == 3 && j == 5
                        || i == 2 && j == 6) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("Nice to meet you! I`m Triangle VI");
    }
}

