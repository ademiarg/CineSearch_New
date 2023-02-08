<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>SupportPage</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Projects</ion-title>
        </ion-toolbar>
      </ion-header>
      <form ref="form" @submit.prevent="sendEmail">
        <label>Name</label>
        <input type="text" name="user_name" />
        <label>Email</label>
        <input type="email" name="user_email" />
        <label>Message</label>
        <textarea name="message"></textarea>
        <input type="submit" value="Send" />
      </form>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import {
  IonPage,
  IonHeader,
  IonToolbar,
  IonTitle,
  IonContent,
} from "@ionic/vue";
import {ref, onMounted } from 'vue'
import emailjs from "@emailjs/browser";

const form = ref<any>(null);

function sendEmail() {
  emailjs.sendForm(
      "service_ex27v2q",
      "template_m8q2lkn",
      form.value,
      "VuXWmKaBh2Ejav599"
    )
    .then(
      (result) => {
        console.log("SUCCESS!", result.text);
      },
      (error) => {
        console.log("FAILED...", error.text);
      }
    );
}
</script>
