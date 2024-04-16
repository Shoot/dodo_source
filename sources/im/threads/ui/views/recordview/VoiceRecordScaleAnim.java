package im.threads.ui.views.recordview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.Metadata;
/* compiled from: VoiceRecordScaleAnim.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/ui/views/recordview/VoiceRecordScaleAnim;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "scaleUpTo", "", "setScaleUpTo", "", "start", "stop", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VoiceRecordScaleAnim {
    private float scaleUpTo;
    private final View view;

    public VoiceRecordScaleAnim(View view) {
        z65.h(view, "view");
        this.view = view;
        this.scaleUpTo = 2.0f;
    }

    public final void setScaleUpTo(float f) {
        this.scaleUpTo = f;
    }

    public final void start() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, "scaleY", this.scaleUpTo), ObjectAnimator.ofFloat(this.view, "scaleX", this.scaleUpTo));
        animatorSet.start();
    }

    public final void stop() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, "scaleY", 1.0f), ObjectAnimator.ofFloat(this.view, "scaleX", 1.0f));
        animatorSet.start();
    }
}
