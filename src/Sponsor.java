import java.util.Random;

public class Sponsor <S extends transport>{
    protected String sponsorName;
    protected int cash;

    public Sponsor(String sponsorName, int cash) {
        this.sponsorName = sponsorName;
        this.cash = cash;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getCash() {
        return cash;
    }

    public void payCash() {
        int min = 100000;
        int max = 100000;
        int itog = max - 3*min;
        Random random = new Random();
        cash = random.nextInt(itog + min / 2) + max / 6;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "sponsorName='" + sponsorName + '\'' +
                ", cash=" + cash +
                '}';
    }
}
