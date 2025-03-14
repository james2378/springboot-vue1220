package com.dao;

import com.entity.XueshengxuankeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxuankeVO;
import com.entity.view.XueshengxuankeView;


/**
 * 学生选课
 * 
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
public interface XueshengxuankeDao extends BaseMapper<XueshengxuankeEntity> {
	
	List<XueshengxuankeVO> selectListVO(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);
	
	XueshengxuankeVO selectVO(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);
	
	List<XueshengxuankeView> selectListView(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);

	List<XueshengxuankeView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);
	
	XueshengxuankeView selectView(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);
	

}
