/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author HP14s
 */
public class TokoSepatu implements Serializable{
    private String id;
    private String tipelengkap;
    private List<Sepatu> shoes;
    
    public void setId(String id){
        this.id =id;
    }
    public void setTipe(String tipelengkap){
        this.tipelengkap = tipelengkap;
    }
    
    public List<Sepatu> getShoes() {
        return shoes;
    }
    public void setShoes(List<Sepatu> shoes){
        this.shoes = shoes;
    }
    
    @Override
    public String toString(){
        String Sepatu, item = "";
        Sepatu = "Toko Sepatu : \r\n"
                + "id = " + id + "\r\n"
                +"tipelengkap=" + tipelengkap + "\r\n"
                + "=========================\r\n"
                + "Detail:\r\n";
        item = shoes.stream().map((obj)->
    obj.toString()).reduce(item, String::concat);
        return Sepatu + item;
    }
    
}
