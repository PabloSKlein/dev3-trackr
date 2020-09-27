<template>
  <div id="main-track-item">
    <div class="ui-box ui-box--lite track-box">
      <ItemTitle></ItemTitle>
      <ItemContent></ItemContent>
    </div>
  </div>
</template>

<script>
import Vue from "vue";
import ItemTitle from "./TrackrItemTitle";
import ItemContent from "./TrackrItemContent";

export default Vue.extend({
  name: "TrackrItem",
  components: { ItemTitle, ItemContent },
  props: {},
});
</script>

<style>
.ui-box,
.ui-panel {
  margin-bottom: 16px;
}
.ui-box--lite {
  border: 1px solid #eee;
}

.ui-badge,
.ui-box--lite {
  background-color: #fff;
}

.ui-box {
  margin-bottom: 15px;
  position: relative;
}
.track-box {
  font-family: Arial, Helvetica, "Nimbus Sans L", sans-serif;
  font-size: 13px;
  line-height: 20px;
  color: #333;
}
</style>
