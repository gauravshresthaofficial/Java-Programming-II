//Write a servlet program to print the prime number between 20 and 100
import java.io.*;
import javax.servlet.http.*;


public class PrimeNumber extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        boolean flag = true;
        for (int i = 20; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
                else{
                    flag=true;
                }
            }
            if(flag)
            {
                out.println("The prime number is: " + i);
            }
                
                
            }

        }

    }

