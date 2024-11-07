public class MultiTabungan {
    private int saldo;
    
    private static final int AUD_TO_IDR = 10000;
    private static final int USD_TO_IDR = 9000;

    public MultiTabungan(int initsaldo, String currency) {
        this.saldo = convertToIDR(initsaldo, currency);
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah, String currency) {
        saldo += convertToIDR(jumlah, currency);
    }

    public boolean ambilUang(int jumlah, String currency) {
        int jumlahIDR = convertToIDR(jumlah, currency);
        if (saldo >= jumlahIDR) {
            saldo -= jumlahIDR;
            return true;
        } else {
            return false;
        }
    }

    private int convertToIDR(int jumlah, String currency) {
        switch (currency.toUpperCase()) {
            case "AUD":
                return jumlah * AUD_TO_IDR;
            case "USD":
                return jumlah * USD_TO_IDR;
            case "IDR":
                return jumlah;
            default:
                throw new IllegalArgumentException("Mata uang tidak valid.");
        }
    }
}
