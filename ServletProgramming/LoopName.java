//Write a servlet program to print your name 10 times

import java.io.*;
import javax.servlet.http.*;


public class LoopName extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        for(int i=0; i<10; i++)
        out.println("Gaurav Shrestha");
    }
}
