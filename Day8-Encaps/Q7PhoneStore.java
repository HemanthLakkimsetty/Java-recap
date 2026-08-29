package Encaps;

public class Q7PhoneStore {

    public static void main(String[] args) {
        Q7PhoneStore phone = new Q7PhoneStore();

        phone.setTotStor(128);
        phone.setStorUsed(50);

        System.out.println("Available Storage: " + phone.getAvailStor() + " GB");
        System.out.printf("Storage Used: %.2f%%", phone.getPerUsed());
    }

    private double totStor;
    private double storUsed;

    public void setTotStor(double totStor) {
        this.totStor = totStor;
    }

    public void setStorUsed(double storUsed) {
        this.storUsed = storUsed;
    }

    public double getAvailStor() {
        return totStor - storUsed;
    }

    public double getPerUsed() {
        return (storUsed / totStor) * 100;
    }
}