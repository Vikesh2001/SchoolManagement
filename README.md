# School Management Platform (Vue + Spring Boot)

A modern, responsive and role-oriented school management solution for **Students, Teachers, Parents, Admins and Staff**.

## 1) Product Design

### Core UX Principles
- Mobile-first layout with responsive cards and adaptive grids.
- Soft color palette, clean typography and low-cognitive-load navigation.
- Light/Dark mode toggle.
- Smooth micro animations (`fadeUp`) and minimal-click workflows.

### Wireframes

#### A. Platform Shell
```text
+--------------------------------------------------------+
| Logo | Home | Features | Alerts | Profile | Theme      |
+-----------------------+--------------------------------+
| Left Sidebar          | Main content area              |
| - Dashboard           | - KPI cards                    |
| - Attendance          | - Assignments                  |
| - Exams               | - Notices                      |
| - Fees                | - Communication panel          |
+-----------------------+--------------------------------+
```

#### B. Role Dashboard Card Layout
```text
+------------------+  +------------------+  +------------------+
| Attendance       |  | Assignment       |  | Fee status        |
| 97%              |  | 5 pending        |  | Paid              |
+------------------+  +------------------+  +------------------+
```

### UI Mockup Mapping (Implemented Screens)
- `/` → Hero + wireframe preview + CTA flow.
- `/dashboard/:role` → Dynamic dashboard for admin/teacher/student/parent.
- `/features` → Core module cards (student mgmt, attendance, learning, exams, fees, communication).

## 2) Feature Explanation

### Implemented in Frontend
- Role-based dashboards with quick KPIs.
- Feature center for module discovery.
- Theme switching (light/dark).
- Responsive navigation and grid cards.

### Blueprinted in Backend API
- Design endpoint provides target users, modules, user flows, database schema and stack guidance.
- Health endpoint for monitoring.

## 3) Technology Stack
- **Frontend:** Vue 3, Vue Router, Vite, CSS (mobile-first).
- **Backend:** Java 17, Spring Boot 3 (Web, Validation, Security).
- **Database (planned):** PostgreSQL.
- **Security (planned):** JWT + OTP/2FA, encryption at rest/in transit.
- **Ops (planned):** Docker/Kubernetes, cloud backups.

## 4) Database Structure (Conceptual)
- `users(id, role, name, email, phone, two_factor_enabled)`
- `students(id, admission_no, class_id, guardian_id)`
- `attendance(id, student_id, date, status, check_in_source)`
- `fees(id, student_id, invoice_no, amount, payment_status)`

## 5) User Flow
- **Student:** Login → Dashboard → Assignments → Results → Messages.
- **Teacher:** Login → Planner → Attendance → Gradebook → Parent Communication.
- **Parent:** Login → Child Progress → Fee Payment → Notifications.
- **Admin:** Login → Institution KPIs → Enrollment/Fees/Transport → Reports.

## 6) Responsive Layout
- Breakpoint at `800px` collapses hero into one column.
- Auto-fit feature cards using `repeat(auto-fit, minmax(220px, 1fr))`.
- Sticky top navigation for quick access.

## Project Structure
```text
frontend/   # Vue SPA UI
backend/    # Spring Boot API
```

## Run Locally

### Frontend
```bash
cd frontend
npm install
npm run dev
```

### Backend
```bash
cd backend
mvn spring-boot:run
```

### API Endpoints
- `GET /api/health`
- `GET /api/design`
