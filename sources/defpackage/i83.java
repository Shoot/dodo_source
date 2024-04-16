package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import defpackage.dlb;
/* compiled from: DrawableCrossFadeTransition.java */
/* renamed from: i83  reason: default package */
/* loaded from: classes.dex */
public class i83 implements dlb<Drawable> {
    private final int a;
    private final boolean b;

    public i83(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.dlb
    /* renamed from: b */
    public boolean a(Drawable drawable, dlb.a aVar) {
        Drawable f = aVar.f();
        if (f == null) {
            f = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{f, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        aVar.e(transitionDrawable);
        return true;
    }
}
