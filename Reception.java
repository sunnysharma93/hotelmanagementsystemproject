import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener {
    JButton newCustumer, rooms, department,allEmployee,managerInfo,custumers,searchRoom,update,roomStatus,pickup,checkout,logout;

    Reception() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        newCustumer = new JButton("New Custumer Form");
        newCustumer.setBounds(10, 30, 200, 30);
        newCustumer.setBackground(Color.BLACK);
        newCustumer.setForeground(Color.WHITE);
        newCustumer.addActionListener(this);
        add(newCustumer);

        rooms = new JButton("Rooms");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);

        department = new JButton("Department");
        department.setBounds(10, 110, 200, 30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);

        allEmployee = new JButton("ALL Employee");
        allEmployee.setBounds(10, 150, 200, 30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.addActionListener(this);
        add(allEmployee);

        custumers = new JButton("Custumer info");
        custumers.setBounds(10, 190, 200, 30);
        custumers.setBackground(Color.BLACK);
        custumers.setForeground(Color.WHITE);
        custumers.addActionListener(this);
        add(custumers);

         managerInfo = new JButton("Manager info");
        managerInfo.setBounds(10, 230, 200, 30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);


        checkout = new JButton("Checkout");
        checkout.setBounds(10, 270, 200, 30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);

         update = new JButton("Update_Status");
        update.setBounds(10, 310, 200, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);

        roomStatus = new JButton("Update_Room_Status");
        roomStatus.setBounds(10, 350, 200, 30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        roomStatus.addActionListener(this);
        add(roomStatus);

        pickup = new JButton("Pickup_Service");
        pickup.setBounds(10, 390, 200, 30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);

        searchRoom = new JButton("Search_Room");
        searchRoom.setBounds(10, 430, 200, 30);
        searchRoom.setBackground(Color.BLACK);
        searchRoom.setForeground(Color.WHITE);
        searchRoom.addActionListener(this);
        add(searchRoom);

       logout = new JButton("Logout");
        logout.setBounds(10, 470, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);


        setBounds(350, 200, 800, 570);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Reception();
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == newCustumer){
            setVisible(false);
            new AddCustomer();
        } else if (ae.getSource() == rooms) {
            setVisible(false);
            new Room();
        } else if (ae.getSource() ==department) {
            setVisible(false);
            new Department();
        } else if (ae.getSource() == allEmployee) {
            setVisible(false);
            new EmployeeInfo();
        } else if (ae.getSource() == managerInfo) {
            setVisible(false);
            new ManagerInfo();
        } else if (ae.getSource() == custumers) {
            setVisible(false);
            new CustomerInfo();
        }else if(ae.getSource() == searchRoom){
            setVisible(false);
            new SearchRoom();
        }else if (ae.getSource() == update ){
            setVisible(false);
            new Updatecheck();
        } else if (ae.getSource() == roomStatus) {
            setVisible(false);
            new UpdateRoom();
        } else if (ae.getSource() == pickup) {
            setVisible(false);
            new Pickup();
        }else if (ae.getSource() == checkout){
            setVisible(false);
            new Checkout();
        }else if (ae.getSource() == logout){
            setVisible(false);
            System.exit(0);
        }
    }
}
