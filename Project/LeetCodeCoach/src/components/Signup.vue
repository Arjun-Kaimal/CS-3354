<template>
  <div class="signup-modal" v-if="show">
    <div class="modal-content">
      <h2 class="modal-title">Sign Up</h2>
      <form @submit.prevent="handleSignup">
        <div class="form-group">
          <label for="email">Email</label>
          <input 
            type="email" 
            id="email" 
            v-model="email" 
            required 
            placeholder="Enter your email"
          >
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input 
            type="password" 
            id="password" 
            v-model="password" 
            required 
            placeholder="Enter your password"
          >
        </div>
        <div class="form-group">
          <label for="confirmPassword">Confirm Password</label>
          <input 
            type="password" 
            id="confirmPassword" 
            v-model="confirmPassword" 
            required 
            placeholder="Confirm your password"
          >
        </div>
        <div class="error" v-if="error">{{ error }}</div>
        <button type="submit" :disabled="loading">
          {{ loading ? 'Signing up...' : 'Sign Up' }}
        </button>
      </form>
      <button class="close-button" @click="$emit('close')">×</button>
    </div>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import { useAuth } from '../composables/useAuth';

const router = useRouter();
const props = defineProps<{
  show: boolean
}>();

const emit = defineEmits<{
  (e: 'close'): void
}>();

const { register, error, loading } = useAuth();
const email = ref('');
const password = ref('');
const confirmPassword = ref('');

const handleSignup = async () => {
  if (password.value !== confirmPassword.value) {
    error.value = 'Passwords do not match';
    return;
  }
  await register(email.value, password.value);
  if (!error.value) {
    emit('close');
    router.push('/dashboard');
  }
};
</script>

<style scoped>
.signup-modal {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 1000;
}

.modal-content {
  background: white;
  padding: 2rem;
  border-radius: 8px;
  width: 100%;
  max-width: 400px;
  position: relative;
}

.modal-title {
  color: #1e5fb3;
  font-size: 2rem;
  font-weight: bold;
  margin-bottom: 1.5rem;
  text-align: center;
  font-family: 'Inter', sans-serif;
}

.close-button {
  position: absolute;
  top: 10px;
  right: 10px;
  background: none;
  border: none;
  font-size: 1.5rem;
  cursor: pointer;
  color: #1e5fb3;
}

.form-group {
  margin-bottom: 1rem;
}

label {
  display: block;
  margin-bottom: 0.5rem;
  color: #333;
  font-weight: 500;
  font-family: 'Inter', sans-serif;
}

input {
  width: 100%;
  padding: 0.75rem;
  border: 1px solid #ccc;
  border-radius: 4px;
  font-size: 1rem;
  color: #333;
  background: white;
  font-family: 'Inter', sans-serif;
}

input::placeholder {
  color: #999;
}

button {
  width: 100%;
  padding: 0.75rem;
  background: #1e5fb3;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 1rem;
  font-weight: 500;
  font-family: 'Inter', sans-serif;
  transition: background-color 0.2s;
}

button:hover {
  background: #164a8c;
}

button:disabled {
  background: #ccc;
  cursor: not-allowed;
}

.error {
  color: #dc3545;
  margin-bottom: 1rem;
  font-size: 0.875rem;
  font-family: 'Inter', sans-serif;
}
</style> 