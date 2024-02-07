import java.sql.*;
import java.util.*;

class Data{

    int fees;
    String name;
    String branch;

    Data(String name, String branch, int fees) {
        this.name = name;
        this.branch = branch;
        this.fees = fees;

    }
}

public class MysqlCon{
    public static void main(String[] args) {


        Scanner userin = new Scanner(System.in);
        
        // System.out.print("Enter total number of users: ");
        // int usr_num = userin.nextInt();

        // for (int i=0; i<usr_num; i++) {
            
        //     System.out.println("--- USER %s DATA ENTRY ---", i);

        //     System.out.print("Enter name: ");
        //     String uname = userin.nextLine();

        //     System.out.print("Enter branch: ");
        //     String bbranch = userin.nextLine();

        //     System.out.print("Enter fees: ");
        //     int ffees = userin.nextInt();
        // }

            System.out.print("Enter name: ");
            String uname = userin.nextLine();

            System.out.print("Enter branch: ");
            String bbranch = userin.nextLine();

            System.out.print("Enter fees: ");
            int ffees = userin.nextInt();


            System.out.println();   

        // Data obj1 = new Data("darlyne", "Malware", 9064);
        Data obj1 = new Data(uname, bbranch, ffees);

        String name = obj1.name;
        String branch = obj1.branch;
        int fees = obj1.fees;

        String custom_query = String.format("insert into users(name, branch , fees) values('%s', '%s', %s)",name, branch, fees);
        // System.out.println(custom_query);

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project2","dante","pass123"); 
            Statement stmt=con.createStatement();  
            
            String q1 = "insert into users(name, branch, fees) values('elliot', 'IT', 25000)";
            String q2 = "insert into users(name, branch, fees) values('sheyla', 'Farma', 90800)";
            String q3 = "update users set fees = 99999 where name = 'elliot'";
            
            //String custom_query = "insert into users(name, branch, fees) values()";

            stmt.addBatch(custom_query);
            stmt.executeBatch();



            ResultSet rs=stmt.executeQuery("select * from users");  


            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
            
            con.close();  
        }

        catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("\nend");

    }
};