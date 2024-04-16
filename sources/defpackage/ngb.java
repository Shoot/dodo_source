package defpackage;
/* compiled from: TimeModule_EventClockFactory.java */
/* renamed from: ngb  reason: default package */
/* loaded from: classes2.dex */
public final class ngb implements oo3<x91> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* renamed from: ngb$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private static final ngb a = new ngb();
    }

    public static ngb a() {
        return a.a;
    }

    public static x91 b() {
        return (x91) fh8.c(mgb.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: c */
    public x91 get() {
        return b();
    }
}
