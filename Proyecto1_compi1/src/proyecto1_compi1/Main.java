package proyecto1_compi1;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileFilter;

public class Main extends javax.swing.JFrame {
    
    public static ArrayList <Fondo> fondos =new ArrayList <Fondo>();
    public static ArrayList <Objeto> objetos =new ArrayList <Objeto>();
    public Objeto mat[][];
    
    
    public Main() {
        initComponents();
    }
    
    public void leer_arch1(String s)
    {
        System.out.println("--------------INICIO DE COMPILACIÓN-----------------");
        try {
            new Parsers.sintactico_1(new Parsers.lexico_1( new FileReader(s))).parse();
                 } catch (Exception ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }//fin catch
                System.out.println("----------------FIN DE COMPILACIÓN-----------------");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C_Arch = new javax.swing.JFrame();
        B_C_arch3 = new javax.swing.JButton();
        B_C_arch2 = new javax.swing.JButton();
        B_C_arch1 = new javax.swing.JButton();
        V_Chooser = new javax.swing.JFrame();
        Chooser = new javax.swing.JFileChooser();
        P_juego = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        C_Arch.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                C_ArchWindowOpened(evt);
            }
        });

        B_C_arch3.setBackground(new java.awt.Color(255, 255, 255));
        B_C_arch3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B_C_arch3.setForeground(new java.awt.Color(255, 255, 255));
        B_C_arch3.setText("Cargar Archivo 3");
        B_C_arch3.setOpaque(false);

        B_C_arch2.setBackground(new java.awt.Color(255, 255, 255));
        B_C_arch2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B_C_arch2.setForeground(new java.awt.Color(255, 255, 255));
        B_C_arch2.setText("Cargar Archivo 2");
        B_C_arch2.setOpaque(false);

        B_C_arch1.setBackground(new java.awt.Color(255, 255, 255));
        B_C_arch1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B_C_arch1.setForeground(new java.awt.Color(255, 255, 255));
        B_C_arch1.setText("Cargar Archivo 1");
        B_C_arch1.setOpaque(false);
        B_C_arch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_C_arch1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout C_ArchLayout = new javax.swing.GroupLayout(C_Arch.getContentPane());
        C_Arch.getContentPane().setLayout(C_ArchLayout);
        C_ArchLayout.setHorizontalGroup(
            C_ArchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C_ArchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(C_ArchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_C_arch1)
                    .addComponent(B_C_arch2)
                    .addComponent(B_C_arch3))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        C_ArchLayout.setVerticalGroup(
            C_ArchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C_ArchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_C_arch1)
                .addGap(18, 18, 18)
                .addComponent(B_C_arch2)
                .addGap(18, 18, 18)
                .addComponent(B_C_arch3)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        V_Chooser.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout V_ChooserLayout = new javax.swing.GroupLayout(V_Chooser.getContentPane());
        V_Chooser.getContentPane().setLayout(V_ChooserLayout);
        V_ChooserLayout.setHorizontalGroup(
            V_ChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(V_ChooserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        V_ChooserLayout.setVerticalGroup(
            V_ChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(V_ChooserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_juego.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                P_juegoWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout P_juegoLayout = new javax.swing.GroupLayout(P_juego.getContentPane());
        P_juego.getContentPane().setLayout(P_juegoLayout);
        P_juegoLayout.setHorizontalGroup(
            P_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1243, Short.MAX_VALUE)
        );
        P_juegoLayout.setVerticalGroup(
            P_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Snake Projecto 1 Compi 1");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Jugar");
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jMenu1.setText("Abrir");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ejecutar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Archivos");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jButton1)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        C_Arch.setBounds(0, 0, 470, 310);
        C_Arch.setVisible(true);
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Dimension tamanio = this.getSize();
        Mipanel p = new Mipanel(tamanio.width,tamanio.height);
        this.add( p , BorderLayout.CENTER);
        p.repaint();
        this.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void C_ArchWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_C_ArchWindowOpened
        Dimension tamanio = C_Arch.getSize();
        Mipanel p = new Mipanel(tamanio.width,tamanio.height);
        C_Arch.add( p , BorderLayout.CENTER);
        p.repaint();
        C_Arch.repaint();
    }//GEN-LAST:event_C_ArchWindowOpened

    private void B_C_arch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_C_arch1MouseClicked
        V_Chooser.setBounds(0, 0, 532, 374);
        V_Chooser.setVisible(true);
        FileFilter filter1 = new ExtensionFileFilter(".snake ", new String[] { ".snake" });
        Chooser.setFileFilter(filter1);
        int seleccion = Chooser.showOpenDialog(this);
        System.out.println(Chooser.getSelectedFile().getAbsolutePath());
        leer_arch1(Chooser.getSelectedFile().getAbsolutePath());
        V_Chooser.setVisible(false);
        for(int i=0;i<fondos.size();i++)
        {
            System.out.println(fondos.get(i).nombre);
        }
        for(int i=0;i<objetos.size();i++)
        {
            System.out.println(objetos.get(i).nombre+" , "+objetos.get(i).path+" , "+objetos.get(i).tipo+" , "+objetos.get(i).crecimiento+" , "+objetos.get(i).puntos+" , "+objetos.get(i).tiempo);
        }
    }//GEN-LAST:event_B_C_arch1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        P_juego.setBounds(0, 0, 1350, 750);
        P_juego.setVisible(true);
        P_juego.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1MouseClicked

    private void P_juegoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_P_juegoWindowOpened
        Dimension tamanio = P_juego.getSize();
        Mipanel p = new Mipanel(tamanio.width,tamanio.height);
        P_juego.add( p , BorderLayout.CENTER);
        p.repaint();
        this.repaint();
    }//GEN-LAST:event_P_juegoWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_C_arch1;
    private javax.swing.JButton B_C_arch2;
    private javax.swing.JButton B_C_arch3;
    private javax.swing.JFrame C_Arch;
    private javax.swing.JFileChooser Chooser;
    private javax.swing.JFrame P_juego;
    private javax.swing.JFrame V_Chooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
