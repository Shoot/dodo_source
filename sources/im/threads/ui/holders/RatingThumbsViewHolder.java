package im.threads.ui.holders;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import im.threads.R;
import im.threads.business.models.Survey;
import im.threads.ui.adapters.ChatAdapter;
/* loaded from: classes3.dex */
public final class RatingThumbsViewHolder extends BaseHolder {
    private TextView askForRate;
    private TextView thanksForRate;
    private ImageView thumbDown;
    private ImageView thumbUp;

    public RatingThumbsViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_rate_thumbs, viewGroup, false), null, null);
        this.thumbUp = (ImageView) this.itemView.findViewById(R.id.thumb_up);
        this.thumbDown = (ImageView) this.itemView.findViewById(R.id.thumb_down);
        this.askForRate = (TextView) this.itemView.findViewById(R.id.ask_for_rate);
        this.thanksForRate = (TextView) this.itemView.findViewById(R.id.thanks_for_rate);
        this.askForRate.setTextColor(iu1.c(this.itemView.getContext(), getStyle().surveyTextColorResId));
        this.thanksForRate.setTextColor(iu1.c(this.itemView.getContext(), getStyle().surveyTextColorResId));
        ImageView imageView = this.thumbUp;
        int c = iu1.c(this.itemView.getContext(), getStyle().surveyUnselectedColorFilterResId);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        imageView.setColorFilter(c, mode);
        this.thumbDown.setColorFilter(iu1.c(this.itemView.getContext(), getStyle().surveyUnselectedColorFilterResId), mode);
    }

    public void bind(final Survey survey, final ChatAdapter.Callback callback) {
        int i = 0;
        this.askForRate.setText(survey.getQuestions().get(0).getText());
        boolean hasRate = survey.getQuestions().get(0).hasRate();
        if (hasRate && survey.getQuestions().get(0).getRate().intValue() == 1) {
            this.thumbUp.setImageResource(getStyle().binarySurveyLikeSelectedIconResId);
            this.thumbUp.setColorFilter(iu1.c(this.itemView.getContext(), getStyle().surveySelectedColorFilterResId), PorterDuff.Mode.SRC_ATOP);
        } else {
            this.thumbUp.setImageResource(getStyle().binarySurveyLikeUnselectedIconResId);
            this.thumbUp.setColorFilter(iu1.c(this.itemView.getContext(), getStyle().surveyUnselectedColorFilterResId), PorterDuff.Mode.SRC_ATOP);
        }
        if (hasRate && survey.getQuestions().get(0).getRate().intValue() == 0) {
            this.thumbDown.setImageResource(getStyle().binarySurveyDislikeSelectedIconResId);
            this.thumbDown.setColorFilter(iu1.c(this.itemView.getContext(), getStyle().surveySelectedColorFilterResId), PorterDuff.Mode.SRC_ATOP);
        } else {
            this.thumbDown.setImageResource(getStyle().binarySurveyDislikeUnselectedIconResId);
            this.thumbDown.setColorFilter(iu1.c(this.itemView.getContext(), getStyle().surveyUnselectedColorFilterResId), PorterDuff.Mode.SRC_ATOP);
        }
        TextView textView = this.thanksForRate;
        if (!hasRate) {
            i = 8;
        }
        textView.setVisibility(i);
        if (!hasRate) {
            this.thumbUp.setOnClickListener(new View.OnClickListener() { // from class: t69
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatAdapter.Callback.this.onRatingClick(survey, 1);
                }
            });
            this.thumbDown.setOnClickListener(new View.OnClickListener() { // from class: u69
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatAdapter.Callback.this.onRatingClick(survey, 0);
                }
            });
        }
    }
}
