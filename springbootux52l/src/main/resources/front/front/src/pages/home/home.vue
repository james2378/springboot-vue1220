<template>
<div class="home-preview" :style='{"width":"100%","margin":"0px auto","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>




	
<div class="news" :style='{"padding":"0 7%","margin":"40px 0 0","flexWrap":"wrap","background":"none","flex":"1","display":"flex","width":"100%","position":"relative","order":"3"}'>
	<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"margin":"0 auto 20px","borderColor":"#7e6b5a","textAlign":"center","display":"flex","outline":"1px solid #7e6b5a","top":"0","outlineOffset":"2px","background":"#f6f5f3","borderWidth":"1px 0","width":"100%","position":"relative","borderStyle":"dashed","zIndex":"99","height":"56px"}'>
		<span :style='{"padding":"0 20px 0 100px","margin":"0 10px 0 0","color":"#4e4e4e","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230207/cb0df322e9b14cb3b11556207d9fab2b.png) no-repeat 20px -1px,#f6f5f3","width":"auto","fontSize":"18px","lineHeight":"56px","fontWeight":"600"}'>公告信息</span>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	<!-- 样式十 -->
	<div v-if="newsList.length" class="list list10 index-pv1" :style='{"padding":"0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
	  <div v-if="newsList.length>0" @click="toDetail('newsDetail', newsList[0])" :style='{"width":"48%","margin":"0","position":"relative","background":"none","height":"auto"}' class="new10-list-item animation-box">
	    <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"290px"}' :src="baseUrl + newsList[0].picture" alt="">
		<div :style='{"padding":"0 20px","margin":"20px 100px 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","background":"#fff","width":"calc(100% - 100px)","fontSize":"16px","lineHeight":"40px","textOverflow":"ellipsis","fontWeight":"500"}' class="new9-list-item-title line1">{{newsList[0].title}}</div>
		<div :style='{"color":"#a6937c","borderRadius":"100%","textAlign":"center","bottom":"23px","background":"radial-gradient(circle, rgba(255,255,255,1) 23%, rgba(233,228,218,1) 100%),#f6f5f3","width":"100px","fontSize":"14px","lineHeight":"100px","position":"absolute","right":"0","height":"100px"}' class="new9-list-item-time">{{newsList[0].addtime.split(' ')[0]}}</div>
	    <div :style='{"padding":"0 20px","margin":"0 100px 0 0","overflow":"hidden","color":"#555","background":"#fff","width":"calc(100% - 100px)","fontSize":"14px","lineHeight":"30px","textIndent":"2em","height":"60px"}' class="new9-list-item-descript line2">{{newsList[0].introduction}}</div>
		<div :style='{"padding":"0 10px","margin":"0 10px 10px","color":"#999","background":"#fff","display":"none","fontSize":"12px","lineHeight":"24px"}' class="new9-list-item-identification">新闻动态</div>
	  </div>
	  <div v-if="newsList.length>1" :style='{"width":"48%","margin":"0","position":"relative","background":"none","display":"block","height":"400px"}'>
	    <div v-for="(item,index) in newsList" v-if="index<4 && index>0" :key="index" @click="toDetail('newsDetail', item)" :style='{"width":"100%","padding":"0 120px 0 0","margin":"0 0 55px","position":"relative","background":"#fff","height":"100px"}' class="new10-list-item animation-box">
	        <div :style='{"padding":"10px 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"calc(100% - 20px)","fontSize":"16px","lineHeight":"1","textOverflow":"ellipsis","fontWeight":"500"}' class="new9-list-item-title line1">{{ item.title }}</div>
	        <div :style='{"color":"#a6937c","top":"0","borderRadius":"100%","textAlign":"center","background":"radial-gradient(circle, rgba(255,255,255,1) 23%, rgba(233,228,218,1) 100%),#f6f5f3","width":"100px","fontSize":"14px","lineHeight":"100px","position":"absolute","right":"0","height":"100px"}' class="new9-list-item-time">{{ item.addtime.split(' ')[0] }}</div>
			<div :style='{"padding":"0 20px 0 0","margin":"5px auto 0","overflow":"hidden","color":"#555","display":"block","width":"100%","fontSize":"14px","lineHeight":"30px","textIndent":"2em","height":"60px"}' class="new9-list-item-descript line2">{{ item.introduction }}</div>
			<div :style='{"padding":"0 10px","fontSize":"12px","lineHeight":"24px","color":"#999","background":"#fff","display":"none"}' class="new9-list-item-identification">新闻动态</div>
	    </div>
	  </div>
	</div>
	
	<div @click="moreBtn('news')" :style='{"border":"0","padding":"0 12px 0 20px","margin":"0 auto","textAlign":"center","display":"inline-block","minWidth":"120px","right":"calc(7% + 40px)","borderRadius":"8px","top":"8px","background":"none","width":"auto","lineHeight":"40px","position":"absolute","height":"44px","zIndex":"1010"}'>
		<span :style='{"color":"#333","fontSize":"15px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#333","fontSize":"15px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>


<div class="lists" :style='{"padding":"0 0 60px","margin":"60px 7% 0","textAlign":"center","background":"none","display":"block","width":"86%","position":"relative","order":"30"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"margin":"0 0 40px","borderColor":"#7e6b5a","alignItems":"flex-start","textAlign":"center","display":"flex","outline":"1px solid #7e6b5a","outlineOffset":"2px","background":"#f6f5f3","borderWidth":"1px 0","width":"auto","position":"relative","borderStyle":"dashed","height":"56px"}'>
	  <span :style='{"padding":"0 20px 0 100px","fontSize":"18px","lineHeight":"54px","color":"#4e4e4e","background":"url(http://codegen.caihongy.cn/20230207/cb0df322e9b14cb3b11556207d9fab2b.png) no-repeat 20px -1px,#f6f5f3","fontWeight":"600"}'>课程信息展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	<!-- 样式八 -->
	<div class="list list8 index-pv1" :style='{"padding":"0","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
		<div :style='{"width":"48%","flexWrap":"wrap","justifyContent":"space-between","display":"flex","height":"570px","order":"2"}' class="list-body">
			<div v-if="kechengxinxiList.length>0" @click="toDetail('kechengxinxiDetail', kechengxinxiList[0])" class="list-4-item animation-box item-1" :style='{"width":"48%","margin":"0","position":"relative","height":"auto","order":"2"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(kechengxinxiList[0].fengmian)" :src="kechengxinxiList[0].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (kechengxinxiList[0].fengmian?kechengxinxiList[0].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{kechengxinxiList[0].kechengmingcheng}}</div>
                    <div>课时:{{kechengxinxiList[0].keshi}}</div>
                    <div>学分:{{kechengxinxiList[0].xuefen}}</div>
                </div>
			</div>
			<div v-if="kechengxinxiList.length>1" @click="toDetail('kechengxinxiDetail', kechengxinxiList[1])" class="list-4-item animation-box item-2" :style='{"width":"48%","margin":"0","position":"relative","height":"auto","order":"3"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(kechengxinxiList[1].fengmian)" :src="kechengxinxiList[1].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (kechengxinxiList[1].fengmian?kechengxinxiList[1].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{kechengxinxiList[1].kechengmingcheng}}</div>
                    <div>课时:{{kechengxinxiList[1].keshi}}</div>
                    <div>学分:{{kechengxinxiList[1].xuefen}}</div>
                </div>
			</div>
			<div v-if="kechengxinxiList.length>2" @click="toDetail('kechengxinxiDetail', kechengxinxiList[2])" class="list-4-item animation-box item-3" :style='{"width":"100%","margin":"0 0 20px","position":"relative","height":"auto"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(kechengxinxiList[2].fengmian)" :src="kechengxinxiList[2].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (kechengxinxiList[2].fengmian?kechengxinxiList[2].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{kechengxinxiList[2].kechengmingcheng}}</div>
                    <div>课时:{{kechengxinxiList[2].keshi}}</div>
                    <div>学分:{{kechengxinxiList[2].xuefen}}</div>
                </div>
			</div>
		</div>
		<div :style='{"width":"48%","margin":"0","flexWrap":"wrap","justifyContent":"space-between","display":"flex","height":"auto"}' class="list-body">
			<div v-if="kechengxinxiList.length>3" @click="toDetail('kechengxinxiDetail', kechengxinxiList[3])" class="list-4-item animation-box item-4" :style='{"width":"100%","margin":"0 0 20px","position":"relative","height":"auto"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(kechengxinxiList[3].fengmian)" :src="kechengxinxiList[3].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (kechengxinxiList[3].fengmian?kechengxinxiList[3].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{kechengxinxiList[3].kechengmingcheng}}</div>
                    <div>课时:{{kechengxinxiList[3].keshi}}</div>
                    <div>学分:{{kechengxinxiList[3].xuefen}}</div>
                </div>
			</div>
			<div v-if="kechengxinxiList.length>4" @click="toDetail('kechengxinxiDetail', kechengxinxiList[4])" class="list-4-item animation-box item-5" :style='{"width":"100%","position":"relative","height":"auto"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(kechengxinxiList[4].fengmian)" :src="kechengxinxiList[4].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (kechengxinxiList[4].fengmian?kechengxinxiList[4].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{kechengxinxiList[4].kechengmingcheng}}</div>
                    <div>课时:{{kechengxinxiList[4].keshi}}</div>
                    <div>学分:{{kechengxinxiList[4].xuefen}}</div>
                </div>
			</div>
		</div>
	</div>
	
	
	<div @click="moreBtn('kechengxinxi')" :style='{"border":"0","padding":"0 20px","margin":"0 auto","textAlign":"center","display":"block","minWidth":"120px","right":"0","borderRadius":"8px","top":"8px","background":"none","width":"auto","lineHeight":"40px","position":"absolute","zIndex":"1010"}'>
		<span :style='{"color":"#333","fontSize":"15px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#333","fontSize":"15px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],

        kechengxinxiList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 4,
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
			
			this.$http.get('kechengxinxi/list', {params: {
				page: 1,
				limit: 5,
			}}).then(res => {
				if (res.data.code == 0) {
					this.kechengxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform:  translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: kew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform:  translate3d(10px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform:  skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform:  skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
