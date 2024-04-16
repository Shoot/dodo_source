package defpackage;

import defpackage.cw5;
import defpackage.yv5;
import kotlin.Metadata;
/* compiled from: LocationReceivedResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcw5;", "Lyv5;", "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: zv5  reason: default package */
/* loaded from: classes.dex */
public final class zv5 {
    public static final yv5 a(cw5 cw5Var) {
        z65.h(cw5Var, "<this>");
        if (cw5Var instanceof cw5.d) {
            cw5.d dVar = (cw5.d) cw5Var;
            return new yv5.b(new ov5(dVar.a().getLatitude(), dVar.a().getLongitude(), null, null, 12, null));
        } else if (cw5Var instanceof cw5.a) {
            return new yv5.a(((cw5.a) cw5Var).a());
        } else {
            return yv5.c.a;
        }
    }
}
