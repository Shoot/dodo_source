package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.atb;
import kotlin.Metadata;
/* compiled from: UpsaleMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\n\u001a\u00020\t*\u00020\b\u001a\n\u0010\u000b\u001a\u00020\b*\u00020\t¨\u0006\f"}, d2 = {"Latb$a;", "Lzsb;", DateTokenConverter.CONVERTER_KEY, "Lftb;", "Letb;", "a", e.a, "f", "Lvsb;", "Lkm8;", c.a, "b", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: usb  reason: default package */
/* loaded from: classes2.dex */
public final class usb {
    public static final etb a(ftb ftbVar) {
        z65.h(ftbVar, "<this>");
        return new etb(ftbVar.a(), ftbVar.b(), ftbVar.d(), ftbVar.e(), b(ftbVar.c()));
    }

    public static final vsb b(km8 km8Var) {
        z65.h(km8Var, "<this>");
        return new vsb(Integer.parseInt(km8Var.a()), Float.parseFloat(km8Var.getValue()));
    }

    public static final km8 c(vsb vsbVar) {
        z65.h(vsbVar, "<this>");
        return new km8(String.valueOf(vsbVar.a()), km8.c.a(String.valueOf(vsbVar.b())));
    }

    public static final zsb d(atb.a aVar) {
        z65.h(aVar, "<this>");
        return new zsb(aVar.b(), aVar.d(), aVar.c(), aVar.f(), aVar.e(), aVar.a(), a(aVar.g()));
    }

    public static final atb.a e(zsb zsbVar) {
        z65.h(zsbVar, "<this>");
        return new atb.a(zsbVar.b(), zsbVar.d(), zsbVar.c(), zsbVar.f(), zsbVar.e(), zsbVar.a(), f(zsbVar.g()));
    }

    public static final ftb f(etb etbVar) {
        z65.h(etbVar, "<this>");
        return new ftb(etbVar.a(), etbVar.d(), etbVar.b(), etbVar.e(), c(etbVar.c()));
    }
}
