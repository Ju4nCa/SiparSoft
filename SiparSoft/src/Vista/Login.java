package Vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(0, 87, 146));
        Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("AnjaliOldLipi", 0, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 87, 146));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Iniciar Sesión");
        Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 70, 132)));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.setOpaque(true);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
        });
        Container.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 320, 250, 50));
        Container.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 190, 230, 40));

        jLabel1.setFont(new java.awt.Font("Nimbus Sans L", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SiparSoft");
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 80, 250, 60));
        Container.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 250, 230, 40));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //Metodo para cuando pases el curso cambie de color
    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(0,87,146));
        evt.getComponent().setForeground(Color.WHITE);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        // TODO add your handling code here:
        evt.getComponent().setBackground(Color.WHITE);
        evt.getComponent().setForeground(new Color(0,87,146));
    }//GEN-LAST:event_LoginMouseExited

   //Metodo para iniciar sesión
    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        
        if ("".equals(Username.getText()) || "".equals(Password.getText()))
        {
            JOptionPane.showMessageDialog(null, "Los datos son invalidos", "Datos invalidos", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int Validacion = 0;
            
            for(int i=0; i<Username.getText().length(); i++)
            {
                if ("@".equals(""+Username.getText().charAt(i)))
                {
                    System.out.println("Correo bueno");
                    Validacion = 1;
                    break;
                }
            }
            
            if(Validacion == 0)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un correo aceptable", "Correo invalido", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_LoginMouseClicked

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JLabel Login;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

  
}
