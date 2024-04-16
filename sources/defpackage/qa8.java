package defpackage;
/* compiled from: PizzeriasInLocalityRepository_Factory.java */
/* renamed from: qa8  reason: default package */
/* loaded from: classes4.dex */
public final class qa8 implements no3<pa8> {
    private final as8<ml0> a;

    public qa8(as8<ml0> as8Var) {
        this.a = as8Var;
    }

    public static qa8 a(as8<ml0> as8Var) {
        return new qa8(as8Var);
    }

    public static pa8 c(ml0 ml0Var) {
        return new pa8(ml0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pa8 get() {
        return c(this.a.get());
    }
}
