package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.s58;
import defpackage.si9;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceRequestHandler.java */
/* renamed from: bk9  reason: default package */
/* loaded from: classes3.dex */
public class bk9 extends si9 {
    private final Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk9(Context context) {
        this.a = context;
    }

    private static Bitmap j(Resources resources, int i, gi9 gi9Var) {
        BitmapFactory.Options d = si9.d(gi9Var);
        if (si9.g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            si9.b(gi9Var.h, gi9Var.i, d, gi9Var);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    @Override // defpackage.si9
    public boolean c(gi9 gi9Var) {
        if (gi9Var.e != 0) {
            return true;
        }
        return "android.resource".equals(gi9Var.d.getScheme());
    }

    @Override // defpackage.si9
    public si9.a f(gi9 gi9Var, int i) throws IOException {
        Resources n = evb.n(this.a, gi9Var);
        return new si9.a(j(n, evb.m(n, gi9Var), gi9Var), s58.e.DISK);
    }
}
