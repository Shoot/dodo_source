package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* compiled from: FrameDrawableTranscoder.java */
/* renamed from: d74  reason: default package */
/* loaded from: classes.dex */
class d74 implements ck9<h74, Drawable> {

    /* compiled from: FrameDrawableTranscoder.java */
    /* renamed from: d74$a */
    /* loaded from: classes.dex */
    class a extends l83<Drawable> {
        final /* synthetic */ o0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Drawable drawable, o0 o0Var) {
            super(drawable);
            this.b = o0Var;
        }

        @Override // defpackage.nj9
        public int a() {
            return this.b.d();
        }

        @Override // defpackage.nj9
        public void b() {
            this.b.stop();
        }

        @Override // defpackage.nj9
        @NonNull
        public Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // defpackage.l83, defpackage.t25
        public void initialize() {
            super.initialize();
        }
    }

    @Override // defpackage.ck9
    public nj9<Drawable> a(@NonNull nj9<h74> nj9Var, @NonNull ac7 ac7Var) {
        h74 h74Var = nj9Var.get();
        boolean booleanValue = ((Boolean) ac7Var.c(qk.a)).booleanValue();
        if (h74Var instanceof n0) {
            o0 o0Var = new o0((n0) h74Var);
            o0Var.h(false);
            o0Var.i(booleanValue);
            return new a(o0Var, o0Var);
        }
        return null;
    }
}
