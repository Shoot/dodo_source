package defpackage;
/* compiled from: PackagingStateResolver_Factory.java */
/* renamed from: bp7  reason: default package */
/* loaded from: classes2.dex */
public final class bp7 implements no3<ap7> {

    /* compiled from: PackagingStateResolver_Factory.java */
    /* renamed from: bp7$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private static final bp7 a = new bp7();
    }

    public static bp7 a() {
        return a.a;
    }

    public static ap7 c() {
        return new ap7();
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ap7 get() {
        return c();
    }
}
