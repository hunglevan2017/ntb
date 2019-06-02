package com.saigonbpo.ntb.Mapper;

import com.saigonbpo.ntb.Model.ThongTinGiaDinh;
import com.saigonbpo.ntb.Model.ThongTinGiaDinhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThongTinGiaDinhMapper {
    long countByExample(ThongTinGiaDinhExample example);

    int deleteByExample(ThongTinGiaDinhExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThongTinGiaDinh record);

    int insertSelective(ThongTinGiaDinh record);

    List<ThongTinGiaDinh> selectByExample(ThongTinGiaDinhExample example);

    ThongTinGiaDinh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThongTinGiaDinh record, @Param("example") ThongTinGiaDinhExample example);

    int updateByExample(@Param("record") ThongTinGiaDinh record, @Param("example") ThongTinGiaDinhExample example);

    int updateByPrimaryKeySelective(ThongTinGiaDinh record);

    int updateByPrimaryKey(ThongTinGiaDinh record);
}