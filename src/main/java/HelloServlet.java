import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //��ȡ�����������߼���
        System.out.println("lsaldkjf");
        servletRequest.getRequestDispatcher("/hello.html").forward(servletRequest,servletResponse);
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
