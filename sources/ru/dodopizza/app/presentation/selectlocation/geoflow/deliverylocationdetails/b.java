package ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a;
/* compiled from: AddressDetailsFieldVO.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "", "isLast", "a", "", com.huawei.hms.opendevice.c.a, "(Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;)Ljava/lang/String;", "value", com.huawei.hms.push.e.a, "(Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;)Z", "b", RemoteMessageConst.Notification.TAG, DateTokenConverter.CONVERTER_KEY, "isComment", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b {
    public static final a a(a aVar, boolean z) {
        z65.h(aVar, "<this>");
        if (e(aVar) != z) {
            if (aVar instanceof a.b) {
                return a.b.b((a.b) aVar, null, null, z, 3, null);
            }
            if (aVar instanceof a.C0607a) {
                return a.C0607a.b((a.C0607a) aVar, null, null, null, z, 7, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        return aVar;
    }

    public static final String b(a aVar) {
        z65.h(aVar, "<this>");
        if (aVar instanceof a.b) {
            return ((a.b) aVar).c().getValue();
        }
        if (aVar instanceof a.C0607a) {
            return ((a.C0607a) aVar).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String c(a aVar) {
        z65.h(aVar, "<this>");
        if (aVar instanceof a.b) {
            return ((a.b) aVar).d();
        }
        if (aVar instanceof a.C0607a) {
            return ((a.C0607a) aVar).e();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean d(a aVar) {
        z65.h(aVar, "<this>");
        if (aVar instanceof a.b) {
            if (((a.b) aVar).c() == nx2.k) {
                return true;
            }
            return false;
        } else if (aVar instanceof a.C0607a) {
            return z65.c(((a.C0607a) aVar).c(), nx2.k.getValue());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean e(a aVar) {
        z65.h(aVar, "<this>");
        if (aVar instanceof a.b) {
            return ((a.b) aVar).e();
        }
        if (aVar instanceof a.C0607a) {
            return ((a.C0607a) aVar).f();
        }
        throw new NoWhenBranchMatchedException();
    }
}
