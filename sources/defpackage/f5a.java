package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: SelectDeliveryAddressDataFactory.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lf5a;", "", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "scenario", "Lzo9;", "routingStrategy", "Lck1;", "sender", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "a", "Lfq0;", "Lfq0;", "cartContentService", "Lay1;", "b", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lava;", c.a, "Lava;", "stateProvider", "Ljv5;", DateTokenConverter.CONVERTER_KEY, "Ljv5;", "localityService", "Lx42;", e.a, "Lx42;", "customerAddressService", "<init>", "(Lfq0;Lay1;Lava;Ljv5;Lx42;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: f5a  reason: default package */
/* loaded from: classes4.dex */
public final class f5a {
    private final fq0 a;
    private final ay1 b;
    private final ava c;
    private final jv5 d;
    private final x42 e;

    public f5a(fq0 fq0Var, ay1 ay1Var, ava avaVar, jv5 jv5Var, x42 x42Var) {
        z65.h(fq0Var, "cartContentService");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(avaVar, "stateProvider");
        z65.h(jv5Var, "localityService");
        z65.h(x42Var, "customerAddressService");
        this.a = fq0Var;
        this.b = ay1Var;
        this.c = avaVar;
        this.d = jv5Var;
        this.e = x42Var;
    }

    public final b a(b.a aVar, zo9 zo9Var, ck1 ck1Var) {
        z65.h(aVar, "scenario");
        z65.h(zo9Var, "routingStrategy");
        z65.h(ck1Var, "sender");
        return new b(aVar, zo9Var, this.a.a().p(), !this.e.getAll().isEmpty(), this.d.i(), this.b.getCode(), jua.c(this.c.e()), ck1Var);
    }
}
