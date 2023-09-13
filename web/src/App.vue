<template>
  <div>Bot昵称:{{ bot_name }}</div>
  <div>Bot战力:{{ bot_rating }}</div>
  <router-view />
</template>

<script>
import $ from "jquery";
import { ref } from "vue";

//调用后端值
export default {
  name: "APP",
  setup: () => {
    let bot_name = ref("");
    let bot_rating = ref("");

    $.ajax({
      url: "http://localhost:8080/pk/getbotinfo/",
      type: "get",
      success: (resp) => {
        //console.log(resp);
        bot_name.value = resp.name;
        bot_rating.value = resp.rating;
      },
    });

    return {
      bot_name,
      bot_rating,
    };
  },
};
</script>




<style>
body{
  background-image: url("@/assets/background.jpg");
  background-size: cover;
  
}


</style>
