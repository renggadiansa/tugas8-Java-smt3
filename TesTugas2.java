public class TesTugas2 {
    static class Truk {
        private double muatan;
        private double muatanMaks;

        public Truk(double berat) {
            muatan = 0;
            muatanMaks = berat;
        }

        public boolean tambahMuatan(double berat) {
            if (muatan + berat <= muatanMaks) {
                muatan += berat;
                return true;
            } else {
                return false;
            }
        }

        public double getMuatan() {
            return muatan;
        }

        public double getMuatanMaks() {
            return muatanMaks;
        }
    }

    public static void main(String args[]) {
        boolean status;
        Truk truk = new Truk(900);
        System.out.println("Muatan maksimal = " + truk.getMuatanMaks());
        status = truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500");
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        status = truk.tambahMuatan(300.0);
        System.out.println("Tambah muatan : 300");
        if (status)
            System.out.println("Ok");

        else
            System.out.println("Gagal");
        status = truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150");
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        status = truk.tambahMuatan(50.0);
        System.out.println("Tambah muatan : 50");
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
}
