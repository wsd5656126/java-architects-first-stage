package com.wusd.dao.gen;

import com.wusd.entity.gen.VideoInfo;
import com.wusd.entity.gen.VideoInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoInfoMapper {
    int countByExample(VideoInfoExample example);

    int deleteByExample(VideoInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    List<VideoInfo> selectByExample(VideoInfoExample example);

    VideoInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    int updateByExample(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}