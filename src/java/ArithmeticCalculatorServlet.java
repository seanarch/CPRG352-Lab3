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
public class ArithmeticCalculatorServlet extends HttpServlet{

    private int result;
    
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // load up a JSP
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // capture the parameters coming in from the POST request
        String firstnumber =  request.getParameter("first_number");
        String secondnumber = request.getParameter("second_number");
 
        // Set some attributes in the request object.
        // The request object will be passed through to the JSP by the forward() method.
        request.setAttribute("firstNumber", firstnumber);
        request.setAttribute("secondNumber", secondnumber);
        
        if (firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("")
                || !firstnumber.matches("[0-9]+") || !secondnumber.matches("[0-9]+")) {
            // set up a helpful error message for user
            request.setAttribute("message", "invalid");
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        int intFirstnumber = parseInt(firstnumber);
        int intSecondnumber = parseInt(secondnumber);

        String action = request.getParameter("action");
        
        if("+".equals(action)) {
            result = intFirstnumber + intSecondnumber;
        } else if ("-".equals(action)) {
            result = intFirstnumber - intSecondnumber;
        } else if ("*".equals(action)) {
            result = intFirstnumber * intSecondnumber;
        } else if ("%".equals(action)) {
            result = intFirstnumber % intSecondnumber;
        }
 
        request.setAttribute("message", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}

 