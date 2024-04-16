package defpackage;
/* compiled from: SelectPizzeriaModule_ProvidePizzeriasFiltersRepositoryFactory.java */
/* renamed from: j8a  reason: default package */
/* loaded from: classes3.dex */
public final class j8a implements no3<fa8> {
    private final d8a a;

    public j8a(d8a d8aVar) {
        this.a = d8aVar;
    }

    public static j8a a(d8a d8aVar) {
        return new j8a(d8aVar);
    }

    public static fa8 c(d8a d8aVar) {
        return (fa8) jh8.e(d8aVar.f());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fa8 get() {
        return c(this.a);
    }
}
