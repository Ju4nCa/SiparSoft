package Vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class windowAdmin extends javax.swing.JFrame {
    
    private JScrollPane ScrollUser;
    private JScrollPane ScrollClient;
    private JPanel ContainerClient;
    private JPanel ContainerUser;
    private int ventanaVisible = 0;
    private String tipo = "Administrador";
    
    public windowAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        PanelUsuarios.setVisible(false);
        PanelClientes.setVisible(false);
        PanelProductos.setVisible(false);
        PanelInformes.setVisible(false);
        buttonMain.setBackground(new Color(255,255,255));
        buttonMain.setForeground(new Color(0,87,146));
        
        
        if(tipo.equals("Administrador"))
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
        buttonClients = new javax.swing.JLabel();
        buttonProducts = new javax.swing.JLabel();
        buttonReport = new javax.swing.JLabel();
        buttonMain = new javax.swing.JLabel();
        PanelUsuarios = new javax.swing.JPanel();
        newUser = new javax.swing.JLabel();
        ScrollUsers = new javax.swing.JScrollPane();
        ContainerUsers = new javax.swing.JPanel();
        PanelClientes = new javax.swing.JPanel();
        newClient = new javax.swing.JLabel();
        ScrollClients = new javax.swing.JScrollPane();
        ContainerClients = new javax.swing.JPanel();
        PanelProductos = new javax.swing.JPanel();
        PanelInformes = new javax.swing.JPanel();
        PanelMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelOptions.setBackground(new java.awt.Color(0, 87, 146));
        PanelOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(0, 87, 146));
        Title.setFont(new java.awt.Font("Ubuntu", 0, 40)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("SiparSoft");
        PanelOptions.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, -1));

        buttonUsers.setBackground(new java.awt.Color(0, 87, 146));
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
        PanelOptions.add(buttonUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 70));

        buttonClients.setBackground(new java.awt.Color(0, 87, 146));
        buttonClients.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        buttonClients.setForeground(new java.awt.Color(255, 255, 255));
        buttonClients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonClients.setText("Clientes");
        buttonClients.setOpaque(true);
        buttonClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClientsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonClientsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonClientsMouseEntered(evt);
            }
        });
        PanelOptions.add(buttonClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 300, 70));

        buttonProducts.setBackground(new java.awt.Color(0, 87, 146));
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
        PanelOptions.add(buttonProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, 70));

        buttonReport.setBackground(new java.awt.Color(0, 87, 146));
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
        PanelOptions.add(buttonReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 300, 70));

        buttonMain.setBackground(new java.awt.Color(0, 87, 146));
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

        ScrollUsers.setViewportView(ContainerUsers);

        PanelUsuarios.add(ScrollUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 750, 500));

        Container.add(PanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        PanelClientes.setBackground(new java.awt.Color(255, 255, 255));
        PanelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newClient.setBackground(new java.awt.Color(0, 87, 146));
        newClient.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        newClient.setForeground(new java.awt.Color(255, 255, 255));
        newClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newClient.setText("Nuevo cliente");
        newClient.setOpaque(true);
        newClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newClientMouseClicked(evt);
            }
        });
        PanelClientes.add(newClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 40));

        ScrollClients.setViewportView(ContainerClients);

        PanelClientes.add(ScrollClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 750, 500));

        Container.add(PanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        PanelProductos.setBackground(new java.awt.Color(250, 207, 90));
        PanelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Container.add(PanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        PanelInformes.setBackground(new java.awt.Color(255, 89, 89));
        PanelInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Container.add(PanelInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        PanelMain.setBackground(new java.awt.Color(255, 255, 255));
        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Container.add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 600));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //METODOS CUANDO PARA CAMBIAR ENTRE PESTAÑAS
    private void buttonUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsersMouseClicked
        PanelUsuarios.setVisible(true);
        buttonUsers.setBackground(new Color(255,255,255));
        buttonUsers.setForeground(new Color(0,87,146));
        switch(ventanaVisible){
            case 0:
                PanelMain.setVisible(false);
                buttonMain.setBackground(new Color(0,87,146));
                buttonMain.setForeground(new Color(255,255,255));
                break;
            case 2:
                PanelClientes.setVisible(false);
                buttonClients.setBackground(new Color(0,87,146));
                buttonClients.setForeground(new Color(255,255,255));
                break;
            case 3:
                PanelProductos.setVisible(false);
                buttonProducts.setBackground(new Color(0,87,146));
                buttonProducts.setForeground(new Color(255,255,255));
                break;
            case 4:
                PanelInformes.setVisible(false);
                buttonReport.setBackground(new Color(0,87,146));
                buttonReport.setForeground(new Color(255,255,255));
                break;
        }
        ventanaVisible = 1;
    }//GEN-LAST:event_buttonUsersMouseClicked

    private void buttonClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClientsMouseClicked
        PanelClientes.setVisible(true);
        buttonClients.setBackground(new Color(255,255,255));
        buttonClients.setForeground(new Color(0,87,146));
        
        switch(ventanaVisible){
            case 0:
                PanelMain.setVisible(false);
                buttonMain.setBackground(new Color(0,87,146));
                buttonMain.setForeground(new Color(255,255,255));
                break;
            case 1:
                PanelUsuarios.setVisible(false);
                buttonUsers.setBackground(new Color(0,87,146));
                buttonUsers.setForeground(new Color(255,255,255));
                break;
            case 3:
                PanelProductos.setVisible(false);
                buttonProducts.setBackground(new Color(0,87,146));
                buttonProducts.setForeground(new Color(255,255,255));
                break;
            case 4:
                PanelInformes.setVisible(false);
                buttonReport.setBackground(new Color(0,87,146));
                buttonReport.setForeground(new Color(255,255,255));
                break;
        }
        ventanaVisible = 2;
    }//GEN-LAST:event_buttonClientsMouseClicked

    private void buttonProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseClicked
        PanelProductos.setVisible(true);
        buttonProducts.setBackground(new Color(255,255,255));
        buttonProducts.setForeground(new Color(0,87,146));
        
        switch(ventanaVisible){
            case 0:
                PanelMain.setVisible(false);
                buttonMain.setBackground(new Color(0,87,146));
                buttonMain.setForeground(new Color(255,255,255));
                break;
            case 1:
                PanelUsuarios.setVisible(false);
                buttonUsers.setBackground(new Color(0,87,146));
                buttonUsers.setForeground(new Color(255,255,255));
                break;
            case 2:
                PanelClientes.setVisible(false);
                buttonClients.setBackground(new Color(0,87,146));
                buttonClients.setForeground(new Color(255,255,255));
                break;
            case 4:
                PanelInformes.setVisible(false);
                buttonReport.setBackground(new Color(0,87,146));
                buttonReport.setForeground(new Color(255,255,255));
                break;
        }
        ventanaVisible = 3;
    }//GEN-LAST:event_buttonProductsMouseClicked

    private void buttonReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReportMouseClicked
        PanelInformes.setVisible(true);
        buttonReport.setBackground(new Color(255,255,255));
        buttonReport.setForeground(new Color(0,87,146));
        
        switch(ventanaVisible){
            case 0:
                PanelMain.setVisible(false);
                buttonMain.setBackground(new Color(0,87,146));
                buttonMain.setForeground(new Color(255,255,255));
                break;
            case 1:
                PanelUsuarios.setVisible(false);
                buttonUsers.setBackground(new Color(0,87,146));
                buttonUsers.setForeground(new Color(255,255,255));
                break;
            case 2:
                PanelClientes.setVisible(false);
                buttonClients.setBackground(new Color(0,87,146));
                buttonClients.setForeground(new Color(255,255,255));
                break;
            case 3:
                PanelProductos.setVisible(false);
                buttonProducts.setBackground(new Color(0,87,146));
                buttonProducts.setForeground(new Color(255,255,255));
                break;
        }
        ventanaVisible = 4;
    }//GEN-LAST:event_buttonReportMouseClicked

    private void buttonMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMainMouseClicked
        PanelMain.setVisible(true);
        buttonMain.setBackground(new Color(255,255,255));
        buttonMain.setForeground(new Color(0,87,146));
        
        switch(ventanaVisible){
            case 1:
                PanelUsuarios.setVisible(false);
                buttonUsers.setBackground(new Color(255,255,255));
                buttonUsers.setForeground(new Color(0,87,146));
                break;
            case 2:
                PanelClientes.setVisible(false);
                buttonClients.setBackground(new Color(255,255,255));
                buttonClients.setForeground(new Color(0,87,146));
                break;
            case 3:
                PanelProductos.setVisible(false);
                buttonProducts.setBackground(new Color(255,255,255));
                buttonProducts.setForeground(new Color(0,87,146));
                break;
            case 4:
                PanelInformes.setVisible(false);
                buttonReport.setBackground(new Color(255,255,255));
                buttonReport.setForeground(new Color(0,87,146));
                break;
        }
        ventanaVisible = 0;
    }//GEN-LAST:event_buttonMainMouseClicked

    
    //METODOS PARA EL DISEÑO DE LOS BOTONES
    private void buttonMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMainMouseEntered
        buttonMain.setBackground(new Color(255,255,255));
        buttonMain.setForeground(new Color(0,87,146));
    }//GEN-LAST:event_buttonMainMouseEntered

    private void buttonMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMainMouseExited
        
        if(ventanaVisible != 0)
        {
            buttonMain.setBackground(new Color(0,87,146));
            buttonMain.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_buttonMainMouseExited

    private void buttonUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsersMouseEntered
        buttonUsers.setBackground(new Color(255,255,255));
        buttonUsers.setForeground(new Color(0,87,146));
    }//GEN-LAST:event_buttonUsersMouseEntered

    private void buttonUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsersMouseExited
        
        if(ventanaVisible != 1)
        {
            buttonUsers.setBackground(new Color(0,87,146));
            buttonUsers.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_buttonUsersMouseExited

    private void buttonClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClientsMouseEntered
        buttonClients.setBackground(new Color(255,255,255));
        buttonClients.setForeground(new Color(0,87,146));
    }//GEN-LAST:event_buttonClientsMouseEntered

    private void buttonClientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClientsMouseExited
        
        if(ventanaVisible != 2)
        {
            buttonClients.setBackground(new Color(0,87,146));
            buttonClients.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_buttonClientsMouseExited

    private void buttonProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseEntered
        buttonProducts.setBackground(new Color(255,255,255));
        buttonProducts.setForeground(new Color(0,87,146));
    }//GEN-LAST:event_buttonProductsMouseEntered

    private void buttonProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseExited
        
        if(ventanaVisible != 3)
        {
            buttonProducts.setBackground(new Color(0,87,146));
            buttonProducts.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_buttonProductsMouseExited

    private void buttonReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReportMouseEntered
        buttonReport.setBackground(new Color(255,255,255));
        buttonReport.setForeground(new Color(0,87,146));
    }//GEN-LAST:event_buttonReportMouseEntered

    private void buttonReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReportMouseExited
        
        if(ventanaVisible != 4)
        {
           buttonReport.setBackground(new Color(0,87,146));
           buttonReport.setForeground(new Color(255,255,255)); 
        }
        
    }//GEN-LAST:event_buttonReportMouseExited

    private void newUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserMouseClicked
        
        new NewUser();
        
    }//GEN-LAST:event_newUserMouseClicked

    private void newClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newClientMouseClicked
        
        new NewClient();
    }//GEN-LAST:event_newClientMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel ContainerClients;
    private javax.swing.JPanel ContainerUsers;
    private javax.swing.JPanel PanelClientes;
    private javax.swing.JPanel PanelInformes;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelOptions;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JScrollPane ScrollClients;
    private javax.swing.JScrollPane ScrollUsers;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel buttonClients;
    private javax.swing.JLabel buttonMain;
    private javax.swing.JLabel buttonProducts;
    private javax.swing.JLabel buttonReport;
    private javax.swing.JLabel buttonUsers;
    private javax.swing.JLabel newClient;
    private javax.swing.JLabel newUser;
    // End of variables declaration//GEN-END:variables
}
