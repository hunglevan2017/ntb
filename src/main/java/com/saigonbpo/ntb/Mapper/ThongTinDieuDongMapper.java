package com.saigonbpo.ntb.Mapper;

import com.saigonbpo.ntb.Model.ThongTinDieuDong;
import com.saigonbpo.ntb.Model.ThongTinDieuDongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThongTinDieuDongMapper {
    long countByExample(ThongTinDieuDongExample example);

    int deleteByExample(ThongTinDieuDongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThongTinDieuDong record);

    int insertSelective(ThongTinDieuDong record);

    List<ThongTinDieuDong> selectByExample(ThongTinDieuDongExample example);

    ThongTinDieuDong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThongTinDieuDong record, @Param("example") ThongTinDieuDongExample example);

    int updateByExample(@Param("record") ThongTinDieuDong record, @Param("example") ThongTinDieuDongExample example);

    int updateByPrimaryKeySelective(ThongTinDieuDong record);

    int updateByPrimaryKey(ThongTinDieuDong record);
}