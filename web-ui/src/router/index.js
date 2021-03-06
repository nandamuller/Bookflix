import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Cadastre from '@/components/Cadastre'
import Conheca from '@/components/Conheca'
import TrechoDoDia from '@/components/TrechoDoDia'
import Biblioteca from '@/components/Biblioteca'
import Configuracoes from '@/components/Configuracoes'
import Login from '@/components/Login'
import CadastroTrecho from '@/components/CadastroTrecho'
import Autor from '@/components/Autor'
import Obra from '@/components/Obra'
import Trechos from '@/components/Trechos'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
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
    }, {
      path: '/configuracoes',
      name: 'configuracoes',
      component: Configuracoes
    }, {
      path: '/login',
      name: 'Login',
      component: Login
    }, {
      path: '/cadastro-trecho',
      name: 'CadastroTrecho',
      component: CadastroTrecho
    }, {
      path: '/autor',
      name: 'Autor',
      component: Autor
    }, {
      path: '/obra',
      name: 'Obra',
      component: Obra
    }, {
      path: '/trechos/:id',
      name: 'Trechos',
      component: Trechos
    }
  ]
})
