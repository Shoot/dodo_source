package defpackage;

import androidx.annotation.NonNull;
/* compiled from: SimpleTarget.java */
@Deprecated
/* renamed from: vla  reason: default package */
/* loaded from: classes.dex */
public abstract class vla<Z> extends k80<Z> {
    private final int b;
    private final int c;

    public vla() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.n6b
    public final void c(@NonNull kna knaVar) {
        if (vub.v(this.b, this.c)) {
            knaVar.d(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.b + " and height: " + this.c + ", either provide dimensions in the constructor or call override()");
    }

    public vla(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.n6b
    public void l(@NonNull kna knaVar) {
    }
}
