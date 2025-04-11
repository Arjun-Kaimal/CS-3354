<template>
    <link href="https://fonts.googleapis.com/css?family=Inter&display=swap" rel="stylesheet" />
    <title>LeetCodeCoach</title>
  
    <div class="gradient_background">
      <h1 class="welcome_msg">Welcome to NeetCode Coach <br>Your Ultimate LeetCode Guide</h1>
      <h2 class="subheading">Master LeetCode with a Personalized Study Plan. </h2>
      <p class="text"> Struggling to crack coding interviews? NeetCode Coach is your personal AI-powered coach, designed to help you systematically improve your problem-solving skills. </p>
      <h2 class="second_body">Whether you're a beginner or a seasoned coder, we create a customized roadmap to guide you through LeetCode problems efficiently.</h2>
      <p class="main_body">How NeetCode Coach Helps You Succeed:
      Adaptive Study Plan – Get a dynamic problem list tailored to your skill level and progress. <br>
      Leaderboard – Compete with others and track your ranking based on problem-solving consistency and accuracy.<br>
      Detailed Problem Insights – Understand patterns, approaches, and optimal solutions for every problem.<br>
      Progress Tracking – Visualize your learning journey with in-depth analytics.<br>
      Smart Recommendations – Receive AI-driven suggestions for the next best problem to solve.
      </p>
      <div class="v15_6"></div>
      <p class="bottom_text">Ready to Level Up Your Coding Skills? Start your personalized journey today and become a LeetCode master with NeetCode Coach!</p>
  
      <router-link to="/dashboard" class="get_started_wrapper">
        <div class="get_started_background"></div>
        <span class="get_started_button">Get Started</span>
      </router-link>
      <div class="sign_up_background"></div>
      <span class="sign_up_text">Sign up</span>
      <div class="log_in_background"></div>
      <span class="log_in_text">Log In</span>
    </div>
    
    <router-view />
    
  </template>
  
  
  <style scoped>
  * {
    box-sizing: border-box;
  }
  body {
    font-size: 14px;
  }
  .gradient_background {
    width: 100%;
    height: 2716px;
    background: linear-gradient(rgba(255,255,255,1), rgba(30,95,179,1));
    opacity: 1;
    position: absolute;
    top: 0px;
    left: 0px;
    overflow: hidden;
  }
  .welcome_msg {
    width: 100%;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 200px;
    left: 350px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 60px;
    opacity: 1;
    text-align: left;
  }
  .subheading {
    width: 965px;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 500px;
    left: 240px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 40px;
    opacity: 1;
    text-align: left;
  }
  .text {
    width: 965px;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 650px;
    left: 240px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 40px;
    opacity: 1;
    text-align: left;
  }
  .second_body {
    width: 965px;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 1000px;
    left: 240px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 40px;
    opacity: 1;
    text-align: left;
  }
  .main_body {
    width: 909px;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 1322px;
    left: 240px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 40px;
    opacity: 1;
    text-align: left;
  }
  .v15_6 {
    width: 918px;
    height: 307px;
    background: url("../images/v15_6.png");
    background-repeat: no-repeat;
    background-position: center center;
    background-size: cover;
    opacity: 1;
    position: absolute;
    top: 1937px;
    left: 214px;
    overflow: hidden;
  }
  .bottom_text {
    width: 898px;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 2227px;
    left: 284px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 40px;
    opacity: 1;
    text-align: left;
  }
  .get_started_wrapper {
    position: absolute;
    top: 2505px;
    left: 490px;
    width: 329px;
    height: 72px;
    display: flex;
    align-items: center;
    justify-content: center;
    text-decoration: none;
  }
  
  .get_started_background {
    position: absolute;
    width: 100%;
    height: 100%;
    background: rgba(217,217,217,1);
    border-radius: 30px;
    z-index: 1;
  }
  
  .get_started_button {
    position: relative;
    z-index: 2;
    font-family: Inter;
    font-size: 32px;
    color: black;
  }
  .sign_up_background {
    width: 218px;
    height: 61px;
    background: rgba(217,217,217,1);
    opacity: 1;
    position: absolute;
    top: 67px;
    left: 788px;
    border-top-left-radius: 30px;
    border-top-right-radius: 30px;
    border-bottom-left-radius: 30px;
    border-bottom-right-radius: 30px;
    overflow: hidden;
  }
  .sign_up_text {
    width: 131px;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 75px;
    left: 831px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 32px;
    opacity: 1;
    text-align: left;
  }
  .log_in_background {
    width: 218px;
    height: 61px;
    background: rgba(217,217,217,1);
    opacity: 1;
    position: absolute;
    top: 67px;
    left: 1149px;
    border-top-left-radius: 30px;
    border-top-right-radius: 30px;
    border-bottom-left-radius: 30px;
    border-bottom-right-radius: 30px;
    overflow: hidden;
  }
  .log_in_text {
    width: 100px;
    color: rgba(0,0,0,1);
    position: absolute;
    top: 78px;
    left: 1211px;
    font-family: Inter;
    font-weight: Regular;
    font-size: 32px;
    opacity: 1;
    text-align: left;
  }
  </style>
  