
package proyecto.pkg2.compi1;

import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Editor extends javax.swing.JFrame {
    
    public static String frontend[][]=new String [30][50];
    public static String backend[][]=new String [30][50];
    public ArrayList <variable> variables =new  ArrayList <variable>();
    public ArrayList <Funcion> funciones =new  ArrayList <Funcion>();
    public boolean ban=false;
    public static String path="";
    public static String nombre="";
    public static String fecha="";
    public Editor() {
        initComponents();
    }
     public void leer_arch1(String s)
    {
        System.out.println("--------------INICIO DE COMPILACIÓN-----------------");
        try {
            new Parsers.sintactico_1(new Parsers.lexico_1( new FileReader(s))).parse();
                 } catch (Exception ex) {
                 Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("----------------FIN DE COMPILACIÓN-----------------");
    }
     public void leer_frontend()
    {
        System.out.println("--------------INICIO DE COMPILACIÓN-----------------");
        try {
            new Parsers.sintactico_2(new Parsers.lexico_2( new FileReader(path+"\\"+nombre+".olc1frontend"))).parse();
                 } catch (Exception ex) {
                 Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("----------------FIN DE COMPILACIÓN-----------------");
                addcolum(Parsers.sintactico_2.cadena,Parsers.sintactico_2.columna);
    }
     public void leer_backend()
    {
        System.out.println("--------------INICIO DE COMPILACIÓN-----------------");
        try {
            new Parsers.sintactico_3(new Parsers.lexico_3( new FileReader(path+"\\"+nombre+".olc1backend"))).parse();
                 } catch (Exception ex) {
                 Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("----------------FIN DE COMPILACIÓN-----------------");
                addline(Parsers.sintactico_3.cadena,Parsers.sintactico_3.pos);
                
    }
     public void add_val(String s, int val)
     {
         for(int i=0;i<variables.size();i++)
         {
             if(variables.get(i).nombre.equals(s))
             {
                 variables.get(i).valor=val;
             }
                 
         }
     }
     public static void addline(String cad,String line)
     {
         String vec[]=line.split(",");
         int cont=vec.length-1;
         String vec2[]=cad.split(";");
         for(int i=0;i<vec2.length;i++)
         {
              String vec3[]=vec2[i].split("-");
              if(vec3.length>1)
              {
                  for(int j=(vec3.length-1);j>=0;j--)
                  {
                      if(cont!=-1)
                      {
                        backend[Integer.parseInt(vec[cont])-1][(vec3.length-1-j)]=vec3[j];
                      }
                  }
                    cont--;
              }
              
         }
         
     }
     public static void addcolum(String cad,String col)
     {
         String vec[]=col.split(",");
         int cont=vec.length-1;
         String vec2[]=cad.split(";");
         for(int i=0;i<vec2.length;i++)
         {
              String vec3[]=vec2[i].split(",");
              if(vec3.length>1)
              {
                  for(int j=(vec3.length-1);j>=0;j--)
                  {
                      if(cont!=-1)
                      {
                        frontend[(vec3.length-1-j)][(Integer.parseInt(vec[cont]))]=vec3[j];
                      }
                  }
                    cont--;
              }
              
         }
         mostrar();
     }
     public static void mostrar()
     {
         for(int i=0;i<25;i++)
         {
             for(int j=0;j<25;j++)
             {
                 jTable1.setValueAt(frontend[i][j],i,j);
             }
         
         }
     }
     public static void mostrar2()
     {
         for(int i=0;i<25;i++)
         {
             for(int j=0;j<25;j++)
             {
             
                jTable1.setValueAt(backend[i][j],i,j);
             }
           
         }
     }
    public static void addpath(String txt)
    {
        String temp="";
        for(int i=0;i<txt.length();i++)
        {
            if(txt.charAt(i)!='"')
            {
                temp=temp+txt.charAt(i);
            }
        }
        path=temp;
    }
    public static void addnom(String txt)
    {
        String temp="";
        for(int i=0;i<txt.length();i++)
        {
            if(txt.charAt(i)!='"')
            {
                temp=temp+txt.charAt(i);
            }
        }
        nombre=temp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        V_Chooser = new javax.swing.JFrame();
        Chooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout V_ChooserLayout = new javax.swing.GroupLayout(V_Chooser.getContentPane());
        V_Chooser.getContentPane().setLayout(V_ChooserLayout);
        V_ChooserLayout.setHorizontalGroup(
            V_ChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(V_ChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(V_ChooserLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        V_ChooserLayout.setVerticalGroup(
            V_ChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(V_ChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(V_ChooserLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            }
        ));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(14).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(15).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(16).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(17).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(18).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(19).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(20).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(21).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(22).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(23).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(24).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(25).setPreferredWidth(400);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        V_Chooser.setBounds(0, 0, 532, 374);
        V_Chooser.setVisible(true);
        Chooser.showOpenDialog(this);
        leer_arch1(Chooser.getSelectedFile().getAbsolutePath());
      
        leer_frontend();
        leer_backend();
        V_Chooser.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        
        if(evt.getKeyCode()==113)
        {
            if(ban==true)
            {
                mostrar();
                ban=false;
            }
            else
            {
                mostrar2();
                ban=true;
            }
        }
        
    }//GEN-LAST:event_jTable1KeyPressed
    
 
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Chooser;
    private javax.swing.JFrame V_Chooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
