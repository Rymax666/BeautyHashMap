package Praktikum;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> data = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        data.put("Bendy", "Lalapan Boy");
        data.put("Comsans", "Papahe Ferro");
        data.put("Asnawy", "Papahe Yanto");
        data.put("Agos", "Papahe Cipong");

        System.out.println(">>Input Dinamis<<");
        System.out.print("Masukkan Nama : ");
        String nama = scan.next();
        System.out.print("Masukkan Identitas : ");
        String identitas = scan.next();

        data.put(nama,identitas);

        System.out.println();
        System.out.println(">>Mencari Key<<");
        System.out.print("Masukkan Key : ");
        String key = scan.next();

        if (data.containsKey(key)){
            System.out.println("Identitas : "+data.get(key));
        }else{
            System.out.println("Kagak Ada Anjir!!!");
        }

        System.out.println(">>Menampilkan Data<<");
        System.out.println();
        for (String orang : data.keySet()){
            String Value = data.get(orang);
            System.out.println("["+orang+", "+Value+"]");
        }

    }
}
