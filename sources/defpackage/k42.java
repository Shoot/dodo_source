package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* compiled from: CustomTarget.java */
/* renamed from: k42  reason: default package */
/* loaded from: classes.dex */
public abstract class k42<T> implements n6b<T> {
    private final int a;
    private final int b;
    private ii9 c;

    public k42() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.n6b
    public final void c(@NonNull kna knaVar) {
        knaVar.d(this.a, this.b);
    }

    @Override // defpackage.n6b
    public final ii9 h() {
        return this.c;
    }

    @Override // defpackage.n6b
    public final void j(ii9 ii9Var) {
        this.c = ii9Var;
    }

    public k42(int i, int i2) {
        if (vub.v(i, i2)) {
            this.a = i;
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    @Override // defpackage.mp5
    public void g() {
    }

    @Override // defpackage.mp5
    public void onDestroy() {
    }

    @Override // defpackage.mp5
    public void onStart() {
    }

    @Override // defpackage.n6b
    public void a(Drawable drawable) {
    }

    @Override // defpackage.n6b
    public void b(Drawable drawable) {
    }

    @Override // defpackage.n6b
    public final void l(@NonNull kna knaVar) {
    }
}
