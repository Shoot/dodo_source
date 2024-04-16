package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import defpackage.k65;
import kotlin.Metadata;
/* compiled from: ChainExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, d2 = {"Lk65$a;", "", c.a, "b", DateTokenConverter.CONVERTER_KEY, SearchIntents.EXTRA_QUERY, "a", "backend"}, k = 2, mv = {1, 9, 0})
/* renamed from: uu0  reason: default package */
/* loaded from: classes4.dex */
public final class uu0 {
    public static final String a(String str) {
        boolean y;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                String str2 = CallerData.NA + str;
                z65.e(str2);
                return str2;
            }
        }
        return "";
    }

    public static final String b(k65.a aVar) {
        z65.h(aVar, "<this>");
        return aVar.request().l().k();
    }

    public static final String c(k65.a aVar) {
        z65.h(aVar, "<this>");
        return aVar.request().l().c();
    }

    public static final String d(k65.a aVar) {
        z65.h(aVar, "<this>");
        return aVar.request().l().e();
    }
}
