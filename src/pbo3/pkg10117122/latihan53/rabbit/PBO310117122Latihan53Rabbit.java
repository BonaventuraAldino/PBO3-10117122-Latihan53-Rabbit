/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan53.rabbit;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini berisi program untuk menampilkan apakah peter
 *                     adalah vegetarian atau bukan dan deskripsi tentang peter
 *                     itu sendiri menggunakan pendekatan berbasis objek.
 */
public class PBO310117122Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal objek = new Animal(false, "grass", 4);
        Rabbit objek2 = new Rabbit(" ", true, " ", 0);
        
        System.out.println("Hello, His name is " + objek2.getNama());
        System.out.println(objek2.getNama() + " is Vegetarian? " 
                + objek.vegetarian);
        System.out.println(objek2.getNama() + " eats " + objek.eats);
        System.out.println(objek2.getNama() + " has " 
                + objek.getNoOfLegs + " legs.");
        System.out.println(objek2.getNama() + " color is " + objek2.getColor());
        System.out.println();
        System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
