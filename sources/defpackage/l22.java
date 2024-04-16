package defpackage;

import android.content.Context;
/* compiled from: CreationContextFactory.java */
/* renamed from: l22  reason: default package */
/* loaded from: classes2.dex */
class l22 {
    private final Context a;
    private final x91 b;
    private final x91 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l22(Context context, x91 x91Var, x91 x91Var2) {
        this.a = context;
        this.b = x91Var;
        this.c = x91Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k22 a(String str) {
        return k22.a(this.a, this.b, this.c, str);
    }
}
