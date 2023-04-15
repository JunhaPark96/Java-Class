package jdbc.connection;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.data.category.*;

public class JDBC {

    public static void main(String[] args) {
        Connection conn = null;
//        Font font = new Font("돋움", Font.PLAIN, 12); ChartFactory.setChartFont(font); 
        ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@192.168.119.119:1521/dink";
            String user = "scott";
            String password = "tiger";
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select p.동이름, round(count(c.상호명) / p.세대수 * 100, 2) as 착한가격업소비율\r\n"
                            + "from (\r\n" + "    select 동이름, sum(세대) as 세대수 \r\n"
                            + "    from 수원시인구수 \r\n" + "    group by 동이름) p \r\n"
                            + "    left join 착한가격업소 c on c.동이름 = p.동이름\r\n"
                            + "group by p.동이름, p.세대수\r\n"
                            + "having ROUND(COUNT(c.상호명) / p.세대수 * 100, 2) > 0\r\n"
                            + "order by 착한가격업소비율 desc");

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            while (rs.next()) {
                String neighbor = rs.getString(1);
                double ratio = rs.getDouble(2);
//                System.out.println(rs.getString("동이름") + " " + rs.getString("착한가격업소비율"));
                
                dataset.addValue(ratio, "Ratio per household", neighbor);
            }

//            JFreeChart chart = ChartFactory.createBarChart("착한가격업소비율", "", "", dataset);
            JFreeChart chart = ChartFactory.createStackedBarChart3D("Good_Price_Restaurant_Ratio in Neighborhood", "Neighborhood",
                    "Ratio", dataset);
            chart.getCategoryPlot().getDomainAxis()
                    .setCategoryLabelPositions(CategoryLabelPositions.UP_45);

            ChartPanel chartPanel = new ChartPanel(chart);

            JFrame frame = new JFrame("착한가격업소비율");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(chartPanel);
            frame.setSize(1000, 600); // 크기 설정
            frame.setVisible(true);



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
