package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.mv9;
import defpackage.qv9;
import kotlin.Metadata;
/* compiled from: ScheduleStatus.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmv9$a;", "Lrv9;", DateTokenConverter.CONVERTER_KEY, "(Lmv9$a;)Lrv9;", "toScheduleStatus", "Lqv9$a;", "", e.a, "(Lqv9$a;)Z", "willBeOpenToday", "Lqv9$b;", "", "b", "(Lqv9$b;)Ljava/lang/String;", RemoteMessageConst.FROM, c.a, RemoteMessageConst.TO, "a", "(Lqv9$a;)Ljava/lang/String;", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: sv9  reason: default package */
/* loaded from: classes4.dex */
public final class sv9 {
    public static final String a(qv9.a aVar) {
        z65.h(aVar, "<this>");
        String b = aVar.b().b();
        z65.g(b, "getFrom(...)");
        return b;
    }

    public static final String b(qv9.b bVar) {
        z65.h(bVar, "<this>");
        String b = bVar.a().b();
        z65.g(b, "getFrom(...)");
        return b;
    }

    public static final String c(qv9.b bVar) {
        z65.h(bVar, "<this>");
        String c = bVar.a().c();
        z65.g(c, "getTo(...)");
        return c;
    }

    public static final rv9 d(mv9.a aVar) {
        z65.h(aVar, "<this>");
        return new rv9(aVar);
    }

    public static final boolean e(qv9.a aVar) {
        z65.h(aVar, "<this>");
        return z65.c(aVar.a(), aVar.b());
    }
}
