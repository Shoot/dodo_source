package im.threads.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.widget.Rating;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: Rating.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lim/threads/ui/widget/Rating;", "Landroid/widget/LinearLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "countStars", "", "ratingCount", "style", "Lim/threads/ui/ChatStyle;", "viewsStar", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "deleteClickListeners", "", "initRating", "setClickListeners", "callBackListener", "Lim/threads/ui/widget/Rating$CallBackListener;", "setImage", "view", "ratingState", "", "setListenerClick", "CallBackListener", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Rating extends LinearLayout {
    private int countStars;
    private int ratingCount;
    private final ChatStyle style;
    private ArrayList<View> viewsStar;

    /* compiled from: Rating.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lim/threads/ui/widget/Rating$CallBackListener;", "", "onStarClick", "", "ratingCount", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface CallBackListener {
        void onStarClick(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rating(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.style = Config.Companion.getInstance().getChatStyle();
        this.viewsStar = new ArrayList<>();
    }

    private final void deleteClickListeners() {
        int i = this.countStars;
        for (int i2 = 0; i2 < i; i2++) {
            this.viewsStar.get(i2).setOnClickListener(null);
        }
    }

    private final void setClickListeners(final CallBackListener callBackListener) {
        int i = this.countStars;
        int i2 = 0;
        while (i2 < i) {
            final int i3 = i2 + 1;
            this.viewsStar.get(i2).setOnClickListener(new View.OnClickListener() { // from class: a59
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Rating.setClickListeners$lambda$0(Rating.this, i3, callBackListener, view);
                }
            });
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListeners$lambda$0(Rating rating, int i, CallBackListener callBackListener, View view) {
        boolean z;
        z65.h(rating, "this$0");
        z65.h(callBackListener, "$callBackListener");
        if (rating.isEnabled()) {
            int i2 = rating.countStars;
            for (int i3 = 0; i3 < i2; i3++) {
                View view2 = rating.viewsStar.get(i3);
                z65.g(view2, "viewsStar[j]");
                View view3 = view2;
                if (i3 < i) {
                    z = true;
                } else {
                    z = false;
                }
                rating.setImage(view3, z);
            }
            rating.ratingCount = i;
            callBackListener.onStarClick(i);
        }
    }

    private final void setImage(View view, boolean z) {
        ImageView imageView = (ImageView) view.findViewById(R.id.star);
        if (z) {
            imageView.setImageResource(this.style.optionsSurveySelectedIconResId);
            ColorsHelper.setTint(getContext(), imageView, this.style.surveySelectedColorFilterResId);
            return;
        }
        imageView.setImageResource(this.style.optionsSurveyUnselectedIconResId);
        if (this.ratingCount == 0) {
            ColorsHelper.setTint(getContext(), imageView, this.style.surveyUnselectedColorFilterResId);
        }
    }

    public final void initRating(Context context, int i, int i2) {
        boolean z;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.ratingCount = i;
        this.countStars = i2;
        LayoutInflater from = LayoutInflater.from(context);
        removeAllViews();
        this.viewsStar.clear();
        for (int i3 = 0; i3 < i2; i3++) {
            View inflate = from.inflate(R.layout.ecc_rating_star, (ViewGroup) this, false);
            z65.g(inflate, "view");
            if (i3 < i) {
                z = true;
            } else {
                z = false;
            }
            setImage(inflate, z);
            this.viewsStar.add(inflate);
            addView(inflate);
        }
    }

    public final void setListenerClick(CallBackListener callBackListener) {
        if (callBackListener != null) {
            setClickListeners(callBackListener);
        } else {
            deleteClickListeners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rating(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.style = Config.Companion.getInstance().getChatStyle();
        this.viewsStar = new ArrayList<>();
    }
}
