package xupt.se.ttms.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xupt.se.ttms.bean.Seat;
import xupt.se.ttms.bean.SeatExample;

public interface SeatMapper {
    int countByExample(SeatExample example);

    int deleteByExample(SeatExample example);

    int deleteByPrimaryKey(Integer seatId);

    int insert(Seat record);

    int insertSelective(Seat record);

    List<Seat> selectByExample(SeatExample example);

    Seat selectByPrimaryKey(Integer seatId);

    int updateByExampleSelective(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByExample(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}