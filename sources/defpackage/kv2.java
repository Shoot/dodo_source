package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.tmb;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: DeliveryAddressListDataFactory.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkv2;", "Ljv2;", "Liv2;", "a", "Lfq0;", "Lfq0;", "cartContentService", "Lay1;", "b", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lava;", c.a, "Lava;", "stateProvider", "Ljv5;", DateTokenConverter.CONVERTER_KEY, "Ljv5;", "localityService", "<init>", "(Lfq0;Lay1;Lava;Ljv5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kv2  reason: default package */
/* loaded from: classes4.dex */
public final class kv2 implements jv2 {
    private final fq0 a;
    private final ay1 b;
    private final ava c;
    private final jv5 d;

    public kv2(fq0 fq0Var, ay1 ay1Var, ava avaVar, jv5 jv5Var) {
        z65.h(fq0Var, "cartContentService");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(avaVar, "stateProvider");
        z65.h(jv5Var, "localityService");
        this.a = fq0Var;
        this.b = ay1Var;
        this.c = avaVar;
        this.d = jv5Var;
    }

    @Override // defpackage.jv2
    public iv2 a() {
        return new iv2(R.id.select_address_list_id, this.a.a().p(), this.b.getCode(), jua.c(this.c.e()), this.d.i(), ck1.q);
    }
}
