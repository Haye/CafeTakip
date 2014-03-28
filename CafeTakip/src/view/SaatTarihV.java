/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mustafa-Bilgisay
 */
public class SaatTarihV extends javax.swing.JPanel {

    /**
     * Creates new form SaatTarihV
     */
    public SaatTarihV() {
        initComponents();
    }

    public void saat(int saat, int dk, int sn){
        
        String saatText = "";
        
        if(saat < 10)
            saatText = "0";
        saatText +=  saat + ":";
        
        if(dk < 10)
            saatText += "0";
        saatText += dk + ":";
        
        if(sn < 10)
            saatText += "0";
        saatText += sn ;
        
        lblSaat.setText(saatText);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaat = new javax.swing.JLabel();
        lblTarih = new javax.swing.JLabel();

        lblSaat.setBackground(new java.awt.Color(0, 0, 0));
        lblSaat.setFont(new java.awt.Font("DS-Digital", 1, 72)); // NOI18N
        lblSaat.setForeground(new java.awt.Color(51, 204, 0));
        lblSaat.setText("00:00:00");
        lblSaat.setOpaque(true);

        lblTarih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTarih.setText("01.1.2014");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTarih)
                    .addComponent(lblSaat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTarih)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSaat;
    private javax.swing.JLabel lblTarih;
    // End of variables declaration//GEN-END:variables
}
