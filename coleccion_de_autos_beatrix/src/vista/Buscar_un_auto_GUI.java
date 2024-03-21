/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author felip
 */
public class Buscar_un_auto_GUI extends javax.swing.JPanel {

    /**
     * Creates new form Buscar_un_auto_GUI
     */
    public Buscar_un_auto_GUI() {
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

        jtf_ano_serie = new javax.swing.JTextField();
        jtf_numero_del_auto_en_la_serie = new javax.swing.JTextField();
        jbtm_buscar_auto = new javax.swing.JButton();
        jlb_ano_serie = new javax.swing.JLabel();
        jlb_numero_del_auto_en_la_serie = new javax.swing.JLabel();
        jlb_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_informacion_del_auto = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        jlb_subtitulo = new javax.swing.JLabel();

        jbtm_buscar_auto.setText("Buscar auto en la colección");
        jbtm_buscar_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtm_buscar_autoActionPerformed(evt);
            }
        });

        jlb_ano_serie.setText("Año de serie del auto");

        jlb_numero_del_auto_en_la_serie.setText("Número del auto en la serie");

        jlb_titulo.setText("Buscar auto");

        jta_informacion_del_auto.setColumns(20);
        jta_informacion_del_auto.setRows(5);
        jScrollPane1.setViewportView(jta_informacion_del_auto);

        jlb_subtitulo.setText("Informacion sobre el auto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jlb_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jbtm_buscar_auto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jlb_ano_serie))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jtf_ano_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jtf_numero_del_auto_en_la_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlb_numero_del_auto_en_la_serie)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_subtitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jlb_titulo)
                .addGap(41, 41, 41)
                .addComponent(jlb_ano_serie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_ano_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlb_numero_del_auto_en_la_serie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_numero_del_auto_en_la_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jlb_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtm_buscar_auto)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtm_buscar_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtm_buscar_autoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtm_buscar_autoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtm_buscar_auto;
    private javax.swing.JLabel jlb_ano_serie;
    private javax.swing.JLabel jlb_numero_del_auto_en_la_serie;
    private javax.swing.JLabel jlb_subtitulo;
    private javax.swing.JLabel jlb_titulo;
    public javax.swing.JTextArea jta_informacion_del_auto;
    public javax.swing.JTextField jtf_ano_serie;
    public javax.swing.JTextField jtf_numero_del_auto_en_la_serie;
    // End of variables declaration//GEN-END:variables
}
