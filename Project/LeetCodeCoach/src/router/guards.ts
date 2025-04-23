import type { NavigationGuardNext, RouteLocationNormalized } from 'vue-router';
import { getCurrentUser } from '../firebase/auth';

export const requireAuth = async (
  to: RouteLocationNormalized,
  from: RouteLocationNormalized,
  next: NavigationGuardNext
) => {
  const user = await getCurrentUser();
  if (user) {
    next();
  } else {
    next('/');
  }
}; 