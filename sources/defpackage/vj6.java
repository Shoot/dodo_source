package defpackage;

import ch.qos.logback.core.joran.action.Action;
import defpackage.hi9;
import defpackage.k65;
import kotlin.Metadata;
/* compiled from: MindboxHeadersInterceptor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lvj6;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "", "a", "Ljava/lang/String;", "baseUrl", "b", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vj6  reason: default package */
/* loaded from: classes4.dex */
public final class vj6 implements k65 {
    private final String a;
    private final String b;

    public vj6(String str, String str2) {
        z65.h(str, "baseUrl");
        z65.h(str2, Action.KEY_ATTRIBUTE);
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        boolean O;
        z65.h(aVar, "chain");
        hi9 request = aVar.request();
        O = m0b.O(this.a, request.l().k(), false, 2, null);
        if (O) {
            hi9.a a = request.i().n("Content-Type").a("Content-Type", "application/json").a("Accept", "application/json");
            String str = this.b;
            return aVar.b(a.a("Authorization", "Mindbox secretKey=\"" + str + "\"").b());
        }
        return aVar.b(request);
    }
}
