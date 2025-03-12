<template>
	<div class="main-content" :style='{"padding":"30px 5%"}'>
		<!-- 列表页 -->
		<template v-if="showFlag">
			<el-form class="center-form-pv" :style='{"width":"100%","margin":"-140px auto 20px"}' :inline="true" :model="searchForm">
				<el-row :style='{"justifyContent":"space-between","display":"flex"}' >
					<div :style='{"margin":"0 10px 0 0","display":"inline-block"}'>
						<label :style='{"margin":"0 10px 0 0","color":"#333","display":"inline-block","lineHeight":"40px","fontSize":"14px","fontWeight":"500","height":"40px"}' class="item-label">课程名称</label>
						<el-input v-model="searchForm.kechengmingcheng" placeholder="课程名称" clearable></el-input>
					</div>
					<el-button :style='{"border":"5px solid rgba(222, 216, 156, 1)","cursor":"pointer","padding":"0 24px","outline":"none","color":"#fff","borderRadius":"4px","background":"rgba(205, 203, 182, 1)","width":"auto","fontSize":"14px","height":"40px"}' type="success" @click="search()">查询</el-button>
				</el-row>

				<el-row :style='{"margin":"90px 0 0","justifyContent":"flex-end","display":"flex"}'>
					<el-button :style='{"border":"5px solid #ded89c","cursor":"pointer","padding":"0 24px","margin":"0 10px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"rgba(205, 203, 182, 1)","width":"auto","fontSize":"14px","height":"40px"}' v-if="isAuth('banjixinxi','新增')" type="success" @click="addOrUpdateHandler()">新增</el-button>
					<el-button :style='{"border":"5px solid #ded89c","cursor":"pointer","padding":"0 24px","margin":"0 10px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#cdcbb6","width":"auto","fontSize":"14px","height":"40px"}' v-if="isAuth('banjixinxi','删除')" :disabled="dataListSelections.length <= 0" type="danger" @click="deleteHandler()">删除</el-button>


					<download-excel v-if="isAuth('banjixinxi','导出')" class="export-excel-wrapper" :data = "dataList" :fields = "json_fields" name = "班级信息.xls">
						<!-- 导出excel -->
						<el-button :style='{"border":"5px solid #ded89c","cursor":"pointer","padding":"0 24px","margin":"0 10px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#cdcbb6","width":"auto","fontSize":"14px","height":"40px"}' type="danger">导出</el-button>
					</download-excel>
					<el-button :style='{"border":"5px solid #ded89c","cursor":"pointer","padding":"0 24px","margin":"0 10px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#cdcbb6","width":"auto","fontSize":"14px","height":"40px"}' v-if="isAuth('banjixinxi','打印')" type="success" @click="printJson">打印</el-button>


				</el-row>
			</el-form>
			
			<!-- <div> -->
				<el-table class="tables"
					:stripe='true'
					:style='{"padding":"0","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3020)","borderColor":"rgba(255, 214, 162, 1)","borderRadius":"30px","borderWidth":"0 8px 10px","background":"rgba(255, 255, 255, 0.5)","width":"100%","borderStyle":"solid"}' 
					v-if="isAuth('banjixinxi','查看')"
					:data="dataList"
					v-loading="dataListLoading"
				@selection-change="selectionChangeHandler">
					<el-table-column :resizable='true' type="selection" align="center" width="50"></el-table-column>
					<el-table-column :resizable='true' :sortable='false' label="索引" type="index" width="50" />
					<el-table-column :resizable='true' :sortable='false'  
						prop="kechengmingcheng"
					label="课程名称">
						<template slot-scope="scope">
							{{scope.row.kechengmingcheng}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="keshi"
					label="课时">
						<template slot-scope="scope">
							{{scope.row.keshi}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="xueqi"
					label="学期">
						<template slot-scope="scope">
							{{scope.row.xueqi}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="nianxian"
					label="年限">
						<template slot-scope="scope">
							{{scope.row.nianxian}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="shangkedidian"
					label="上课地点">
						<template slot-scope="scope">
							{{scope.row.shangkedidian}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="jiaoshigonghao"
					label="教师工号">
						<template slot-scope="scope">
							{{scope.row.jiaoshigonghao}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="jiaoshixingming"
					label="教师姓名">
						<template slot-scope="scope">
							{{scope.row.jiaoshixingming}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="xuehao"
					label="学号">
						<template slot-scope="scope">
							{{scope.row.xuehao}}
						</template>
					</el-table-column>
					<el-table-column :resizable='true' :sortable='false'  
						prop="xueshengxingming"
					label="学生姓名">
						<template slot-scope="scope">
							{{scope.row.xueshengxingming}}
						</template>
					</el-table-column>
					<el-table-column width="300" label="操作">
						<template slot-scope="scope">
							<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0 10px 5px 0","outline":"none","color":"#000","borderRadius":"15px","background":"rgba(222, 216, 156, 1)","width":"auto","fontSize":"14px","height":"32px"}' v-if=" isAuth('banjixinxi','查看')" type="success" size="mini" @click="addOrUpdateHandler(scope.row.id,'info')">详情</el-button>
							<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0 10px 5px 0","outline":"none","color":"#000","borderRadius":"15px","background":"rgba(222, 216, 156, 1)","width":"auto","fontSize":"14px","height":"32px"}' v-if="isAuth('banjixinxi','成绩')" type="success" size="mini" @click="xueshengchengjiCrossAddOrUpdateHandler(scope.row,'cross','','','')">成绩</el-button>
							<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0 10px 5px 0","outline":"none","color":"#000","borderRadius":"15px","background":"rgba(222, 216, 156, 1)","width":"auto","fontSize":"14px","height":"32px"}' v-if=" isAuth('banjixinxi','修改')" type="primary" size="mini" @click="addOrUpdateHandler(scope.row.id)">修改</el-button>





							<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0 10px 5px 0","outline":"none","color":"#000","borderRadius":"15px","background":"rgba(222, 216, 156, 1)","width":"auto","fontSize":"14px","height":"32px"}' v-if="isAuth('banjixinxi','删除') " type="danger" size="mini" @click="deleteHandler(scope.row.id)">删除</el-button>
						</template>
					</el-table-column>
				</el-table>
				<el-pagination
					@size-change="sizeChangeHandle"
					@current-change="currentChangeHandle"
					:current-page="pageIndex"
					background
					:page-sizes="[10, 20, 30, 50]"
					:page-size="pageSize"
					:layout="layouts.join()"
					:total="totalPage"
					prev-text="<"
					next-text=">"
					:hide-on-single-page="false"
					:style='{"padding":"0","margin":"20px 0 0","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","fontWeight":"500"}'
				></el-pagination>
			<!-- </div> -->
		</template>
		
		<!-- 添加/修改页面  将父组件的search方法传递给子组件-->
		<add-or-update v-if="addOrUpdateFlag" :parent="this" ref="addOrUpdate"></add-or-update>

		<xueshengchengji-cross-add-or-update v-if="xueshengchengjiCrossAddOrUpdateFlag" :parent="this" ref="xueshengchengjiCrossaddOrUpdate"></xueshengchengji-cross-add-or-update>




	</div>
</template>

<script>
import axios from 'axios'
import AddOrUpdate from "./add-or-update";
import xueshengchengjiCrossAddOrUpdate from "../xueshengchengji/add-or-update";
export default {
  data() {
    return {
      searchForm: {
        key: ""
      },
      form:{},
      dataList: [],
      pageIndex: 1,
      pageSize: 10,
      totalPage: 0,
      dataListLoading: false,
      dataListSelections: [],
      showFlag: true,
      sfshVisiable: false,
      shForm: {},
      chartVisiable: false,
      chartVisiable1: false,
      chartVisiable2: false,
      chartVisiable3: false,
      chartVisiable4: false,
      chartVisiable5: false,
      addOrUpdateFlag:false,
      xueshengchengjiCrossAddOrUpdateFlag: false,
      layouts: ["total","prev","pager","next","sizes","jumper"],
//导出excel
      json_fields: {
      "课程名称": "kechengmingcheng",    //常规字段
      "课时": "keshi",    //常规字段
      "学期": "xueqi",    //常规字段
      "年限": "nianxian",    //常规字段
      "上课地点": "shangkedidian",    //常规字段
      "教师工号": "jiaoshigonghao",    //常规字段
      "教师姓名": "jiaoshixingming",    //常规字段
      "学号": "xuehao",    //常规字段
      "学生姓名": "xueshengxingming",    //常规字段
      "跨表用户id": "crossuserid",    //常规字段
      "跨表主键id": "crossrefid",    //常规字段
      },
      json_meta: [
        [
          {
            " key ": " charset ",
            " value ": " utf- 8 "
          }
        ]
      ]

    };
  },
  created() {
    this.init();
    this.getDataList();
    this.contentStyleChange()
  },
  mounted() {
  },
  filters: {
    htmlfilter: function (val) {
      return val.replace(/<[^>]*>/g).replace(/undefined/g,'');
    }
  },
  components: {
    AddOrUpdate,
    xueshengchengjiCrossAddOrUpdate,
  },
  methods: {

    contentStyleChange() {
      this.contentPageStyleChange()
    },
    // 分页
    contentPageStyleChange(){
      let arr = []

      // if(this.contents.pageTotal) arr.push('total')
      // if(this.contents.pageSizes) arr.push('sizes')
      // if(this.contents.pagePrevNext){
      //   arr.push('prev')
      //   if(this.contents.pagePager) arr.push('pager')
      //   arr.push('next')
      // }
      // if(this.contents.pageJumper) arr.push('jumper')
      // this.layouts = arr.join()
      // this.contents.pageEachNum = 10
    },

    xueshengchengjiCrossAddOrUpdateHandler(row,type,crossOptAudit,statusColumnName,tips,statusColumnValue){
      this.showFlag = false;
      this.addOrUpdateFlag = false;
      this.xueshengchengjiCrossAddOrUpdateFlag = true;
      this.$storage.set('crossObj',row);
      this.$storage.set('crossTable','banjixinxi');
      this.$storage.set('statusColumnName',statusColumnName);
      this.$storage.set('statusColumnValue',statusColumnValue);
      this.$storage.set('tips',tips);
	if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
		var obj = this.$storage.getObj('crossObj');
		for (var o in obj){
		  if(o==statusColumnName && obj[o]==statusColumnValue){
		    this.$message({
		      message: tips,
		      type: "success",
		      duration: 1500,
		      onClose: () => {
			this.getDataList();
		      }
		    });
		      this.showFlag = true;
		      this.xueshengchengjiCrossAddOrUpdateFlag = false;
			return;
		  }
		}
	}
      this.$nextTick(() => {
      this.$refs.xueshengchengjiCrossaddOrUpdate.init(row.id,type);
      });
    },







    init () {
    },
    search() {
      this.pageIndex = 1;
      this.getDataList();
    },

    // 获取数据列表
    getDataList() {
      this.dataListLoading = true;
      let params = {
        page: this.pageIndex,
        limit: this.pageSize,
        sort: 'id',
        order: 'desc',
      }
           if(this.searchForm.kechengmingcheng!='' && this.searchForm.kechengmingcheng!=undefined){
            params['kechengmingcheng'] = '%' + this.searchForm.kechengmingcheng + '%'
          }
      this.$http({
        url: "banjixinxi/page",
        method: "get",
        params: params
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.dataList = data.data.list;
          this.totalPage = data.data.total;
        } else {
          this.dataList = [];
          this.totalPage = 0;
        }
        this.dataListLoading = false;
      });
    },
    // 每页数
    sizeChangeHandle(val) {
      this.pageSize = val;
      this.pageIndex = 1;
      this.getDataList();
    },
    // 当前页
    currentChangeHandle(val) {
      this.pageIndex = val;
      this.getDataList();
    },
    // 多选
    selectionChangeHandler(val) {
      this.dataListSelections = val;
    },
    // 添加/修改
    addOrUpdateHandler(id,type) {
      this.showFlag = false;
      this.addOrUpdateFlag = true;
      this.crossAddOrUpdateFlag = false;
      if(type!='info'){
        type = 'else';
      }
      this.$nextTick(() => {
        this.$refs.addOrUpdate.init(id,type);
      });
    },
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 删除
    deleteHandler(id) {
      var ids = id
        ? [Number(id)]
        : this.dataListSelections.map(item => {
            return Number(item.id);
          });
      this.$confirm(`确定进行[${id ? "删除" : "批量删除"}]操作?`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).then(() => {
        this.$http({
          url: "banjixinxi/delete",
          method: "post",
          data: ids
        }).then(({ data }) => {
          if (data && data.code === 0) {
            this.$message({
              message: "操作成功",
              type: "success",
              duration: 1500,
              onClose: () => {
                this.search();
              }
            });
          } else {
            this.$message.error(data.msg);
          }
        });
      });
    },


    async printJson() {
      //通过getdata调用后台接口获取数据封装到res
      this.list = this.dataList;
      let data = []
      for (let i=0; i < this.list.length; i++) {
          data.push({
          kechengmingcheng: this.list[i].kechengmingcheng,
          keshi: this.list[i].keshi,
          xueqi: this.list[i].xueqi,
          nianxian: this.list[i].nianxian,
          shangkedidian: this.list[i].shangkedidian,
          jiaoshigonghao: this.list[i].jiaoshigonghao,
          jiaoshixingming: this.list[i].jiaoshixingming,
          xuehao: this.list[i].xuehao,
          xueshengxingming: this.list[i].xueshengxingming,
          crossuserid: this.list[i].crossuserid,
          crossrefid: this.list[i].crossrefid,
        })
      }
      printJS({
        printable: data,
        properties: [
	  {
		field: 'kechengmingcheng',
		displayName: '课程名称',
		columnSize: 1
	  },
	  {
		field: 'keshi',
		displayName: '课时',
		columnSize: 1
	  },
	  {
		field: 'xueqi',
		displayName: '学期',
		columnSize: 1
	  },
	  {
		field: 'nianxian',
		displayName: '年限',
		columnSize: 1
	  },
	  {
		field: 'shangkedidian',
		displayName: '上课地点',
		columnSize: 1
	  },
	  {
		field: 'jiaoshigonghao',
		displayName: '教师工号',
		columnSize: 1
	  },
	  {
		field: 'jiaoshixingming',
		displayName: '教师姓名',
		columnSize: 1
	  },
	  {
		field: 'xuehao',
		displayName: '学号',
		columnSize: 1
	  },
	  {
		field: 'xueshengxingming',
		displayName: '学生姓名',
		columnSize: 1
	  },
	  {
		field: 'crossuserid',
		displayName: '跨表用户id',
		columnSize: 1
	  },
	  {
		field: 'crossrefid',
		displayName: '跨表主键id',
		columnSize: 1
	  },
        ],
        type: 'json',
        header: '班级信息',
        // 样式设置
        gridStyle: 'border: 2px solid #3971A5;',
        gridHeaderStyle: 'color: red;  border: 2px solid #3971A5;'
      })
    },
  }

};
</script>
<style lang="scss" scoped>
	//导出excel
	.export-excel-wrapper{
		display: inline-block;
	}
	
	.center-form-pv {
	  .el-date-editor.el-input {
	    width: auto;
	  }
	}
	
	.el-input {
	  width: auto;
	}
	
	// form
	.center-form-pv .el-input /deep/ .el-input__inner {
				border: 5px solid rgba(205, 203, 182, 1);
				border-radius: 16px;
				padding: 0 12px;
				outline: none;
				color: #333;
				background: rgba(222, 216, 156, 1);
				width: 170px;
				font-size: 14px;
				height: 40px;
			}
	
	.center-form-pv .el-select /deep/ .el-input__inner {
				border: 5px solid rgba(205, 203, 182, 1);
				border-radius: 16px;
				padding: 0 10px;
				outline: none;
				color: #333;
				background: rgba(222, 216, 156, 1);
				width: 170px;
				font-size: 14px;
				height: 40px;
			}
	
	.center-form-pv .el-date-editor /deep/ .el-input__inner {
				border: 5px solid rgba(205, 203, 182, 1);
				border-radius: 16px;
				padding: 0 10px 0 30px;
				outline: none;
				color: #333;
				background: rgba(222, 216, 156, 1);
				width: 170px;
				font-size: 14px;
				height: 40px;
			}
	
	// table
	.el-table /deep/ .el-table__header-wrapper thead {
				color: #333;
				font-weight: 500;
				width: 100%;
			}
	
	.el-table /deep/ .el-table__header-wrapper thead tr {
				background: #fff;
			}
	
	.el-table /deep/ .el-table__header-wrapper thead tr th {
				padding: 12px 0;
				background: rgba(222, 216, 156, 1);
				border-color: #eee;
				border-width: 0 1px 1px 0;
				border-style: solid;
				text-align: center;
			}

	.el-table /deep/ .el-table__header-wrapper thead tr th .cell {
				padding: 0 10px;
				word-wrap: normal;
				word-break: break-all;
				white-space: normal;
				font-weight: bold;
				display: inline-block;
				vertical-align: middle;
				width: 100%;
				line-height: 24px;
				position: relative;
				text-overflow: ellipsis;
			}

	
	.el-table /deep/ .el-table__body-wrapper tbody {
				width: 100%;
			}

	.el-table /deep/ .el-table__body-wrapper tbody tr {
				background: rgba(255, 255, 255, 0.1);
			}
	
	.el-table /deep/ .el-table__body-wrapper tbody tr td {
				padding: 12px 0;
				color: #999;
				background: rgba(255, 255, 255, 0.5);
				border-color: #666;
				border-width: 0 1px 1px 0;
				border-style: solid;
				text-align: center;
			}
	
		.el-table /deep/ .el-table__body-wrapper tbody tr.el-table__row--striped td {
		background: #eeeeee;
	}
		
	.el-table /deep/ .el-table__body-wrapper tbody tr:hover td {
				padding: 12px 0;
				color: #666;
				background: #f1eed4;
				border-color: #666;
				border-width: 0 1px 1px 0;
				border-style: solid;
				text-align: center;
			}
	
	.el-table /deep/ .el-table__body-wrapper tbody tr td {
				padding: 12px 0;
				color: #999;
				background: rgba(255, 255, 255, 0.5);
				border-color: #666;
				border-width: 0 1px 1px 0;
				border-style: solid;
				text-align: center;
			}

	.el-table /deep/ .el-table__body-wrapper tbody tr td .cell {
				padding: 0 10px;
				overflow: hidden;
				word-break: break-all;
				white-space: normal;
				line-height: 24px;
				text-overflow: ellipsis;
			}
	
	// pagination
	.main-content .el-pagination /deep/ .el-pagination__total {
				margin: 0 10px 0 0;
				color: #666;
				font-weight: 400;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .btn-prev {
				border: none;
				border-radius: 2px;
				padding: 0;
				margin: 0 5px;
				color: #666;
				background: #f4f4f5;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				min-width: 35px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .btn-next {
				border: none;
				border-radius: 2px;
				padding: 0;
				margin: 0 5px;
				color: #666;
				background: #f4f4f5;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				min-width: 35px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .btn-prev:disabled {
				border: none;
				cursor: not-allowed;
				border-radius: 2px;
				padding: 0;
				margin: 0 5px;
				color: #C0C4CC;
				background: #f4f4f5;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .btn-next:disabled {
				border: none;
				cursor: not-allowed;
				border-radius: 2px;
				padding: 0;
				margin: 0 5px;
				color: #C0C4CC;
				background: #f4f4f5;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}

	.main-content .el-pagination /deep/ .el-pager {
				padding: 0;
				margin: 0;
				display: inline-block;
				vertical-align: top;
			}

	.main-content .el-pagination /deep/ .el-pager .number {
				cursor: pointer;
				padding: 0 4px;
				margin: 0 5px;
				color: #666;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				border-radius: 2px;
				background: #f4f4f5;
				text-align: center;
				min-width: 30px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .el-pager .number:hover {
				cursor: pointer;
				padding: 0 4px;
				margin: 0 5px;
				color: #999;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				border-radius: 2px;
				background: #f4f4f5;
				text-align: center;
				min-width: 30px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .el-pager .number.active {
				cursor: default;
				padding: 0 4px;
				margin: 0 5px;
				color: #FFF;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				border-radius: 2px;
				background: #ded89c;
				text-align: center;
				min-width: 30px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__sizes {
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__sizes .el-input {
				margin: 0 5px;
				width: 100px;
				position: relative;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
				border: 1px solid #DCDFE6;
				cursor: pointer;
				padding: 0 25px 0 8px;
				color: #606266;
				display: inline-block;
				font-size: 13px;
				line-height: 28px;
				border-radius: 3px;
				outline: 0;
				background: #FFF;
				width: 100%;
				text-align: center;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
				top: 0;
				position: absolute;
				right: 0;
				height: 100%;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
				cursor: pointer;
				color: #C0C4CC;
				width: 25px;
				font-size: 14px;
				line-height: 28px;
				text-align: center;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__jump {
				margin: 0 0 0 24px;
				color: #606266;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__jump .el-input {
				border-radius: 3px;
				padding: 0 2px;
				margin: 0 2px;
				display: inline-block;
				width: 50px;
				font-size: 14px;
				line-height: 18px;
				position: relative;
				text-align: center;
				height: 28px;
			}
	
	.main-content .el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
				border: 1px solid #DCDFE6;
				cursor: pointer;
				padding: 0 3px;
				color: #606266;
				display: inline-block;
				font-size: 14px;
				line-height: 28px;
				border-radius: 3px;
				outline: 0;
				background: #FFF;
				width: 100%;
				text-align: center;
				height: 28px;
			}
</style>
