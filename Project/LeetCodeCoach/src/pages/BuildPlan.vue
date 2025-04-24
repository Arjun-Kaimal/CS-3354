<template>
  <div class="study-plan">
    <h1>Build your personalized Study Plan</h1>
    <p class="intro">
      Let LeetCodeCoach craft a custom roadmap to help you master LeetCode problems efficiently.
      Answer a few questions, and we’ll generate a study plan tailored to your skills and goals.
    </p>

    <section class="section">
      <h2>Set your Goal</h2>
      <ul class="option-list">
        <li><span class="icon"></span>Prepare for Interviews</li>
        <li><span class="icon"></span>Master Data Structures and Algorithms</li>
        <li><span class="icon"></span>Practice Coding Skills</li>
      </ul>
    </section>

    <section class="section">
      <h2>Skill Level</h2>
      <ul class="option-list">
        <li><span class="icon"></span>Beginner</li>
        <li><span class="icon"></span>Intermediate</li>
        <li><span class="icon"></span>Advanced</li>
      </ul>
    </section>

    <section class="section">
      <h2>Weekly Commitment</h2>
      <ul class="option-list">
        <li><span class="icon"></span>3 problems/week - Ideal for beginners or those balancing coding with a busy schedule.</li>
        <li><span class="icon"></span>5 problems/week - A balanced approach for those looking to improve consistently.</li>
        <li><span class="icon"></span>10 problems/week - Designed for those preparing for interviews or coding competitions.</li>
      </ul>
    </section>

    <button class="submit-button">Make my Study Plan</button>
  </div>
  <router-view />
</template>

<style scoped>
.study-plan {
  font-family: 'Inter', sans-serif;
  background: white;
  padding: 3rem;
  display: flex;
  flex-direction: column;
  gap: 2rem;
  width: 100%;
  margin: 0 auto;
  position: absolute;
  top: 0px;
  left: 0px;
  color: black;
}

h1 {
  font-size: 3rem;
  font-weight: 600;
}

.intro {
  font-size: 1.5rem;
  color: black;
}

.section h2 {
  font-size: 2rem;
  margin-bottom: 1rem;
}

.option-list {
  list-style: none;
  padding: 0;
  display: flex;
  flex-direction: column;
  gap: 1rem;
  color: black;
}

.option-list li {
  font-size: 1.25rem;
  padding-left: 2.5rem;
  position: relative;
}

.icon {
  position: absolute;
  left: 0;
  top: 0.3rem;
  width: 1.5rem;
  height: 1.5rem;
  background-color: #312aa5;
  border-radius: 50%;
}

.submit-button {
  background: #312aa5;
  color: white;
  font-size: 1.25rem;
  padding: 1rem 2rem;
  border: none;
  border-radius: 30px;
  cursor: pointer;
  align-self: center;
  margin-top: 2rem;
}
</style>
