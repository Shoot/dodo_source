package com.inappstory.sdk.stories.ui.widgets.elasticview;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import android.util.FloatProperty;
import android.util.IntProperty;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class AnimUtils {
    private static Interpolator fastOutLinearIn;
    private static Interpolator fastOutSlowIn;
    private static Interpolator linear;
    private static Interpolator linearOutSlowIn;

    /* loaded from: classes3.dex */
    public static abstract class FloatProp<T> {
        public final String name;

        protected FloatProp(String str) {
            this.name = str;
        }

        public abstract float get(T t);

        public abstract void set(T t, float f);
    }

    /* loaded from: classes3.dex */
    public static abstract class IntProp<T> {
        public final String name;

        public IntProp(String str) {
            this.name = str;
        }

        public abstract int get(T t);

        public abstract void set(T t, int i);
    }

    /* loaded from: classes3.dex */
    public static class NoPauseAnimator extends Animator {
        private final Animator mAnimator;
        private final ArrayMap<Animator.AnimatorListener, Animator.AnimatorListener> mListeners = new ArrayMap<>();

        public NoPauseAnimator(Animator animator) {
            this.mAnimator = animator;
        }

        @Override // android.animation.Animator
        public void addListener(Animator.AnimatorListener animatorListener) {
            e eVar = new e(this, animatorListener);
            if (!this.mListeners.containsKey(animatorListener)) {
                this.mListeners.put(animatorListener, eVar);
                this.mAnimator.addListener(eVar);
            }
        }

        @Override // android.animation.Animator
        public void cancel() {
            this.mAnimator.cancel();
        }

        @Override // android.animation.Animator
        public void end() {
            this.mAnimator.end();
        }

        @Override // android.animation.Animator
        public long getDuration() {
            return this.mAnimator.getDuration();
        }

        @Override // android.animation.Animator
        public TimeInterpolator getInterpolator() {
            return this.mAnimator.getInterpolator();
        }

        @Override // android.animation.Animator
        public ArrayList<Animator.AnimatorListener> getListeners() {
            return new ArrayList<>(this.mListeners.keySet());
        }

        @Override // android.animation.Animator
        public long getStartDelay() {
            return this.mAnimator.getStartDelay();
        }

        @Override // android.animation.Animator
        public boolean isPaused() {
            return this.mAnimator.isPaused();
        }

        @Override // android.animation.Animator
        public boolean isRunning() {
            return this.mAnimator.isRunning();
        }

        @Override // android.animation.Animator
        public boolean isStarted() {
            return this.mAnimator.isStarted();
        }

        @Override // android.animation.Animator
        public void removeAllListeners() {
            this.mListeners.clear();
            this.mAnimator.removeAllListeners();
        }

        @Override // android.animation.Animator
        public void removeListener(Animator.AnimatorListener animatorListener) {
            Animator.AnimatorListener animatorListener2 = this.mListeners.get(animatorListener);
            if (animatorListener2 != null) {
                this.mListeners.remove(animatorListener);
                this.mAnimator.removeListener(animatorListener2);
            }
        }

        @Override // android.animation.Animator
        public Animator setDuration(long j) {
            this.mAnimator.setDuration(j);
            return this;
        }

        @Override // android.animation.Animator
        public void setInterpolator(TimeInterpolator timeInterpolator) {
            this.mAnimator.setInterpolator(timeInterpolator);
        }

        @Override // android.animation.Animator
        public void setStartDelay(long j) {
            this.mAnimator.setStartDelay(j);
        }

        @Override // android.animation.Animator
        public void setTarget(Object obj) {
            this.mAnimator.setTarget(obj);
        }

        @Override // android.animation.Animator
        public void setupEndValues() {
            this.mAnimator.setupEndValues();
        }

        @Override // android.animation.Animator
        public void setupStartValues() {
            this.mAnimator.setupStartValues();
        }

        @Override // android.animation.Animator
        public void start() {
            this.mAnimator.start();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    static class a<T> extends IntProperty<T> {
        final /* synthetic */ IntProp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, IntProp intProp) {
            super(str);
            this.a = intProp;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(T t) {
            return Integer.valueOf(this.a.get(t));
        }

        @Override // android.util.IntProperty
        public void setValue(T t, int i) {
            this.a.set(t, i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    static class b<T> extends Property<T, Integer> {
        final /* synthetic */ IntProp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls, String str, IntProp intProp) {
            super(cls, str);
            this.a = intProp;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(T t) {
            return Integer.valueOf(this.a.get(t));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(T t, Integer num) {
            this.a.set(t, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    static class c<T> extends FloatProperty<T> {
        final /* synthetic */ FloatProp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, FloatProp floatProp) {
            super(str);
            this.a = floatProp;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(T t) {
            return Float.valueOf(this.a.get(t));
        }

        @Override // android.util.FloatProperty
        public void setValue(T t, float f) {
            this.a.set(t, f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    static class d<T> extends Property<T, Float> {
        final /* synthetic */ FloatProp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Class cls, String str, FloatProp floatProp) {
            super(cls, str);
            this.a = floatProp;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(T t) {
            return Float.valueOf(this.a.get(t));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(T t, Float f) {
            this.a.set(t, f.floatValue());
        }
    }

    /* loaded from: classes3.dex */
    private static class e implements Animator.AnimatorListener {
        private final Animator a;
        private final Animator.AnimatorListener b;

        e(Animator animator, Animator.AnimatorListener animatorListener) {
            this.a = animator;
            this.b = animatorListener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.onAnimationCancel(this.a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.onAnimationEnd(this.a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.b.onAnimationRepeat(this.a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.b.onAnimationStart(this.a);
        }
    }

    private AnimUtils() {
    }

    public static <T> Property<T, Float> createFloatProperty(FloatProp<T> floatProp) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c(floatProp.name, floatProp);
        }
        return new d(Float.class, floatProp.name, floatProp);
    }

    public static <T> Property<T, Integer> createIntProperty(IntProp<T> intProp) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new a(intProp.name, intProp);
        }
        return new b(Integer.class, intProp.name, intProp);
    }

    public static Interpolator getFastOutLinearInInterpolator(Context context) {
        if (fastOutLinearIn == null) {
            fastOutLinearIn = AnimationUtils.loadInterpolator(context, 17563663);
        }
        return fastOutLinearIn;
    }

    public static Interpolator getFastOutSlowInInterpolator(Context context) {
        if (fastOutSlowIn == null) {
            fastOutSlowIn = AnimationUtils.loadInterpolator(context, 17563661);
        }
        return fastOutSlowIn;
    }

    public static Interpolator getLinearInterpolator() {
        if (linear == null) {
            linear = new LinearInterpolator();
        }
        return linear;
    }

    public static Interpolator getLinearOutSlowInInterpolator(Context context) {
        if (linearOutSlowIn == null) {
            linearOutSlowIn = AnimationUtils.loadInterpolator(context, 17563662);
        }
        return linearOutSlowIn;
    }

    public static float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }
}
