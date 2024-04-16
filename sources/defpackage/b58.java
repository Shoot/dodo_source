package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PhonePrefixVO.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"Lj48;", "", "isSelected", "La58;", e.a, "", "filter", "b", "f", "", "text", "a", c.a, DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: b58  reason: default package */
/* loaded from: classes4.dex */
public final class b58 {
    private static final CharSequence a(CharSequence charSequence, String str) {
        int Z;
        Z = m0b.Z(charSequence, str, 0, true, 2, null);
        if (Z == -1) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(1), Z, str.length() + Z, 0);
        return spannableStringBuilder;
    }

    public static final boolean b(a58 a58Var, String str) {
        z65.h(a58Var, "<this>");
        z65.h(str, "filter");
        if (!c(a58Var, str) && !d(a58Var, str)) {
            return false;
        }
        return true;
    }

    private static final boolean c(a58 a58Var, String str) {
        boolean D0;
        D0 = m0b.D0(a58Var.d(), str, true);
        return D0;
    }

    private static final boolean d(a58 a58Var, String str) {
        boolean M;
        M = m0b.M(a58Var.e(), str, true);
        return M;
    }

    public static final a58 e(j48 j48Var, boolean z) {
        z65.h(j48Var, "<this>");
        return new a58(j48Var.a(), j48Var.c(), j48Var.b(), z, false);
    }

    public static final a58 f(a58 a58Var, String str) {
        z65.h(a58Var, "<this>");
        z65.h(str, "filter");
        if (c(a58Var, str)) {
            return a58.b(a58Var, null, null, a(a58Var.d(), str), false, false, 27, null);
        }
        if (d(a58Var, str)) {
            return a58.b(a58Var, null, a(a58Var.e(), str), null, false, false, 29, null);
        }
        return a58Var;
    }
}
