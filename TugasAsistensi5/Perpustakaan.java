/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi5;


public class Perpustakaan{
  
}
class buku extends Perpustakaan{
    private String judul, pengarang, jenis;
    private int halaman;
    
    public buku(){
        judul = "default";
        pengarang = "default";
        halaman = 0;
    }
    public buku(String j, String p, int hal){
        judul = j;
        pengarang = p;
        halaman = hal;
    }
    public buku(String j, String p, int hal, String jn){
        judul= j;
        pengarang = p;
        halaman = hal;
        jenis = jn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String j) {
        judul= j;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String p) {
        pengarang = p;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int hal) {
        halaman = hal;
    }
    public String getJenis(){
        return this.jenis;
    }
    public void print(){
        System.out.println("Judul Buku\t: "+getJudul()+"\nPengarang\t: "
        +getPengarang()+"\nJumlah Halaman\t: "+getHalaman());
    }
}
class fiksi extends buku{
    private String jenis;
    public fiksi(){
        super();
        this.jenis = "fiksi";
    }
    public fiksi(String j, String p, int hal){
        super(j, p, hal);
        this.jenis = "fiksi";
    }

    public void setJudul(String j) {
        super.setJudul(j);
    }
    public String getJudul(){
        return super.getJudul();
    }
    public void setHalaman(int hal){
        super.setHalaman(hal);
    }
    public int getJmlHalaman(){
        return super.getHalaman();
    }
    public String getJenis(){
        return this.jenis;
    }
    public void print(){
        super.print();
        System.out.println("Jenis Buku\t: "+ this.jenis);
    }
}
class nonFiksi extends buku{
    private String jenis;
    public nonFiksi(){
        super();
        this.jenis = "non fiksi";
    }
    public nonFiksi(String jd, String p, int hal){
        super(jd, p, hal);
        this.jenis = "non fiksi";
    }

    public void setJudul(String jb){
        super.setJudul(jb);
    }
    public String getJudulBuku(){
        return super.getJudul();
    }
    public void setJmlHalaman(int hal){
        super.setHalaman(hal);
    }
    public int getJmlHalaman(){
        return super.getHalaman();
    }
    public String getJenis(){
        return this.jenis;
    }
    public void print(){
        super.print();
        System.out.println("Jenis Buku\t: "+ this.jenis);
    }
}