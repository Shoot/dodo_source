package defpackage;

import ru.dodopizza.app.presentation.main.a;
/* compiled from: AppsFlyerDeepLinksReporter_Factory.java */
/* renamed from: jq  reason: default package */
/* loaded from: classes3.dex */
public final class jq implements no3<iq> {
    private final as8<fq> a;
    private final as8<b79> b;
    private final as8<a> c;

    public jq(as8<fq> as8Var, as8<b79> as8Var2, as8<a> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static jq a(as8<fq> as8Var, as8<b79> as8Var2, as8<a> as8Var3) {
        return new jq(as8Var, as8Var2, as8Var3);
    }

    public static iq c(fq fqVar, b79 b79Var, as8<a> as8Var) {
        return new iq(fqVar, b79Var, as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public iq get() {
        return c(this.a.get(), this.b.get(), this.c);
    }
}
