public class TestMultiTabungan {
    public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan(100, "USD");

        System.out.println("Saldo awal dalam IDR: " + tabungan.getSaldo());

        tabungan.simpanUang(50, "AUD");
        System.out.println("Saldo setelah menyimpan 50 AUD: " + tabungan.getSaldo());

        boolean sukses = tabungan.ambilUang(200000, "IDR");
        System.out.println("Pengambilan 200000 IDR berhasil: " + sukses);
        System.out.println("Saldo setelah pengambilan: " + tabungan.getSaldo());

        sukses = tabungan.ambilUang(20, "USD");
        System.out.println("Pengambilan 20 USD berhasil: " + sukses);
        System.out.println("Saldo setelah pengambilan: " + tabungan.getSaldo());
    }
}
