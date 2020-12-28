public class Triangle4 {
    public void T4() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == i && i < 4 || i == 0
                        || i == 1 && j == 5
                        || i == 2 && j == 4) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("Nice to meet you! I`m Triangle V");
    }
}
