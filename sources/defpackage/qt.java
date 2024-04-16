package defpackage;
/* compiled from: AssistantGeneratorResultConverter_Factory.java */
/* renamed from: qt  reason: default package */
/* loaded from: classes2.dex */
public final class qt implements no3<pt> {
    private final as8<jn6> a;

    public qt(as8<jn6> as8Var) {
        this.a = as8Var;
    }

    public static qt a(as8<jn6> as8Var) {
        return new qt(as8Var);
    }

    public static pt c(jn6 jn6Var) {
        return new pt(jn6Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pt get() {
        return c(this.a.get());
    }
}
