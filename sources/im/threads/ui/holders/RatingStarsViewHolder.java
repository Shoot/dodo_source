package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import im.threads.R;
import im.threads.business.models.Survey;
import im.threads.ui.widget.Rating;
/* loaded from: classes3.dex */
public final class RatingStarsViewHolder extends BaseHolder {
    private TextView askForRate;
    private Rating rating;
    private TextView thanksForRate;

    public RatingStarsViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_rate_stars, viewGroup, false), null, null);
        this.rating = (Rating) this.itemView.findViewById(R.id.mark);
        this.askForRate = (TextView) this.itemView.findViewById(R.id.ask_for_rate);
        this.thanksForRate = (TextView) this.itemView.findViewById(R.id.thanks_for_rate);
        this.askForRate.setTextColor(iu1.c(this.itemView.getContext(), getStyle().surveyTextColorResId));
        this.thanksForRate.setTextColor(iu1.c(this.itemView.getContext(), getStyle().surveyTextColorResId));
    }

    public void bind(Survey survey, Rating.CallBackListener callBackListener) {
        int i;
        int i2 = 0;
        int scale = survey.getQuestions().get(0).getScale();
        if (survey.getQuestions().get(0).getRate() != null) {
            i = survey.getQuestions().get(0).getRate().intValue();
        } else {
            i = -1;
        }
        this.rating.initRating(this.itemView.getContext(), i, scale);
        this.askForRate.setText(survey.getQuestions().get(0).getText());
        boolean hasRate = survey.getQuestions().get(0).hasRate();
        this.rating.setListenerClick(callBackListener);
        TextView textView = this.thanksForRate;
        if (!hasRate) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }
}
