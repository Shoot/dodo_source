package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: GeoAnalytics.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0000\u001a\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b\u001a\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¨\u0006\u0012"}, d2 = {"Ldc;", "b", e.a, "Lov5;", "location", "f", com.huawei.hms.opendevice.c.a, "", "field", "Lck1;", "sender", "", "isNewAddressSystem", "a", "", "lat", "lon", DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: md4  reason: default package */
/* loaded from: classes4.dex */
public final class md4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: md4$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ ck1 a;
        final /* synthetic */ boolean b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ck1 ck1Var, boolean z, String str) {
            super(1);
            this.a = ck1Var;
            this.b = z;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            vc.h(bcVar, this.b);
            return bc.e(bcVar, "field", this.c, false, 4, null);
        }
    }

    /* compiled from: GeoAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: md4$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ double a;
        final /* synthetic */ double b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(double d, double d2) {
            super(1);
            this.a = d;
            this.b = d2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            Map k;
            z65.h(bcVar, "$this$eventProducer");
            k = g86.k(lnb.a("lat", Double.valueOf(this.a)), lnb.a("lon", Double.valueOf(this.b)));
            return bc.e(bcVar, "position", k, false, 4, null);
        }
    }

    /* compiled from: GeoAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: md4$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ ov5 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ov5 ov5Var) {
            super(1);
            this.a = ov5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            Map k;
            z65.h(bcVar, "$this$eventProducer");
            k = g86.k(lnb.a("lat", Double.valueOf(this.a.b())), lnb.a("lon", Double.valueOf(this.a.c())));
            return bc.e(bcVar, "location", k, false, 4, null);
        }
    }

    public static final dc a(String str, ck1 ck1Var, boolean z) {
        z65.h(str, "field");
        z65.h(ck1Var, "sender");
        return ec.a("address_information_changed", new a(ck1Var, z, str));
    }

    public static final dc b() {
        return ec.b("current_location_click", null, 2, null);
    }

    public static final dc c() {
        return ec.b("open_geolocator_form", null, 2, null);
    }

    public static final dc d(double d, double d2) {
        return ec.a("pin_position_changed", new b(d, d2));
    }

    public static final dc e() {
        return ec.b("request_user_location", null, 2, null);
    }

    public static final dc f(ov5 ov5Var) {
        z65.h(ov5Var, "location");
        return ec.a("current_location_click", new c(ov5Var));
    }
}
