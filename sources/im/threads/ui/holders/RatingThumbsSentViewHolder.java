package im.threads.ui.holders;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.Survey;
import im.threads.ui.utils.ColorFilterKotlinExtKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: RatingThumbsSentViewHolder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lim/threads/ui/holders/RatingThumbsSentViewHolder;", "Lim/threads/ui/holders/BaseHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bubble", "header", "Landroid/widget/TextView;", "sdf", "Ljava/text/SimpleDateFormat;", "thumb", "Landroid/widget/ImageView;", "timeStampTextView", "bind", "", "survey", "Lim/threads/business/models/Survey;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RatingThumbsSentViewHolder extends BaseHolder {
    private final ViewGroup bubble;
    private final TextView header;
    private final SimpleDateFormat sdf;
    private final ImageView thumb;
    private final TextView timeStampTextView;

    /* compiled from: RatingThumbsSentViewHolder.kt */
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
    public RatingThumbsSentViewHolder(android.view.ViewGroup r7) {
        /*
            r6 = this;
            java.lang.String r0 = "parent"
            defpackage.z65.h(r7, r0)
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = im.threads.R.layout.ecc_item_rate_thumbs_sent
            r2 = 0
            android.view.View r7 = r0.inflate(r1, r7, r2)
            java.lang.String r0 = "from(parent.context).inf…umbs_sent, parent, false)"
            defpackage.z65.g(r7, r0)
            r0 = 0
            r6.<init>(r7, r0, r0)
            android.view.View r7 = r6.itemView
            int r1 = im.threads.R.id.thumb
            android.view.View r7 = r7.findViewById(r1)
            java.lang.String r1 = "itemView.findViewById(R.id.thumb)"
            defpackage.z65.g(r7, r1)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.thumb = r7
            android.view.View r7 = r6.itemView
            int r1 = im.threads.R.id.header
            android.view.View r7 = r7.findViewById(r1)
            java.lang.String r1 = "itemView.findViewById(R.id.header)"
            defpackage.z65.g(r7, r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.header = r7
            android.view.View r1 = r6.itemView
            int r3 = im.threads.R.id.timestamp
            android.view.View r1 = r1.findViewById(r3)
            java.lang.String r3 = "itemView.findViewById(R.id.timestamp)"
            defpackage.z65.g(r1, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.timeStampTextView = r1
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "HH:mm"
            java.util.Locale r5 = java.util.Locale.getDefault()
            r3.<init>(r4, r5)
            r6.sdf = r3
            android.view.View r3 = r6.itemView
            int r4 = im.threads.R.id.bubble
            android.view.View r3 = r3.findViewById(r4)
            java.lang.String r4 = "itemView.findViewById(R.id.bubble)"
            defpackage.z65.g(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r6.bubble = r3
            android.view.View r4 = r6.itemView
            android.content.Context r4 = r4.getContext()
            im.threads.ui.ChatStyle r5 = r6.getStyle()
            int r5 = r5.outgoingMessageBubbleBackground
            android.graphics.drawable.Drawable r4 = defpackage.on.b(r4, r5)
            r3.setBackground(r4)
            r6.setPaddings(r2, r3)
            r6.setLayoutMargins(r2, r3)
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            java.lang.String r4 = "bubble.background"
            defpackage.z65.g(r3, r4)
            im.threads.ui.ChatStyle r4 = r6.getStyle()
            int r4 = r4.outgoingMessageBubbleColor
            int r4 = r6.getColorInt(r4)
            r5 = 2
            im.threads.ui.utils.ColorFilterKotlinExtKt.applyColorFilter$default(r3, r4, r0, r5, r0)
            r0 = 1
            android.widget.TextView[] r0 = new android.widget.TextView[r0]
            r0[r2] = r7
            im.threads.ui.ChatStyle r7 = r6.getStyle()
            int r7 = r7.outgoingMessageTextColor
            r6.setTextColorToViews(r0, r7)
            im.threads.ui.ChatStyle r7 = r6.getStyle()
            int r7 = r7.outgoingMessageTimeColor
            int r7 = r6.getColorInt(r7)
            r1.setTextColor(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.RatingThumbsSentViewHolder.<init>(android.view.ViewGroup):void");
    }

    public final void bind(Survey survey) {
        QuestionDTO questionDTO;
        Integer num;
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
        if (num != null && num.intValue() == 1) {
            this.thumb.setImageResource(getStyle().binarySurveyLikeSelectedIconResId);
        } else {
            this.thumb.setImageResource(getStyle().binarySurveyDislikeSelectedIconResId);
        }
        this.thumb.setColorFilter(iu1.c(this.itemView.getContext(), getStyle().surveyFinalColorFilterResId), PorterDuff.Mode.SRC_ATOP);
        TextView textView = this.header;
        if (questionDTO != null) {
            str = questionDTO.getText();
        } else {
            str = null;
        }
        textView.setText(str);
        this.timeStampTextView.setText(this.sdf.format(new Date(survey.getTimeStamp())));
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
