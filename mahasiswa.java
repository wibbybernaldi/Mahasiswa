public class mahasiswa {
    private String namamahasiswa;
    private int umur;

    public mahasiswa(String nama, int umu){
        namamahasiswa = nama;
    umur=umu;
    }

    public void setNamamahasiswa(String nama){
    namamahasiswa=nama;
    }
    public void setUmur(int umu){
    umur=umu;
    }
    public String getNamamahasiswa(){
        return namamahasiswa;
    }
    public int getUmur(){
    return umur;
    }
    public void cetakbiodata(){
        System.out.println("Nama mahasiswa : "+ namamahasiswa);
        System.out.println("Umur mahasiswa : "+ umur);
    }
}
