public class CompareCoin {
    public void compareDiametr(Coin first, Coin second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0 ) {
            System.out.println("The first coin is more than  the second for " + delta);
        } else if (delta == 0) {
            System.out.println("Coins have the same diameter");
        } else System.out.println("The second coin is more than  the first for " + -delta);

    }
}
