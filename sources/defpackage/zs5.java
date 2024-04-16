package defpackage;

import defpackage.sl5;
import kotlin.Metadata;
/* compiled from: LocaleListServiceModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lzs5;", "", "Lwl5;", "languageService", "Lry1;", "countryRepository", "Lny1;", "b", "countryLanguageConfigService", "Lsl5$a;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: zs5  reason: default package */
/* loaded from: classes3.dex */
public final class zs5 {
    public static final zs5 a = new zs5();

    private zs5() {
    }

    public final sl5.a a(ny1 ny1Var) {
        z65.h(ny1Var, "countryLanguageConfigService");
        return new sl5.a(ny1Var);
    }

    public final ny1 b(wl5 wl5Var, ry1 ry1Var) {
        z65.h(wl5Var, "languageService");
        z65.h(ry1Var, "countryRepository");
        return new ny1(wl5Var, ry1Var);
    }
}
