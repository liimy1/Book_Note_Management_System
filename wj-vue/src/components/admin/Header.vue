<template>
  <el-card class="admin-header">
    <a href="/index">
      <img src="../../assets/img/icon/icon8.png" alt="" width="45px" style="float: left;margin-top: -5px;">
    </a>
    <span style="font-size: 28px;font-weight: bold;position:absolute;left: 85px">
      <div>{{user}}</div>
    </span>
    <i class="el-icon-switch-button" v-on:click="logout" style="font-size: 40px;float: right"></i>
  </el-card>
</template>

<script>
  import {createRouter} from '../../router'

  export default {
    name: 'Header',
    data(){
      return{
        user:''
      }
    },
    created() {
      this.getUser()

    },
    methods: {
      getUser(){
        var uname=window.localStorage.getItem('username')
        uname=uname.substring(1,uname.length-1) // 去掉双引号
        this.user = "您好,"+uname
      },
      logout () {
        var _this = this
        this.$axios.get('/logout').then(resp => {
          if (resp && resp.data.code === 200) {
            _this.$store.commit('logout')
            _this.$router.replace('/index')
            // 清空路由，防止路由重复加载
            const newRouter = createRouter()
            _this.$router.matcher = newRouter.matcher
          }
        }).catch(failResponse => {})
      }
    }
  }
</script>

<style scoped>
  .admin-header {
    height: 80px;
    opacity: 0.85;
    line-height: 40px;
    min-width: 900px;
  }
  .el-icon-switch-button {
    cursor: pointer;
    outline:0;
  }
</style>
