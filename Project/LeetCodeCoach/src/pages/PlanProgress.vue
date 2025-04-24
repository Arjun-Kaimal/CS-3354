<template>
  <div class="study-progress">
    <h1>Your study plan progress</h1>
    <p>Select the topic you want to see progress for in the graph.</p>

    <div class="topics">
      <button>Arrays & Strings</button>
      <button>Dynamic Programming</button>
      <button>Graphs & Trees</button>
    </div>

    <div class="graph-placeholder">
      <!-- Replace with actual graph component or image -->
      <img src="../images/v21_361.png" alt="Progress Graph" />
    </div>

    <div class="stats-and-suggestions">
      <div class="statistics">
        <h2>Statistics</h2>
        <p>Total Questions Solved: 2</p>
        <p>Current Streak: 364 Days</p>
        <p>Accuracy Rate: 78%</p>
      </div>

      <div class="suggestions">
        <h2>LeetCode AI Coach Suggestions</h2>
        <ul>
          <li>You're doing great with Arrays! Try focusing on Graphs next.</li>
          <li>You've attempted 5 DP problems but struggled with Memoization. Want to review it?</li>
          <li>You're solving mostly Easy problems. Let's try some Medium ones!</li>
        </ul>
      </div>
    </div>

    <div class="challenges">
      <h2>Identified Challenges</h2>
      <ul>
        <li>Dynamic Programming - High time complexity in solutions</li>
        <li>Backtracking - Struggled in last 3 attempts</li>
        <li>Binary Search - Accuracy below 50%</li>
      </ul>
    </div>

    <router-link to="/buildplan" class="modify-button">
          <span>Modify Study Plan</span>
        </router-link>
  </div>
</template>

<style scoped>
.study-progress {
  font-family: 'Inter', sans-serif;
  padding: 2rem;
  background: white;
  display: flex;
  flex-direction: column;
  gap: 2rem;
  align-items: center;
  position: absolute;
  top: 0px;
  left: 0px;
  width: 100%;
  color: black;
}

.study-progress h1 {
  font-size: 2.5rem;
}

.study-progress p {
  font-size: 1.25rem;
  text-align: center;
}

.topics {
  display: flex;
  gap: 1rem;
  flex-wrap: wrap;
  justify-content: center;
}

.topics button {
  padding: 0.75rem 1.5rem;
  border-radius: 30px;
  background: #312aa5;
  color: white;
  border: none;
  font-size: 1rem;
  cursor: pointer;
}

.graph-placeholder img {
  max-width: 100%;
  height: auto;
  border-radius: 20px;
}

.stats-and-suggestions {
  display: flex;
  flex-wrap: wrap;
  gap: 2rem;
  justify-content: center;
  width: 100%;
}

.statistics, .suggestions {
  background: #d9d9d9;
  padding: 2rem;
  border-radius: 20px;
  max-width: 500px;
  width: 100%;
}

.statistics h2, .suggestions h2, .challenges h2 {
  margin-bottom: 1rem;
}

.challenges {
  background: #d9d9d9;
  padding: 2rem;
  border-radius: 20px;
  max-width: 900px;
  width: 100%;
}

.challenges ul, .suggestions ul {
  list-style-type: disc;
  padding-left: 1.5rem;
}

.modify-button {
  background: #312aa5;
  color: white;
  font-size: 1.25rem;
  padding: 1rem 2rem;
  border: none;
  border-radius: 30px;
  cursor: pointer;
}
</style>
