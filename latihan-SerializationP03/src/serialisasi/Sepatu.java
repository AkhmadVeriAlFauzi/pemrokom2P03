/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author HP14s
 */
public class Sepatu implements Serializable {
    private final String merek = "Ventela"; // contoh buat keyword final
    private String jenis; 
    private transient String kodesepatu; //contoh buat keyword transient
    
    public Sepatu(String merek, String jenis, String kodesepatu){
        this.jenis = jenis;
        this.kodesepatu = kodesepatu;
    }
    
    public String toString(){
        return "\r\nmerek=" + merek + "\r\njenis =" + jenis + "\r\nkode sepatu =" + kodesepatu + "\r\n";
    }
}
