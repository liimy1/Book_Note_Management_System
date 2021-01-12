<template>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span style="font-weight: bold;font-size: 20px">最近更新</span>
      <el-button @click="modify" style="float: right; padding: 3px 0;color:black" icon="el-icon-search" circle>放大</el-button>
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item timestamp="2021/1/11" placement="top">
          <el-card>
            <h4 :style="{fontSize: FontSize + 'px'}">网站升级已完成</h4>
            <p>ss 提交于 2021/1/15 21:32</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2021/1/13" placement="top">
          <el-card>
            <h4 :style="{fontSize: FontSize + 'px'}">新增图书分类功能</h4>
            <p>xx 提交于 2021/1/13 09:02</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2021/1/12" placement="top">
          <el-card>
            <h4 :style="{fontSize: FontSize + 'px'}">新版图书笔记管理系统即将上线</h4>
            <p>ss 提交于 2021/1/12 22:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2021/1/11" placement="top">
          <el-card>
            <h4 :style="{fontSize: FontSize + 'px'}">笔记本功能更新-创建属于你自己的线上知识库</h4>
            <p>qq 完成于 2021/1/11 21:20</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2020/12/25" placement="top">
          <el-card>
            <h4 :style="{fontSize: FontSize + 'px'}">网站将进行全面升级</h4>
            <p>通知</p>
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
        FontSize:14
      }
    },
    methods:{
      modify () {
        if(this.FontSize<=50)
          this.FontSize+=3
        else
          this.$alert('字体已放至最大')
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
