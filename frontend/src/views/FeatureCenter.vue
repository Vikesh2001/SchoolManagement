<template>
  <section>
    <h2 class="fade-up">Core Modules</h2>
    <div class="grid">
      <FeatureCard
        v-for="feature in features"
        :key="feature.title"
        :title="feature.title"
        :description="feature.description"
        :bullets="feature.bullets"
      />
    </div>
  </section>
</template>

<script setup>
import FeatureCard from '../components/FeatureCard.vue';

const features = [
  { title: 'Student Management', description: 'Admissions, records and profile lifecycle.', bullets: ['Enrollment', 'Documents', 'Academic history'] },
  { title: 'Attendance Tracking', description: 'Daily attendance and parent notification flows.', bullets: ['QR/Biometric ready', 'Auto reports', 'Alerts'] },
  { title: 'Online Learning', description: 'Live classes, recordings and assignment workflow.', bullets: ['Meeting links', 'Study material', 'Homework submission'] },
  { title: 'Exam & Results', description: 'Online exams, grading and report cards.', bullets: ['Marks entry', 'Analytics', 'Performance charts'] },
  { title: 'Fee Management', description: 'Invoices, online payment and history.', bullets: ['Gateway integration', 'Receipts', 'Due reminders'] },
  { title: 'Communication', description: 'Messages, notices, push/email/SMS alerts.', bullets: ['Role-based chat', 'Broadcast', 'Escalation'] }
];
</script>
