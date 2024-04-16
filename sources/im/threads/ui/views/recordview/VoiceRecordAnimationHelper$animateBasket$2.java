package im.threads.ui.views.recordview;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import im.threads.ui.views.recordview.VoiceRecordAnimationHelper;
import im.threads.ui.views.recordview.VoiceRecordAnimationHelper$animateBasket$2;
import kotlin.Metadata;
/* compiled from: VoiceRecordAnimationHelper.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"im/threads/ui/views/recordview/VoiceRecordAnimationHelper$animateBasket$2", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VoiceRecordAnimationHelper$animateBasket$2 implements Animation.AnimationListener {
    final /* synthetic */ VoiceRecordAnimationHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VoiceRecordAnimationHelper$animateBasket$2(VoiceRecordAnimationHelper voiceRecordAnimationHelper) {
        this.this$0 = voiceRecordAnimationHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(VoiceRecordAnimationHelper voiceRecordAnimationHelper) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        TranslateAnimation translateAnimation;
        z65.h(voiceRecordAnimationHelper, "this$0");
        imageView = voiceRecordAnimationHelper.basketImg;
        if (imageView != null) {
            translateAnimation = voiceRecordAnimationHelper.translateAnimation2;
            imageView.startAnimation(translateAnimation);
        }
        imageView2 = voiceRecordAnimationHelper.smallBlinkingMic;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        imageView3 = voiceRecordAnimationHelper.basketImg;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        pk pkVar;
        Handler handler;
        z65.h(animation, "animation");
        pkVar = this.this$0.animatedVectorDrawable;
        if (pkVar != null) {
            pkVar.start();
        }
        this.this$0.handler2 = new Handler(Looper.getMainLooper());
        handler = this.this$0.handler2;
        if (handler != null) {
            final VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.this$0;
            handler.postDelayed(new Runnable() { // from class: c2c
                @Override // java.lang.Runnable
                public final void run() {
                    VoiceRecordAnimationHelper$animateBasket$2.onAnimationEnd$lambda$0(VoiceRecordAnimationHelper.this);
                }
            }, 450L);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        z65.h(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        z65.h(animation, "animation");
    }
}
