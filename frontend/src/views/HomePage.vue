<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>HomePage</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Projects</ion-title>
        </ion-toolbar>
      </ion-header>
      <div p>
        <h3>Herzlich Willkommen bei CineSearch</h3>
        Vielen Dank dass du die App CineSearch nutzt. Du kannst direkt nach einem Film suchen oder dich vorab registrieren/anmelden. 
        Durch die Registrierung erhältst du die Möglichkeit, Informationen zu Neuerscheinungen direkt per E-Mail zu erhalten, siehst eine Übersicht über deine letzten Suchanfragen und deine gesehenen Filme. Ebenfalls kannst du die Filme in der App bewerten und so deine Meinung mit unserer Community teilen. 
        Falls du Fragen hast, wende dich bitte über den Button oben rechts an unseren Support. 
        Nun wünschen wir Dir viel Spass beim Stöbern und gute Unterhaltung bei deinem nächsten Kinobesuch!
        Liebe Grüsse
        Dein CineSearch Team
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/vue';

</script>