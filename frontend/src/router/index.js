import { createRouter, createWebHistory } from 'vue-router';
import LandingPage from '../views/LandingPage.vue';
import RoleDashboard from '../views/RoleDashboard.vue';
import FeatureCenter from '../views/FeatureCenter.vue';

const routes = [
  { path: '/', name: 'home', component: LandingPage },
  { path: '/dashboard/:role', name: 'dashboard', component: RoleDashboard, props: true },
  { path: '/features', name: 'features', component: FeatureCenter }
];

export default createRouter({
  history: createWebHistory(),
  routes
});
