package View;

import Coding.CourierCargo;
import Coding.Database1;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Qorina
 */

@SuppressWarnings("serial")
public class CourierCargoForm extends javax.swing.JFrame {

    private CourierCargo CourierCargo;
    
    public CourierCargoForm() {
        initComponents();
        CourierCargo = new CourierCargo(this);
    }
    public JTextField getNoResi() {
        return noresi;
    }
    public JTextField getId() {
        return idtext;
    }
     public JTextField getNamaPengirim() {
        return pengirimnm;
    }
      public JTextField getNoPengirim() {
        return hp1text;
    }
     public JTextField getNamaPenerima() {
        return penerimanm;
    }
     public JTextField getAlamatPenerima() {
        return alamat2text;
    }
     public JTextField getNoPenerima() {
        return no2text;
    }
    public JTextField getJenisBarang() {
        return jenis;
    }
     public JTextField getBeratBarang() {
        return berat;
    }
    public JComboBox getPackingBarang() {
        return pack;
    }
    public JComboBox getMetodePengiriman() {
        return metode;
    }
    public JComboBox getEstimasiPengiriman() {
        return estimasi;
    }
    public JTextField getKeterangan() {
        return ket;
    }
    public JTextField getOngkir() {
        return ongkir;
    }
    public JTable getTabelJual(){
        return tabeljual;
    }
    public JTextField getEstimasi() {
        return estimasi1;
    }
    public JTextField getPack(){
        return pack1;
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ket = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        noresi = new javax.swing.JTextField();
        ongkir = new javax.swing.JTextField();
        metode = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        barang = new javax.swing.JLabel();
        no2text = new javax.swing.JTextField();
        hp2 = new javax.swing.JLabel();
        alamat2text = new javax.swing.JTextField();
        alamat2 = new javax.swing.JLabel();
        penerimanm = new javax.swing.JTextField();
        nama2 = new javax.swing.JLabel();
        penerima = new javax.swing.JLabel();
        hp1text = new javax.swing.JTextField();
        hp = new javax.swing.JLabel();
        pengirimnm = new javax.swing.JTextField();
        nm = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        pengirim = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        ongkirklik = new javax.swing.JButton();
        estimasi = new javax.swing.JComboBox<>();
        pack = new javax.swing.JComboBox<>();
        ExitButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeljual = new javax.swing.JTable();
        HomeButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        estimasi1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pack1 = new javax.swing.JTextField();
        desain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ket.setBackground(new java.awt.Color(153, 0, 51));
        ket.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        ket.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(ket, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 373, 150, 30));

        berat.setBackground(new java.awt.Color(153, 0, 51));
        berat.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        berat.setForeground(new java.awt.Color(255, 204, 204));
        berat.setToolTipText("");
        getContentPane().add(berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 150, 30));

        jenis.setBackground(new java.awt.Color(153, 0, 51));
        jenis.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jenis.setForeground(new java.awt.Color(255, 204, 204));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        getContentPane().add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 150, 30));

        noresi.setBackground(new java.awt.Color(153, 0, 51));
        noresi.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        noresi.setForeground(new java.awt.Color(255, 204, 204));
        noresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noresiActionPerformed(evt);
            }
        });
        getContentPane().add(noresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 150, 30));

        ongkir.setBackground(new java.awt.Color(153, 0, 51));
        ongkir.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        ongkir.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(ongkir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 413, 150, 30));

        metode.setBackground(new java.awt.Color(153, 0, 51));
        metode.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        metode.setForeground(new java.awt.Color(255, 204, 204));
        metode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antar ke Counter (Drop Off)", "Dijemput Kurir (Pick Up)" }));
        metode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodeActionPerformed(evt);
            }
        });
        getContentPane().add(metode, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("ONGKIR TOTAL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, 80));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("KETERANGAN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, 100));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("ESTIMASI PENGIRIMAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, 70));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("METODE PENGIRIMAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, 70));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("PACKING");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 70));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("BERAT BARANG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, 70));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("JENIS BARANG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, 70));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("NO RESI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, 50));

        barang.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        barang.setForeground(new java.awt.Color(102, 0, 0));
        barang.setText("BARANG");
        getContentPane().add(barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        no2text.setBackground(new java.awt.Color(153, 0, 51));
        no2text.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        no2text.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(no2text, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 170, 30));

        hp2.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        hp2.setForeground(new java.awt.Color(153, 0, 51));
        hp2.setText("NO HP");
        getContentPane().add(hp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 40));

        alamat2text.setBackground(new java.awt.Color(153, 0, 51));
        alamat2text.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        alamat2text.setForeground(new java.awt.Color(255, 204, 204));
        alamat2text.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alamat2text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamat2textActionPerformed(evt);
            }
        });
        getContentPane().add(alamat2text, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, 80));

        alamat2.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        alamat2.setForeground(new java.awt.Color(153, 0, 51));
        alamat2.setText("ALAMAT");
        getContentPane().add(alamat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 40));

        penerimanm.setBackground(new java.awt.Color(153, 0, 51));
        penerimanm.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        penerimanm.setForeground(new java.awt.Color(255, 204, 204));
        penerimanm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penerimanmActionPerformed(evt);
            }
        });
        getContentPane().add(penerimanm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 170, 30));

        nama2.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        nama2.setForeground(new java.awt.Color(153, 0, 51));
        nama2.setText("NAMA");
        getContentPane().add(nama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 40));

        penerima.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        penerima.setForeground(new java.awt.Color(102, 0, 0));
        penerima.setText("PENERIMA");
        getContentPane().add(penerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        hp1text.setBackground(new java.awt.Color(153, 0, 51));
        hp1text.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        hp1text.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(hp1text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, 30));

        hp.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        hp.setForeground(new java.awt.Color(153, 0, 51));
        hp.setText("NO HP");
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, -1));

        pengirimnm.setBackground(new java.awt.Color(153, 0, 51));
        pengirimnm.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        pengirimnm.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(pengirimnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 170, 30));

        nm.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        nm.setForeground(new java.awt.Color(153, 0, 51));
        nm.setText("NAMA");
        getContentPane().add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, -1));

        idtext.setBackground(new java.awt.Color(153, 0, 51));
        idtext.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        idtext.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 170, 30));

        id.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        id.setForeground(new java.awt.Color(153, 0, 51));
        id.setText("ID");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 20));

        pengirim.setBackground(new java.awt.Color(102, 0, 0));
        pengirim.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        pengirim.setForeground(new java.awt.Color(102, 0, 0));
        pengirim.setText("PENGIRIM");
        getContentPane().add(pengirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delivery-courier.png"))); // NOI18N
        jLabel7.setText(" JASA PENGIRIMAN COURIER CARGO");
        jLabel7.setFocusCycleRoot(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        cc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nude Maroon.jpg"))); // NOI18N
        getContentPane().add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 80));

        DeleteButton.setBackground(new java.awt.Color(255, 204, 204));
        DeleteButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(135, 45, 60));
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash (1).png"))); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 100, 30));

        ShowButton.setBackground(new java.awt.Color(255, 204, 204));
        ShowButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ShowButton.setForeground(new java.awt.Color(135, 45, 60));
        ShowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons (2).png"))); // NOI18N
        ShowButton.setText("SHOW");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 90, 30));

        UpdateButton.setBackground(new java.awt.Color(255, 204, 204));
        UpdateButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(135, 45, 60));
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 110, 30));

        SaveButton.setBackground(new java.awt.Color(255, 204, 204));
        SaveButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(135, 45, 60));
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        SaveButton.setText("SAVE");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, 30));

        ongkirklik.setBackground(new java.awt.Color(153, 0, 51));
        ongkirklik.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ongkirklik.setForeground(new java.awt.Color(255, 204, 204));
        ongkirklik.setText("by Ongkir");
        ongkirklik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ongkirklikActionPerformed(evt);
            }
        });
        getContentPane().add(ongkirklik, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 100, 20));

        estimasi.setBackground(new java.awt.Color(153, 0, 51));
        estimasi.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        estimasi.setForeground(new java.awt.Color(255, 204, 204));
        estimasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-1 Hari", "1-2 Hari", "2-3 Hari", "3-5 Hari" }));
        estimasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimasiActionPerformed(evt);
            }
        });
        getContentPane().add(estimasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 90, 30));

        pack.setBackground(new java.awt.Color(153, 0, 51));
        pack.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        pack.setForeground(new java.awt.Color(255, 204, 204));
        pack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Box Carton", "Foam sheet", "Bubble Wrap", "Seal Tape", "Kayu" }));
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        getContentPane().add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 150, 30));

        ExitButton.setBackground(new java.awt.Color(255, 204, 204));
        ExitButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(135, 45, 60));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit (1).png"))); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 100, 30));

        ResetButton.setBackground(new java.awt.Color(255, 204, 204));
        ResetButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(135, 45, 60));
        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 100, 30));

        tabeljual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabeljual.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tabeljual.setForeground(new java.awt.Color(255, 204, 204));
        tabeljual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "NAMA PENGIRIM", "ALAMAT PENGIRIM", "NO HP PENGIRIM", "NAMA PENERIMA", "ALAMAT PENERIMA", "NO HP PENERIMA", "NO RESI", "JENIS BARANG", "BERAT BARANG", "PACKING", "ESTIMASI", "METODE KIRIM", "KETERANGAN", "ONGKIR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabeljual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeljualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeljual);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 950, 110));

        HomeButton.setBackground(new java.awt.Color(255, 204, 204));
        HomeButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(135, 45, 60));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        HomeButton.setText(" HOME");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("ISI ID DAN NO RESI SESUAI URUTAN");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 240, 20));
        getContentPane().add(estimasi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 90, 30));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Rp.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 30, 30));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Rp.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 30, 30));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Rp.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 30, 30));
        getContentPane().add(pack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 100, 30));

        desain.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        desain.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2021-04-12_07.12.23_5.jpg"))); // NOI18N
        desain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        desain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desain.setPreferredSize(new java.awt.Dimension(1308, 2000));
        getContentPane().add(desain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 970, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estimasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estimasiActionPerformed
        String Estimasi;
        int bayarEstimasi;
        
        Estimasi = String.valueOf(estimasi.getSelectedItem());
            if (Estimasi.equals("1-1 Hari")){
            bayarEstimasi = 15000;
        }else
            if (Estimasi.equals("1-2 Hari")){
            bayarEstimasi = 12000;
        }else
            if (Estimasi.equals("2-3 Hari")){
            bayarEstimasi = 10000;
        }else
            if (Estimasi.equals("3-5 Hari")){
            bayarEstimasi = 7000;
        }else {
            bayarEstimasi = 0;
        }
        
        estimasi1.setText(""+bayarEstimasi);
    }//GEN-LAST:event_estimasiActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        try{
        String sql = "DELETE FROM courier_cargo WHERE no_resi ='"+noresi.getText()+"'";
        java.sql.Connection conn = Database1.configDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement (sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Data Anda Berhasil Dihapus!");
    
    }catch (HeadlessException | SQLException e){
        JOptionPane.showInputDialog(this, e.getMessage());
    }
    CourierCargo.tampilkan_data();
    CourierCargo.kosongkan_form();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void alamat2textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamat2textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamat2textActionPerformed

    private void tabeljualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljualMouseClicked
        int baris = tabeljual.rowAtPoint(evt.getPoint());
        
        String no_resi = tabeljual.getValueAt(baris, 0).toString();
        noresi.setText(no_resi);
        
        String id = tabeljual.getValueAt(baris, 1).toString();
        idtext.setText(id);
        
        String pengirim = tabeljual.getValueAt(baris, 2).toString();
        pengirimnm.setText(pengirim);
        
        String nopengirim = tabeljual.getValueAt(baris, 3).toString();
        hp1text.setText(nopengirim);
        
        String penerima = tabeljual.getValueAt(baris, 4).toString();
        penerimanm.setText(penerima);
        
        String alpenerima = tabeljual.getValueAt(baris, 5).toString();
        alamat2text.setText(alpenerima);
        
        String nopenerima = tabeljual.getValueAt(baris, 6).toString();
        no2text.setText(nopenerima);
        
        String jenisBarang = tabeljual.getValueAt(baris, 7).toString();
        jenis.setText(jenisBarang);
        
        String beratBarang = tabeljual.getValueAt(baris, 8).toString();
        berat.setText(beratBarang);
        
        String packing = tabeljual.getValueAt(baris,9).toString();
        pack.setSelectedItem(packing);
        
        String metodePengiriman = tabeljual.getValueAt(baris, 10).toString();
        metode.setSelectedItem(metodePengiriman);
        
        String estimasiPengiriman = tabeljual.getValueAt(baris, 11).toString();
        estimasi.setSelectedItem(estimasiPengiriman);
        
        String keterangan = tabeljual.getValueAt(baris, 12).toString();
        ket.setText(keterangan);
        
        String Ongkir = tabeljual.getValueAt(baris, 13).toString();
        ongkir.setText(Ongkir);
        
    }//GEN-LAST:event_tabeljualMouseClicked

    private void penerimanmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penerimanmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penerimanmActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        try{
            String sql = "INSERT INTO courier_cargo VALUES ('"+noresi.getText()+"','"+idtext.getText()+"','"+pengirimnm.getText()+"','"+hp1text.getText()+"','"+penerimanm.getText()
                    +"','"+no2text.getText()+"','"+alamat2text.getText()+"','"+jenis.getText()+"','"+berat.getText()+"','"+pack.getSelectedItem()+"','"+metode.getSelectedItem()
                    +"','"+estimasi.getSelectedItem()+"','"+ket.getText()+"','"+ongkir.getText()+"')";
        
        java.sql.Connection conn = Database1.configDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Data Anda Berhasil Disimpan!");
        CourierCargo.tampilkan_data();
        CourierCargo.kosongkan_form();
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        } 
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        CourierCargo.tampilkan_data();
    }//GEN-LAST:event_ShowButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        try{
            String sql = "UPDATE courier_cargo SET no_resi='"+noresi.getText()+" ', id = '"+idtext.getText()+" ', nama_pengirim = '"+pengirimnm.getText()+" ', no_pengirim = '"+hp1text.getText()+" ', nama_penerima = '"+penerimanm.getText()
                    +" ', no_penerima= '"+no2text.getText()+" ', alamat_penerima = '"+alamat2text.getText()+" ', jenis_barang = '"+jenis.getText()+" ', berat_barang = '"+berat.getText()+" ', packing = '"+pack.getSelectedItem()+" ', metode_kirim = '"+metode.getSelectedItem()
                    +" ', estimasi_kirim = '"+estimasi.getSelectedItem()+" ', ket = '"+ket.getText()+" ', ongkir = '"+ongkir.getText()+"'WHERE no_resi= '"+noresi.getText()+"'";
            java.sql.Connection conn = Database1.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Anda Berhasil Diupdate!");
          
        } catch (HeadlessException | SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
        CourierCargo.tampilkan_data();
        CourierCargo.kosongkan_form();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        CourierCargo.kosongkan_form();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
        String Packing;
        int bayarPacking;
        
        Packing = String.valueOf(pack.getSelectedItem());
            if (Packing.equals("Box Carton")){
            bayarPacking = 20000;
        }else
            if (Packing.equals("Foam sheet")){
            bayarPacking = 19500;
        }else
            if (Packing.equals("Bubble Wrap")){
            bayarPacking = 23000;
        }else
            if (Packing.equals("Seal Tape")){
            bayarPacking = 24000;
        }else
            if (Packing.equals("Kayu")){
            bayarPacking = 28500;
        }else {
            bayarPacking = 0;
        }
      pack1.setText(""+bayarPacking);
    }//GEN-LAST:event_packActionPerformed

    private void ongkirklikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ongkirklikActionPerformed
        int bayarEstimasi, totalbayar,bayarPacking;
        
        bayarPacking = Integer.parseInt(pack1.getText());
        bayarEstimasi = Integer.parseInt(estimasi1.getText());
        
        totalbayar = bayarEstimasi + bayarPacking ;
        ongkir.setText(""+totalbayar);
    }//GEN-LAST:event_ongkirklikActionPerformed

    private void metodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metodeActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

    private void noresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noresiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noresiActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CourierCargoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel alamat2;
    private javax.swing.JTextField alamat2text;
    private javax.swing.JLabel barang;
    private javax.swing.JTextField berat;
    private javax.swing.JLabel cc;
    private javax.swing.JLabel desain;
    private javax.swing.JComboBox<String> estimasi;
    private javax.swing.JTextField estimasi1;
    private javax.swing.JLabel hp;
    private javax.swing.JTextField hp1text;
    private javax.swing.JLabel hp2;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField ket;
    private javax.swing.JComboBox<String> metode;
    private javax.swing.JLabel nama2;
    private javax.swing.JLabel nm;
    private javax.swing.JTextField no2text;
    private javax.swing.JTextField noresi;
    private javax.swing.JTextField ongkir;
    private javax.swing.JButton ongkirklik;
    private javax.swing.JComboBox<String> pack;
    private javax.swing.JTextField pack1;
    private javax.swing.JLabel penerima;
    private javax.swing.JTextField penerimanm;
    private javax.swing.JLabel pengirim;
    private javax.swing.JTextField pengirimnm;
    private javax.swing.JTable tabeljual;
    // End of variables declaration//GEN-END:variables
}
