import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class Mainframe extends JFrame{
     final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
     JTextField Name, age,phone,city; 
     JLabel lbWelcome;
     ImageIcon image;
     JLabel DisplayField;


     public void initalize(){

        /*Form  Panel */
        JLabel lbName = new JLabel("Enter Name of Student");
        lbName.setFont(mainFont);
        
        Name = new JTextField();
        Name.setFont(mainFont);

        JLabel lbAge = new JLabel("Enter Age of Student");
        lbAge.setFont(mainFont);

        age = new JTextField();
        age.setFont(mainFont);

        JLabel lbphone = new JLabel("Enter Phone Number");
        lbphone.setFont(mainFont);

        phone = new JTextField();
        phone.setFont(mainFont);

        JLabel lbcity = new JLabel("Enter City of Student");
        lbcity.setFont(mainFont);

        city = new JTextField();
        city.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.setOpaque(false);
        formPanel.add(lbName);
        formPanel.add(Name);
        formPanel.add(lbAge);
        formPanel.add(age);
        formPanel.add(lbphone);
        formPanel.add(phone);
        formPanel.add(lbcity);
        formPanel.add(city);


        /*Welcome Label */
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /*Button Panel */
        JButton btnOk = new JButton("OK");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*Fetching the inputs */
                String name = Name.getText();
                String Age = age.getText();
                String mobile = phone.getText();
                String cityodStudent = city.getText();
                Student st = new Student(name,Age,mobile,cityodStudent);
                Boolean res = Insertintodb.insertTodb(st);
                if(res){
                    lbWelcome.setText("Successfully Added to Database");
                }else{
                    lbWelcome.setText("Oops something error Occured");
                }
            }
            
        });


        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Name.setText("");
                age.setText("");
                phone.setText("");
                city.setText("");
                lbWelcome.setText("");
            }
            
        });

        /*This will contain two buttons */

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        buttonPanel.setOpaque(false);
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);

        /*Image icon  */
        try{
            image = new ImageIcon(getClass().getResource("students.png"));
            DisplayField = new JLabel(image);
        }catch (Exception e){
            System.out.println("Image cannot be found");
        }
        



        /*Main Panel */
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setBackground(new Color(128,128,255));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainpanel.add(DisplayField,BorderLayout.WEST);
        mainpanel.add(formPanel,BorderLayout.NORTH);
        mainpanel.add(lbWelcome,BorderLayout.CENTER);
        mainpanel.add(buttonPanel,BorderLayout.SOUTH);


        /*JFRAME */
        add(mainpanel);
        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
     }
     public static void main(String[] args) throws IOException {
        Mainframe frame = new Mainframe();
        frame.initalize();
     }
}