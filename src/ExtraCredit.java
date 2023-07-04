public class ExtraCredit {
    public static void main(String[] args) {
        int numberOfCharacters = 0;
        for(int cnt = 1; cnt <= 10; cnt++) {
            if(cnt == 1 || cnt == 2 || cnt == 9 || cnt == 10){
                numberOfCharacters = 7;
            }
            if(cnt == 3 || cnt == 4 || cnt == 7 || cnt == 8) {
                numberOfCharacters = 2;
            }
            if(cnt == 5 || cnt == 6) {
                numberOfCharacters = 5;
            }
            for(int cnt2 = 1; cnt2 <= numberOfCharacters; cnt2++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
