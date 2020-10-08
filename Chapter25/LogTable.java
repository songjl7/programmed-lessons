import java.lang.Math; 

public class LogTable{
    public static void main(String[] args){
        System.out.println("<html>\n<body>\n<table>\n<tr><th>x</th><th>ln(x)</th></tr>");
        for (double x = 1.0/8.0; x <= 2.0; x = x + 1.0/8.0){
            double logx = Math.log(x);
            System.out.println("<tr><td>" + x + "</td><td>" + logx + "</td></tr>");
        }
        System.out.println("</table>\n</body>\n</html>");
    }
}