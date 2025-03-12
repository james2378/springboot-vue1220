export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"课程类型","menuJump":"列表","tableName":"kechengleixing"}],"menu":"课程类型管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","修改","删除","打印","导出"],"menu":"学生选课","menuJump":"列表","tableName":"xueshengxuanke"}],"menu":"学生选课管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除","打印","导出"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除","打印","导出"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除","打印","导出"],"menu":"学生缴费","menuJump":"列表","tableName":"xueshengjiaofei"}],"menu":"学生缴费管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"综合信息","menuJump":"列表","tableName":"zonghexinxi"}],"menu":"综合信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","选课"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"学生选课","menuJump":"列表","tableName":"xueshengxuanke"}],"menu":"学生选课管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","支付"],"menu":"学生缴费","menuJump":"列表","tableName":"xueshengjiaofei"}],"menu":"学生缴费管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","选课"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","审核","班级加入"],"menu":"学生选课","menuJump":"列表","tableName":"xueshengxuanke"}],"menu":"学生选课管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","成绩"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改","删除"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","选课"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
