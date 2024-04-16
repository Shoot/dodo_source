package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: MoneyStringFormatter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0003"}, d2 = {"Lu1b;", "Lb80;", "Lhn6;", "money", "Ljava/util/Locale;", "locale", "", "b", "symbol", "<init>", "(Ljava/lang/String;Ljava/util/Locale;)V"}, k = 1, mv = {1, 4, 2})
/* renamed from: u1b  reason: default package */
/* loaded from: classes.dex */
public final class u1b extends b80 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ u1b(java.lang.String r1, java.util.Locale r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "Locale.getDefault()"
            defpackage.z65.g(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1b.<init>(java.lang.String, java.util.Locale, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // defpackage.tn6
    public String b(hn6 hn6Var, Locale locale) {
        z65.h(hn6Var, "money");
        return c(hn6Var.b().doubleValue(), locale) + ' ' + e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1b(String str, Locale locale) {
        super(str, locale);
        z65.h(str, "symbol");
        z65.h(locale, "locale");
    }
}
