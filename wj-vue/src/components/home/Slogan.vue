<template>
  <div>
    <el-card class="box-card">
      <div style="font-size: 40px;color: azure;white-space: nowrap">Learning is the eye of the mind</div>
      <a href="https://github.com/liimy1/Book_Note_Management_System" target="_blank">
        <img src="../../assets/img/icon/icon6.png" alt="" class="git-link">
      </a>
    </el-card>
  </div>
</template>

<script>
  export default {
    name: 'Slogan'
  }
</script>

<style scoped>
  .box-card {
    width: 100%;
    height: 150px;
    background-color: #222;
    text-align: center;
    margin-top: 5px;
  }

  .slogan {
    width: 100%;
  }

  .git-link {
    width: 80px;
    /*position: absolute;*/
  }
</style>
