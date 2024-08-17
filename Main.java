import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// use Jframe(swing)
class HotelManageSystem extends JFrame implements ActionListener {

    // constructor
    HotelManageSystem(){
        // hight of frame
    //    setSize(1366,565);

        // set frame location
       //setLocation(100,100);

       // setbounds used
        setBounds(0,0,1366,565);

        setLayout(null);

        // set the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));

        // jlabes use the frame the picture
        JLabel image = new JLabel(i1);

        // create the layout
        image.setBounds(0,0,1366,565); //location x and location y and lenght and breadth
        add(image);

        // Jlabes usding the text under frame
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,430,1000,90);

        // colour the text
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.PLAIN,50));
        image.add(text);

        // set the button
        JButton next = new JButton("next");
        next.setBounds(1150,450,150,50);
        next.setForeground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN,30));
        image.add(next);

        // show the frame
        setVisible(true);

        while(true){
            text.setVisible(false);
            // use multi threading class
            try{
                 Thread.sleep(500);
            }catch (Exception e){
                  e.printStackTrace();
            }
            text.setVisible(true);
            // again use try and catch because execution is running
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }


        }
    }
    // main method
    public static void main(String[] args){

        // object
        new HotelManageSystem();


    }


    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new login();

    }
}