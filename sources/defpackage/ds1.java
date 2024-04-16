package defpackage;

import defpackage.cs1;
import kotlin.Metadata;
/* compiled from: ContactMeSwitchFeatureStateProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lds1;", "", "Lcs1;", "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ds1  reason: default package */
/* loaded from: classes.dex */
public final class ds1 {
    private final hq3 a;

    public ds1(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    public final cs1 a() {
        if (this.a.a(bq3.z) && this.a.a(bq3.P6)) {
            return cs1.c.a;
        }
        if (this.a.a(bq3.B)) {
            if (this.a.a(bq3.N6)) {
                return new cs1.b(es1.a);
            }
            return cs1.a.a;
        } else if (this.a.a(bq3.A) && this.a.a(bq3.h)) {
            if (this.a.a(bq3.N6)) {
                if (this.a.a(bq3.O6)) {
                    return new cs1.b(es1.c);
                }
                return new cs1.b(es1.b);
            }
            return cs1.a.a;
        } else {
            return cs1.c.a;
        }
    }
}
