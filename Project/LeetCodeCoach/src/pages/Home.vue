<template>
  <div class="page">
    <div class="auth_buttons">
      <div class="sign_up" @click="showSignup = true">
        <span class="sign_up_text">Sign up</span>
      </div>
      <div class="log_in" @click="showLogin = true">
        <span class="log_in_text">Log In</span>
      </div>
    </div>
    <h1 class="welcome_msg">Welcome to NeetCode Coach <br>Your Ultimate LeetCode Guide</h1>
    <h2 class="subheading">Master LeetCode with a Personalized Study Plan.</h2>

    <p class="text">Struggling to crack coding interviews? NeetCode Coach is your personal AI-powered coach, designed to help you systematically improve your problem-solving skills.</p>

    <h2 class="second_body">Whether you're a beginner or a seasoned coder, we create a customized roadmap to guide you through LeetCode problems efficiently.</h2>

    <p class="main_body">How NeetCode Coach Helps You Succeed:<br>
      Adaptive Study Plan – Get a dynamic problem list tailored to your skill level and progress.<br>
      Leaderboard – Compete with others and track your ranking based on problem-solving consistency and accuracy.<br>
      Detailed Problem Insights – Understand patterns, approaches, and optimal solutions for every problem.<br>
      Progress Tracking – Visualize your learning journey with in-depth analytics.<br>
      Smart Recommendations – Receive AI-driven suggestions for the next best problem to solve.
    </p>

    <p class="bottom_text">Ready to Level Up Your Coding Skills? Start your personalized journey today and become a LeetCode master with NeetCode Coach!</p>

    <router-link to="/dashboard" class="get_started_wrapper">
      <div class="get_started_background"></div>
      <span class="get_started_button">Get Started</span>
    </router-link>

    <Login :show="showLogin" @close="showLogin = false" />
    <Signup :show="showSignup" @close="showSignup = false" />
  </div>

  <router-view />
</template>

<script setup lang="ts">
import { ref } from 'vue';
import Login from '../components/Login.vue';
import Signup from '../components/Signup.vue';

const showLogin = ref(false);
const showSignup = ref(false);
</script>

<style scoped>
.page {
  position: absolute;
  top: 0px;
  left: 0px;
  font-family: 'Inter', sans-serif;
  background: linear-gradient(rgba(255,255,255,1), rgba(30,95,179,1));
  padding: 100px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 50px;
  width: 100vw;
  height: 100vw;
}

.welcome_msg, .subheading, .text, .second_body, .main_body, .bottom_text {
  max-width: 900px;
  text-align: center;
  color: black;
}

.welcome_msg {
  font-size: 3rem;
  font-weight: bold;
}

.subheading, .second_body, .main_body, .bottom_text {
  font-size: 1.75rem;
}

.text, .main_body {
  font-size: 1.5rem;
}

.get_started_wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
  background: rgba(217, 217, 217, 1);
  border-radius: 30px;
  padding: 1rem 2rem;
  text-decoration: none;
  color: black;
  font-size: 1.5rem;
  cursor: pointer;
}

.auth_buttons {
  display: flex;
  gap: 50px;
  padding-bottom: 10px;
}

.sign_up, .log_in {
  background: rgba(217,217,217,1);
  padding: 0.75rem 1.5rem;
  border-radius: 30px;
  text-align: center;
  cursor: pointer;
}

.sign_up_text, .log_in_text {
  font-size: 1.25rem;
  color: black;
}

</style>
