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
    public static ArrayList <Estrategias> estrats =new ArrayList <Estrategias>();
    public static Objeto mat[][];
    public static Objeto matPl[][];
    public static String vector[];
    public static Objeto Player=new Objeto();
    public static int cabezax=0,cabezay=0;
    public static String nombre_fondo=" ";
    public static Mipanel fondo;
    public static int puntos=0;
    public static int segundos;
    private Timer timer = new Timer();
    
    public static void fondo_juego(String nombre)
    {
        for(int i=0;i<fondos.size();i++)
        {
            if(fondos.get(i).nombre.equals(nombre))
            {
                String temp="";
                for(int a=1;a<fondos.get(i).path.length()-1;a++)
                {
                    temp=temp+fondos.get(i).path.charAt(a);
                }
                nombre_fondo=temp;
            }
        }
    }
    public static void add_mat(String nombre,int x,int y)       
    {
        for(int i=0;i<objetos.size();i++)
        {
            if(objetos.get(i).nombre.equals(nombre))
            {
                mat[x][y]=objetos.get(i);
                mat[x][y].x=x;
                mat[x][y].y=y;
            }
        }
    }
    public static void add_matx(String nombre,int xo,int xf,int y)
    {
        for(int i=0;i<objetos.size();i++)
        {
            if(objetos.get(i).nombre.equals(nombre))
            {
                for(int j=xo;j<=xf;j++)
                {
                    mat[j][y]=objetos.get(i);
                    mat[j][y].x=j;
                    mat[j][y].y=y;
                }
               
            }
        }
    }
    public static void add_maty(String nombre,int x,int yo,int yf)
    {
        for(int i=0;i<objetos.size();i++)
        {
            if(objetos.get(i).nombre.equals(nombre))
            {
                for(int j=yo;j<=yf;j++)
                {
                    mat[x][j]=objetos.get(i);
                    mat[x][j].x=x;
                    mat[x][j].y=j;
                }
               
            }
        }
    }
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
                }
                System.out.println("----------------FIN DE COMPILACIÓN-----------------");
    }
    public void leer_arch2(String s)
    {
        System.out.println("--------------INICIO DE COMPILACIÓN-----------------");
        try {
            new Parsers.sintactico_2(new Parsers.lexico_2( new FileReader(s))).parse();
                 } catch (Exception ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("----------------FIN DE COMPILACIÓN-----------------");
    }
    public void leer_arch3(String s)
    {
        System.out.println("--------------INICIO DE COMPILACIÓN-----------------");
        try {
            new Parsers.sintactico_3(new Parsers.lexico_3( new FileReader(s))).parse();
                 } catch (Exception ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("----------------FIN DE COMPILACIÓN-----------------");
    }
    public void imgs()
    {
        for(int i=0;i<objetos.size();i++)
        {
            objetos.get(i).imagen();
        }
    }
    public void iniciar_mat2()
    {
        matPl=new Objeto[mat.length][mat[0].length];
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                matPl[i][j]=new Objeto();
            }
        }
        Player.x=mat.length/2;
        Player.y=mat[0].length/2;
        cabezax=Player.x;
        cabezay=Player.y;
        Player.path="C:\\Users\\BryanAlexander\\Desktop\\ImagenesCompi1\\player.jpg";
        Player.imagen2();
        matPl[Player.x][Player.y]=Player;
    }
    public void pintar_mat()
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                javax.swing.JLabel temp=new javax.swing.JLabel();
                temp.setIcon(mat[i][j].imagen.getIcon());
                javax.swing.JLabel temp2=new javax.swing.JLabel();
                temp2.setIcon(matPl[i][j].imagen.getIcon());
                P_juego.add(temp2);
                temp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                temp2.setBounds((i*50),(j*50),50,50);
                P_juego.add(temp);
                temp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                temp.setBounds((i*50),(j*50),50,50);
            }
        }
        Lpuntos.setText("Puntos: "+puntos);
        P_juego.repaint();
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
        Bjugar = new javax.swing.JButton();
        Lista_movs = new javax.swing.JComboBox();
        Lpuntos = new javax.swing.JLabel();
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
        B_C_arch3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_C_arch3MouseClicked(evt);
            }
        });

        B_C_arch2.setBackground(new java.awt.Color(255, 255, 255));
        B_C_arch2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B_C_arch2.setForeground(new java.awt.Color(255, 255, 255));
        B_C_arch2.setText("Cargar Archivo 2");
        B_C_arch2.setOpaque(false);
        B_C_arch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_C_arch2MouseClicked(evt);
            }
        });

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

        Bjugar.setText("Jugar");
        Bjugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BjugarMouseClicked(evt);
            }
        });

        Lista_movs.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        Lpuntos.setBackground(new java.awt.Color(0, 0, 0));
        Lpuntos.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout P_juegoLayout = new javax.swing.GroupLayout(P_juego.getContentPane());
        P_juego.getContentPane().setLayout(P_juegoLayout);
        P_juegoLayout.setHorizontalGroup(
            P_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_juegoLayout.createSequentialGroup()
                .addContainerGap(1227, Short.MAX_VALUE)
                .addGroup(P_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lpuntos)
                    .addGroup(P_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Bjugar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Lista_movs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P_juegoLayout.setVerticalGroup(
            P_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_juegoLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Lista_movs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bjugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lpuntos)
                .addContainerGap(318, Short.MAX_VALUE))
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
                        .addGap(409, 409, 409)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(107, Short.MAX_VALUE))
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
        leer_arch1(Chooser.getSelectedFile().getAbsolutePath());
        V_Chooser.setVisible(false);
        imgs();
    }//GEN-LAST:event_B_C_arch1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        C_Arch.setVisible(false);
        P_juego.setBounds(0, 0, 1350, 750);
        P_juego.setVisible(true);
        P_juego.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1MouseClicked

    private void P_juegoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_P_juegoWindowOpened
        iniciar_mat2();
        pintar_mat();
        Dimension tamanio = P_juego.getSize();
        fondo = new Mipanel(tamanio.width,tamanio.height);
        fondo.cimg(nombre_fondo);
        P_juego.add( fondo , BorderLayout.CENTER);
        fondo.repaint();
        P_juego.repaint();
        Lpuntos.setText("Puntos: "+puntos);
        for(int i=0;i<estrats.size();i++)
        {
            Lista_movs.addItem(estrats.get(i).nombre);
        }
    }//GEN-LAST:event_P_juegoWindowOpened

    private void B_C_arch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_C_arch2MouseClicked
        V_Chooser.setBounds(0, 0, 532, 374);
        V_Chooser.setVisible(true);
        FileFilter filter1 = new ExtensionFileFilter(".snake ", new String[] { ".snake" });
        Chooser.setFileFilter(filter1);
        int seleccion = Chooser.showOpenDialog(this);
        leer_arch2(Chooser.getSelectedFile().getAbsolutePath());
        V_Chooser.setVisible(false);
        
        
    }//GEN-LAST:event_B_C_arch2MouseClicked

    private void B_C_arch3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_C_arch3MouseClicked
        V_Chooser.setBounds(0, 0, 532, 374);
        V_Chooser.setVisible(true);
        FileFilter filter1 = new ExtensionFileFilter(".snake ", new String[] { ".snake" });
        Chooser.setFileFilter(filter1);
        int seleccion = Chooser.showOpenDialog(this);
        leer_arch3(Chooser.getSelectedFile().getAbsolutePath());
        V_Chooser.setVisible(false);
    }//GEN-LAST:event_B_C_arch3MouseClicked

    private void BjugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BjugarMouseClicked
        String movimientos[];
        boolean flag=false;
        int indice=0;
        for(int i=0;i<estrats.size();i++)
        {
            if(estrats.get(i).nombre.equals(Lista_movs.getSelectedItem()))
            {
                flag=true;
                indice=i;
            }           
        }
        if(flag==true)
        {
            movimientos=estrats.get(indice).movs;
        }
        else
        {
            movimientos=new String[0];
        }
        Contar(movimientos);
            
        
    }//GEN-LAST:event_BjugarMouseClicked

    public void verificar_pos()
    {
        
        P_juego.add( fondo , BorderLayout.CENTER);
        
        fondo.repaint();
        P_juego.repaint();
        System.out.println("entro aqui "+Player.x+"  "+Player.y);
        System.out.println("entro aqui "+cabezax+"  "+cabezay);
        switch(mat[Player.x][Player.y].tipo)
        {
            case "manzana":puntos=puntos+mat[Player.x][Player.y].puntos;mat[Player.x][Player.y]=new Objeto();matPl[Player.x][Player.y]=Player;matPl[cabezax][cabezay]=new Objeto();cabezay=Player.y;cabezax=Player.x;pintar_mat();break;
            case "bomba":puntos=puntos+mat[Player.x][Player.y].puntos;mat[Player.x][Player.y]=new Objeto();matPl[Player.x][Player.y]=Player;matPl[cabezax][cabezay]=new Objeto();cabezay=Player.y;cabezax=Player.x;pintar_mat();break;
            case "bonus":puntos=puntos+mat[Player.x][Player.y].puntos;mat[Player.x][Player.y]=new Objeto();matPl[Player.x][Player.y]=Player;matPl[cabezax][cabezay]=new Objeto();cabezay=Player.y;cabezax=Player.x;pintar_mat();break;
            case "veneno":puntos=0;mat[Player.x][Player.y]=new Objeto();matPl[Player.x][Player.y]=Player;cabezay=Player.y;matPl[cabezax][cabezay]=new Objeto();cabezax=Player.x;pintar_mat();break;
            case "estrella":;break;
            case "pared":Player.x=cabezax;Player.y=cabezay;break;    
            case "":matPl[Player.x][Player.y]=Player;matPl[cabezax][cabezay]=new Objeto();cabezay=Player.y;cabezax=Player.x;pintar_mat();break;
        }
    }
    ;
    class Contador extends TimerTask {

        public void run() {
            
            segundos++;
            
            if(segundos<vector.length)
            {
                
                switch(vector[segundos])
                {
                case "arriba":Player.y=Player.y-1;verificar_pos();break;
                case "abajo":Player.y=Player.y+1;verificar_pos();break;
                case "izquierda":Player.x=Player.x-1;verificar_pos();break;
                case "derecha":Player.x=Player.x+1;verificar_pos();break;
                case "atras":break;
                }
            }
            else
            {
                Detener();
            }
            
              
        }
    }

    //Crea un timer, inicia segundos a 0 y comienza a contar
    public void Contar(String vec[]) {
        this.segundos = 0;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 1000);
        vector=vec;
        
    }

    //Detiene el contador
    public void Detener() {
        timer.cancel();
    }
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
    private javax.swing.JButton Bjugar;
    private javax.swing.JFrame C_Arch;
    private javax.swing.JFileChooser Chooser;
    private javax.swing.JComboBox Lista_movs;
    private javax.swing.JLabel Lpuntos;
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
