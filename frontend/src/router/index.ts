import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';
import Tabs from '../views/TabsPage.vue'
import Login from '../views/LoginPage.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/tabs/HomePage'
  },
  {
    path: '/login',
    component: Login,
  },
  {
    path: '/tabs/',
    component: Tabs,
    children: [
      {
        path: '',
        redirect: '/tabs/'
      },
      {
        path: 'HomePage',
        component: () => import('@/views/HomePage.vue')
      },
      {
      path: 'LoginPage',
      component: () => import('@/views/LoginPage.vue')
      },
      {
        path: 'MovieSearch',
        component: () => import('@/views/MovieSearch.vue')
      },
      {
        path: 'RegisterPage',
        component: () => import('@/views/RegisterPage.vue')
      },
      {
        path: 'SupportPage',
        component: () => import('@/views/SupportPage.vue')
      }
    ]
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
