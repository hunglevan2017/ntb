package com.saigonbpo.ntb.Mapper;

import com.saigonbpo.ntb.Model.ThongTinThuyenVien;
import com.saigonbpo.ntb.Model.ThongTinThuyenVienExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThongTinThuyenVienMapper {
    long countByExample(ThongTinThuyenVienExample example);

    int deleteByExample(ThongTinThuyenVienExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThongTinThuyenVien record);

    int insertSelective(ThongTinThuyenVien record);

    List<ThongTinThuyenVien> selectByExample(ThongTinThuyenVienExample example);

    ThongTinThuyenVien selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThongTinThuyenVien record, @Param("example") ThongTinThuyenVienExample example);

    int updateByExample(@Param("record") ThongTinThuyenVien record, @Param("example") ThongTinThuyenVienExample example);

    int updateByPrimaryKeySelective(ThongTinThuyenVien record);

    int updateByPrimaryKey(ThongTinThuyenVien record);
}