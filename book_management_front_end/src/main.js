import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import VueAxios from "vue-axios";

//其他vue组件中就可以this.$axios调用使用
//Vue.prototype.$axios = axios

const app=createApp(App);

app.use(store).use(router).mount('#app')
app.use(VueAxios,axios)

