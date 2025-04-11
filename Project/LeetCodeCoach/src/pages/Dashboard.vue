<template>
  <div class="dashboard">
    <aside class="sidebar">
      <h2>Dashboard</h2>
      <nav>
        <router-link to="/completequestion" class="button">
          <span>Complete a Question</span>
        </router-link>
        <router-link to="/planprogress" class="button">
          <span>Study Plan</span>
        </router-link>
        <router-link to="/leaderboard" class="button">
          <span>Leaderboard</span>
        </router-link>        
        <router-link to="/profile" class="button">
          <span>Profile</span>
        </router-link>      
      </nav>
    </aside>

    <main class="main">
      <div class="header">Dashboard</div>

      <div class="cards">
        <div class="card">
          <h3>Your Progress At a Glance</h3>
          <p>Track your journey and see how far you have come.</p>
          <a href="#" class="button">View Progress</a>
        </div>
        <div class="card">
          <h3>Personalized Study Plan</h3>
          <p>Let NeetCode Coach build a personalized study plan for you.</p>
          <a href="#" class="button">Start</a>
        </div>
      </div>

      <div class="full-card">
        <h4>Your Next Question</h4>
        <p>
          <strong>Problem 341:</strong> Maximum Subarray Problem<br />
          <em>Categories: Arrays, Algorithms</em>
        </p>

        <router-link to="/completequestion" class="button">
          <span>Solve Now</span>
        </router-link>

        <h4 class="alt-heading">Or choose a question from here</h4>
        <a href="#" class="button">View Complete List of Questions</a>
      </div>
    </main>
  </div>

    <router-view />
</template>

<script>
export default {
  name: 'Dashboard',
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Inter&display=swap');

* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  font-family: 'Inter', sans-serif;
}

body {
  background-color: #fff;
  color: #000;
  font-size: 16px;
}

.dashboard {
  display: flex;
  min-height: 100vh;
}

.sidebar {
  width: 250px;
  background-color: #1e5fb4;
  color: #fff;
  padding: 2rem 1rem;
  border-top-right-radius: 20px;
  border-bottom-right-radius: 20px;
}

.sidebar h2 {
  font-size: 1.5rem;
  margin-bottom: 2rem;
}

.sidebar nav a {
  display: block;
  font-size: 1.1rem;
  margin: 1rem 0;
  color: #fff;
  text-decoration: none;
}

.main {
  flex: 1;
  padding: 2rem;
  display: flex;
  flex-direction: column;
  gap: 2rem;
}

.header {
  font-size: 3rem;
  font-weight: bold;
}

.cards {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 2rem;
}

.card {
  background-color: #d9d9d9;
  padding: 2rem;
  border-radius: 20px;
}

.card h3 {
  font-size: 1.8rem;
  margin-bottom: 1rem;
}

.card p {
  font-size: 1.2rem;
  margin-bottom: 1.5rem;
}

.button {
  display: inline-block;
  background-color: #302aa5;
  color: white;
  padding: 0.75rem 1.5rem;
  border-radius: 30px;
  font-size: 1rem;
  text-decoration: none;
}

.full-card {
  background-color: #d9d9d9;
  padding: 2rem;
  border-radius: 20px;
}

.full-card h4 {
  font-size: 1.5rem;
  margin-bottom: 1rem;
}

.full-card .button {
  margin-top: 1rem;
}

.alt-heading {
  margin-top: 2rem;
}

@media (max-width: 900px) {
  .cards {
    grid-template-columns: 1fr;
  }

  .sidebar {
    display: none;
  }
}
</style>
