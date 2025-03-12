import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import jiaoshiList from '../pages/jiaoshi/list'
import jiaoshiDetail from '../pages/jiaoshi/detail'
import jiaoshiAdd from '../pages/jiaoshi/add'
import kechengleixingList from '../pages/kechengleixing/list'
import kechengleixingDetail from '../pages/kechengleixing/detail'
import kechengleixingAdd from '../pages/kechengleixing/add'
import kechengxinxiList from '../pages/kechengxinxi/list'
import kechengxinxiDetail from '../pages/kechengxinxi/detail'
import kechengxinxiAdd from '../pages/kechengxinxi/add'
import xueshengxuankeList from '../pages/xueshengxuanke/list'
import xueshengxuankeDetail from '../pages/xueshengxuanke/detail'
import xueshengxuankeAdd from '../pages/xueshengxuanke/add'
import banjixinxiList from '../pages/banjixinxi/list'
import banjixinxiDetail from '../pages/banjixinxi/detail'
import banjixinxiAdd from '../pages/banjixinxi/add'
import xueshengchengjiList from '../pages/xueshengchengji/list'
import xueshengchengjiDetail from '../pages/xueshengchengji/detail'
import xueshengchengjiAdd from '../pages/xueshengchengji/add'
import xueshengjiaofeiList from '../pages/xueshengjiaofei/list'
import xueshengjiaofeiDetail from '../pages/xueshengjiaofei/detail'
import xueshengjiaofeiAdd from '../pages/xueshengjiaofei/add'
import zonghexinxiList from '../pages/zonghexinxi/list'
import zonghexinxiDetail from '../pages/zonghexinxi/detail'
import zonghexinxiAdd from '../pages/zonghexinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'jiaoshi',
					component: jiaoshiList
				},
				{
					path: 'jiaoshiDetail',
					component: jiaoshiDetail
				},
				{
					path: 'jiaoshiAdd',
					component: jiaoshiAdd
				},
				{
					path: 'kechengleixing',
					component: kechengleixingList
				},
				{
					path: 'kechengleixingDetail',
					component: kechengleixingDetail
				},
				{
					path: 'kechengleixingAdd',
					component: kechengleixingAdd
				},
				{
					path: 'kechengxinxi',
					component: kechengxinxiList
				},
				{
					path: 'kechengxinxiDetail',
					component: kechengxinxiDetail
				},
				{
					path: 'kechengxinxiAdd',
					component: kechengxinxiAdd
				},
				{
					path: 'xueshengxuanke',
					component: xueshengxuankeList
				},
				{
					path: 'xueshengxuankeDetail',
					component: xueshengxuankeDetail
				},
				{
					path: 'xueshengxuankeAdd',
					component: xueshengxuankeAdd
				},
				{
					path: 'banjixinxi',
					component: banjixinxiList
				},
				{
					path: 'banjixinxiDetail',
					component: banjixinxiDetail
				},
				{
					path: 'banjixinxiAdd',
					component: banjixinxiAdd
				},
				{
					path: 'xueshengchengji',
					component: xueshengchengjiList
				},
				{
					path: 'xueshengchengjiDetail',
					component: xueshengchengjiDetail
				},
				{
					path: 'xueshengchengjiAdd',
					component: xueshengchengjiAdd
				},
				{
					path: 'xueshengjiaofei',
					component: xueshengjiaofeiList
				},
				{
					path: 'xueshengjiaofeiDetail',
					component: xueshengjiaofeiDetail
				},
				{
					path: 'xueshengjiaofeiAdd',
					component: xueshengjiaofeiAdd
				},
				{
					path: 'zonghexinxi',
					component: zonghexinxiList
				},
				{
					path: 'zonghexinxiDetail',
					component: zonghexinxiDetail
				},
				{
					path: 'zonghexinxiAdd',
					component: zonghexinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
