package com.challenge.meisters.task;

import jakarta.persistence.*;

import lombok.*;

@Table(name = "tasks")
@Entity(name = "Task")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Task(TaskRegistrationData data) {
        this.title = data.title();
        this.description = data.description();
        this.status = data.status();
    }
}
