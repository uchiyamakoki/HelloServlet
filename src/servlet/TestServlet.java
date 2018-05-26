package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
通过注解来实现web.xml的功能
 */
@WebServlet(name = "TestServlet",urlPatterns = "/test")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testServlet收到了请求");
        System.out.println("请求方式:"+request.getMethod());
        System.out.println("URI:"+request.getRequestURI());
        System.out.println("发出请求客户端IP地址:"+request.getRemoteAddr());
        System.out.println("服务点接收请求的IP地址:"+request.getLocalAddr());
        System.out.println("访问客户端的端口号:"+request.getRemotePort());
        System.out.println("web应用路径:"+request.getContextPath());
        System.out.println("http协议和版本:"+request.getProtocol());

        Enumeration<String> headerNames=request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String elements=headerNames.nextElement();
            System.out.println(elements+":"+request.getHeader(elements));
        }
    }
}
