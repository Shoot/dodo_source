package defpackage;

import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import defpackage.k65;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChuckInterceptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lq71;", "Lk65;", "Lsq4;", "newBaseUrl", "", "host", "path", SearchIntents.EXTRA_QUERY, "a", "Lk65$a;", "chain", "Lik9;", "intercept", "Ljava/lang/String;", "baseUrl", "Ls13;", "b", "Ls13;", "deviceIdProvider", "<init>", "(Ljava/lang/String;Ls13;)V", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q71  reason: default package */
/* loaded from: classes3.dex */
public final class q71 implements k65 {
    public static final a c = new a(null);
    private final String a;
    private final s13 b;

    /* compiled from: ChuckInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lq71$a;", "", "", "BASE_URL", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: q71$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public q71(String str, s13 s13Var) {
        z65.h(str, "baseUrl");
        z65.h(s13Var, "deviceIdProvider");
        this.a = str;
        this.b = s13Var;
    }

    private final String a(sq4 sq4Var, String str, String str2, String str3) {
        String str4 = String.valueOf(sq4Var) + str + str2 + str3;
        z65.g(str4, "toString(...)");
        return str4;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        z65.h(aVar, "chain");
        String a2 = a(sq4.j.c(this.a), uu0.b(aVar), uu0.c(aVar), uu0.a(uu0.d(aVar)));
        return aVar.b(aVar.request().i().u(a2).a("automation-test-identifier", this.b.a()).b());
    }
}
