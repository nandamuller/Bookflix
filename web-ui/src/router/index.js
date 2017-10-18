import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Home from '@/components/Home'
import Cadastre from '@/components/Cadastre'
import Conheca from '@/components/Conheca'
import Trecho from '@/components/Trecho'
import Biblioteca from '@/components/Biblioteca'
import Login from '@/components/Login'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    }, {
      path: '/home',
      name: 'Home',
      component: Home
    }, {
      path: '/conheca',
      name: 'Conheca',
      component: Conheca
    }, {
      path: '/cadastre',
      name: 'Cadastre',
      component: Cadastre
    }, {
      path: '/trecho',
      name: 'Trecho',
      component: Trecho
    }, {
      path: '/biblioteca',
      name: 'Biblioteca',
      component: Biblioteca
    },{
      path: '/login',
      name: 'login',
      component: Login
    }
  ]
})
