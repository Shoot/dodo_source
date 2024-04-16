package defpackage;

import android.content.Context;
/* compiled from: EventStoreModule_PackageNameFactory.java */
/* renamed from: il3  reason: default package */
/* loaded from: classes2.dex */
public final class il3 implements oo3<String> {
    private final as8<Context> a;

    public il3(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static il3 a(as8<Context> as8Var) {
        return new il3(as8Var);
    }

    public static String c(Context context) {
        return (String) fh8.c(gl3.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public String get() {
        return c(this.a.get());
    }
}
