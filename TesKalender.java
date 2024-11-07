public class TesKalender {
    static class Kalender {
        private int tanggal;
        private int bulan;
        private int tahun;

        public Kalender(int tgl) {
            this.tanggal = tgl;
            this.bulan = 1;
            this.tahun = 2000;
        }

        public Kalender(int bln, int thn) {
            this.tanggal = 1;
            this.bulan = bln;
            this.tahun = thn;
        }

        public Kalender(int tgl, int bln, int thn) {
            this.tanggal = tgl;
            this.bulan = bln;
            this.tahun = thn;
        }

        public void setTanggal(int tgl) {
            this.tanggal = tgl;
        }

        public void setBulan(int bln) {
            this.bulan = bln;
        }

        public void setTahun(int thn) {
            this.tahun = thn;
        }

        public int getTanggal() {
            return tanggal;
        }

        public int getBulan() {
            return bulan;
        }

        public int getTahun() {
            return tahun;
        }
    }

    public static String getTime(Kalender kal) {
        return kal.getTanggal() + "-" + kal.getBulan() + "-" + kal.getTahun();
    }

    public static void main(String args[]) {
        Kalender kal = new Kalender(8);
        System.out.println("Waktu awal : " + getTime(kal));
        kal.setTanggal(9);
        System.out.println("1 hari setelah waktu awal : " + getTime(kal));
        kal = new Kalender(6, 2003);
        System.out.println("Waktu berubah : " + getTime(kal));
        kal.setBulan(7);
        System.out.println("1 bulan setelah itu : " + getTime(kal));
        kal = new Kalender(20, 10, 2004);
        System.out.println("Waktu berubah : " + getTime(kal));
        kal.setTahun(2005);
        System.out.println("1 tahun setelah itu : " + getTime(kal));
    }
}
