package defpackage;

import kotlin.Metadata;
/* compiled from: CommonModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lyj1;", "", "Lre4;", "geocodeService", "Ljv5;", "localityService", "Lsj1;", "data", "Lj9a;", "selectedAddressState", "Lk9a;", "a", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yj1  reason: default package */
/* loaded from: classes2.dex */
public final class yj1 {
    public static final yj1 a = new yj1();

    private yj1() {
    }

    public final k9a a(re4 re4Var, jv5 jv5Var, sj1 sj1Var, j9a j9aVar) {
        String str;
        z65.h(re4Var, "geocodeService");
        z65.h(jv5Var, "localityService");
        z65.h(sj1Var, "data");
        z65.h(j9aVar, "selectedAddressState");
        boolean c = sj1Var.c();
        dt5 b = sj1Var.b();
        if (b != null) {
            str = b.d();
        } else {
            str = null;
        }
        return new l9a(re4Var, jv5Var, c, sj1Var.a(), str, j9aVar);
    }
}
