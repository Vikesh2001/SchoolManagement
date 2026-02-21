<template>
  <article class="card fade-up">
    <h3>{{ title }}</h3>
    <p>{{ description }}</p>
    <ul>
      <li v-for="item in bullets" :key="item">{{ item }}</li>
    </ul>
  </article>
</template>

<script setup>
defineProps({
  title: String,
  description: String,
  bullets: Array
});
</script>
