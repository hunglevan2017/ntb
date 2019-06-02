package com.saigonbpo.ntb.Mapper;

import com.saigonbpo.ntb.Model.ChungChiThuyenVien;
import com.saigonbpo.ntb.Model.ChungChiThuyenVienExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChungChiThuyenVienMapper {
    long countByExample(ChungChiThuyenVienExample example);

    int deleteByExample(ChungChiThuyenVienExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChungChiThuyenVien record);

    int insertSelective(ChungChiThuyenVien record);

    List<ChungChiThuyenVien> selectByExample(ChungChiThuyenVienExample example);

    ChungChiThuyenVien selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChungChiThuyenVien record, @Param("example") ChungChiThuyenVienExample example);

    int updateByExample(@Param("record") ChungChiThuyenVien record, @Param("example") ChungChiThuyenVienExample example);

    int updateByPrimaryKeySelective(ChungChiThuyenVien record);

    int updateByPrimaryKey(ChungChiThuyenVien record);
}