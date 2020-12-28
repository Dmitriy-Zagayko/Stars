public class Triangle1 {
    public void T1 () {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                if (j > 0 && i < 6) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("*  ");
        }
        System.out.println("Nice to meet you! I`m Triangle II");
    }
}
