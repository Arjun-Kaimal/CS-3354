import { createRouter, createWebHistory } from 'vue-router'
import Home from '../pages/Home.vue'
import Dashboard from '../pages/Dashboard.vue'
import Leaderboard from '../pages/Leaderboard.vue'
import Profile from '../pages/Profile.vue'
import CompleteQuestion from '../pages/CompleteQuestion.vue'
import BuildPlan from '../pages/BuildPlan.vue'
import PlanProgress from '../pages/PlanProgress.vue'
import { requireAuth } from './guards'

const routes = [
  { path: '/', name: 'Home', component: Home },
  { 
    path: '/dashboard', 
    name: 'Dashboard', 
    component: Dashboard,
    beforeEnter: requireAuth
  },
  { 
    path: '/leaderboard', 
    name: 'Leaderboard', 
    component: Leaderboard,
    beforeEnter: requireAuth
  },
  { 
    path: '/profile', 
    name: 'Profile', 
    component: Profile,
    beforeEnter: requireAuth
  },
  { 
    path: '/completequestion', 
    name: 'CompleteQuestion', 
    component: CompleteQuestion,
    beforeEnter: requireAuth
  },
  { 
    path: '/buildplan', 
    name: 'BuildPlan', 
    component: BuildPlan,
    beforeEnter: requireAuth
  },
  { 
    path: '/planprogress', 
    name: 'PlanProgress', 
    component: PlanProgress,
    beforeEnter: requireAuth
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router