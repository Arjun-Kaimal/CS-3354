<template>
  <div class="leaderboard">
    <div class="header">
      <h1>LeaderBoard</h1>
    </div>

    <div class="entries">
      <div class="entry">
        <span class="rank">1st</span>
        <span class="name">Arvindh</span>
        <span class="points">500pts</span>
      </div>
      <div class="entry">
        <span class="rank">2nd</span>
        <span class="name">Barkat</span>
        <span class="points">400pts</span>
      </div>
      <div class="entry">
        <span class="rank">3rd</span>
        <span class="name">Arya</span>
        <span class="points">360pts</span>
      </div>
    </div>

    <div class="your-position">
      <h2>Your Position</h2>
      <div class="entry">
        <span class="rank">45th</span>
        <span class="name">Arjun</span>
        <span class="points">90pts</span>
      </div>
    </div>

    <router-link to="/dashboard" class="full-view-button">
      Back Home
    </router-link>
  </div>
  <router-view />
</template>

<style scoped>
.leaderboard {
  font-family: 'Inter', sans-serif;
  background: white;
  padding: 2rem;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 2rem;
  position: absolute;
  top: 0px;
  left: 0px;
  width: 100%;
}

.header {
  background: #1e5fb4;
  width: 100%;
  border-radius: 30px;
  padding: 2rem;
  text-align: center;
  color: white;
}

.entries, .your-position {
  background: #020209;
  color: white;
  padding: 1.5rem;
  border-radius: 20px;
  width: 100%;
  max-width: 900px;
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

.entry {
  display: flex;
  justify-content: space-between;
  font-size: 1.5rem;
  background-color: rgba(255, 255, 255, 0.1);
  padding: 1rem;
  border-radius: 10px;
}

.rank, .name, .points {
  flex: 1;
  text-align: center;
}

.your-position h2 {
  color: white;
  font-size: 2rem;
  margin-bottom: 1rem;
}

.full-view-button {
  background: #312aa5;
  color: white;
  padding: 1rem 2rem;
  border-radius: 30px;
  text-decoration: none;
  font-size: 1.25rem;
  cursor: pointer;
}
</style>
