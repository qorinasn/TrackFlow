package Coding;

import View.MovingForm;
import java.awt.HeadlessException; 
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Qorina
 */

public class Moving extends PengirimanBarang{

    private String NamaPengirim;
    private String Id;
    private String AlamatPengirim;
    private String noHpPengirim;
    private String NamaPenerima;
    private String AlamatPenerima;
    private String noHpPenerima;
    private String JenisBarang;
    private String NoResi;
    private String BeratBarang;
    private String Packing;
    private String EstimasiPengiriman;
    private String MetodePengiriman;
    private String Keterangan;
    private String ongkir;
    private int Ongkos;
    private int Pack;
    
    @Override
    public String getNamaPengirim() {
        return NamaPengirim;
    }
    @Override
    public void setNamaPengirim(String NamaPengirim) {
        this.NamaPengirim = NamaPengirim;
    }
    @Override
    public String getId() {
        return Id;
    }
    @Override
    public void setId(String Id) {
        this.Id = Id;
    }
    @Override
    public String getAlamatPengirim() {
        return AlamatPengirim;
    }
    @Override
    public void setAlamatPengirim(String AlamatPengirim) {
        this.AlamatPengirim = AlamatPengirim;
    }
    @Override
    public String getNoHpPengirim() {
        return noHpPengirim;
    }
    @Override
    public void setNoHpPengirim(String noHpPengirim) {
        this.noHpPengirim = noHpPengirim;
    }
    @Override
    public String getNamaPenerima() {
        return NamaPenerima;
    }
    @Override
    public void setNamaPenerima(String NamaPenerima) {
        this.NamaPenerima = NamaPenerima;
    }
    @Override
    public String getAlamatPenerima() {
        return AlamatPenerima;
    }
    @Override
    public void setAlamatPenerima(String AlamatPenerima) {
        this.AlamatPenerima = AlamatPenerima;
    }
    public String getNoHpPenerima() {
        return noHpPenerima;
    }
    public void setNoHpPenerima(String noHpPenerima) {
        this.noHpPenerima = noHpPenerima;
    }
    public String getJenisBarang() {
        return JenisBarang;
    }
    public void setJenisBarang(String JenisBarang) {
        this.JenisBarang = JenisBarang;
    }
    public String getNoResi() {
        return NoResi;
    }
    public void setNoResi(String NoResi) {
        this.NoResi = NoResi;
    }
    public String getBeratBarang() {
        return BeratBarang;
    }
    public void setBeratBarang(String BeratBarang) {
        this.BeratBarang = BeratBarang;
    }
    public String getPacking() {
        return Packing;
    }
    public void setPacking(String Packing) {
        this.Packing = Packing;
    }
    public String getEstimasiPengiriman() {
        return EstimasiPengiriman;
    }
    public void setEstimasiPengiriman(String EstimasiPengiriman) {
        this.EstimasiPengiriman = EstimasiPengiriman;
    }
    public String getMetodePengiriman() {
        return MetodePengiriman;
    }
    public void setMetodePengiriman(String MetodePengiriman) {
        this.MetodePengiriman = MetodePengiriman;
    }
    public String getKeterangan() {
        return Keterangan;
    }
    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }
    public String getOngkir() {
        return ongkir;
    }
    public void setOngkir(String Ongkir) {
        this.ongkir = ongkir;
    }
    public int getOngkos() {
        return Ongkos;
    }
    public void setOngkos(int Ongkos) {
        this.Ongkos = Ongkos;
    }
    public int getPack() {
        return Pack;
    }
    public void setPack(int Pack) {
        this.Pack = Pack;
    }
    
    
    public final MovingForm m;
    public Moving(MovingForm m){
        this.m = m;
        
    }
    
    @Override
     public void kosongkan_form(){
       m.getNoResi().setText(null);
       m.getId().setText(null);
       m.getNamaPengirim().setText(null);
       m.getNoPengirim().setText(null);
       m.getNamaPenerima().setText(null);
       m.getAlamatPenerima().setText(null);
       m.getNoPenerima().setText(null);
       m.getJenisBarang().setText(null);
       m.getBeratBarang().setText(null);
       m.getPackingBarang().setSelectedItem(this);
       m.getMetodePengiriman().setSelectedItem(this);
       m.getEstimasiPengiriman().setSelectedItem(this);
       m.getKeterangan().setText(null);
       m.getOngkir().setText(null);
       m.getOngkos().setText(null);
       m.getPack().setText(null);
    }
     
    @Override
    public void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No RESI");
        model.addColumn("ID");
        model.addColumn("NAMA PENGIRIM");
        model.addColumn("NO HP PENGIRIM");
        model.addColumn("NAMA PENERIMA");
        model.addColumn("NO HP PENERIMA");
        model.addColumn("ALAMAT PENERIMA");
        model.addColumn("JENIS BARANG");
        model.addColumn("BERAT BARANG");
        model.addColumn("PACKING");
        model.addColumn("ESTIMASI");
        model.addColumn("METODE KIRIM");
        model.addColumn("KETERANGAN");
        model.addColumn("ONGKIR");
     
     try{
         String sql = "SELECT * FROM moving";
         java.sql.Connection conn = Database2.configDB();
         java.sql.Statement stm = conn.createStatement();
         java.sql.ResultSet res = stm.executeQuery(sql);
         while (res.next()){
             
             model.addRow(new Object[]{res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getString(11),res.getString(12),res.getString(13),res.getString(14)});    
         }
         m.getTabelJual().setModel(model);

     }catch(SQLException e){
         System.out.println("Error : "+ e.getMessage());  
     }
   }
}