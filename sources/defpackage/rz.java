package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.pincodelogin.d;
/* compiled from: AuthorizationAppModule.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, d2 = {"Lrz;", "", "Lb00;", "b", "a", "Lv53;", "dodoDomainState", "Li00;", c.a, "Lr68;", "f", "Lru/dodopizza/app/presentation/pincodelogin/d;", e.a, "Lih4;", "googlePlayServicesService", "Lhq3;", "featureService", "Lr28;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rz  reason: default package */
/* loaded from: classes3.dex */
public class rz {
    protected b00 a() {
        return new b00(5000L);
    }

    public final b00 b() {
        return a();
    }

    public final i00 c(v53 v53Var) {
        z65.h(v53Var, "dodoDomainState");
        return v53Var;
    }

    public final r28 d(ih4 ih4Var, hq3 hq3Var) {
        z65.h(ih4Var, "googlePlayServicesService");
        z65.h(hq3Var, "featureService");
        return new s28(ih4Var, hq3Var);
    }

    public final d e() {
        return d.a;
    }

    public final r68 f() {
        return new s68();
    }
}
