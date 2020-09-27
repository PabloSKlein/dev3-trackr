<template>
  <div id="main-track-item-title" class="myml-ui-item-container__header">
    <ItemButton></ItemButton>
    <div class="purchase-status__title-container">
      <h2 class="purchase-status__title purchase-status__title--black">
        Em trasferência entre unidades.
      </h2>
      <span class="purchase-status__icon">
        <div class="purchase-status__icon-full">
          <svg
            width="50px"
            height="20px"
            viewBox="0 0 56 18"
            xmlns="http://www.w3.org/2000/svg"
            xmlns:xlink="http://www.w3.org/1999/xlink"
          >
            <image href="../assets/Trackr.png" width="50px" height="20px" />
          </svg>
        </div>
      </span>
    </div>
    <p class="purchase-status__subtitle">
      Atividade registrada em 26/09/2020 ás 15:40.
    </p>
  </div>
</template>

<script>
import Vue from "vue";
import ItemButton from "./TrackrItemButton";

export default Vue.extend({
  name: "TrackItemTitle",
  components: { ItemButton },
  props: {},
  data: function () {
    return {
      icon: "0",
    };
  },
});
</script>

<style>
.myml-ui-item-container__header {
  padding: 24px 32px 0;
}

.purchase-status__title {
  font-size: 18px;
  color: rgba(0, 0, 0, 0.8);
  margin: 0 5px 0 0;
  display: inline;
}

.purchase-status__subtitle {
  font-size: 14px;
  color: #999;
}

h1,
h2,
h3,
h4,
h5,
h6 {
  font-weight: 400;
  margin: 10px 0;
}

.purchase-status__icon {
  position: relative;
  height: 18px;
  width: 56px;
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
}

.purchase-status__title-container {
  margin-bottom: 2px;
}

a,
abbr,
address,
article,
aside,
audio,
b,
big,
blockquote,
body,
canvas,
caption,
cite,
code,
datalist,
dd,
del,
details,
dialog,
div,
dl,
dt,
em,
fieldset,
figure,
footer,
form,
h1,
h2,
h3,
h4,
h5,
h6,
header,
html,
i,
iframe,
img,
ins,
label,
legend,
li,
mark,
menu,
meter,
nav,
object,
ol,
output,
p,
pre,
progress,
q,
s,
section,
small,
span,
strong,
sub,
sup,
table,
tbody,
td,
tfoot,
th,
thead,
time,
tr,
u,
ul,
video {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
  vertical-align: baseline;
}
</style>
