package com.dao;

import com.entity.XueshengjiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjiaofeiVO;
import com.entity.view.XueshengjiaofeiView;


/**
 * 学生缴费
 * 
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
public interface XueshengjiaofeiDao extends BaseMapper<XueshengjiaofeiEntity> {
	
	List<XueshengjiaofeiVO> selectListVO(@Param("ew") Wrapper<XueshengjiaofeiEntity> wrapper);
	
	XueshengjiaofeiVO selectVO(@Param("ew") Wrapper<XueshengjiaofeiEntity> wrapper);
	
	List<XueshengjiaofeiView> selectListView(@Param("ew") Wrapper<XueshengjiaofeiEntity> wrapper);

	List<XueshengjiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjiaofeiEntity> wrapper);
	
	XueshengjiaofeiView selectView(@Param("ew") Wrapper<XueshengjiaofeiEntity> wrapper);
	

}
