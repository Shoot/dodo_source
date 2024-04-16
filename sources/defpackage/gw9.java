package defpackage;
/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* renamed from: gw9  reason: default package */
/* loaded from: classes2.dex */
public final class gw9 implements oo3<zv9> {
    private final as8<x91> a;

    public gw9(as8<x91> as8Var) {
        this.a = as8Var;
    }

    public static zv9 a(x91 x91Var) {
        return (zv9) fh8.c(fw9.a(x91Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static gw9 b(as8<x91> as8Var) {
        return new gw9(as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: c */
    public zv9 get() {
        return a(this.a.get());
    }
}
