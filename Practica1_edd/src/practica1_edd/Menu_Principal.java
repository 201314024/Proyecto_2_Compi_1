package practica1_edd;

import java.awt.Dimension;
import java.awt.Rectangle;

public class Menu_Principal extends javax.swing.JFrame {
    public Objeto personaje=new Objeto();
    public Objeto ficha=new Objeto();
    public Objeto castillo=new Objeto();
    public Objeto goomba=new Objeto();
    public Objeto hongo=new Objeto();
    public Objeto koopa=new Objeto();
    public Objeto pared=new Objeto();
    public Objeto piso=new Objeto();
    public Lista lista=new Lista();
    public Matriz matriz=new Matriz();
    
    public Menu_Principal() {
        initComponents();
        iniciar();

        
        
        
        
    }
    
    public void iniciar()
    {
        personaje.imagen("mario.jpg");
        ficha.imagen("ficha.png");
        castillo.imagen("castillo.jpg");
        goomba.imagen("goomba.png");
        hongo.imagen("hongo.png");
        koopa.imagen("koopa.jpg");
        pared.imagen("pared.png");
        piso.imagen("piso.png");
        javax.swing.GroupLayout SeleccionLayout = new javax.swing.GroupLayout(Seleccion);
        Seleccion.setLayout(SeleccionLayout);
        SeleccionLayout.setHorizontalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(personaje.imagen)
                .addComponent(ficha.imagen)
                .addComponent(castillo.imagen)
                .addComponent(goomba.imagen)
                .addComponent(hongo.imagen)
                .addComponent(koopa.imagen)
                .addComponent(pared.imagen)
                .addComponent(piso.imagen))   
              
            )
                
        );
        SeleccionLayout.setVerticalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionLayout.createSequentialGroup()
                
                .addComponent(personaje.imagen)
                .addComponent(ficha.imagen)
                .addComponent(castillo.imagen)
                .addComponent(goomba.imagen)
                .addComponent(hongo.imagen)
                .addComponent(koopa.imagen)
                .addComponent(pared.imagen)
                .addComponent(piso.imagen)
            )
        );
        System.out.println(lista.IsEmpty());
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana_matriz = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        fondo = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        Add_F = new javax.swing.JButton();
        Add_C = new javax.swing.JButton();
        lista_show = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Seleccion = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        No_elim = new javax.swing.JTextField();
        Belim = new javax.swing.JButton();
        Bconfycon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane(Mostrar);
        Mostrar = new javax.swing.JPanel();

        fondo.setBackground(new java.awt.Color(0, 0, 255));
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoMouseClicked(evt);
            }
        });

        titulo2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Mario Maker Guatemalteco");

        Add_F.setText("Argregar Fila");
        Add_F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_FMouseClicked(evt);
            }
        });

        Add_C.setText("Agregar Columna");
        Add_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_CMouseClicked(evt);
            }
        });

        lista_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_showMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lista_showLayout = new javax.swing.GroupLayout(lista_show);
        lista_show.setLayout(lista_showLayout);
        lista_showLayout.setHorizontalGroup(
            lista_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        lista_showLayout.setVerticalGroup(
            lista_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Add_C)
                    .addComponent(Add_F)
                    .addComponent(lista_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(Add_F)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Add_C)
                .addGap(18, 18, 18)
                .addComponent(lista_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(fondo);

        javax.swing.GroupLayout Ventana_matrizLayout = new javax.swing.GroupLayout(Ventana_matriz.getContentPane());
        Ventana_matriz.getContentPane().setLayout(Ventana_matrizLayout);
        Ventana_matrizLayout.setHorizontalGroup(
            Ventana_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        Ventana_matrizLayout.setVerticalGroup(
            Ventana_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mario Maker Guatemalteco");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Agregar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Agregar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Agregar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Agregar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SeleccionLayout = new javax.swing.GroupLayout(Seleccion);
        Seleccion.setLayout(SeleccionLayout);
        SeleccionLayout.setHorizontalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(101, 101, 101))
        );
        SeleccionLayout.setVerticalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(59, 59, 59)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(59, 59, 59)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(59, 59, 59)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(58, 58, 58)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(60, 60, 60)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(60, 60, 60)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(58, 58, 58)
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Seleccion);

        Belim.setText("Eliminar Por numero");
        Belim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BelimMouseClicked(evt);
            }
        });

        Bconfycon.setText("Confirmar y Continuar");
        Bconfycon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BconfyconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MostrarLayout = new javax.swing.GroupLayout(Mostrar);
        Mostrar.setLayout(MostrarLayout);
        MostrarLayout.setHorizontalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MostrarLayout.setVerticalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(Mostrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(No_elim, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Belim)
                        .addGap(18, 18, 18)
                        .addComponent(Bconfycon)
                        .addGap(0, 242, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(No_elim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Belim)
                            .addComponent(Bconfycon))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField1.getText();
        temp.imagen("mario.jpg");
        lista.Insertar(temp);
        jButton1.setEnabled(false);
        jTextField1.setEnabled(false);
        graficarlista();
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField2.getText();
        temp.imagen("ficha.png");
        lista.Insertar(temp);
        graficarlista();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField3.getText();
        temp.imagen("castillo.jpg");
        lista.Insertar(temp);
        jButton3.setEnabled(false);
        jTextField3.setEnabled(false);
        graficarlista();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField4.getText();
        temp.imagen("goomba.png");
        lista.Insertar(temp);
        graficarlista();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField5.getText();
        temp.imagen("hongo.png");
        lista.Insertar(temp);
        graficarlista();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField6.getText();
        temp.imagen("koopa.jpg");
        lista.Insertar(temp);
        graficarlista();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField7.getText();
        temp.imagen("pared.png");
        lista.Insertar(temp);
        graficarlista();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        Objeto temp=new Objeto();
        temp.nombre=jTextField8.getText();
        temp.imagen("piso.png");
        lista.Insertar(temp);
        graficarlista();
    }//GEN-LAST:event_jButton8MouseClicked

    private void BelimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BelimMouseClicked
       boolean ban=false;
        if(!No_elim.getText().isEmpty())
        {
            
            for(int i=0;i<No_elim.getText().length();i++)
            {
                
                if(Character.isLetter(No_elim.getText().charAt(i))||Integer.parseInt(No_elim.getText())>(lista.tamano()-1))
                {
                    ban=true;
                }
            }
            if(ban==false)
            {
                lista.Eliminar(Integer.parseInt(No_elim.getText())+1);
                graficarlista();
            }
            else
            {
                System.out.println("no se puede eliminar ya que el indice indicado no exsiste");
            }
        }
        else
        {
            System.out.println("cadena vacia");
        }
        
    }//GEN-LAST:event_BelimMouseClicked

    private void BconfyconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BconfyconMouseClicked
        this.setVisible(false);
        Ventana_matriz.setVisible(true);
        Ventana_matriz.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Ventana_matriz.setBounds(this.getBounds());
        Objeto o=new Objeto();
        o.imagen("avatar.jpg");
        matriz.Add(0, 0, 1, o);
        matriz.Add(0, 1, 1, o);
        matriz.Add(1, 0, 1, o);
        matriz.Add(1, 1, 1, o);
        matriz.Add(2, 0, 1, o);
        matriz.Add(2, 1, 1, o);
        matriz.Add(3, 0, 1, o);
        matriz.Add(3, 1, 1, o);
        int x=100;
        int y=585;
        for(int i=0;i<=matriz.maxIndiceX();i++)
        {
            y=585;
            for(int j=0;j<=matriz.maxIndiceY();j++)
            {
                javax.swing.JLabel temp=new javax.swing.JLabel();
                temp.setIcon(matriz.Get(i, j, 1).dato.imagen.getIcon()); 
                fondo.add(temp);
                temp.setBounds(x, y, 100, 100);
                y=y-100;
                
            }
            x=x+100;
        }
        lista_show.add(lista.getlast().imagen);
        lista.getlast().imagen.setBounds(0, 0, 140, 100);
 
    }//GEN-LAST:event_BconfyconMouseClicked

    private void Add_FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_FMouseClicked
        int y =matriz.maxIndiceY()+1;
        for(int i=0;i<=matriz.maxIndiceX();i++)
        {
            
            Objeto o=new Objeto();
            o.imagen("avatar.jpg");
            matriz.Add(i,y, 1,o);
        }
        graficarmatriz();
    }//GEN-LAST:event_Add_FMouseClicked

    private void Add_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_CMouseClicked
        int x =matriz.maxIndiceX()+1;
        for(int i=0;i<=matriz.maxIndiceY();i++)
        {
            Objeto o=new Objeto();
            o.imagen("avatar.jpg");
            matriz.Add(x,i , 1,o);
        }
        graficarmatriz();
    }//GEN-LAST:event_Add_CMouseClicked

    private void lista_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_showMouseClicked
        System.out.println("toco aqui");
    }//GEN-LAST:event_lista_showMouseClicked

    private void fondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseClicked
        System.out.println("toco aqui");   
    }//GEN-LAST:event_fondoMouseClicked

    public void graficarmatriz()
    {
        int x=100;
        int y=585;
        for(int i=0;i<=matriz.maxIndiceX();i++)
        {
            y=585;
            for(int j=0;j<=matriz.maxIndiceY();j++)
            {
                javax.swing.JLabel temp=new javax.swing.JLabel();
                temp.setIcon(matriz.Get(i, j, 1).dato.imagen.getIcon()); 
                fondo.add(temp);
                temp.setBounds(x, y, 100, 100);
                y=y-100;
                
            }
            x=x+100;
        }
    }
    
    public void graficarlista()
    {
        Nodo aux=lista.Inicio;
        Mostrar.removeAll();
        
        int y=1;
        int x=0;
        int cont=0;
        
        while(aux!=null)
        {
            if(aux!=lista.Inicio)
            {
                javax.swing.JLabel temp=new javax.swing.JLabel();
                aux.o.imagen.setText(aux.o.nombre);
                temp.setText((y+cont)/100+").");
                Mostrar.add(aux.o.imagen);
                Mostrar.add(temp);
                Mostrar.setPreferredSize(new Dimension(630,581));
                aux.o.imagen.setBounds(x+30, y, 200, 100);
                temp.setBounds(x, y, 30, 100);
                if(y>=500)
                {
                    x=x+210;
                    y=1;
                    cont=cont+600;
                }
                else{
                y=y+100;
                }
            }  
            aux=aux.next;
        }
       
        
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_C;
    private javax.swing.JButton Add_F;
    private javax.swing.JButton Bconfycon;
    private javax.swing.JButton Belim;
    private javax.swing.JPanel Mostrar;
    private javax.swing.JTextField No_elim;
    private javax.swing.JPanel Seleccion;
    private javax.swing.JFrame Ventana_matriz;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel lista_show;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
