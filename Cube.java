public class Cube {

    public void Cube1 () {
        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < 7; b++) {
                if (b == 6) {
                    System.out.println("*");
                } else {
                    System.out.print("*     ");
                }
            }
            System.out.println();
        }
        System.out.println("Nice to meet you! I`m Cube!");
    }
}

