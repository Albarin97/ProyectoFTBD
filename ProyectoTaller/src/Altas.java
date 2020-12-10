
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import Conexion.Conexion;
import java.awt.Component;
import java.io.File;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableCellRenderer;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.*;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.JasperPrint;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albar
 */
public class Altas extends javax.swing.JFrame {
    
    //Variables
    
    String marca, modelo, tipo;
    int precio, cantidad;
    
    ResultSet rs;

    /**
     * Creates new form Altas
     */
    public Altas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        spnPrecio = new javax.swing.JSpinner();
        spnCantidad = new javax.swing.JSpinner();
        jcbMarca = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jtIDVacio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jtfFiltrar = new javax.swing.JTextField();
        jcbFiltro = new javax.swing.JComboBox<>();
        btnGraf = new javax.swing.JButton();
        btnPortada = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTablaVentas = new javax.swing.JTable();
        btnResTablas = new javax.swing.JButton();
        btnPortada1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Altas");
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 195, 0));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sistema De Ventas Albar's Moto Sport SA. de CV.");

        jPanel2.setBackground(new java.awt.Color(255, 87, 51));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Marca");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Modelo");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tipo");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Precio");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cantidad");

        jtfModelo.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        jcbTipo.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige Una Opción", "Doble Proposito", "Deportiva", "Turing", "Scooter", "Naked", "Crucero", "Enduro", "Cafe Racer" }));

        spnPrecio.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        spnPrecio.setVerifyInputWhenFocusTarget(false);

        spnCantidad.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        jcbMarca.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige Una Opción", "Italika", "Suzuki", "Yamaha", "Honda", "Bajaj", "Ducati", "BMW", "Kawasaki", "Harley-Davidson" }));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");

        jtIDVacio.setEditable(false);
        jtIDVacio.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtIDVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jtIDVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Albar's Moto Sport");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAlta.setBackground(new java.awt.Color(199, 0, 57));
        btnAlta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar50.png"))); // NOI18N
        btnAlta.setToolTipText("Confirmar Alta");
        btnAlta.setBorder(null);
        btnAlta.setBorderPainted(false);
        btnAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(144, 12, 63));
        btnReset.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar50.png"))); // NOI18N
        btnReset.setToolTipText("Limpiar");
        btnReset.setBorder(null);
        btnReset.setBorderPainted(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 87, 51));

        jtConsulta.setBackground(new java.awt.Color(255, 87, 51));
        jtConsulta.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Tipo", "Precio", "Cantidad", "Editar", "Eliminar", "Vender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtConsulta.setToolTipText("");
        jtConsulta.setGridColor(new java.awt.Color(255, 195, 0));
        jtConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtConsultaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtConsulta);
        if (jtConsulta.getColumnModel().getColumnCount() > 0) {
            jtConsulta.getColumnModel().getColumn(6).setHeaderValue("Editar");
        }

        jtfFiltrar.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jtfFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFiltrarActionPerformed(evt);
            }
        });
        jtfFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfFiltrarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFiltrarKeyReleased(evt);
            }
        });

        jcbFiltro.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDProducto", "Marca", "Modelo", "Tipo" }));

        btnGraf.setBackground(new java.awt.Color(199, 0, 57));
        btnGraf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnGraf.setText("Gráfica");
        btnGraf.setBorder(null);
        btnGraf.setBorderPainted(false);
        btnGraf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGraf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafActionPerformed(evt);
            }
        });

        btnPortada.setBackground(new java.awt.Color(199, 0, 57));
        btnPortada.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnPortada.setText("Portada");
        btnPortada.setBorder(null);
        btnPortada.setBorderPainted(false);
        btnPortada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortadaActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 87, 51));

        jtTablaVentas.setBackground(new java.awt.Color(255, 87, 51));
        jtTablaVentas.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jtTablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venta", "ID Producto", "Cliente", "Cantidad", "Costo", "Telefono", "Direccion", "Confirmar", "Cancelar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTablaVentas.setToolTipText("");
        jtTablaVentas.setGridColor(new java.awt.Color(255, 195, 0));
        jtTablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaVentasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtTablaVentas);

        btnResTablas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-cita-recurrente-24.png"))); // NOI18N
        btnResTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResTablasActionPerformed(evt);
            }
        });

        btnPortada1.setBackground(new java.awt.Color(199, 0, 57));
        btnPortada1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnPortada1.setText("Reportes");
        btnPortada1.setBorder(null);
        btnPortada1.setBorderPainted(false);
        btnPortada1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPortada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortada1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 195, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo copia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGraf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPortada1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResTablas)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGraf)
                        .addComponent(btnPortada)
                        .addComponent(btnPortada1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResTablas)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfFiltrar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        if(jtIDVacio.getText().equalsIgnoreCase("")){
            if (jcbMarca.getSelectedIndex() != 0 && jcbTipo.getSelectedIndex() != 0 && !jtfModelo.getText().equalsIgnoreCase("") && !spnCantidad.getValue().equals(0) && !spnPrecio.getValue().equals(0)) {
                marca = jcbMarca.getSelectedItem() + "";
                tipo = jcbTipo.getSelectedItem() + "";
                modelo = jtfModelo.getText();
                cantidad = Integer.parseInt(spnCantidad.getValue() + "");
                precio = Integer.parseInt(spnPrecio.getValue() + "");

                //Generar ID
                try {
                    ResultSet res = Conexion.Consulta("SELECT public.registros()");
                    res.next();
                    int cont = res.getInt(1);
                    if (cont == 0) {
                        if (Conexion.insertar("AMS1", marca.toUpperCase(), modelo.toUpperCase(), tipo.toUpperCase(), precio, cantidad, 1)) {
                            JOptionPane.showMessageDialog(this, "Alta Realizada", "Aviso", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Hubo un error en la Alta", "Error", JOptionPane.OK_OPTION);
                        }
                    } else {
                        res = Conexion.Consulta("SELECT public.obtenermax()");
                        res.next();
                        cont = res.getInt(1);
                        if (Conexion.insertar("AMS"+cont, marca.toUpperCase(), modelo.toUpperCase(), tipo.toUpperCase(), precio, cantidad, cont)) {
                            JOptionPane.showMessageDialog(this, "Alta Realizada", "Aviso", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Hubo un error en la Alta", "Error", JOptionPane.OK_OPTION);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Altas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Faltan Datos", "Error", JOptionPane.OK_OPTION);
            }
        }else{
            if (jcbMarca.getSelectedIndex() != 0 && jcbTipo.getSelectedIndex() != 0 && !jtfModelo.getText().equalsIgnoreCase("") && !spnCantidad.getValue().equals(0) && !spnPrecio.getValue().equals(0)) {
                marca = jcbMarca.getSelectedItem() + "";
                tipo = jcbTipo.getSelectedItem() + "";
                modelo = jtfModelo.getText();
                cantidad = Integer.parseInt(spnCantidad.getValue() + "");
                precio = Integer.parseInt(spnPrecio.getValue() + "");
                String id = jtIDVacio.getText()+"";
                //Transaccion
                Conexion.Ejecutar("BEGIN;\nUPDATE public.productos SET marca='"+marca.toUpperCase()+"', modelo='"+modelo.toUpperCase()+"', tipo='"+tipo.toUpperCase()+"', precio="+precio+", cantidad="+cantidad+" WHERE idproducto='"+id.toUpperCase()+"';\nCOMMIT;");
            } else {
                JOptionPane.showMessageDialog(this, "Faltan Datos", "Error", JOptionPane.OK_OPTION);
            }
        }
        
        
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed
public void reset(){
    jtIDVacio.setText("");
        jcbMarca.setSelectedIndex(0);
        jtfModelo.setText("");
        jcbTipo.setSelectedIndex(0);
        spnCantidad.setValue(0);
        spnPrecio.setValue(0);
}
    private void btnGrafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafActionPerformed
        new Elegir().setVisible(true);
    }//GEN-LAST:event_btnGrafActionPerformed

    private void btnPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortadaActionPerformed
        new Portada().setVisible(true);
    }//GEN-LAST:event_btnPortadaActionPerformed

    private void jtConsultaMouseClicked(java.awt.event.MouseEvent evt) {                                        
                                        
    }                                       

    private void jtfFiltrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFiltrarKeyPressed
        
    }//GEN-LAST:event_jtfFiltrarKeyPressed

    private void jtfFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFiltrarKeyReleased
        
    }//GEN-LAST:event_jtfFiltrarKeyReleased

    private void jtTablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaVentasMouseClicked

    }//GEN-LAST:event_jtTablaVentasMouseClicked

    private void btnResTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResTablasActionPerformed
        
    }//GEN-LAST:event_btnResTablasActionPerformed

    private void jtfFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFiltrarActionPerformed

    private void btnPortada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortada1ActionPerformed

    }//GEN-LAST:event_btnPortada1ActionPerformed

    
    private void tabla_vistaMouseClicked(java.awt.event.MouseEvent evt) {                                         

 }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnGraf;
    private javax.swing.JButton btnPortada;
    private javax.swing.JButton btnPortada1;
    private javax.swing.JButton btnResTablas;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbTipo;
    public javax.swing.JTable jtConsulta;
    private javax.swing.JTextField jtIDVacio;
    public javax.swing.JTable jtTablaVentas;
    private javax.swing.JTextField jtfFiltrar;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnPrecio;
    // End of variables declaration//GEN-END:variables
}

class renderBTNs extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if (value instanceof JButton) {
            JButton btn = (JButton)value;
            return btn;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
}
