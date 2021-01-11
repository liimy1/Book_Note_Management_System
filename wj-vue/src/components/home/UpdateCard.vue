<template>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span style="font-weight: bold;font-size: 20px">最近更新</span>
      <el-button v-on:click="modify" style="float: right; padding: 3px 0;color:black" icon="el-icon-search" circle>放大</el-button>
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item timestamp="2021/1/11" placement="top">
          <el-card>
            <h4 style="font-size: FontSize+'px';font-weight: bold">网站升级</h4>
            <p>ss 提交于 2021/1/11 21:32</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/4/11" placement="top">
          <el-card>
            <h4>实现图书分类功能</h4>
            <p>qq 提交于 2019/4/11 09:02</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/4/8" placement="top">
          <el-card>
            <h4>实现图书分页，修复图书添加的 BUG</h4>
            <p>Evan 提交于 2019/4/8 22:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/4/6" placement="top">
          <el-card>
            <h4>实现搜索框模糊查询</h4>
            <p>Evan 提交于 2019/4/6 19:51</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/4/5" placement="top">
          <el-card>
            <h4>实现图书修改功能</h4>
            <p>Evan 提交于 2019/4/5 22:52</p>
          </el-card>
        </el-timeline-item>
      </el-timeline>
    </div>
  </el-card>
</template>

<script>
  export default {
    name: 'UpdateCard',
    data(){
      return{
        FontSize:16
      }
    },
    methods:{
      modify () {
        this.FontSize+=20
        console.log(this.FontSize)
      }
    }
  }
</script>

<style scoped>
  .box-card {
    margin-top: 5px;
    width: 988px;
    height: 1050px;
    text-align: left;
  }
</style>
