package com.schoolmanagement.service;

import com.schoolmanagement.dto.DesignBlueprint;
import com.schoolmanagement.dto.FeatureModule;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BlueprintService {

    public DesignBlueprint getBlueprint() {
        return new DesignBlueprint(
            List.of("Student", "Teacher", "Parent", "Admin", "Staff"),
            List.of(
                new FeatureModule("Dashboard", "Role-based insights", List.of("Attendance KPI", "Assignments", "Notices")),
                new FeatureModule("Attendance", "Track and alert", List.of("Daily logs", "Parent alerts", "Automated reports")),
                new FeatureModule("Online Learning", "Virtual classroom", List.of("Live classes", "Recorded lectures", "Homework flow")),
                new FeatureModule("Exams", "Assessment lifecycle", List.of("Online tests", "Grading", "Report cards"))
            ),
            Map.of(
                "Student", List.of("Login", "Dashboard", "Assignments", "Exam result", "Messages"),
                "Teacher", List.of("Login", "Class planner", "Attendance", "Gradebook", "Parent communication"),
                "Parent", List.of("Login", "Child progress", "Fee payment", "Notifications")
            ),
            Map.of(
                "users", List.of("id", "role", "name", "email", "phone", "two_factor_enabled"),
                "students", List.of("id", "admission_no", "class_id", "guardian_id"),
                "attendance", List.of("id", "student_id", "date", "status", "check_in_source"),
                "fees", List.of("id", "student_id", "invoice_no", "amount", "payment_status")
            ),
            List.of(
                "Frontend: Vue 3 + Vue Router + Vite",
                "Backend: Spring Boot REST API",
                "Database: PostgreSQL",
                "Auth: JWT + OTP/2FA",
                "Cloud: Docker + Kubernetes + object storage backups"
            )
        );
    }
}
