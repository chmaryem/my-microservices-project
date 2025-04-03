package tn.esprit.feedbacks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FeedBacks")
public class FeedBackRestController {
    @Autowired
    private FeedBackService feedbackService;

    @PostMapping
    public ResponseEntity<FeedBack> addFeedback(@RequestBody FeedBack feedback) {
        return ResponseEntity.ok(feedbackService.addFeedback(feedback));
    }

    @GetMapping("/training/{trainingId}")
    public ResponseEntity<List<FeedBack>> getFeedbacksByTraining(@PathVariable Long trainingId) {
        return ResponseEntity.ok(feedbackService.getFeedbacksByTraining(trainingId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFeedback(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public List<FeedBack> getFeedBacks() {
        return feedbackService.getAllFeedBacks();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FeedBack> updateFeedback(@PathVariable Long id, @RequestBody FeedBack feedback) {
        return ResponseEntity.ok(feedbackService.updateFeedback(id, feedback));
    }


}
