public class Triangle2 {
    public void T2() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && j != i) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("* ");
        }
        System.out.println("Nice to meet you! I`m Triangle III");
    }
}
