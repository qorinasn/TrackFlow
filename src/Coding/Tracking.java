package Coding;

import View.TrackingForm;
import java.awt.HeadlessException; 
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Qorina
 */

public class Tracking {

    private int NoResi;
    private String JenisBarang;
    private int TglKirim;
    private int TglSampai;
    private String NamaPenerima;
    private String NamaPengirim;
    private String Status;
    private int SubTotal;
    
    public int getNoResi() {
        return NoResi;
    }
    public void setNoResi(int NoResi) {
        this.NoResi = NoResi;
    }
    public String getJenisBarang() {
        return JenisBarang;
    }
    public void setJenisBarang(String JenisBarang) {
        this.JenisBarang = JenisBarang;
    }
    public int getTglKirim() {
        return TglKirim;
    }
    public void setTglKirim(int TglKirim) {
        this.TglKirim = TglKirim;
    }
    public int getTglSampai() {
        return TglSampai;
    }
    public void setTglSampai(int TglSampai) {
        this.TglSampai = TglSampai;
    }
    public String getNamaPenerima() {
        return NamaPenerima;
    }
    public void setNamaPenerima(String NamaPenerima) {
        this.NamaPenerima = NamaPenerima;
    }
    public String getNamaPengirim() {
        return NamaPengirim;
    }
    public void setNamaPengirim(String NamaPengirim) {
        this.NamaPengirim = NamaPengirim;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }
    public int getSubTotal() {
        return SubTotal;
    }
    public void setSubTotal(int SubTotal) {
        this.SubTotal = SubTotal;
    }
    public final TrackingForm t;
    public Tracking(TrackingForm t){
        this.t = t;
    }
    public void kosongkan_form(){
       t.getNoResi().setText(null);

    }
    //table.setValueAt(HashTable.getData().getNopol(), x, 0);
        //table.setValueAt(HashTable.getData().getNama(), x, 1);
        //table.setValueAt(HashTable.getData().getAlamat(), x, 2);
        //table.setValueAt(HashTable.getData().getTelp(), x, 3);
        //table.setValueAt(HashTable.getData().getTgl(), x, 4);
        //table.setValueAt(HashTable.getData().getKerusakan(), x, 5);
        //table.setValueAt(HashTable.getData().getMekanik(), x, 6);
        //x++;

    
    @SuppressWarnings("empty-statement")
    public void cariData(String key) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No RESI");
        model.addColumn("TGL KIRIM");
        model.addColumn("JENIS BARANG");
        model.addColumn("PENGIRIM");
        model.addColumn("PENERIMA");
        model.addColumn("TGL SAMPAI");
        model.addColumn("STATUS");
        model.addColumn("SUB TOTAL");
     
     try{
         String sql = "SELECT * FROM tracking WHERE no_resi LIKE '%"+key+"%'";
         java.sql.Connection conn = Database3.configDB();
         java.sql.Statement stm = conn.createStatement();
         java.sql.ResultSet res = stm.executeQuery(sql);
         while (res.next()){
             
             model.addRow(new Object[]{res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});    
         }
         t.getTabelJual().setModel(model);

     }catch(SQLException e){
         System.out.println("Error : "+ e.getMessage());  
     }
    }
    
    public void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No RESI");
        model.addColumn("TGL KIRIM");
        model.addColumn("JENIS BARANG");
        model.addColumn("PENGIRIM");
        model.addColumn("PENERIMA");
        model.addColumn("TGL SAMPAI");
        model.addColumn("STATUS");
        model.addColumn("SUB TOTAL");
     
     try{
         String sql = "SELECT * FROM tracking";
         java.sql.Connection conn = Database3.configDB();
         java.sql.Statement stm = conn.createStatement();
         java.sql.ResultSet res = stm.executeQuery(sql);
         while (res.next()){
             
             model.addRow(new Object[]{res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});    
         }
         t.getTabelJual().setModel(model);

     }catch(SQLException e){
         System.out.println("Error : "+ e.getMessage());  
     }
}
}
