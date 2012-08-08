/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.TableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author duende
 */
public class UIMemVirtual extends javax.swing.JFrame {
    
    private ArrayList<String> proceso  ;
    private int cont = 0;
    
    private SimpleAttributeSet estiloVerde;             // para el marco
    private SimpleAttributeSet estiloAzul;              // azul para el la pagina
    private SimpleAttributeSet estiloMorado;            // rojo para ...
    private SimpleAttributeSet estiloNaranja;          // rojo para el desplazamiento
   
    /**
     * Crea un nuevo formualario
     */
    public UIMemVirtual() {
        initComponents();
        this.cargarTablas();
        this.procesos();
        this.jLabel1.setVisible(false);
        this.crearEstilos();
        
    }
    
    
    private void cargarTablas(){
        
        TableModel zi =  this.jTableZI.getModel();
        TableModel tp =  this.jTableTablaDePag.getModel();
        TableModel ram =  this.jTableRAM.getModel();
        
        for(int i = 0; i < 16; i++){
            zi.setValueAt(Integer.toBinaryString(i), i, 0);
            tp.setValueAt(Integer.toBinaryString(i), i, 0);
            tp.setValueAt(0, i, 1);
            tp.setValueAt(0, i, 2); 
        }
        for(int i = 0; i < 4; i++){
            ram.setValueAt(Integer.toBinaryString(i), i, 1);         
        }
      //  DefaultListModel tablero = new DefaultListModel();
     //   this.jList1.setModel(tablero);
       // tablero.addElement("Dir virtual a dir real");
    }
    
    private void procesos(){
        // 27 procesos
        this.proceso = new ArrayList<String>();
        this.proceso.clear();
        this.proceso.add("☺");      // 0
        this.proceso.add("☻");
        this.proceso.add("♥");
        this.proceso.add("♦");
        this.proceso.add("♣");
        this.proceso.add("♠");      // 5
        this.proceso.add("•");      
        this.proceso.add("◘");
        this.proceso.add("○");
        this.proceso.add("◙");
        this.proceso.add("♂");      // 10
        this.proceso.add("♀");  
        this.proceso.add("♪");
        this.proceso.add("♫");
        this.proceso.add("☼");
        this.proceso.add("►");      // 15
        this.proceso.add("◄");
        this.proceso.add("↕");
        this.proceso.add("¶");
        this.proceso.add("§");
        this.proceso.add("☺");      // 20
        this.proceso.add("⌂");
        this.proceso.add("↑");
        this.proceso.add("↓");
        this.proceso.add("→");
        this.proceso.add("←");      // 25
        this.proceso.add("↔");
        System.out.println("numero de procesos : " + this.proceso.size());
       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonCrearProceso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableZI = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTablaDePag = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRAM = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneTablero = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jButtonCrearProceso.setText("Crear proceso");
        jButtonCrearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearProcesoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zona de intercambio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jTableZI.setForeground(new java.awt.Color(0, 0, 204));
        jTableZI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "# Pág", "proceso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableZI.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableZI);
        jTableZI.getColumnModel().getColumn(0).setResizable(false);
        jTableZI.getColumnModel().getColumn(1).setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla de páginas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jTableTablaDePag.setForeground(new java.awt.Color(153, 0, 153));
        jTableTablaDePag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "# de pag", "Bit de presente/ausente", "Bit de modificacion", "Dir Marco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTablaDePag.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableTablaDePag);
        jTableTablaDePag.getColumnModel().getColumn(0).setResizable(false);
        jTableTablaDePag.getColumnModel().getColumn(1).setResizable(false);
        jTableTablaDePag.getColumnModel().getColumn(2).setResizable(false);
        jTableTablaDePag.getColumnModel().getColumn(3).setResizable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RAM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jTableRAM.setForeground(new java.awt.Color(0, 153, 153));
        jTableRAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Proceso", "# Marco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRAM.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableRAM);
        jTableRAM.getColumnModel().getColumn(0).setResizable(false);
        jTableRAM.getColumnModel().getColumn(1).setResizable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Defecto de página");

        jScrollPane4.setViewportView(jTextPaneTablero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCrearProceso)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCrearProceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(73, 73, 73)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearProcesoActionPerformed
        // BOTON CREAR PROCESO
        this.jLabel1.setVisible(false);
        if (!this.proceso.isEmpty() && this.cont < 16) {
            TableModel zi = this.jTableZI.getModel();
            TableModel tabpag = this.jTableTablaDePag.getModel();
            TableModel ram = this.jTableRAM.getModel();
            Random randomWind = new Random();
           

            int alt = randomWind.nextInt(16);       // deme un numero random de 0 a 16
            String proc = this.proceso.remove(this.proceso.size()-1);       // deme un proceso
          
            while (zi.getValueAt(alt, 1) != null)    //  mientras seauna celda ocupada...     
                alt = randomWind.nextInt(16);
             
            zi.setValueAt(proc, alt, 1);        // agrega en la zona de intercambio
            tabpag.setValueAt(1, alt, 1);       // marca la pagina como presente en la tabla de paginas
            if(this.cont < 4){
                ram.setValueAt(proc, this.cont, 0);
                tabpag.setValueAt(Integer.toBinaryString(this.cont), alt, 3);
                int aux = Integer.parseInt((String)tabpag.getValueAt(alt, 0));
                this.dirVirDirReal(proc, aux, this.cont); 
            }
            else{
                System.out.println("Defecto de página!! D:");
                this.jLabel1.setVisible(true);
            }
            this.cont++;
        }
        else{
            System.out.println("se va a limpiar");
            this.limpiarTablas();
            
        }
    }//GEN-LAST:event_jButtonCrearProcesoActionPerformed

    
    private void dirVirDirReal(String proc, int pag, int marco){
        
     
        // Atributos para la frase, en negrita
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        StyleConstants.setBold(attrs, true);
        // se inserta
       
        
        Random desplazamiento = new Random();
        int d = desplazamiento.nextInt(256); 
        String des = Integer.toBinaryString(d);
        String mc = Integer.toBinaryString(marco);
         
        String con = proc+ " " +pag+"-" +des+ " => " +mc+ "-" +des;  
       // this.jTextPaneTablero.setText(con +"\n"+this.jTextPaneTablero.getText());
        
        
        try{
            jTextPaneTablero.getStyledDocument().insertString(
        jTextPaneTablero.getStyledDocument().getLength(), proc+" ", attrs);
            jTextPaneTablero.getStyledDocument().insertString(
        jTextPaneTablero.getStyledDocument().getLength(), pag+"", this.estiloAzul);
            jTextPaneTablero.getStyledDocument().insertString(
        jTextPaneTablero.getStyledDocument().getLength(), des, this.estiloNaranja);
            jTextPaneTablero.getStyledDocument().insertString(
        jTextPaneTablero.getStyledDocument().getLength(), " => ", attrs);     
            jTextPaneTablero.getStyledDocument().insertString(
        jTextPaneTablero.getStyledDocument().getLength(), mc, this.estiloVerde);
            jTextPaneTablero.getStyledDocument().insertString(
        jTextPaneTablero.getStyledDocument().getLength(), des+"\n", this.estiloNaranja);
            
        
        }catch(Exception e){
            System.out.println("problemas");
        }
        
    
    }
    
    private void limpiarTablas(){
    
        for(int i = 0; i < 16; i++){
            this.jTableZI.getModel().setValueAt(null, i, 1);
            this.jTableTablaDePag.getModel().setValueAt(0, i, 1);
            this.jTableTablaDePag.getModel().setValueAt("", i, 3);
        }
        this.procesos();
        this.cont = 0; 
        for(int i = 0; i < 4; i++)
            this.jTableRAM.getModel().setValueAt("", i, 0);         
    }
    
    private void crearEstilos() {

        this.estiloMorado = new SimpleAttributeSet();
        StyleConstants.setForeground(estiloMorado, new Color(153,0,153));
       
        this.estiloAzul = new SimpleAttributeSet();
        StyleConstants.setForeground(estiloAzul, new Color(0,0,204));

        this.estiloVerde = new SimpleAttributeSet();
        StyleConstants.setForeground(estiloVerde, new Color(0,153,153)); 

        this.estiloNaranja = new SimpleAttributeSet();
        StyleConstants.setForeground(estiloNaranja, Color.ORANGE); 
    }
    
    
    
    /**
     * @param args argumentos de la línea de comandos
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIMemVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIMemVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIMemVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIMemVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UIMemVirtual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableRAM;
    private javax.swing.JTable jTableTablaDePag;
    private javax.swing.JTable jTableZI;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPaneTablero;
    // End of variables declaration//GEN-END:variables
}
