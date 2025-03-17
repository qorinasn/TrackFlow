package Coding;

import View.CourierCargoForm;
import java.awt.HeadlessException; 
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Qorina
 */

public class CourierCargo extends PengirimanBarang{
    
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
    private int Estimasi;
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
    @Override
    public String getNoHpPenerima() {
        return noHpPenerima;
    }
    @Override
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
    public int getEstimasi() {
        return Estimasi;
    }
    public void setOngkos(int Ongkos) {
        this.Estimasi = Estimasi;
    }
    public int getPack() {
        return Pack;
    }
    public void setPack(int Pack) {
        this.Pack = Pack;
    }
    
    public final CourierCargoForm c;
    public CourierCargo(CourierCargoForm c){
        this.c = c;
        
    }
    @Override
     public void kosongkan_form(){
       c.getNoResi().setText(null);
       c.getId().setText(null);
       c.getNamaPengirim().setText(null);
       c.getNoPengirim().setText(null);
       c.getNamaPenerima().setText(null);
       c.getAlamatPenerima().setText(null);
       c.getNoPenerima().setText(null);
       c.getJenisBarang().setText(null);
       c.getBeratBarang().setText(null);
       c.getPackingBarang().setSelectedItem(this);
       c.getMetodePengiriman().setSelectedItem(this);
       c.getEstimasiPengiriman().setSelectedItem(this);
       c.getKeterangan().setText(null);
       c.getOngkir().setText(null);
       c.getEstimasi().setText(null);
       c.getPack().setText(null);
    }
     
    @Override
    public void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No RESI");
        model.addColumn("ID");
        model.addColumn("NAMA PENGIRIM");
        model.addColumn("NO HP PENGIRIM");
        model.addColumn("NAMA PENERIMA");
        model.addColumn("ALAMAT PENERIMA");
        model.addColumn("NO HP PENERIMA");
        model.addColumn("JENIS BARANG");
        model.addColumn("BERAT BARANG");
        model.addColumn("PACKING");
        model.addColumn("ESTIMASI");
        model.addColumn("METODE KIRIM");
        model.addColumn("KETERANGAN");
        model.addColumn("ONGKIR");
     
     try{
         String sql = "SELECT * FROM courier_cargo";
         java.sql.Connection conn = Database1.configDB();
         java.sql.Statement stm = conn.createStatement();
         java.sql.ResultSet res = stm.executeQuery(sql);
         while (res.next()){
             
             model.addRow(new Object[]{res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getString(11),res.getString(12),res.getString(13),res.getString(14)});    
         }
         c.getTabelJual().setModel(model);

     }catch(SQLException e){
         System.out.println("Error : "+ e.getMessage());  
     }
   }
}
