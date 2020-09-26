<template>
  <div id="main">
    <NavBar nome="Track"></NavBar>
    <div class="container-fluid">
      <div class="row">
        <MenuBar></MenuBar>
        <Content></Content>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from "vue";
import MenuBar from "./components/MenuBar.vue";
import NavBar from "./components/NavBar.vue";
import Content from "./components/Content.vue";

export default Vue.extend({
  name: "App",
  components: { MenuBar, NavBar, Content },
});
</script>

<style>
/* #app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
} */
</style>
