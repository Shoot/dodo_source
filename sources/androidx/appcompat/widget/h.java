package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
class h {
    @NonNull
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(@NonNull CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a() {
        Drawable a = so1.a(this.a);
        if (a != null) {
            if (this.d || this.e) {
                Drawable mutate = f83.r(a).mutate();
                if (this.d) {
                    f83.o(mutate, this.b);
                }
                if (this.e) {
                    f83.p(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:11:0x003b, B:13:0x0043, B:15:0x0049), top: B:29:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:11:0x003b, B:13:0x0043, B:15:0x0049), top: B:29:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = defpackage.n29.W0
            r8 = 0
            androidx.appcompat.widget.e0 r0 = androidx.appcompat.widget.e0.v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            defpackage.syb.s0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = defpackage.n29.Y0     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3b
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L3b
            android.widget.CompoundButton r11 = r9.a     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            android.graphics.drawable.Drawable r10 = defpackage.on.b(r1, r10)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            goto L56
        L39:
            r10 = move-exception
            goto L82
        L3b:
            int r10 = defpackage.n29.X0     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L56
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L56
            android.widget.CompoundButton r11 = r9.a     // Catch: java.lang.Throwable -> L39
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r10 = defpackage.on.b(r1, r10)     // Catch: java.lang.Throwable -> L39
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L39
        L56:
            int r10 = defpackage.n29.Z0     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L67
            android.widget.CompoundButton r11 = r9.a     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L39
            defpackage.so1.c(r11, r10)     // Catch: java.lang.Throwable -> L39
        L67:
            int r10 = defpackage.n29.a1     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7e
            android.widget.CompoundButton r11 = r9.a     // Catch: java.lang.Throwable -> L39
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch: java.lang.Throwable -> L39
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.u.e(r10, r1)     // Catch: java.lang.Throwable -> L39
            defpackage.so1.d(r11, r10)     // Catch: java.lang.Throwable -> L39
        L7e:
            r0.w()
            return
        L82:
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        return i;
    }
}
