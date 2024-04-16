package defpackage;
/* compiled from: EventStoreModule_DbNameFactory.java */
/* renamed from: hl3  reason: default package */
/* loaded from: classes2.dex */
public final class hl3 implements oo3<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* renamed from: hl3$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private static final hl3 a = new hl3();
    }

    public static hl3 a() {
        return a.a;
    }

    public static String b() {
        return (String) fh8.c(gl3.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: c */
    public String get() {
        return b();
    }
}
