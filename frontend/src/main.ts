
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap';
import 'jquery';
import "./assets/Tools.js";
import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(App)
}).$mount('#app')
