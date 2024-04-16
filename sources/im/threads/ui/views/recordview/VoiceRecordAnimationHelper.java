package im.threads.ui.views.recordview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.R;
import im.threads.ui.utils.ColorFilterKotlinExtKt;
import im.threads.ui.utils.ColorFilterMode;
import im.threads.ui.views.recordview.VoiceRecordAnimationHelper;
import im.threads.ui.views.recordview.VoiceRecordButton;
import kotlin.Metadata;
/* compiled from: VoiceRecordAnimationHelper.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010#\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0004J:\u0010\u0018\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0006R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010'R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=¨\u0006A"}, d2 = {"Lim/threads/ui/views/recordview/VoiceRecordAnimationHelper;", "", "", RemoteMessageConst.Notification.COLOR, "", "setTrashIconColor", "", "recordButtonGrowingAnimationEnabled", "setRecordButtonGrowingAnimationEnabled", "", "basketInitialY", "animateBasket", "resetBasketAnimation", "hideView", "clearAlphaAnimation", "animateSmallMicAlpha", "Lim/threads/ui/views/recordview/VoiceRecordButton;", "recordBtn", "Landroid/widget/FrameLayout;", "slideToCancelLayout", "initialX", "initialY", "difX", "setY", "moveRecordButtonAndSlideToCancelBack", "resetSmallMic", "Lim/threads/ui/views/recordview/VoiceRecordOnBasketAnimationEnd;", "onBasketAnimationEndListener", "setOnBasketAnimationEndListener", "onAnimationEnd", "startRecorded", "setStartRecorded", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Landroid/widget/ImageView;", "basketImg", "Landroid/widget/ImageView;", "smallBlinkingMic", "Z", "Lpk;", "animatedVectorDrawable", "Lpk;", "Landroid/view/animation/AlphaAnimation;", "alphaAnimation", "Landroid/view/animation/AlphaAnimation;", "Lim/threads/ui/views/recordview/VoiceRecordOnBasketAnimationEnd;", "isBasketAnimating", "isStartRecorded", "micX", "F", "micY", "Landroid/animation/AnimatorSet;", "micAnimation", "Landroid/animation/AnimatorSet;", "Landroid/view/animation/TranslateAnimation;", "translateAnimation1", "Landroid/view/animation/TranslateAnimation;", "translateAnimation2", "Landroid/os/Handler;", "handler1", "Landroid/os/Handler;", "handler2", "<init>", "(Landroid/content/Context;Landroid/widget/ImageView;Landroid/widget/ImageView;Z)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class VoiceRecordAnimationHelper {
    private AlphaAnimation alphaAnimation;
    private final pk animatedVectorDrawable;
    private final ImageView basketImg;
    private final Context context;
    private Handler handler1;
    private Handler handler2;
    private boolean isBasketAnimating;
    private boolean isStartRecorded;
    private AnimatorSet micAnimation;
    private float micX;
    private float micY;
    private VoiceRecordOnBasketAnimationEnd onBasketAnimationEndListener;
    private boolean recordButtonGrowingAnimationEnabled;
    private final ImageView smallBlinkingMic;
    private TranslateAnimation translateAnimation1;
    private TranslateAnimation translateAnimation2;

    public VoiceRecordAnimationHelper(Context context, ImageView imageView, ImageView imageView2, boolean z) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        this.basketImg = imageView;
        this.smallBlinkingMic = imageView2;
        this.recordButtonGrowingAnimationEnabled = z;
        this.animatedVectorDrawable = pk.a(context, R.drawable.recv_basket_animated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBasket$lambda$0(VoiceRecordAnimationHelper voiceRecordAnimationHelper) {
        z65.h(voiceRecordAnimationHelper, "this$0");
        ImageView imageView = voiceRecordAnimationHelper.basketImg;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = voiceRecordAnimationHelper.basketImg;
        if (imageView2 != null) {
            imageView2.startAnimation(voiceRecordAnimationHelper.translateAnimation1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveRecordButtonAndSlideToCancelBack$lambda$1(VoiceRecordButton voiceRecordButton, boolean z, float f, ValueAnimator valueAnimator) {
        z65.h(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        if (voiceRecordButton != null) {
            voiceRecordButton.setX(floatValue);
        }
        if (z && voiceRecordButton != null) {
            voiceRecordButton.setY(f);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void animateBasket(float f) {
        ImageView imageView;
        this.isBasketAnimating = true;
        clearAlphaAnimation(false);
        if (this.micX == 0.0f && (imageView = this.smallBlinkingMic) != null) {
            this.micX = imageView.getX();
            this.micY = this.smallBlinkingMic.getY();
        }
        Animator i = xk.i(this.context, R.animator.ecc_delete_mic_animation);
        z65.f(i, "null cannot be cast to non-null type android.animation.AnimatorSet");
        AnimatorSet animatorSet = (AnimatorSet) i;
        this.micAnimation = animatorSet;
        if (animatorSet != null) {
            animatorSet.setTarget(this.smallBlinkingMic);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f - 90);
        this.translateAnimation1 = translateAnimation;
        translateAnimation.setDuration(250L);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, f - 130, f);
        this.translateAnimation2 = translateAnimation2;
        translateAnimation2.setDuration(350L);
        AnimatorSet animatorSet2 = this.micAnimation;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        ImageView imageView2 = this.basketImg;
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.animatedVectorDrawable);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler1 = handler;
        handler.postDelayed(new Runnable() { // from class: a2c
            @Override // java.lang.Runnable
            public final void run() {
                VoiceRecordAnimationHelper.animateBasket$lambda$0(VoiceRecordAnimationHelper.this);
            }
        }, 350L);
        TranslateAnimation translateAnimation3 = this.translateAnimation1;
        if (translateAnimation3 != null) {
            translateAnimation3.setAnimationListener(new VoiceRecordAnimationHelper$animateBasket$2(this));
        }
        TranslateAnimation translateAnimation4 = this.translateAnimation2;
        if (translateAnimation4 != null) {
            translateAnimation4.setAnimationListener(new Animation.AnimationListener() { // from class: im.threads.ui.views.recordview.VoiceRecordAnimationHelper$animateBasket$3
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
                    r2 = r1.this$0.onBasketAnimationEndListener;
                 */
                @Override // android.view.animation.Animation.AnimationListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onAnimationEnd(android.view.animation.Animation r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "animation"
                        defpackage.z65.h(r2, r0)
                        im.threads.ui.views.recordview.VoiceRecordAnimationHelper r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.this
                        android.widget.ImageView r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.access$getBasketImg$p(r2)
                        if (r2 != 0) goto Le
                        goto L12
                    Le:
                        r0 = 4
                        r2.setVisibility(r0)
                    L12:
                        im.threads.ui.views.recordview.VoiceRecordAnimationHelper r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.this
                        r0 = 0
                        im.threads.ui.views.recordview.VoiceRecordAnimationHelper.access$setBasketAnimating$p(r2, r0)
                        im.threads.ui.views.recordview.VoiceRecordAnimationHelper r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.this
                        im.threads.ui.views.recordview.VoiceRecordOnBasketAnimationEnd r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.access$getOnBasketAnimationEndListener$p(r2)
                        if (r2 == 0) goto L33
                        im.threads.ui.views.recordview.VoiceRecordAnimationHelper r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.this
                        boolean r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.access$isStartRecorded$p(r2)
                        if (r2 != 0) goto L33
                        im.threads.ui.views.recordview.VoiceRecordAnimationHelper r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.this
                        im.threads.ui.views.recordview.VoiceRecordOnBasketAnimationEnd r2 = im.threads.ui.views.recordview.VoiceRecordAnimationHelper.access$getOnBasketAnimationEndListener$p(r2)
                        if (r2 == 0) goto L33
                        r2.onAnimationEnd()
                    L33:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.views.recordview.VoiceRecordAnimationHelper$animateBasket$3.onAnimationEnd(android.view.animation.Animation):void");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    z65.h(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    z65.h(animation, "animation");
                }
            });
        }
    }

    public final void animateSmallMicAlpha() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.alphaAnimation = alphaAnimation;
        alphaAnimation.setDuration(500L);
        AlphaAnimation alphaAnimation2 = this.alphaAnimation;
        if (alphaAnimation2 != null) {
            alphaAnimation2.setRepeatMode(2);
        }
        AlphaAnimation alphaAnimation3 = this.alphaAnimation;
        if (alphaAnimation3 != null) {
            alphaAnimation3.setRepeatCount(-1);
        }
        ImageView imageView = this.smallBlinkingMic;
        if (imageView != null) {
            imageView.startAnimation(this.alphaAnimation);
        }
    }

    public final void clearAlphaAnimation(boolean z) {
        AlphaAnimation alphaAnimation = this.alphaAnimation;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        AlphaAnimation alphaAnimation2 = this.alphaAnimation;
        if (alphaAnimation2 != null) {
            alphaAnimation2.reset();
        }
        ImageView imageView = this.smallBlinkingMic;
        if (imageView != null) {
            imageView.clearAnimation();
            if (z) {
                this.smallBlinkingMic.setVisibility(8);
            }
        }
    }

    public final void moveRecordButtonAndSlideToCancelBack(final VoiceRecordButton voiceRecordButton, FrameLayout frameLayout, float f, final float f2, float f3, final boolean z) {
        float f4;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator x;
        ViewPropertyAnimator duration;
        float[] fArr = new float[2];
        if (voiceRecordButton != null) {
            f4 = voiceRecordButton.getX();
        } else {
            f4 = 0.0f;
        }
        fArr[0] = f4;
        fArr[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: b2c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoiceRecordAnimationHelper.moveRecordButtonAndSlideToCancelBack$lambda$1(VoiceRecordButton.this, z, f2, valueAnimator);
            }
        });
        if (this.recordButtonGrowingAnimationEnabled && voiceRecordButton != null) {
            voiceRecordButton.stopScale();
        }
        ofFloat.setDuration(0L);
        ofFloat.start();
        if (f3 != 0.0f) {
            float f5 = f - f3;
            if (frameLayout != null && (animate = frameLayout.animate()) != null && (x = animate.x(f5)) != null && (duration = x.setDuration(0L)) != null) {
                duration.start();
            }
        }
    }

    public final void onAnimationEnd() {
        VoiceRecordOnBasketAnimationEnd voiceRecordOnBasketAnimationEnd = this.onBasketAnimationEndListener;
        if (voiceRecordOnBasketAnimationEnd != null) {
            voiceRecordOnBasketAnimationEnd.onAnimationEnd();
        }
    }

    public final void resetBasketAnimation() {
        if (this.isBasketAnimating) {
            TranslateAnimation translateAnimation = this.translateAnimation1;
            if (translateAnimation != null) {
                translateAnimation.reset();
            }
            TranslateAnimation translateAnimation2 = this.translateAnimation1;
            if (translateAnimation2 != null) {
                translateAnimation2.cancel();
            }
            TranslateAnimation translateAnimation3 = this.translateAnimation2;
            if (translateAnimation3 != null) {
                translateAnimation3.reset();
            }
            TranslateAnimation translateAnimation4 = this.translateAnimation2;
            if (translateAnimation4 != null) {
                translateAnimation4.cancel();
            }
            AnimatorSet animatorSet = this.micAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ImageView imageView = this.smallBlinkingMic;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            ImageView imageView2 = this.basketImg;
            if (imageView2 != null) {
                imageView2.clearAnimation();
            }
            Handler handler = this.handler1;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.handler2;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            ImageView imageView3 = this.basketImg;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
            ImageView imageView4 = this.smallBlinkingMic;
            if (imageView4 != null) {
                imageView4.setX(this.micX);
            }
            ImageView imageView5 = this.smallBlinkingMic;
            if (imageView5 != null) {
                imageView5.setY(this.micY);
            }
            ImageView imageView6 = this.smallBlinkingMic;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            this.isBasketAnimating = false;
        }
    }

    public final void resetSmallMic() {
        ImageView imageView = this.smallBlinkingMic;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        }
    }

    public final void setOnBasketAnimationEndListener(VoiceRecordOnBasketAnimationEnd voiceRecordOnBasketAnimationEnd) {
        this.onBasketAnimationEndListener = voiceRecordOnBasketAnimationEnd;
    }

    public final void setRecordButtonGrowingAnimationEnabled(boolean z) {
        this.recordButtonGrowingAnimationEnabled = z;
    }

    public final void setStartRecorded(boolean z) {
        this.isStartRecorded = z;
    }

    public final void setTrashIconColor(int i) {
        pk pkVar = this.animatedVectorDrawable;
        if (pkVar != null) {
            ColorFilterKotlinExtKt.applyColorFilter(pkVar, i, ColorFilterMode.SRC_IN);
        }
    }
}
