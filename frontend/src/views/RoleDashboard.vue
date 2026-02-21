<template>
  <section>
    <h2 class="fade-up">{{ title }} Dashboard</h2>
    <div class="grid">
      <article class="card" v-for="widget in widgets" :key="widget.title">
        <h3>{{ widget.title }}</h3>
        <p>{{ widget.value }}</p>
        <small>{{ widget.helper }}</small>
      </article>
    </div>
  </section>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({ role: String });
const roleName = computed(() => (props.role || 'student').toLowerCase());
const title = computed(() => roleName.value.charAt(0).toUpperCase() + roleName.value.slice(1));

const roleWidgets = {
  admin: [
    { title: 'Total Students', value: '1,280', helper: 'Enrollment active' },
    { title: 'Fee Collection', value: '92%', helper: 'Current month' },
    { title: 'Transport Routes', value: '18 Live', helper: 'GPS enabled buses' }
  ],
  teacher: [
    { title: 'Today Classes', value: '6', helper: '2 online sessions' },
    { title: 'Pending Grading', value: '24 papers', helper: 'Due this week' },
    { title: 'Parent Messages', value: '9 unread', helper: 'Respond quickly' }
  ],
  parent: [
    { title: 'Attendance', value: '97%', helper: 'This month' },
    { title: 'Fee Status', value: 'Paid', helper: 'Next due 15th' },
    { title: 'Teacher Notes', value: '3 updates', helper: 'Academic progress' }
  ],
  student: [
    { title: 'Assignments', value: '5 pending', helper: '2 due tomorrow' },
    { title: 'Exam Average', value: '86%', helper: 'AI trend: improving' },
    { title: 'Library Books', value: '2 issued', helper: 'Return in 7 days' }
  ]
};

const widgets = computed(() => roleWidgets[roleName.value] || roleWidgets.student);
</script>
