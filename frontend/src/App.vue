<template>
  <div :class="['app-shell', mode]">
    <header class="top-nav">
      <h1>SchoolHub</h1>
      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/features">Features</RouterLink>
      </nav>
      <button @click="toggleMode" class="mode-btn">{{ modeLabel }}</button>
    </header>
    <main>
      <RouterView />
    </main>
  </div>
</template>

<script setup>
import { computed, ref } from 'vue';

const mode = ref('light');
const modeLabel = computed(() => (mode.value === 'light' ? 'Dark Mode' : 'Light Mode'));
const toggleMode = () => {
  mode.value = mode.value === 'light' ? 'dark' : 'light';
};
</script>
