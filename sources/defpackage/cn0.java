package defpackage;

import android.graphics.Typeface;
/* compiled from: CancelableFontCallback.java */
/* renamed from: cn0  reason: default package */
/* loaded from: classes2.dex */
public final class cn0 extends hab {
    private final Typeface a;
    private final a b;
    private boolean c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: cn0$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public cn0(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    @Override // defpackage.hab
    public void a(int i) {
        d(this.a);
    }

    @Override // defpackage.hab
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }
}
