public class Triangle {

    public void T() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j > 0 && j <= 6 && i < 6) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("*  ");
        }
        System.out.println("Nice to meet you! I`m Triangle I!");
    }
}
