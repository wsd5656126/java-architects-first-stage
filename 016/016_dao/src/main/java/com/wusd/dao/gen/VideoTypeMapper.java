package com.wusd.dao.gen;

import com.wusd.entity.gen.VideoType;
import com.wusd.entity.gen.VideoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoTypeMapper {
    int countByExample(VideoTypeExample example);

    int deleteByExample(VideoTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoType record);

    int insertSelective(VideoType record);

    List<VideoType> selectByExample(VideoTypeExample example);

    VideoType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    int updateByExample(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    int updateByPrimaryKeySelective(VideoType record);

    int updateByPrimaryKey(VideoType record);
}