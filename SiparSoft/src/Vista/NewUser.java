package Vista;

public class NewUser extends javax.swing.JFrame {

    public NewUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Container = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel7.setText("Apellido:");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(0, 87, 146));
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleText.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        TitleText.setForeground(new java.awt.Color(255, 255, 255));
        TitleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleText.setText("Formulario para nuevo empleado");
        Title.add(TitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, 350, -1));

        Container.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));
        Container.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));
        Container.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Usuario.png"))); // NOI18N
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel2.setText("Apellido:");
        Container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 80, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setText("Nombre:");
        Container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setText("Tipo identificación:");
        Container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setText("Nro de identificación:");
        Container.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, -1));
        Container.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 30));
        Container.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 160, 30));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel8.setText("Celular:");
        Container.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, -1));
        Container.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, 30));

        jLabel9.setBackground(new java.awt.Color(0, 87, 146));
        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enviar");
        jLabel9.setOpaque(true);
        Container.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 200, 40));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel10.setText("Contraseña:");
        Container.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 120, -1));
        Container.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 160, 30));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel TitleText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
