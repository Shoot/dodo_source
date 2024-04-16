package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.k9a;
import defpackage.ou2;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SelectedDeliveryAddressHandler.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Ll9a;", "Lk9a;", "Lou2$c;", "newDeliveryLocation", "", "isEmptyCart", "Lk9a$a;", DateTokenConverter.CONVERTER_KEY, "Lqw1;", MessageAttributes.COORDINATES, "Ldt5;", c.a, "Lou2;", "first", "second", "b", "newDeliverablePlace", "a", "Lre4;", "Lre4;", "geocodeService", "Ljv5;", "Ljv5;", "localityService", "Z", "", "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, e.a, "localityUUID", "Lj9a;", "f", "Lj9a;", "selectedAddressState", "<init>", "(Lre4;Ljv5;ZLjava/lang/String;Ljava/lang/String;Lj9a;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l9a  reason: default package */
/* loaded from: classes.dex */
public final class l9a implements k9a {
    private final re4 a;
    private final jv5 b;
    private final boolean c;
    private final String d;
    private final String e;
    private final j9a f;

    public l9a(re4 re4Var, jv5 jv5Var, boolean z, String str, String str2, j9a j9aVar) {
        z65.h(re4Var, "geocodeService");
        z65.h(jv5Var, "localityService");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(j9aVar, "selectedAddressState");
        this.a = re4Var;
        this.b = jv5Var;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = j9aVar;
    }

    private final boolean b(ou2 ou2Var, ou2 ou2Var2) {
        if ((ou2Var instanceof ou2.c) && (ou2Var2 instanceof ou2.c)) {
            ou2.c cVar = (ou2.c) ou2Var;
            ou2.c cVar2 = (ou2.c) ou2Var2;
            if (z65.c(cVar.b().getId(), cVar2.b().getId()) && z65.c(cVar.b().c().d(), cVar2.b().c().d()) && z65.c(cVar.b().c().c(), cVar2.b().c().c())) {
                return true;
            }
            return false;
        }
        return z65.c(ou2Var, ou2Var2);
    }

    private final dt5 c(qw1 qw1Var) {
        String b = this.a.b(qw1Var, this.d);
        if (b != null) {
            return this.b.b(this.d, b);
        }
        return null;
    }

    private final k9a.a d(ou2.c cVar, boolean z) {
        e91 b = cVar.b();
        dt5 c = c(b.c().d());
        if (c == null) {
            return new k9a.a.b(cVar);
        }
        if (z65.c(c.d(), this.e)) {
            return new k9a.a.e(new k9a.b(b, c, k9a.b.a.a));
        }
        k9a.b bVar = new k9a.b(b, c, k9a.b.a.b);
        if (z) {
            return new k9a.a.c(bVar);
        }
        return new k9a.a.d(bVar);
    }

    @Override // defpackage.k9a
    public k9a.a a(ou2 ou2Var) {
        z65.h(ou2Var, "newDeliverablePlace");
        ou2 g = this.f.g();
        if (b(ou2Var, g)) {
            return new k9a.a.C0407a(ru2.e(g));
        }
        return d((ou2.c) ou2Var, this.c);
    }
}
