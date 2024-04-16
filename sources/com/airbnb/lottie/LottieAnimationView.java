package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final String o = "LottieAnimationView";
    private static final sz5<Throwable> p = new sz5() { // from class: cz5
        @Override // defpackage.sz5
        public final void onResult(Object obj) {
            LottieAnimationView.v((Throwable) obj);
        }
    };
    private final sz5<ez5> a;
    private final sz5<Throwable> b;
    private sz5<Throwable> c;
    private int d;
    private final n e;
    private String f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final Set<c> k;
    private final Set<wz5> l;
    private o<ez5> m;
    private ez5 n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements sz5<Throwable> {
        a() {
        }

        @Override // defpackage.sz5
        /* renamed from: a */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.d != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.d);
            }
            (LottieAnimationView.this.c == null ? LottieAnimationView.p : LottieAnimationView.this.c).onResult(th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    class b<T> extends b06<T> {
        final /* synthetic */ jla d;

        b(jla jlaVar) {
            this.d = jlaVar;
        }

        @Override // defpackage.b06
        public T a(qz5<T> qz5Var) {
            return (T) this.d.a(qz5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new sz5() { // from class: bz5
            @Override // defpackage.sz5
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((ez5) obj);
            }
        };
        this.b = new a();
        this.d = 0;
        this.e = new n();
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = new HashSet();
        this.l = new HashSet();
        r(attributeSet, xv8.lottieAnimationViewStyle);
    }

    private void A() {
        boolean s = s();
        setImageDrawable(null);
        setImageDrawable(this.e);
        if (s) {
            this.e.t0();
        }
    }

    private void m() {
        o<ez5> oVar = this.m;
        if (oVar != null) {
            oVar.j(this.a);
            this.m.i(this.b);
        }
    }

    private void n() {
        this.n = null;
        this.e.u();
    }

    private o<ez5> p(final String str) {
        if (isInEditMode()) {
            return new o<>(new Callable() { // from class: dz5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    yz5 t;
                    t = LottieAnimationView.this.t(str);
                    return t;
                }
            }, true);
        }
        if (this.j) {
            return nz5.j(getContext(), str);
        }
        return nz5.k(getContext(), str, null);
    }

    private o<ez5> q(final int i) {
        if (isInEditMode()) {
            return new o<>(new Callable() { // from class: az5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    yz5 u;
                    u = LottieAnimationView.this.u(i);
                    return u;
                }
            }, true);
        }
        if (this.j) {
            return nz5.s(getContext(), i);
        }
        return nz5.t(getContext(), i, null);
    }

    private void r(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v19.C, i, 0);
        this.j = obtainStyledAttributes.getBoolean(v19.E, true);
        int i2 = v19.O;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = v19.J;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = v19.T;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(v19.I, 0));
        if (obtainStyledAttributes.getBoolean(v19.D, false)) {
            this.i = true;
        }
        if (obtainStyledAttributes.getBoolean(v19.M, false)) {
            this.e.Q0(-1);
        }
        int i5 = v19.R;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = v19.Q;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = v19.S;
        if (obtainStyledAttributes.hasValue(i7)) {
            setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = v19.F;
        if (obtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(v19.L));
        setProgress(obtainStyledAttributes.getFloat(v19.N, 0.0f));
        o(obtainStyledAttributes.getBoolean(v19.H, false));
        int i9 = v19.G;
        if (obtainStyledAttributes.hasValue(i9)) {
            j(new of5("**"), xz5.K, new b06(new ala(on.a(getContext(), obtainStyledAttributes.getResourceId(i9, -1)).getDefaultColor())));
        }
        int i10 = v19.P;
        if (obtainStyledAttributes.hasValue(i10)) {
            he9 he9Var = he9.AUTOMATIC;
            int i11 = obtainStyledAttributes.getInt(i10, he9Var.ordinal());
            if (i11 >= he9.values().length) {
                i11 = he9Var.ordinal();
            }
            setRenderMode(he9.values()[i11]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(v19.K, false));
        obtainStyledAttributes.recycle();
        n nVar = this.e;
        if (fvb.f(getContext()) != 0.0f) {
            z = true;
        }
        nVar.U0(Boolean.valueOf(z));
    }

    private void setCompositionTask(o<ez5> oVar) {
        this.k.add(c.SET_ANIMATION);
        n();
        m();
        this.m = oVar.d(this.a).c(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ yz5 t(String str) throws Exception {
        if (this.j) {
            return nz5.l(getContext(), str);
        }
        return nz5.m(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ yz5 u(int i) throws Exception {
        if (this.j) {
            return nz5.u(getContext(), i);
        }
        return nz5.v(getContext(), i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Throwable th) {
        if (fvb.k(th)) {
            ox5.d("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    public boolean getClipToCompositionBounds() {
        return this.e.F();
    }

    public ez5 getComposition() {
        return this.n;
    }

    public long getDuration() {
        ez5 ez5Var = this.n;
        if (ez5Var != null) {
            return ez5Var.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.e.J();
    }

    public String getImageAssetsFolder() {
        return this.e.L();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.e.N();
    }

    public float getMaxFrame() {
        return this.e.O();
    }

    public float getMinFrame() {
        return this.e.P();
    }

    public by7 getPerformanceTracker() {
        return this.e.Q();
    }

    public float getProgress() {
        return this.e.R();
    }

    public he9 getRenderMode() {
        return this.e.S();
    }

    public int getRepeatCount() {
        return this.e.T();
    }

    public int getRepeatMode() {
        return this.e.U();
    }

    public float getSpeed() {
        return this.e.V();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.e.p(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof n) && ((n) drawable).S() == he9.SOFTWARE) {
            this.e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        n nVar = this.e;
        if (drawable2 == nVar) {
            super.invalidateDrawable(nVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public <T> void j(of5 of5Var, T t, b06<T> b06Var) {
        this.e.q(of5Var, t, b06Var);
    }

    public <T> void k(of5 of5Var, T t, jla<T> jlaVar) {
        this.e.q(of5Var, t, new b(jlaVar));
    }

    public void l() {
        this.k.add(c.PLAY_OPTION);
        this.e.t();
    }

    public void o(boolean z) {
        this.e.z(z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.i) {
            this.e.q0();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f = savedState.a;
        Set<c> set = this.k;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f)) {
            setAnimation(this.f);
        }
        this.g = savedState.b;
        if (!this.k.contains(cVar) && (i = this.g) != 0) {
            setAnimation(i);
        }
        if (!this.k.contains(c.SET_PROGRESS)) {
            setProgress(savedState.c);
        }
        if (!this.k.contains(c.PLAY_OPTION) && savedState.d) {
            x();
        }
        if (!this.k.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!this.k.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f);
        }
        if (!this.k.contains(c.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.g);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.f;
        savedState.b = this.g;
        savedState.c = this.e.R();
        savedState.d = this.e.a0();
        savedState.e = this.e.L();
        savedState.f = this.e.U();
        savedState.g = this.e.T();
        return savedState;
    }

    public boolean s() {
        return this.e.Z();
    }

    public void setAnimation(int i) {
        this.g = i;
        this.f = null;
        setCompositionTask(q(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        o<ez5> x;
        if (this.j) {
            x = nz5.w(getContext(), str);
        } else {
            x = nz5.x(getContext(), str, null);
        }
        setCompositionTask(x);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.e.v0(z);
    }

    public void setCacheComposition(boolean z) {
        this.j = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.e.w0(z);
    }

    public void setComposition(@NonNull ez5 ez5Var) {
        if (oi5.a) {
            String str = o;
            Log.v(str, "Set Composition \n" + ez5Var);
        }
        this.e.setCallback(this);
        this.n = ez5Var;
        this.h = true;
        boolean x0 = this.e.x0(ez5Var);
        this.h = false;
        if (getDrawable() == this.e && !x0) {
            return;
        }
        if (!x0) {
            A();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (wz5 wz5Var : this.l) {
            wz5Var.a(ez5Var);
        }
    }

    public void setFailureListener(sz5<Throwable> sz5Var) {
        this.c = sz5Var;
    }

    public void setFallbackResource(int i) {
        this.d = i;
    }

    public void setFontAssetDelegate(s24 s24Var) {
        this.e.y0(s24Var);
    }

    public void setFrame(int i) {
        this.e.z0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.e.A0(z);
    }

    public void setImageAssetDelegate(cu4 cu4Var) {
        this.e.B0(cu4Var);
    }

    public void setImageAssetsFolder(String str) {
        this.e.C0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.e.D0(z);
    }

    public void setMaxFrame(int i) {
        this.e.E0(i);
    }

    public void setMaxProgress(float f) {
        this.e.G0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.e.I0(str);
    }

    public void setMinFrame(int i) {
        this.e.J0(i);
    }

    public void setMinProgress(float f) {
        this.e.L0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.e.M0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.e.N0(z);
    }

    public void setProgress(float f) {
        this.k.add(c.SET_PROGRESS);
        this.e.O0(f);
    }

    public void setRenderMode(he9 he9Var) {
        this.e.P0(he9Var);
    }

    public void setRepeatCount(int i) {
        this.k.add(c.SET_REPEAT_COUNT);
        this.e.Q0(i);
    }

    public void setRepeatMode(int i) {
        this.k.add(c.SET_REPEAT_MODE);
        this.e.R0(i);
    }

    public void setSafeMode(boolean z) {
        this.e.S0(z);
    }

    public void setSpeed(float f) {
        this.e.T0(f);
    }

    public void setTextDelegate(mab mabVar) {
        this.e.V0(mabVar);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        n nVar;
        if (!this.h && drawable == (nVar = this.e) && nVar.Z()) {
            w();
        } else if (!this.h && (drawable instanceof n)) {
            n nVar2 = (n) drawable;
            if (nVar2.Z()) {
                nVar2.p0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void w() {
        this.i = false;
        this.e.p0();
    }

    public void x() {
        this.k.add(c.PLAY_OPTION);
        this.e.q0();
    }

    public void y(InputStream inputStream, String str) {
        setCompositionTask(nz5.n(inputStream, str));
    }

    public void z(String str, String str2) {
        y(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(String str) {
        this.f = str;
        this.g = 0;
        setCompositionTask(p(str));
    }

    public void setMaxFrame(String str) {
        this.e.F0(str);
    }

    public void setMinFrame(String str) {
        this.e.K0(str);
    }
}
