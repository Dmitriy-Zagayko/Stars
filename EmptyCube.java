public class EmptyCube {

    public void EC() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j > 0 && i < 6 && i != 0 && j != 6) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        System.out.println("Nice to meet you! I`m Empty Cube!");
    }
}