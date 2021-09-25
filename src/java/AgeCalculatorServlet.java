/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author seanz
 */
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // load up a JSP
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // capture the parameters coming in from the POST request
        String yourage =  request.getParameter("your_age");
         
        
        
        // Set some attributes in the request object.
        // The request object will be passed through to the JSP by the forward() method.
        request.setAttribute("yourAge", yourage);
       
        
        if (yourage == null || yourage.equals("") || !yourage.matches("[0-9]+")) {
            // set up a helpful error message for user
            request.setAttribute("message", "You must give your current age.");
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        int nextage = parseInt(yourage) + 1;
        request.setAttribute("message", "Your age next birthday will be " + nextage);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
