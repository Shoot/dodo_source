package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import ru.dodopizza.mindbox.model.User;
/* compiled from: CustomerExt.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln42;", "Lru/dodopizza/mindbox/model/User;", "b", "", "birthDay", "birthMonth", "", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: f52  reason: default package */
/* loaded from: classes4.dex */
public final class f52 {
    private static final String a(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1992, num2.intValue() - 1, num.intValue());
            String format = new SimpleDateFormat("dd.MM.yyyy", Locale.US).format(calendar.getTime());
            z65.e(format);
            return format;
        }
        return "";
    }

    public static final User b(n42 n42Var) {
        CharSequence R0;
        z65.h(n42Var, "<this>");
        String i = n42Var.i();
        R0 = m0b.R0(n42Var.h());
        return new User(i, R0.toString(), n42Var.m().toString(), a(n42Var.d(), n42Var.e()), n42Var.g(), n42Var.n());
    }
}
