package com.dodopizza.core.domain.push;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.core.domain.push.ServicePushApi;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ServicePushService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006#"}, d2 = {"Lcom/dodopizza/core/domain/push/a;", "Lxda;", "", "token", "", "g", "", "f", "orderId", DateTokenConverter.CONVERTER_KEY, c.a, "a", "b", "Las8;", "Lcom/dodopizza/core/domain/push/ServicePushApi;", "Las8;", "servicePushApiProvider", "Lut8;", "Lut8;", "pushTokenProvider", "Li00;", "Li00;", "authorizationState", "Lci8;", "Lci8;", "preferencesAssetsDataSource", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lorg/slf4j/Logger;", "logger", "()Lcom/dodopizza/core/domain/push/ServicePushApi;", "servicePushApi", "<init>", "(Las8;Lut8;Li00;Lci8;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a implements xda {
    private final as8<ServicePushApi> a;
    private final ut8 b;
    private final i00 c;
    private final ci8 d;
    private final Logger e;

    public a(as8<ServicePushApi> as8Var, ut8 ut8Var, i00 i00Var, ci8 ci8Var) {
        z65.h(as8Var, "servicePushApiProvider");
        z65.h(ut8Var, "pushTokenProvider");
        z65.h(i00Var, "authorizationState");
        z65.h(ci8Var, "preferencesAssetsDataSource");
        this.a = as8Var;
        this.b = ut8Var;
        this.c = i00Var;
        this.d = ci8Var;
        this.e = LoggerFactory.getLogger(a.class);
    }

    private final ServicePushApi e() {
        return this.a.get();
    }

    private final boolean f(String str) {
        return !z65.c(str, this.d.m());
    }

    private final void g(String str) {
        boolean b = this.c.b();
        boolean f = f(str);
        if (b) {
            e().subscribeDevice(new pib(str));
            this.d.A(str);
            return;
        }
        Logger logger = this.e;
        logger.info("Token wasn't send to API! User authorized: " + b + "; Has token changed: " + f);
    }

    @Override // defpackage.xda
    public void a(String str) {
        z65.h(str, "token");
        g(str);
    }

    @Override // defpackage.xda
    public void b() {
        this.d.y();
        e().unsubscribeDevice();
    }

    @Override // defpackage.xda
    public void c() {
        g(this.b.a());
    }

    @Override // defpackage.xda
    public void d(String str) {
        String F;
        z65.h(str, "orderId");
        F = l0b.F(str, "-", "", false, 4, null);
        ServicePushApi e = e();
        z65.g(e, "<get-servicePushApi>(...)");
        ServicePushApi.a.a(e, F, null, 2, null);
    }
}
