package tn.esprit.feedbacks;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FeedBack {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;
    private Long trainingId;
    private int rating;
    private String comment;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
