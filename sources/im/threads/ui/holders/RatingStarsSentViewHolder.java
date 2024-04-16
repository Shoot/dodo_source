package im.threads.ui.holders;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.Survey;
import im.threads.ui.utils.ColorFilterKotlinExtKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: RatingStarsSentViewHolder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lim/threads/ui/holders/RatingStarsSentViewHolder;", "Lim/threads/ui/holders/BaseHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", RemoteMessageConst.FROM, "Landroid/widget/TextView;", "mBubble", "mHeader", "rateStarsCount", "sdf", "Ljava/text/SimpleDateFormat;", "star", "Landroid/widget/ImageView;", "timeStampTextView", "totalStarsCount", "bind", "", "survey", "Lim/threads/business/models/Survey;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RatingStarsSentViewHolder extends BaseHolder {
    private final TextView from;
    private final ViewGroup mBubble;
    private final TextView mHeader;
    private final TextView rateStarsCount;
    private final SimpleDateFormat sdf;
    private final ImageView star;
    private final TextView timeStampTextView;
    private final TextView totalStarsCount;

    /* compiled from: RatingStarsSentViewHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStatus.values().length];
            try {
                iArr[MessageStatus.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStatus.SENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageStatus.DELIVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageStatus.READ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RatingStarsSentViewHolder(android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.RatingStarsSentViewHolder.<init>(android.view.ViewGroup):void");
    }

    public final void bind(Survey survey) {
        QuestionDTO questionDTO;
        Integer num;
        Integer num2;
        String str;
        Object Z;
        z65.h(survey, "survey");
        if (survey.isRead()) {
            survey.setSentState(MessageStatus.READ);
        }
        ArrayList<QuestionDTO> questions = survey.getQuestions();
        if (questions != null) {
            Z = sc1.Z(questions);
            questionDTO = (QuestionDTO) Z;
        } else {
            questionDTO = null;
        }
        if (questionDTO != null) {
            num = questionDTO.getRate();
        } else {
            num = null;
        }
        if (questionDTO != null) {
            num2 = Integer.valueOf(questionDTO.getScale());
        } else {
            num2 = null;
        }
        this.rateStarsCount.setText(String.valueOf(num));
        this.totalStarsCount.setText(String.valueOf(num2));
        this.timeStampTextView.setText(this.sdf.format(new Date(survey.getTimeStamp())));
        TextView textView = this.mHeader;
        if (questionDTO != null) {
            str = questionDTO.getText();
        } else {
            str = null;
        }
        textView.setText(str);
        int i = WhenMappings.$EnumSwitchMapping$0[survey.getSentState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            Drawable b = on.b(this.itemView.getContext(), getStyle().messageFailedIconResId);
                            if (b != null) {
                                ColorFilterKotlinExtKt.applyColorFilter$default(b, iu1.c(this.itemView.getContext(), getStyle().messageFailedIconColorResId), null, 2, null);
                            }
                            this.timeStampTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b, (Drawable) null);
                            return;
                        }
                        return;
                    }
                    Drawable b2 = on.b(this.itemView.getContext(), getStyle().messageReadIconResId);
                    if (b2 != null) {
                        ColorFilterKotlinExtKt.applyColorFilter$default(b2, iu1.c(this.itemView.getContext(), getStyle().messageReadIconColorResId), null, 2, null);
                    }
                    this.timeStampTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b2, (Drawable) null);
                    return;
                }
                Drawable b3 = on.b(this.itemView.getContext(), getStyle().messageDeliveredIconResId);
                if (b3 != null) {
                    ColorFilterKotlinExtKt.applyColorFilter$default(b3, iu1.c(this.itemView.getContext(), getStyle().messageDeliveredIconColorResId), null, 2, null);
                }
                this.timeStampTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b3, (Drawable) null);
                return;
            }
            Drawable b4 = on.b(this.itemView.getContext(), getStyle().messageSentIconResId);
            if (b4 != null) {
                ColorFilterKotlinExtKt.applyColorFilter$default(b4, iu1.c(this.itemView.getContext(), getStyle().messageSentIconColorResId), null, 2, null);
            }
            this.timeStampTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b4, (Drawable) null);
            return;
        }
        Drawable b5 = on.b(this.itemView.getContext(), getStyle().messageSendingIconResId);
        if (b5 != null) {
            ColorFilterKotlinExtKt.applyColorFilter$default(b5, iu1.c(this.itemView.getContext(), getStyle().messageSendingIconColorResId), null, 2, null);
        }
        this.timeStampTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b5, (Drawable) null);
    }
}
