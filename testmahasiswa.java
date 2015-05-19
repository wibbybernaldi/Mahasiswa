public class testmahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Rudi Riswanto", 20);
        mhs1.cetakbiodata();
        System.out.println();

        mhs1.setUmur(25);
        mhs1.cetakbiodata();

    }
}
