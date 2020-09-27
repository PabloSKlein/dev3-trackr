<template>
  <div id="main">
    <NavBar nome="Trackr"></NavBar>
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
body {
  font-family: Arial, Helvetica, "Nimbus Sans L", sans-serif;
  font-size: 13px;
  line-height: 20px;
  color: #333;
}
</style>
