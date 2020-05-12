package xupt.se.ttms.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xupt.se.ttms.bean.Studio;
import xupt.se.ttms.bean.StudioExample;

public interface StudioMapper {
    int countByExample(StudioExample example);

    int deleteByExample(StudioExample example);

    int deleteByPrimaryKey(Integer studioId);

    int insert(Studio record);

    int insertSelective(Studio record);

    List<Studio> selectByExampleWithBLOBs(StudioExample example);

    List<Studio> selectByExample(StudioExample example);

    Studio selectByPrimaryKey(Integer studioId);

    int updateByExampleSelective(@Param("record") Studio record, @Param("example") StudioExample example);

    int updateByExampleWithBLOBs(@Param("record") Studio record, @Param("example") StudioExample example);

    int updateByExample(@Param("record") Studio record, @Param("example") StudioExample example);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKeyWithBLOBs(Studio record);

    int updateByPrimaryKey(Studio record);
}