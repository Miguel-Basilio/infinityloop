 import javax.swing.JOptionPane;
  import java.util.Calendar;
  
public class age {




 public static void main(String[] args) {
  
 String name;
 String date;
 int birthYear;
 int today;
 String message;
 int age;
 
 boolean again = true;
 while  (again) {
  
 today=Calendar.getInstance().get(Calendar.YEAR);
 
 name = JOptionPane.showInputDialog("Please enter Your name");
 date = JOptionPane.showInputDialog("please enter your year of birth");
 birthYear = Integer.parseInt(date);
 age = (today - birthYear);
 message = String.format("hello, %s, Youre %d years old today!",name, age, birthYear);
 JOptionPane.showMessageDialog(null, message);
 
 if ( age <= 20){
    int x = today - birthYear;
  message = String.format("Your too Young to Drink!, you need to wait %x more years",x);
  JOptionPane.showMessageDialog(null, message);
  
  }
  else {
  JOptionPane.showMessageDialog(null, "Lets Party like theres no Tomorrow!");
  
  
  
  int dialogResult = JOptionPane.showConfirmDialog(null, "do you want to continue?");
  if  (dialogResult == JOptionPane.NO_OPTION) again = false;
  
  }
  
   }
 }




}