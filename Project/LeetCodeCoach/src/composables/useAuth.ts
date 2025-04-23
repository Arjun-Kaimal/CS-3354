import { ref } from 'vue';
import type { User } from 'firebase/auth';
import { signIn, signUp, logOut, getCurrentUser } from '../firebase/auth';

export function useAuth() {
  const user = ref<User | null>(null);
  const error = ref<string | null>(null);
  const loading = ref(false);

  const login = async (email: string, password: string) => {
    loading.value = true;
    error.value = null;
    const { user: authUser, error: authError } = await signIn(email, password);
    if (authError) {
      error.value = authError;
    } else {
      user.value = authUser;
    }
    loading.value = false;
  };

  const register = async (email: string, password: string) => {
    loading.value = true;
    error.value = null;
    const { user: authUser, error: authError } = await signUp(email, password);
    if (authError) {
      error.value = authError;
    } else {
      user.value = authUser;
    }
    loading.value = false;
  };

  const logout = async () => {
    loading.value = true;
    error.value = null;
    const { error: authError } = await logOut();
    if (authError) {
      error.value = authError;
    } else {
      user.value = null;
    }
    loading.value = false;
  };

  const checkAuth = async () => {
    loading.value = true;
    user.value = await getCurrentUser();
    loading.value = false;
  };

  return {
    user,
    error,
    loading,
    login,
    register,
    logout,
    checkAuth
  };
} 