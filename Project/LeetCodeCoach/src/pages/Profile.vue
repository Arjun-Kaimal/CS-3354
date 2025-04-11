<template>
    <link href="https://fonts.googleapis.com/css?family=Inter&display=swap" rel="stylesheet" />
    <link href="./css/main.css" rel="stylesheet" />
    <title>Document</title>
    <div class="v19_201">
        <div class="v19_202"></div>
        <span class="v19_232">[USERNAME]</span>
        <div class="v19_235"></div>
        <div class="v19_237"></div>
        <div class="v19_338"></div>
        <div class="v19_341"></div>
        <div class="v19_239"></div>
        <div class="v19_241"></div>
        <span class="v19_250">[USERNAME]</span>
        <span class="v19_320">[User information]</span>
        <span class="v19_339">[Condensed progress data.]</span>
        <span class="v19_343">[Current recommended goal (study plan)]</span>
        <span class="v19_322">[Recently completed questions.]</span>
        <div class="name"></div>
        <div class="v19_345"></div>
        <span class="v19_447">AI Coach</span>
        <span class="v19_448">Hi! I try to offer advice and things. Users can choose to interact with the coach if they want to. However, I won’t help answer questions!</span>
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
.v19_201 {
  width: 100%;
  height: 1851px;
  background: rgba(255,255,255,1);
  opacity: 1;
  position: absolute;
  top: 0px;
  left: 0px;
  overflow: hidden;
}
.v19_202 {
  width: 100%;
  height: 214px;
  background: linear-gradient(rgba(52,112,191,1), rgba(18,71,133,1));
  opacity: 1;
  position: absolute;
  top: 0px;
  left: 0px;
  overflow: hidden;
}
.v19_232 {
  width: 820px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 431px;
  left: 557px;
  font-family: Inter;
  font-weight: Semi Bold;
  font-size: 128px;
  opacity: 1;
  text-align: left;
}
.v19_235 {
  width: 100%;
  height: 395px;
  background: rgba(217,217,217,1);
  opacity: 1;
  position: absolute;
  top: 698px;
  left: 236px;
}
.v19_237 {
  width: 611px;
  height: 100%;
  background: rgba(217,217,217,1);
  opacity: 1;
  position: absolute;
  top: 698px;
  left: 1409px;
}
.v19_338 {
  width: 630px;
  height: 619px;
  background: rgba(217,217,217,1);
  opacity: 1;
  position: absolute;
  top: 1141px;
  left: 236px;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px;
  border-bottom-left-radius: 40px;
  border-bottom-right-radius: 40px;
  overflow: hidden;
}
.v19_341 {
  width: 442px;
  height: 619px;
  background: rgba(217,217,217,1);
  opacity: 1;
  position: absolute;
  top: 1141px;
  left: 912px;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px;
  border-bottom-left-radius: 40px;
  border-bottom-right-radius: 40px;
  overflow: hidden;
}
.v19_239 {
  width: 611px;
  height: 473px;
  background: rgba(217,217,217,1);
  opacity: 1;
  position: absolute;
  top: 233px;
  left: 2114px;
}
.v19_241 {
  width: 128px;
  height: 482px;
  background: rgba(217,217,217,1);
  opacity: 1;
  position: absolute;
  top: 57px;
  left: 2597px;
}
.v19_250 {
  width: 410px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 274px;
  left: 2285px;
  font-family: Inter;
  font-weight: Semi Bold;
  font-size: 64px;
  opacity: 1;
  text-align: left;
}
.v19_320 {
  width: 412px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 726px;
  left: 264px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 48px;
  opacity: 1;
  text-align: left;
}
.v19_339 {
  width: 491px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 1162px;
  left: 264px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 48px;
  opacity: 1;
  text-align: left;
}
.v19_343 {
  width: 399px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 1162px;
  left: 931px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 48px;
  opacity: 1;
  text-align: left;
}
.v19_322 {
  width: 483px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 726px;
  left: 1442px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 48px;
  opacity: 1;
  text-align: left;
}
.name {
  color: #fff;
}
.v19_345 {
  width: 606px;
  height: 875px;
  background: rgba(255,255,255,1);
  opacity: 1;
  position: absolute;
  top: 726px;
  left: 2089px;
  border: 3px solid rgba(44,44,44,1);
  border-top-left-radius: 59px;
  border-top-right-radius: 59px;
  border-bottom-left-radius: 59px;
  border-bottom-right-radius: 59px;
  overflow: hidden;
}
.v19_447 {
  width: 194px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 762px;
  left: 2185px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 40px;
  opacity: 1;
  text-align: left;
}
.v19_448 {
  width: 502px;
  color: rgba(0,0,0,1);
  position: absolute;
  top: 818px;
  left: 2138px;
  font-family: Inter;
  font-weight: Regular;
  font-size: 36px;
  opacity: 1;
  text-align: left;
}

</style>