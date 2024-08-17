import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Driver;

public class Dashboard extends JFrame implements ActionListener {

    //constructor
    Dashboard(){
      setBounds(0,0,1550,700);
      setLayout(null);

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
      Image i2 = i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0,0,1550,700);
      add(image);

      JLabel text = new JLabel("WELCOME TO TAJ GROUP HOTEL");
      text.setBounds(400,60,1000,50);
      text.setFont(new Font("Tahoma",Font.PLAIN,46));
      text.setForeground(Color.WHITE);
      image.add(text);
      // MENUBAR
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);

        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);

        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);

        JMenuItem addroom = new JMenuItem("ADD ROOM");
        addroom.addActionListener(this);
        admin.add(addroom);

        JMenuItem adddriver = new JMenuItem("ADD DRIVER");
        adddriver.addActionListener(this);
        admin.add(adddriver);




        setVisible(true);

    }

    public static void main(String[] args) {

        new Dashboard();
    }



  public void actionPerformed(ActionEvent ae) {
       if(ae.getActionCommand().equals("ADD EMPLOYEE")) {
         new AddEmployee();
       }else if(ae.getActionCommand().equals("ADD ROOM")){
            new AddRooms();
       } else if (ae.getActionCommand().equals("ADD DRIVER")) {
          new AddDriver();
       }else if(ae.getActionCommand().equals("RECEPTION")){
           new Reception();
       }

  }
}
