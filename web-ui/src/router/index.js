import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Home from '@/components/Home'
import Cadastre from '@/components/Cadastre'
import Conheca from '@/components/Conheca'
import TrechoDoDia from '@/components/TrechoDoDia'
import Biblioteca from '@/components/Biblioteca'
import Login from '@/components/Login'
import Configuracoes from '@/components/Configuracoes'

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
      path: '/trecho-do-dia',
      name: 'TrechoDoDia',
      component: TrechoDoDia
    }, {
      path: '/biblioteca',
      name: 'Biblioteca',
      component: Biblioteca
    },{
      path: '/login',
      name: 'login',
      component: Login
    }, {
      path: '/configuracoes',
      name: 'configuracoes',
      component: Configuracoes
    }
  ]
})
