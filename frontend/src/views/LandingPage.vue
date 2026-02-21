<template>
  <section class="hero fade-up">
    <div>
      <p class="eyebrow">All-in-One School Management</p>
      <h2>Modern digital campus for students, teachers, parents & admins</h2>
      <p>
        Responsive, secure and fast platform with role-based dashboards, communication,
        online classes, exams, finance and analytics.
      </p>
      <div class="cta-row">
        <RouterLink class="btn" to="/dashboard/admin">Admin Dashboard</RouterLink>
        <RouterLink class="btn secondary" to="/features">Explore Features</RouterLink>
      </div>
    </div>
    <div class="wireframe">
      <h4>Wireframe Snapshot</h4>
      <pre>
+------------------------------------------------+
| Top Nav | Search | Alerts | Profile            |
+---------------------+--------------------------+
| Sidebar             | Dashboard widgets        |
| - Attendance        | [KPIs] [Notices]         |
| - Classes           | [Assignments] [Results]  |
| - Fees              | [Calendar] [Messages]    |
+---------------------+--------------------------+
      </pre>
    </div>
  </section>
</template>
