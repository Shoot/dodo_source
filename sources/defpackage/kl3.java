package defpackage;
/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* renamed from: kl3  reason: default package */
/* loaded from: classes2.dex */
public final class kl3 implements oo3<fl3> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* renamed from: kl3$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private static final kl3 a = new kl3();
    }

    public static kl3 a() {
        return a.a;
    }

    public static fl3 c() {
        return (fl3) fh8.c(gl3.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fl3 get() {
        return c();
    }
}
