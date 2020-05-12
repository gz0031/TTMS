package xupt.se.ttms.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xupt.se.ttms.dao.*;

/*测试dao层：可以直接使用原生的代码
但是推荐使用spring的单元测试，可以自动注入我们需要的组件
@ContextConfiguration：指定spring文件的位置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    MovieMapper movieMapper;

    @Autowired
    PlanMapper planMapper;

    @Autowired
    SeatMapper seatMapper;

    @Autowired
    StudioMapper studioMapper;

    @Autowired
    TicketMapper ticketMapper;

    @Autowired
    UserMapper userMapper;

    @Test
    public void testMapper(){

        System.out.println(employeeMapper);
        System.out.println(movieMapper);
        System.out.println(planMapper);
        System.out.println(seatMapper);
        System.out.println(studioMapper);
        System.out.println(ticketMapper);
        System.out.println(userMapper);

        System.out.println(employeeMapper.selectByPrimaryKey(1));
    }
}
