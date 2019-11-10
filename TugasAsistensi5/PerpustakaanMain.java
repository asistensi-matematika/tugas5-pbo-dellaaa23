/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi5;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PerpustakaanMain {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        int jumlahBuku = 3;
        int jumlahFiksi=0;
        int Nonfiksi=0;
        int halamanFiksi=0;
        int halamanNonFiksi=0;
        double ragamFiksi=0;
        double ragamNonFiksi=0;
        int list;
        Random r = new Random();
        buku[] buku = new buku[100000];
        
        for(int i=0; i<jumlahBuku; i++){
            list = r.nextInt(2)+1;
            
            if(list == 1){
                buku[i] = new fiksi(("buku_"+(i+1)), "A Fuadi", 100);
                jumlahFiksi+=1;
                halamanFiksi += buku[i].getHalaman();
                ragamFiksi += Math.pow((buku[i].getHalaman()-rata(halamanFiksi,jumlahFiksi)),2);
            }else{
                buku[i]= new nonFiksi(("buku_"+(i+1)),"A Fuadi", 100);
                Nonfiksi+=1;
                halamanNonFiksi+=buku[i].getHalaman();
                ragamNonFiksi += Math.pow((buku[i].getHalaman()-rata(halamanNonFiksi,Nonfiksi)),2);
            }
            buku[i].print();
            System.out.println("");
        }
        double ragamf = ragamFiksi/jumlahFiksi;
        double ragamnf = ragamNonFiksi/Nonfiksi;
        int halbuku = halamanFiksi+halamanNonFiksi;
            System.out.println("fiksi : "+jumlahFiksi);
            System.out.println("nonfiksi : "+Nonfiksi);
            System.out.println("halaman seluruh buku : "+halbuku);
            System.out.println("hal fiksi : "+halamanFiksi);
            System.out.println("hal non fiksi : "+halamanNonFiksi);
            
        for(int n=0; n<buku.length; n++){
        tepi();
        header("perpustakaan.txt");
        tepi();
        System.out.println("1) input buku baru\n2) modifikasi detail buku"
        + "\n3) hapus buku\n0) EXIT");
        System.out.print("pilih: ");
        int pilih = input.nextInt();
        switch(pilih){
            
            case 1:
                tepi();
                header("bukubaru.txt");
                tepi();
                try{
                    System.out.println("input judul buku:\n>");
                    String judul = input.next();
                    System.out.println("input pengarang buku:\n>");
                    String pengarang = input.next();
                    System.out.println("input jumlah halaman\n>");
                    int hlm = input.nextInt();
                    
                    System.out.println("pilih jenis: \n1. fiksi\n2. non fiksi");
                    System.out.println("pilih: ");
                    int a = input.nextInt();
                    
                    switch(a){
                    case 1:
                        buku[jumlahBuku] = new fiksi(judul,pengarang,hlm);
                        jumlahFiksi+=1;
                        jumlahBuku +=1;
                        halamanFiksi +=hlm;
                        ragamFiksi += Math.pow((buku[jumlahBuku].getHalaman()-rata(halamanFiksi,jumlahFiksi)),2);
                        break;
                    case 2:
                        buku[jumlahBuku] = new nonFiksi(judul,pengarang,hlm);
                        Nonfiksi+=1;
                        jumlahBuku +=1;
                        halamanNonFiksi+=hlm;
                        ragamNonFiksi += Math.pow((buku[jumlahBuku].getHalaman()-rata(halamanNonFiksi,Nonfiksi)),2);
                        break;
                    }
                
                }
                catch(Exception e){
                    
                }
                break;
            case 2:
                tepi();
                header("ubahbuku.txt");
                tepi();
                System.out.println("pilih buku yang akan diubah:");
                for(int i=0; i<jumlahBuku; i++){
                    System.out.println((i+1)+". "+buku[i].getJudul()+" | "+buku[i].getPengarang());
                }
                System.out.println("pilih: ");
                int p = input.nextInt();
                
                switch(p){
                    case 1:
                        try{
                            System.out.println("input judul buku:\n>");
                            String judul = input.next();
                            System.out.println("input pengarang buku:\n>");
                            String pengarang = input.next();
                            System.out.println("input jumlah halaman\n>");
                            int hal = input.nextInt();
                            
                            if(buku[0].getJenis()=="fiksi"){
                                buku[0] = new fiksi(judul,pengarang,hal);
                                buku[0].setHalaman(hal);
                            }else{
                                buku[0] = new nonFiksi(judul,pengarang,hal);
                                buku[0].setHalaman(hal);
                            }
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                    case 2:
                        try{
                            System.out.println("input judul buku:\n>");
                            String judul = input.next();
                            System.out.println("input pengarang buku:\n>");
                            String pengarang = input.next();
                            System.out.println("input jumlah halaman\n>");
                            int hal = input.nextInt();
                            
                            if(buku[1].getJenis()=="fiksi"){
                                buku[1] = new fiksi(judul,pengarang,hal);
                                buku[1].setHalaman(hal);
                            }else{
                                buku[1] = new nonFiksi(judul,pengarang,hal);
                                buku[1].setHalaman(hal);
                            }
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                    case 3:
                        try{
                            System.out.println("input judul buku:\n>");
                            String judul = input.next();
                            System.out.println("input pengarang buku:\n>");
                            String pengarang = input.next();
                            System.out.println("input jumlah halaman\n>");
                            int hal = input.nextInt();
                            
                            if(buku[2].getJenis()=="fiksi"){
                                buku[2] = new fiksi(judul,pengarang,hal);
                                buku[2].setHalaman(hal);
                            }else{
                                buku[2] = new nonFiksi(judul,pengarang,hal);
                                buku[2].setHalaman(hal);
                            }
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                }
                break;
            case 3:
                tepi();
                header("hapusbuku.txt");
                tepi();
                System.out.println("pilih buku yang akan dihapus:");
                for(int i=0; i<jumlahBuku; i++){
                    System.out.println((1+i)+". "+buku[i].getJudul()+" | "+buku[i].getPengarang());
                }
                System.out.print("pilih: ");
                int pil = input.nextInt();
                switch(pil){
                    case 1:
                        try{
                        for(int i=1; i<jumlahBuku; i++){
                            buku[i-1]=buku[i];
                            buku[i].print();
                            System.out.println("");
                        }
                        if(buku[0].getJenis()=="fiksi"){
                            jumlahFiksi-=1;
                            buku[0].setHalaman(0);
                        }else{
                            Nonfiksi-=1;
                            buku[0].setHalaman(0);
                        }
                        jumlahBuku-=1;
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                    case 2:
                        try{
                        for(int i=2; i<jumlahBuku; i++){
                            buku[i-1]=buku[i];
                            buku[i].print();
                            System.out.println("");
                        }
                        if(buku[1].getJenis()=="fiksi"){
                            jumlahFiksi-=1;
                            buku[1].setHalaman(0);
                        }else{
                            Nonfiksi-=1;
                            buku[1].setHalaman(0);
                        }
                        jumlahBuku-=1;
                        }
                        catch(Exception e){
                            
                        }
                        break;
                    case 3:
                        try{
                        for(int i=0; i<jumlahBuku-1; i++){
                            buku[i].print();
                            System.out.println("");
                            
                        }
                        if(buku[2].getJenis()=="fiksi"){
                            jumlahFiksi -=1;
                            buku[2].setHalaman(0);
                        }else{
                            Nonfiksi-=1;
                            buku[2].setHalaman(0);
                        }
                        jumlahBuku-=1;
                        }
                        catch(Exception e){
                            
                        }
                        break;
                }
            case 0:
                tepi();
                header("perpustakaan.txt");
                tepi();
                double x=0;
                for(int i=0; i<jumlahBuku; i++){
                    buku[i].print();
                    System.out.println("");
                    x += Math.pow((buku[i].getHalaman()-rata(halbuku,jumlahBuku)),2);
                }
                double ragambuku = x/jumlahBuku;
                tepi();
                System.out.println("jumlah buku dalam perpustakaan : "+jumlahBuku);
                System.out.println("rata rata halaman buku dalam perpustakaan : "+rata(halbuku,jumlahBuku));
                System.out.println("standar deviasi halam buku dalam perpustakaan : "+standardeviasi(ragambuku));
                tepi();
                System.out.println("jumlah buku fiksi dalam perpustakaan : "+jumlahFiksi);
                System.out.println("rata rata halaman buku fiksi dalam perpustakaan : "+rata(halamanFiksi,jumlahFiksi));
                System.out.println("standar deviasi halaman buku fiksi dalam perpustakaan : "+standardeviasi(ragamf));
                tepi();
                System.out.println("jumlah buku nonfiksi dalam perpustakaan : "+Nonfiksi);
                System.out.println("rata-rata buku nonfiksi dalam perpustakaan : "+rata(halamanNonFiksi,Nonfiksi));
                System.out.println("standar deviasi buku nonfiksi dalam perpustakaan : "+ standardeviasi(ragamnf));
                tepi();
                String path = "data.txt";
                try{
                    FileWriter file = new FileWriter(path);
                        BufferedWriter buf = new BufferedWriter(file);
                        buf.write("PERPUSTAKAAN");
                        buf.newLine();
                        buf.newLine();
                        for(int i=0; i<jumlahBuku; i++){
                            int a = i+1;
                            buf.write("buku ke : ["+Integer.toString(a)+"]");
                            buf.newLine();
                            buf.write("judul : "+buku[i].getJudul());
                            buf.newLine();
                            buf.write("pengarang : "+buku[i].getPengarang());
                            buf.newLine();
                            buf.write("jumlah halaman : "+ buku[i].getHalaman());
                            buf.newLine();
                            buf.write("jenis buku : "+ buku[i].getJenis());
                            buf.newLine();
                            buf.newLine();
                        }
                        buf.close();
                    }
                    catch(Exception e){
                    }
                System.exit(0);
                break;
        }
    }
}
         public static void header(String fileTxt){
        File tampil = new File(fileTxt);
        String encoding = "utf-8";
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(tampil), encoding)){
            int data = isr.read();
            while (data != -1){
                System.out.print((char)data);
                data = isr.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        public static void tepi(){
        System.out.println("\n=======================================================");
    }
        
    public static double rata(int jumlahdata, int ndata){
        double rata=0;
        if(ndata == 0){
            System.out.print("");
        }else{
            rata = jumlahdata/ndata;
        }
        return rata;
    }

    public static double standardeviasi(double ragam){
        double standev=0;
        if(ragam==0){
            System.out.print("");
        }else{
            standev = Math.sqrt(ragam);
        }
        return standev;
    }
}
