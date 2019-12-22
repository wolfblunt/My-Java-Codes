package p1;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.catalina.servlet4preview.ServletContext;

/**
 * Application Lifecycle Listener implementation class AddObject
 *
 */
@WebListener
public class AddObject implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public AddObject() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sc)  { 
         // TODO Auto-generated method stub
    	javax.servlet.ServletContext cont = sc.getServletContext();
    	String name="Aman Khandelwal";
    	cont.setAttribute("nm", name);
    }
	
}
