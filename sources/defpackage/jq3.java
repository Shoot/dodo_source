package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: FeatureServiceImpl_Factory.java */
/* renamed from: jq3  reason: default package */
/* loaded from: classes4.dex */
public final class jq3 implements no3<iq3> {
    private final as8<HashMap<String, List<bq3>>> a;
    private final as8<fq3> b;
    private final as8<ry1> c;
    private final as8<yhb> d;
    private final as8<mh0> e;
    private final as8<gy3> f;

    public jq3(as8<HashMap<String, List<bq3>>> as8Var, as8<fq3> as8Var2, as8<ry1> as8Var3, as8<yhb> as8Var4, as8<mh0> as8Var5, as8<gy3> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static jq3 a(as8<HashMap<String, List<bq3>>> as8Var, as8<fq3> as8Var2, as8<ry1> as8Var3, as8<yhb> as8Var4, as8<mh0> as8Var5, as8<gy3> as8Var6) {
        return new jq3(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static iq3 c(HashMap<String, List<bq3>> hashMap, fq3 fq3Var, ry1 ry1Var, yhb yhbVar, mh0 mh0Var, gy3 gy3Var) {
        return new iq3(hashMap, fq3Var, ry1Var, yhbVar, mh0Var, gy3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public iq3 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
