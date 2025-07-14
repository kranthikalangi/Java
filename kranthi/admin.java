import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class admin {
    private Frame frame;
    private Label usernameLabel, passwordLabel;
    private TextField usernameField, passwordField;
    private Button loginButton,showPasswordButton;
    private boolean passwordVisible = false;


    public admin() {
        frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        usernameLabel = new Label("Username:");
        usernameField = new TextField(20);

        passwordLabel = new Label("Password:");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');

        loginButton = new Button("Login");
        loginButton.addActionListener(new LoginButtonListener());

        showPasswordButton = new Button("Show password");
        showPasswordButton.addActionListener(new ShowPasswordButtonListener());

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(showPasswordButton);
        frame.add(loginButton);
        frame.setBackground(Color.RED);;

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
    private class ShowPasswordButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (passwordVisible) {
                passwordField.setEchoChar('*');
                showPasswordButton.setLabel("Show Password");
            } else {
                passwordField.setEchoChar((char) 0);
                showPasswordButton.setLabel("Hide Password");
            }
            passwordVisible = !passwordVisible;

        }
    }

    private class LoginButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("candy") && password.equals("raghu")) {
                frame.dispose();
                new WelcomeForm();
            }else if (username.equals("candy"))
            {
                frame.add (new Label("Invalid password"));
            }
            else if (password.equals("raghu")
            {
                frame.add (new Label("Invalid user name."));
            }
             else {
                frame.add (new Label("Invalid username or password"));
            }
        }
    }

    public static void main(String[] args) {
        new admin();
    }
}

class WelcomeForm {
    public WelcomeForm() {
        Frame frame = new Frame("Welcome");
        frame.setSize(200, 100);
        frame.add(new Label("Welcome, admin!"));
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}