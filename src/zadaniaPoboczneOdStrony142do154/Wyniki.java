package zadaniaPoboczneOdStrony142;

public class Wyniki {

    public static void main(String[] args) {

        Wyniki w = new Wyniki();
        w.doDziela();
    }

    private void doDziela() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.println(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
