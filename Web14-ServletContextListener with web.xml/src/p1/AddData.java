package p1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AddData implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sc) {
		// TODO Auto-generated method stub
		ServletContext cont=sc.getServletContext();
		String name="Manish hurkat";
		cont.setAttribute("nm", name);
	}

}
