<template>
  <a
    class="ch-btn myml-ui-list-item-container__primary-action"
    href="https://www.mercadolivre.com.br/returns/typification?order_id=4029808308&amp;ref=myml-listings_primary"
    target="_self"
    shipping-track=""
    shipping_path="SHIPPING_TRACK_LIST"
    shipping_status="delivered/"
    shipping_substatus=""
    shipping_delayed="/"
    >Ver Detalhes</a
  >
</template>

<script>
import Vue from "vue";

export default Vue.extend({
  name: "TrackrItemButton",
  components: {},
  props: {},
});
</script>

<style>
a.ch-btn,
a.ch-btn:active,
a.ch-btn:link,
a.ch-btn:visited {
  color: #fff;
}

a,
a:active,
a:link {
  color: #03b;
  text-decoration: none;
}
a,
a:active,
a:link,
a:visited {
  color: #0c3ab7;
}
.ch-btn,
.ch-btn:focus,
.ch-btn:visited,
a.ch-btn {
  background-color: #c5ac1e;
  background-image: -webkit-linear-gradient(#c5ac1e, #a33223);
  background-image: linear-gradient(#c5ac1e, #a33223);
  box-shadow: 0 1px 0 #707a17 inset;
  border: 1px solid #c5ac1e;
  color: #fff;
}

.myml-ui-list-item-container__primary-action {
  margin-left: 24px;
}

.myml-ui-list-item-container__primary-action {
  float: right;
}
.ch-btn,
.ch-btn:focus {
  line-height: 20px;
  padding: 5px 10px;
}
[class*="ch-btn"],
[class*="ch-btn"]:focus {
  font-family: Arial, Helvetica, "Nimbus Sans L", sans-serif;
  border-radius: 4px;
  box-shadow: none;
  cursor: pointer;
  display: inline-block;
  height: auto;
  text-decoration: none;
  font-size: 18px;
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
  /* border: 0; */
  /* outline: 0; */
  vertical-align: baseline;
}
</style>
