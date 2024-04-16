package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzaKustoMetaDataCollector.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Ll78;", "Lai5;", "", c.a, "b", "", "", "a", "Lji5;", "Lji5;", "kustoRepository", "Lih4;", "Lih4;", "googlePlayServicesHelper", "<init>", "(Lji5;Lih4;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l78  reason: default package */
/* loaded from: classes4.dex */
public final class l78 implements ai5 {
    public static final a c = new a(null);
    private final ji5 a;
    private final ih4 b;

    /* compiled from: PizzaKustoMetaDataCollector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Ll78$a;", "", "", "KEY_DEVICE_ID", "Ljava/lang/String;", "KEY_GOOGLE_SERVICES_STATUS", "KEY_SESSION_ID", "KEY_SOURCE", "SOURCE", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: l78$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l78(ji5 ji5Var, ih4 ih4Var) {
        z65.h(ji5Var, "kustoRepository");
        z65.h(ih4Var, "googlePlayServicesHelper");
        this.a = ji5Var;
        this.b = ih4Var;
    }

    private final String b() {
        if (this.a.a().length() == 0) {
            String uuid = UUID.randomUUID().toString();
            z65.g(uuid, "toString(...)");
            this.a.b(uuid);
            return uuid;
        }
        return this.a.a();
    }

    private final String c() {
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "toString(...)");
        return uuid;
    }

    @Override // defpackage.ai5
    public Map<String, Object> a() {
        Map<String, Object> k;
        k = g86.k(lnb.a(KustoStorage.KustoTable.COLUMN_SOURCE, "app"), lnb.a("visit_token", c()), lnb.a("visitor_token", b()), lnb.a("gms_status_code", Integer.valueOf(this.b.getStatusCode())));
        return k;
    }
}
