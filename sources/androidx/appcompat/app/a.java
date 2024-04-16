package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.x4;
/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract boolean o(int i, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(Drawable drawable);

    public abstract void s(boolean z);

    public abstract void t(int i);

    public abstract void u(Drawable drawable);

    public abstract void v(boolean z);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public x4 y(x4.a aVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0008a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0008a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n29.t);
            this.a = obtainStyledAttributes.getInt(n29.u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0008a(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public C0008a(C0008a c0008a) {
            super((ViewGroup.MarginLayoutParams) c0008a);
            this.a = 0;
            this.a = c0008a.a;
        }

        public C0008a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
    }

    public void m(Configuration configuration) {
    }
}
