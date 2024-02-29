import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
        initComponents();
        groupRadioButtons(); 
    }
private void groupRadioButtons() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(bird);
        buttonGroup.add(cat);
        buttonGroup.add(dog);
        buttonGroup.add(rabbit);
        buttonGroup.add(pig);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bird = new javax.swing.JRadioButton();
        cat = new javax.swing.JRadioButton();
        dog = new javax.swing.JRadioButton();
        rabbit = new javax.swing.JRadioButton();
        pig = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bird.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        bird.setText("bird");
        bird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birdActionPerformed(evt);
            }
        });

        cat.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        cat.setText("cat");
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        dog.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        dog.setText("dog");
        dog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogActionPerformed(evt);
            }
        });

        rabbit.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        rabbit.setText("rabbit");
        rabbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabbitActionPerformed(evt);
            }
        });

        pig.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        pig.setText("pig");
        pig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bird)
                    .addComponent(pig)
                    .addComponent(rabbit)
                    .addComponent(dog)
                    .addComponent(cat))
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(bird)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rabbit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pig)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birdActionPerformed
 
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/pets/bird.jpeg")));
    }//GEN-LAST:event_birdActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/pets/cat.jpeg")));
    }//GEN-LAST:event_catActionPerformed

    private void dogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogActionPerformed
       
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/pets/doggy.jpg")));
    }//GEN-LAST:event_dogActionPerformed

    private void rabbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabbitActionPerformed
        
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/pets/rabbit.jpg")));
    }//GEN-LAST:event_rabbitActionPerformed

    private void pigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pigActionPerformed
       
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/pets/pig.jpg")));
    }//GEN-LAST:event_pigActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bird;
    private javax.swing.JRadioButton cat;
    private javax.swing.JRadioButton dog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton pig;
    private javax.swing.JRadioButton rabbit;
    // End of variables declaration//GEN-END:variables
}
