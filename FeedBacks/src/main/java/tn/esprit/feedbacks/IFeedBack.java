package tn.esprit.feedbacks;

import java.util.List;

public interface IFeedBack {
    public FeedBack addFeedback(FeedBack feedback);
    public List<FeedBack> getFeedbacksByTraining(Long trainingId);
    public void deleteFeedback(Long feedbackId);
    public List<FeedBack> getAllFeedBacks();
}
