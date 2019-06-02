package com.saigonbpo.ntb.Mapper;

import com.saigonbpo.ntb.Model.KinhNghiemLamViec;
import com.saigonbpo.ntb.Model.KinhNghiemLamViecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KinhNghiemLamViecMapper {
    long countByExample(KinhNghiemLamViecExample example);

    int deleteByExample(KinhNghiemLamViecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KinhNghiemLamViec record);

    int insertSelective(KinhNghiemLamViec record);

    List<KinhNghiemLamViec> selectByExample(KinhNghiemLamViecExample example);

    KinhNghiemLamViec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KinhNghiemLamViec record, @Param("example") KinhNghiemLamViecExample example);

    int updateByExample(@Param("record") KinhNghiemLamViec record, @Param("example") KinhNghiemLamViecExample example);

    int updateByPrimaryKeySelective(KinhNghiemLamViec record);

    int updateByPrimaryKey(KinhNghiemLamViec record);
}