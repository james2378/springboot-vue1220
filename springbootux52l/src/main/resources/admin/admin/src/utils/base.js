const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootux52l/",
            name: "springbootux52l",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootux52l/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "教务管理系统"
        } 
    }
}
export default base
