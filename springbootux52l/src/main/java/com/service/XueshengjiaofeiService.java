package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjiaofeiView;


/**
 * 学生缴费
 *
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
public interface XueshengjiaofeiService extends IService<XueshengjiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjiaofeiVO> selectListVO(Wrapper<XueshengjiaofeiEntity> wrapper);
   	
   	XueshengjiaofeiVO selectVO(@Param("ew") Wrapper<XueshengjiaofeiEntity> wrapper);
   	
   	List<XueshengjiaofeiView> selectListView(Wrapper<XueshengjiaofeiEntity> wrapper);
   	
   	XueshengjiaofeiView selectView(@Param("ew") Wrapper<XueshengjiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjiaofeiEntity> wrapper);
   	

}

