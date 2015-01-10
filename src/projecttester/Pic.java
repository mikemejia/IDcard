    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */
    package projecttester;
    import java.awt.*;
    import java.awt.image.BufferedImage;
    import javax.swing.*;
    import java.io.*; 
    import javax.imageio.ImageIO;
    /**
     *
     * @author Mike
     */
    public class Pic extends JFrame {
        private StoredInfo info;

        private JLabel label;
        private JLabel iDLabel;
        private JLabel lastLabel;
        private JLabel firstLabel;
        private JLabel labelpic;
        private JLayeredPane main;
       /*Layered pane allows there to be labels that can be placed ontop of others
        */
        public Pic(StoredInfo info){
            this.info=info;
        /*the set size is the size of the id*/

        setTitle("Student ID creator");
        setSize(300, 196);
        
            //calls on the build method to add all the labels to the panel
            buildPanel();


            pack();

            setVisible(true);
            /*After the frame is created the picture is automatically saved*/
             BufferedImage bi = new BufferedImage(300, 196
                     , BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bi.createGraphics();
        main.paint(g);
        try {


        File outputfile = new File("saved.jpg");
        ImageIO.write(bi, "jpg", outputfile);
    } catch (IOException e) {

    }





    } /*the ImageIcon uses the image of the set id. 
     */
        private void buildPanel() {

          ImageIcon ss = new ImageIcon("hootloot_idcard - Copy.jpg");
          JOptionPane.showMessageDialog(null,"Please find your Photo");
          label = new JLabel(ss);
          main = new JLayeredPane();
          main.setPreferredSize(new Dimension(300, 196));
          label.setSize(main.getPreferredSize());
          label.setLocation(0,0);
          firstLabel = new JLabel(info.getFirst());
          firstLabel.setLocation(225,157);
          firstLabel.setSize(65,20);
          firstLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15 ));
          lastLabel = new JLabel(info.getLast());
          lastLabel.setLocation(230,170);
          lastLabel.setSize(65,20);
          lastLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15 ));
          iDLabel = new JLabel(info.getID());
          iDLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14 ));
          iDLabel.setForeground(Color.RED);
          iDLabel.setLocation(71,172);
          iDLabel.setSize(85,12);
          // JFileChooser lets the user pic what photo to place on there id
           JFileChooser File = new JFileChooser();
          int stat = File.showOpenDialog(null);
          File sel = File.getSelectedFile();
          String photo = sel.getPath();
          ImageIcon pic = new ImageIcon(photo);
          labelpic = new JLabel(pic);
          labelpic.setLocation(219,51);
          labelpic.setSize(64, 85);

          //label1.setBounds(75,184,138,174);
          main.add(label, new Integer(0));
        //  main.add(label, 1);
          main.add(iDLabel, new Integer(1));
          main.add(lastLabel, new Integer(2));
          main.add(firstLabel, new Integer(3));
          main.add(labelpic, new Integer(4));

          add(main);











        


      }
    }
