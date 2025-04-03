package tn.esprit.feedbacks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {
    List<FeedBack> findByTrainingId(Long trainingId);
    List<FeedBack> findByUserId(Long userId);

}
