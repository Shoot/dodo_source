package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: MoneyStringFormatter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u000b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Ltn6;", "", "", "amount", "Ljava/util/Locale;", "locale", "", c.a, "Lhn6;", "money", "b", "a"}, k = 1, mv = {1, 4, 2})
/* renamed from: tn6  reason: default package */
/* loaded from: classes.dex */
public interface tn6 {

    /* compiled from: MoneyStringFormatter.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* renamed from: tn6$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ String a(tn6 tn6Var, double d, Locale locale, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    locale = null;
                }
                return tn6Var.c(d, locale);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: amountFormat");
        }

        public static /* synthetic */ String b(tn6 tn6Var, hn6 hn6Var, Locale locale, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    locale = null;
                }
                return tn6Var.b(hn6Var, locale);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
    }

    String a();

    String b(hn6 hn6Var, Locale locale);

    String c(double d, Locale locale);
}
