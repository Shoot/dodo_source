package defpackage;

import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
/* compiled from: TabLayoutColorManagerCreator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lo5b;", "", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Ln5b;", "a", "Lhq3;", "Lhq3;", "getFeatureService", "()Lhq3;", "featureService", "<init>", "(Lhq3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o5b  reason: default package */
/* loaded from: classes2.dex */
public final class o5b {
    private final hq3 a;

    public o5b(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    public final n5b a(TabLayout tabLayout) {
        z65.h(tabLayout, "tabLayout");
        if (this.a.a(bq3.v5)) {
            return new p5b(tabLayout);
        }
        return q5b.a;
    }
}
