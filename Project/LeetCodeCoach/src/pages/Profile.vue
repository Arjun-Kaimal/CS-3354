<template>
  <div class="user-profile">
    <header class="header-gradient">
    <h1 class="username">User Profile</h1>
    </header>

    <section class="profile-summary">
      <div class="user-info">
        <p class="subhead_text">[User information]</p>   
        <p v-if="user">Email: {{ user.email }}</p>
        <p v-else>Loading user info...</p>
      </div>
      <div class="recent-questions">
        <p class="subhead_text">[Recently completed questions]</p>
        <p>Question 2 - Palindrome</p>
        <p>Question 14 - Longest Common Prefix</p>
      </div>
    </section>

    <section class="progress-goals">
      <div class="progress-box">
        <p class="subhead_text">[Condensed progress data]</p>
        <p>Streak: 364 days!!!</p>
        <p>LeaderBoard: 45th Place</p>
      </div>
      <div class="goals-box">
        <p class="subhead_text">[Current recommended goal]</p>
        <p>Try solving with lower complexity solutions.</p>
        <p>Try solving some medium/hard questions.</p>
      </div>
    </section>

    <aside class="ai-coach">
      <h2>AI Coach</h2>
      <p>Hi! I try to offer advice and things. Users can choose to interact with the coach if they want to. However, I won’t help answer questions!</p>
    </aside>
  
  <router-link to="/dashboard">
      <span class="button">Go Home</span>
    </router-link>
  </div>
  <router-view />
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue'
import { getCurrentUser } from '@/firebase/auth' // adjust path if needed

const user = ref<{ name: string; email: string } | null>(null)

onMounted(async () => {
  const currentUser = await getCurrentUser()
  if (currentUser) {
    user.value = {
      name: currentUser.displayName || 'User',
      email: currentUser.email || 'No Email',
    }
  }
})
</script>
<style scoped>
.user-profile {
  font-family: 'Inter', sans-serif;
  background: white;
  padding: 2rem;
  display: flex;
  flex-direction: column;
  gap: 2rem;
  align-items: center;
  position: absolute;
  top: 0px;
  left: 0px;
  width: 100%;
}

.header-gradient {
  width: 100%;
  background: linear-gradient(rgba(52,112,191,1), rgba(18,71,133,1));
  padding: 2rem;
  text-align: center;
  border-radius: 10px;
  color: white;
}

.username {
  font-size: 4rem;
  margin: 0;
}

.profile-summary {
  display: flex;
  flex-wrap: wrap;
  gap: 2rem;
  justify-content: center;
  width: 100%;
}

.user-info, .recent-questions {
  background: #d9d9d9;
  padding: 2rem;
  border-radius: 20px;
  width: 100%;
  max-width: 600px;
  font-size: 1.5rem;
  color: black;
}

.subhead_text {
  color: rgba(52,112,191,1);
  font-size: 30px;
  white-space: nowrap;
}

.progress-goals {
  display: flex;
  flex-wrap: wrap;
  gap: 2rem;
  justify-content: center;
  width: 100%;
  color: black;
}

.progress-box, .goals-box {
  background: #d9d9d9;
  padding: 2rem;
  border-radius: 20px;
  width: 100%;
  max-width: 500px;
  font-size: 1.5rem;
}

.ai-coach {
  background: white;
  border: 3px solid #2c2c2c;
  border-radius: 59px;
  padding: 2rem;
  max-width: 600px;
  width: 100%;
  font-size: 1.25rem;
  text-align: center;
  color: black;
}

.ai-coach h2 {
  font-size: 2rem;
  margin-bottom: 1rem;
  color: black;
}

.button {
  background: rgba(52,112,191,1);
  color: white;
  padding: 15px;
  border-radius: 5px;
  font-size: 20px;
  margin-left: 0px
}
</style>
