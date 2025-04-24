<template>
    <link href="https://fonts.googleapis.com/css?family=Inter&display=swap" rel="stylesheet" />
    <title>Complete a Question</title>
    <div class="background">
      <div class="header"></div>
      <div class="question_box">
        <span class="question_text">Question 76: Reverse String</span>
        <p class="question_text2">Write a function that reverses a string. The input string is given as an array of characters. You must do this by modifying the input array in-place with O(1) extra memory.</p>
      </div>
      <div class="answer_box">
        <span class="answer_text">Your Answer:</span>
        <textarea class="user_response"></textarea>
      </div>     
      <router-link to="/dashboard">
      <span class="button">Submit!</span>
    </router-link>   
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
.background {
  width: 100%;
  height: 1851px;
  background: rgba(255,255,255,1);
  opacity: 1;
  position: absolute;
  top: 0px;
  left: 0px;
  overflow: hidden;
}
.header {
  width: 100%;
  height: 214px;
  background: rgba(52,112,191,1);
  opacity: 1;
  position: absolute;
  top: 0px;
  left: 0px;
  overflow: hidden;
}
.question_box {
  width: 85%;
  height: 500px;
  background: rgba(217,217,217,1);
  opacity: 1;
  margin-top: 250px;
  margin-left: 100px;
  border-radius: 50px;
  display: flex;
  flex-direction: column;
}
.question_text {
  width: 200px;
  color: rgba(0,0,0,1);
  margin-left: 50px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 30px;
  opacity: 1;
  text-align: left;
}
.question_text2 {
  color: rgba(0,0,0,1);
  margin-left: 50px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 30px;
  opacity: 1;
  text-align: left;
  padding-top: 75px;
}
.answer_box {
  width: 85%;
  height: 750px;
  background: rgba(217,217,217,1);
  opacity: 1;
  margin-top: 250px;
  margin-left: 100px;
  border-radius: 50px;
  display: flex;
  flex-direction: column;
  padding: 25px; 
  gap: 20px;
}
.answer_text {
  width: 409px;
  color: rgba(0,0,0,1);
  font-family: Inter;
  font-weight: Regular;
  margin-left: 50px;
  font-size: 48px;
  opacity: 1;
  text-align: left;
  white-space: nowrap;
}
.user_response {
  flex-grow: 1; /* fills remaining height */
  width: 100%;
  font-size: 18px;
  padding: 1rem;
  border-radius: 20px;
  border: none;
  resize: none;
  font-family: Inter, sans-serif;
  background-color: rgba(238, 239, 244, 0.956);
  border-color: white;
}
.button {
  background-color: rgb(66, 212, 66);
  color: black;
  padding: 15px;
  border-radius: 5px;
  font-size: 20px;
  margin-left: 750px
}
</style>