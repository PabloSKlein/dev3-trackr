<template>
  <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
    <div id="container">
      <h2>Rastreios</h2>
      <TrackrItem></TrackrItem>
      <TrackrItem></TrackrItem>
      <TrackrItem></TrackrItem>
      <TrackrItem></TrackrItem>
      <TrackrItem></TrackrItem>
      <TrackrItem></TrackrItem>
      <TrackrItem></TrackrItem>
    </div>
  </main>
</template>

<script>
import Vue from "vue";
import TrackrItem from "./TrackrItem.vue";

export default Vue.extend({
  name: "Content",
  components: { TrackrItem },
  props: {},
});
</script>

<style>
</style>
