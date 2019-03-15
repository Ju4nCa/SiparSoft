package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class windowAdmin extends javax.swing.JFrame{
    
    private JScrollPane ScrollUser;
    private JScrollPane ScrollClient;
    private JPanel ContainerClient;
    private JPanel ContainerUser;
    private int ventanaVisible = 0;
    /*
    ventanaVisible = 0 /Principal
    ventanaVisible = 1 /Productos
    ventanaVisible = 2 /Usuarios
    ventanaVisible = 3 /Informes
    */
    private int espacioUsers = 50;
    private int espacioProduct = 50;
    private FormUser formularioUser;
    private int ventanaUser = 0;
    private User usuario;
    
    public windowAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        PanelUsuarios.setVisible(false);
        PanelProductos.setVisible(false);
        PanelInformes.setVisible(false);
        buttonMain.setBackground(new Color(255,255,255));
        buttonMain.setForeground(new Color(39,48,54));
        
  
        ContainerUsers.add(TitlesUsers);
        TitlesUsers.setBounds(0, 0, 735, 50);
        ContainerUsers.setPreferredSize(new Dimension(735,espacioUsers));
        ScrollUsers.setViewportView(ContainerUsers);
        
        ContainerProduct.add(TitleProduct);
        TitleProduct.setBounds(0, 0, 735, 50);
        ContainerProduct.setPreferredSize(new Dimension(735,espacioProduct));
        ScrollProduct.setViewportView(ContainerProduct);
        
        usuario = new User("Santiago", "Zuluaga", "Administrador", "C.C", 1144105479, "Admin");
        
        InfoUser.setText(usuario.getNombre() + " " + usuario.getApellido());
        
        if(usuario.getTipo().equals("Administrador"))
        {
        
        }
        else {
            buttonUsers.setVisible(false);
            buttonReport.setVisible(false);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        PanelOptions = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        buttonUsers = new javax.swing.JLabel();
        buttonProducts = new javax.swing.JLabel();
        buttonReport = new javax.swing.JLabel();
        buttonMain = new javax.swing.JLabel();
        PanelProductos = new javax.swing.JPanel();
        newProduct = new javax.swing.JLabel();
        TitleProduct = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ScrollProduct = new javax.swing.JScrollPane();
        ContainerProduct = new javax.swing.JPanel();
        PanelUsuarios = new javax.swing.JPanel();
        newUser = new javax.swing.JLabel();
        TitlesUsers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ScrollUsers = new javax.swing.JScrollPane();
        ContainerUsers = new javax.swing.JPanel();
        PanelMain = new javax.swing.JPanel();
        ImageUser = new javax.swing.JLabel();
        User = new javax.swing.JPanel();
        InfoUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PanelInformes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelOptions.setBackground(new java.awt.Color(39, 48, 54));
        PanelOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(0, 87, 146));
        Title.setFont(new java.awt.Font("Ubuntu", 0, 40)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("SiparSoft");
        PanelOptions.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, -1));

        buttonUsers.setBackground(new java.awt.Color(39, 48, 54));
        buttonUsers.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        buttonUsers.setForeground(new java.awt.Color(255, 255, 255));
        buttonUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonUsers.setText("Usuarios");
        buttonUsers.setOpaque(true);
        buttonUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonUsersMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonUsersMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonUsersMouseEntered(evt);
            }
        });
        PanelOptions.add(buttonUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, 70));

        buttonProducts.setBackground(new java.awt.Color(39, 48, 54));
        buttonProducts.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        buttonProducts.setForeground(new java.awt.Color(255, 255, 255));
        buttonProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonProducts.setText("Productos");
        buttonProducts.setOpaque(true);
        buttonProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonProductsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonProductsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonProductsMouseEntered(evt);
            }
        });
        PanelOptions.add(buttonProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 300, 70));

        buttonReport.setBackground(new java.awt.Color(39, 48, 54));
        buttonReport.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        buttonReport.setForeground(new java.awt.Color(255, 255, 255));
        buttonReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonReport.setText("Informes");
        buttonReport.setOpaque(true);
        buttonReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonReportMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonReportMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReportMouseEntered(evt);
            }
        });
        PanelOptions.add(buttonReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 70));

        buttonMain.setBackground(new java.awt.Color(39, 48, 54));
        buttonMain.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        buttonMain.setForeground(new java.awt.Color(255, 255, 255));
        buttonMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMain.setText("Principal");
        buttonMain.setBorder(null);
        buttonMain.setOpaque(true);
        buttonMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMainMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMainMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMainMouseEntered(evt);
            }
        });
        PanelOptions.add(buttonMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, 70));

        Container.add(PanelOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 600));

        PanelProductos.setBackground(new java.awt.Color(255, 255, 255));
        PanelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newProduct.setBackground(new java.awt.Color(0, 87, 146));
        newProduct.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        newProduct.setForeground(new java.awt.Color(255, 255, 255));
        newProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newProduct.setText("Nuevo producto");
        newProduct.setToolTipText("");
        newProduct.setOpaque(true);
        newProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newProductMouseClicked(evt);
            }
        });
        PanelProductos.add(newProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 40));

        TitleProduct.setBackground(new java.awt.Color(255, 255, 255));
        TitleProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 87, 146));
        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nombre");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel10.setOpaque(true);
        TitleProduct.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 183, 50));

        jLabel11.setBackground(new java.awt.Color(0, 87, 146));
        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Código");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel11.setOpaque(true);
        TitleProduct.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 0, 183, 50));

        jLabel12.setBackground(new java.awt.Color(0, 87, 146));
        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tipo");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel12.setOpaque(true);
        TitleProduct.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 0, 183, 50));

        jLabel13.setBackground(new java.awt.Color(0, 87, 146));
        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Opciones");
        jLabel13.setToolTipText("");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel13.setOpaque(true);
        TitleProduct.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 0, 181, 50));

        PanelProductos.add(TitleProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 735, 50));

        ScrollProduct.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollProduct.setToolTipText("");
        ScrollProduct.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollProduct.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollProduct.setWheelScrollingEnabled(false);

        ContainerProduct.setLayout(null);
        ScrollProduct.setViewportView(ContainerProduct);

        PanelProductos.add(ScrollProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 750, 500));

        Container.add(PanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        PanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        PanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newUser.setBackground(new java.awt.Color(0, 87, 146));
        newUser.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        newUser.setForeground(new java.awt.Color(255, 255, 255));
        newUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newUser.setText("Nuevo empleado");
        newUser.setOpaque(true);
        newUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newUserMouseClicked(evt);
            }
        });
        PanelUsuarios.add(newUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 40));

        TitlesUsers.setBackground(new java.awt.Color(255, 255, 255));
        TitlesUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 87, 146));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel1.setOpaque(true);
        TitlesUsers.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 183, 50));

        jLabel2.setBackground(new java.awt.Color(0, 87, 146));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellido");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel2.setOpaque(true);
        TitlesUsers.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 0, 183, 50));

        jLabel3.setBackground(new java.awt.Color(0, 87, 146));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel3.setOpaque(true);
        TitlesUsers.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 0, 183, 50));

        jLabel4.setBackground(new java.awt.Color(0, 87, 146));
        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Opciones");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 146), 5));
        jLabel4.setOpaque(true);
        TitlesUsers.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 0, 181, 50));

        PanelUsuarios.add(TitlesUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 735, 50));

        ScrollUsers.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollUsers.setToolTipText("");
        ScrollUsers.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollUsers.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollUsers.setWheelScrollingEnabled(false);

        ContainerUsers.setLayout(null);
        ScrollUsers.setViewportView(ContainerUsers);

        PanelUsuarios.add(ScrollUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 750, 500));

        Container.add(PanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Usuario.png"))); // NOI18N
        PanelMain.add(ImageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoUser.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        InfoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoUser.setText("Usuario");
        User.add(InfoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        jLabel5.setBackground(new java.awt.Color(255, 89, 89));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar");
        jLabel5.setOpaque(true);
        User.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 40));

        PanelMain.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 240));

        jPanel3.setBackground(new java.awt.Color(255, 89, 89));
        PanelMain.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 460, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        PanelMain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 500, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        PanelMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 200, 200));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        PanelMain.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 200, 200));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        PanelMain.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 200, 200));

        Container.add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        PanelInformes.setBackground(new java.awt.Color(255, 89, 89));
        PanelInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Container.add(PanelInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //METODOS CUANDO PARA CAMBIAR ENTRE PESTAÑAS
    private void buttonUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsersMouseClicked
        
        PanelUsuarios.setVisible(true);
        buttonUsers.setBackground(new Color(255,255,255));
        buttonUsers.setForeground(new Color(39,48,54));
        switch(ventanaVisible){
            case 0:
                PanelMain.setVisible(false);
                buttonMain.setBackground(new Color(39,48,54));
                buttonMain.setForeground(new Color(255,255,255));
                break;
            case 1:
                PanelProductos.setVisible(false);
                buttonProducts.setBackground(new Color(39,48,54));
                buttonProducts.setForeground(new Color(255,255,255));
                break;
            case 3:
                PanelInformes.setVisible(false);
                buttonReport.setBackground(new Color(39,48,54));
                buttonReport.setForeground(new Color(255,255,255));
                break;
        }
        ventanaVisible = 2;
    }//GEN-LAST:event_buttonUsersMouseClicked

    private void buttonProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseClicked
        
        PanelProductos.setVisible(true);
        buttonProducts.setBackground(new Color(255,255,255));
        buttonProducts.setForeground(new Color(39,48,54));
        
        switch(ventanaVisible){
            case 0:
                PanelMain.setVisible(false);
                buttonMain.setBackground(new Color(39,48,54));
                buttonMain.setForeground(new Color(255,255,255));
                break;
            case 2:
                PanelUsuarios.setVisible(false);
                buttonUsers.setBackground(new Color(39,48,54));
                buttonUsers.setForeground(new Color(255,255,255));
                break;
            case 3:
                PanelInformes.setVisible(false);
                buttonReport.setBackground(new Color(39,48,54));
                buttonReport.setForeground(new Color(255,255,255));
                break;
        }
        ventanaVisible = 1;
    }//GEN-LAST:event_buttonProductsMouseClicked

    private void buttonReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReportMouseClicked
        
        PanelInformes.setVisible(true);
        buttonReport.setBackground(new Color(255,255,255));
        buttonReport.setForeground(new Color(39,48,54));
        
        switch(ventanaVisible){
            case 0:
                PanelMain.setVisible(false);
                buttonMain.setBackground(new Color(39,48,54));
                buttonMain.setForeground(new Color(255,255,255));
                break;
            case 1:
                PanelProductos.setVisible(false);
                buttonProducts.setBackground(new Color(39,48,54));
                buttonProducts.setForeground(new Color(255,255,255));
                break;
            case 2:
                PanelUsuarios.setVisible(false);
                buttonUsers.setBackground(new Color(39,48,54));
                buttonUsers.setForeground(new Color(255,255,255));
                break;
            
        }
        ventanaVisible = 3;
    }//GEN-LAST:event_buttonReportMouseClicked

    private void buttonMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMainMouseClicked
        
        PanelMain.setVisible(true);
        buttonMain.setBackground(new Color(255,255,255));
        buttonMain.setForeground(new Color(39,48,54));
        
        switch(ventanaVisible){            
            case 1:
                PanelProductos.setVisible(false);
                buttonProducts.setBackground(new Color(255,255,255));
                buttonProducts.setForeground(new Color(39,48,54));
                break;
            case 2:
                PanelUsuarios.setVisible(false);
                buttonUsers.setBackground(new Color(255,255,255));
                buttonUsers.setForeground(new Color(39,48,54));
                break;
            case 3:
                PanelInformes.setVisible(false);
                buttonReport.setBackground(new Color(255,255,255));
                buttonReport.setForeground(new Color(39,48,54));
                break;
        }
        ventanaVisible = 0;
    }//GEN-LAST:event_buttonMainMouseClicked

    
    
    //METODOS PARA EL DISEÑO DE LOS BOTONES
    private void buttonMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMainMouseEntered
        buttonMain.setBackground(new Color(255,255,255));
        buttonMain.setForeground(new Color(39,48,54));
    }//GEN-LAST:event_buttonMainMouseEntered

    private void buttonMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMainMouseExited
        
        if(ventanaVisible != 0)
        {
            buttonMain.setBackground(new Color(39,48,54));
            buttonMain.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_buttonMainMouseExited

    private void buttonUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsersMouseEntered
        buttonUsers.setBackground(new Color(255,255,255));
        buttonUsers.setForeground(new Color(39,48,54));
    }//GEN-LAST:event_buttonUsersMouseEntered

    private void buttonUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsersMouseExited
        
        if(ventanaVisible != 2)
        {
            buttonUsers.setBackground(new Color(39,48,54));
            buttonUsers.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_buttonUsersMouseExited

    private void buttonProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseEntered
        buttonProducts.setBackground(new Color(255,255,255));
        buttonProducts.setForeground(new Color(39,48,54));
    }//GEN-LAST:event_buttonProductsMouseEntered

    private void buttonProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseExited
        
        if(ventanaVisible != 1)
        {
            buttonProducts.setBackground(new Color(39,48,54));
            buttonProducts.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_buttonProductsMouseExited

    private void buttonReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReportMouseEntered
        buttonReport.setBackground(new Color(255,255,255));
        buttonReport.setForeground(new Color(39,48,54));
    }//GEN-LAST:event_buttonReportMouseEntered

    private void buttonReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReportMouseExited
        
        if(ventanaVisible != 3)
        {
           buttonReport.setBackground(new Color(39,48,54));
           buttonReport.setForeground(new Color(255,255,255)); 
        }
        
    }//GEN-LAST:event_buttonReportMouseExited

    
    
    //Metodos para agregar nuevos usuarios-clientes-productos
    private void newUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserMouseClicked
        
        if (ventanaUser == 0)
        {
            formularioUser = new FormUser();
            ventanaUser = 1;
            HiloUser hilo = new HiloUser(formularioUser);
            hilo.start();
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Ya se esta creando un usuario", "Ventana abierta", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_newUserMouseClicked

    private void newProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProductMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newProductMouseClicked
    
    
    //Metodos para crear usuarios-productos
    private void createNewUser(String info) {
        
        String[] Informacion = info.split(",");
                
        JPanel nuevo = new JPanel();
        ContainerUsers.add(nuevo);
        nuevo.setBounds(0, espacioUsers, 730, 50);
        nuevo.setBorder(BorderFactory.createLineBorder(new Color (0,87,146)));
        nuevo.setBackground(new Color(255,255,255));
        
        JLabel nombre = new JLabel(Informacion[0]);
        JLabel apellido = new JLabel(Informacion[1]);
        JLabel codigo = new JLabel(Informacion[3]);
        JLabel opciones = new JLabel("No tiene");
        nuevo.setLayout(null);
        
        nuevo.add(nombre);
        nuevo.add(apellido);
        nuevo.add(codigo);
        nuevo.add(opciones);
        
        nombre.setBounds(0, 0, 183, 50);
        nombre.setFont(new Font("Monospaced", Font.BOLD, 16));
        nombre.setHorizontalAlignment(0);
        apellido.setBounds(183, 0, 183, 50);
        apellido.setFont(new Font("Monospaced", Font.BOLD, 16));
        apellido.setHorizontalAlignment(0);
        codigo.setBounds(366, 0, 183, 50);
        codigo.setFont(new Font("Monospaced", Font.BOLD, 16));
        codigo.setHorizontalAlignment(0);
        opciones.setBounds(549, 0, 181, 50);
        opciones.setFont(new Font("Monospaced", Font.BOLD, 16));
        opciones.setHorizontalAlignment(0);
        
        nombre.setBorder(BorderFactory.createLineBorder(new Color (0,87,146)));
        apellido.setBorder(BorderFactory.createLineBorder(new Color (0,87,146)));
        codigo.setBorder(BorderFactory.createLineBorder(new Color (0,87,146)));
        opciones.setBorder(BorderFactory.createLineBorder(new Color (0,87,146)));
        
        
        espacioUsers = espacioUsers + 50;
        ContainerUsers.setPreferredSize(new Dimension(730,espacioUsers));
        ScrollUsers.setViewportView(ContainerUsers);
        
    }
    
    //Hilos necesarios
    private class HiloUser extends Thread {

        FormUser F;
        
        public HiloUser(FormUser f) {
            this.F = f;
        }
        
        @Override
        public void run() {
            
            while(true){
                
                if (F.getInformacion().equals("")){
                    
                    System.out.println(".");
                }
                else {
                    break;
                }
            }
            
            if (F.getInformacion().equals("Cerrada")){
                
                ventanaUser = 0;
            }
            else {
                
                ventanaUser = 0;
                createNewUser(F.getInformacion());
            }
        }
    }
    
    
    private class User {
        
        private String Nombre;
        private String Apellido;
        private String Tipoid;
        private String Tipo;
        private int Nroid;
        private String Password;
        
        public User(String N, String A, String T, String Ti, int Ni, String P) {
            
            this.Nombre = N;
            this.Apellido = A;
            this.Tipo = T;
            this.Tipoid = Ti;
            this.Nroid = Ni;
            this.Password = P;
        }
        
        public void setNombre() {
            
        }
        
        public String getNombre() {
            return Nombre;
        }
        
        public void setApellido() {
            
        }
        
        public String getApellido() {
            return Apellido;
        }
        
        public void setTipo() {
            
        }
        
        public String getTipo() {
            return Tipo;
        }
        
        public void setTipoid() {
            
        }
        
        public String getTipoid() {
            return Tipoid;
        }
        
        public void setNroid() {
            
        }
        
        public int getNroid() {
            return Nroid;
        }
        
        public void setPassword() {
            
        }
        
        public String getPassword() {
            return Password;
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel ContainerProduct;
    private javax.swing.JPanel ContainerUsers;
    private javax.swing.JLabel ImageUser;
    private javax.swing.JLabel InfoUser;
    private javax.swing.JPanel PanelInformes;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelOptions;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JScrollPane ScrollProduct;
    private javax.swing.JScrollPane ScrollUsers;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TitleProduct;
    private javax.swing.JPanel TitlesUsers;
    private javax.swing.JPanel User;
    private javax.swing.JLabel buttonMain;
    private javax.swing.JLabel buttonProducts;
    private javax.swing.JLabel buttonReport;
    private javax.swing.JLabel buttonUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel newProduct;
    private javax.swing.JLabel newUser;
    // End of variables declaration//GEN-END:variables

}
