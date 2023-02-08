<template>
  <ion-page>
    <ion-tabs>
      <ion-router-outlet></ion-router-outlet>
      <ion-tab-bar slot="bottom">
        <ion-tab-button tab="HomePage" href="/tabs/HomePage">
          <ion-icon :icon="home" />
          <ion-label>Home</ion-label>
        </ion-tab-button>
          
        <ion-tab-button tab="LoginPage" href="/tabs/LoginPage">
          <ion-icon :icon="logIn" />
          <ion-label>Login</ion-label>
        </ion-tab-button>
        
        <ion-tab-button tab="MovieSearch" href="/tabs/MovieSearch">
          <ion-icon :icon="search" />
          <ion-label>Suche</ion-label>
        </ion-tab-button>

        <ion-tab-button tab="RegisterPage" href="/tabs/RegisterPage">
          <ion-icon :icon="personAddOutline" />
          <ion-label>Registrieren</ion-label>
        </ion-tab-button>

        <ion-tab-button tab="SupportPage" href="/tabs/SupportPage">
          <ion-icon :icon="helpCircleOutline" />
          <ion-label>Support</ion-label>
        </ion-tab-button>
        
      </ion-tab-bar>
    </ion-tabs>
  </ion-page>
</template>

<script setup lang="ts">
import { IonTabBar, IonTabButton, IonTabs, IonLabel, IonIcon, IonPage, IonRouterOutlet } from '@ionic/vue';
import { flash, apps, send, home, logIn, search, add, personAddOutline, helpCircleOutline } from 'ionicons/icons';
</script>