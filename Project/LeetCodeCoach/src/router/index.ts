import { createRouter, createWebHistory } from 'vue-router'
import Home from '../pages/Home.vue'
import Dashboard from '../pages/Dashboard.vue'
import Leaderboard from '../pages/Leaderboard.vue'
import Profile from '../pages/Profile.vue'
import CompleteQuestion from '../pages/CompleteQuestion.vue'
import BuildPlan from '../pages/BuildPlan.vue'
import PlanProgress from '../pages/PlanProgress.vue'


const routes = [
  { path: '/', name: 'Home', component: Home },
  { path: '/dashboard', name: 'Dashboard', component: Dashboard },
  { path: '/leaderboard', name: 'Leaderboard', component: Leaderboard },
  { path: '/profile', name: 'Profile', component: Profile },
  { path: '/completequestion', name: 'CompleteQuestion', component: CompleteQuestion },
  { path: '/buildplan', name: 'BuildPlan', component: BuildPlan },
  { path: '/planprogress', name: 'PlanProgress', component: PlanProgress }
]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router