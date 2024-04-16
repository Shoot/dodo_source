package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import defpackage.ep9;
import defpackage.zo9;
import kotlin.Metadata;
/* compiled from: RoutingStrategy.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nH\u0016J \u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lbp9;", "Lzo9;", "Lep9;", "u0", "", "addressListWasShown", "d0", "Lzo9$c;", "request", "c0", "Lzo9$b;", "F", "Le91;", "clientDeliveryLocation", "isFromState", "s0", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bp9  reason: default package */
/* loaded from: classes2.dex */
public final class bp9 implements zo9 {
    @Override // defpackage.zo9
    public ep9 F(zo9.b bVar) {
        z65.h(bVar, "request");
        if (bVar.f()) {
            return new ep9.a(new a.AbstractC0149a.C0150a(bVar.b(), bVar.d()));
        }
        return new ep9.d(new c.a.C0131a(bVar.b(), bVar.f(), bVar.e(), bVar.c()));
    }

    @Override // defpackage.zo9
    public ep9 c0(zo9.c cVar) {
        z65.h(cVar, "request");
        return ep9.c.a;
    }

    @Override // defpackage.zo9
    public ep9 d0(boolean z) {
        if (z) {
            return new ep9.d(c.a.C0132c.a);
        }
        return new ep9.a(a.AbstractC0149a.e.a);
    }

    @Override // defpackage.zo9
    public ep9 s0(e91 e91Var, boolean z, boolean z2) {
        z65.h(e91Var, "clientDeliveryLocation");
        return new ep9.d(new c.a.b(e91Var, z));
    }

    @Override // defpackage.zo9
    public ep9 u0() {
        return new ep9.a(a.AbstractC0149a.e.a);
    }
}
