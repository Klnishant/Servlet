import jakarta.servlet.*;
import java.io.*;

public class MeraServlet extends GenericServlet{
	public void service(ServletRequest rq,ServletResponse rs){
		try{
			PrintWriter pw = rs.getWriter();
			System.out.println("Mera Pehla Servelet,yipee");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}