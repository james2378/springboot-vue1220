package com.dao;

import com.entity.ZonghexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghexinxiVO;
import com.entity.view.ZonghexinxiView;


/**
 * 综合信息
 * 
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
public interface ZonghexinxiDao extends BaseMapper<ZonghexinxiEntity> {
	
	List<ZonghexinxiVO> selectListVO(@Param("ew") Wrapper<ZonghexinxiEntity> wrapper);
	
	ZonghexinxiVO selectVO(@Param("ew") Wrapper<ZonghexinxiEntity> wrapper);
	
	List<ZonghexinxiView> selectListView(@Param("ew") Wrapper<ZonghexinxiEntity> wrapper);

	List<ZonghexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghexinxiEntity> wrapper);
	
	ZonghexinxiView selectView(@Param("ew") Wrapper<ZonghexinxiEntity> wrapper);
	

}
