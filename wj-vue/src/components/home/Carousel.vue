<template>
  <el-card class="card-carousel">
  <el-carousel  class="push" :interval="4000" arrow="always">
    <el-carousel-item v-for="item in items" :key="item.id">
      <a :href=item.link target="_blank">
        <img :src=item.img alt="" class="carousel_img">
      </a>
      <h3>{{item.title}}</h3>
    </el-carousel-item>
  </el-carousel>
  </el-card>
</template>

<style>
  .el-carousel__item h3 {
    margin-left: 3px;
    color: black;
    font-size: 15px;
    /*line-height: 300px;*/
    bottom: 43px;
    float: left;
    position: relative;
  }

  .card-carousel {
    /*margin: 0 auto;*/
    margin-left: 20px;
    width: 680px;
    height: 320px;
  }

  .push {
    /*margin-left: -15px;*/
  }

  .el-carousel__item:nth-child(2n) {
    background: black;
  }

  .el-carousel__item:nth-child(2n+1) {
    background: black;
  }

  .carousel_img {
    height: 100%;
    width: 100%;
    text-align: center;
  }
</style>

<script>
  export default {
    name: 'Carousel',
    data: function () {
      return {
        items: [{
          id: 1,
          title: '笔记本功能全面上线',
          img: '../../../static/img/carousel/pen.png',
          link: 'http://localhost:8080/jotter'},
        {
          id: 2,
          title: '图书上新',
          img: '../../../static/img/carousel/cunshang.png',
          link: 'http://localhost:8080/library'
        },
        {
          id: 3,
          title: '广告',
          img: '../../../static/img/carousel/kindle.png',
          link: 'https://www.amazon.com/Kindle-Now-with-Built-in-Front-Light/dp/B07978J597'
        }]
      }
    }
  }
</script>
