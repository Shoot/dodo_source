package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SbpAnalytics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lgu9;", "", "Ldc;", c.a, "", "isVpnEnabled", "", "errorText", DateTokenConverter.CONVERTER_KEY, "b", "a", e.a, "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gu9  reason: default package */
/* loaded from: classes4.dex */
public final class gu9 {
    public static final gu9 a = new gu9();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SbpAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gu9$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, String str) {
            super(1);
            this.a = z;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "isVpnEnabled", Boolean.valueOf(this.a), false, 4, null);
            return bc.e(bcVar, "errorText", this.b, false, 4, null);
        }
    }

    private gu9() {
    }

    public final dc a() {
        return ec.b("sbp_bank_app_open_error", null, 2, null);
    }

    public final dc b() {
        return ec.b("sbp_bank_app_opened", null, 2, null);
    }

    public final dc c() {
        return ec.b("sbp_banks_loaded", null, 2, null);
    }

    public final dc d(boolean z, String str) {
        z65.h(str, "errorText");
        return ec.a("sbp_banks_load_error", new a(z, str));
    }

    public final dc e() {
        return ec.b("sbp_cancelled", null, 2, null);
    }
}
