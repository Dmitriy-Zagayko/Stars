public class Triangle3 {
    public void T3() {
        for (int i = 7; i > 0; i--) {
            for (int j = 7; j > 0; j--) {
                if (j > 1 && i < 7 && j != i) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("Nice to meet you! I`m Triangle IV");
    }
}
