package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CharJVM.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¨\u0006\r"}, d2 = {"", "", c.a, "Ljava/util/Locale;", "locale", "", e.a, DateTokenConverter.CONVERTER_KEY, "char", "", "radix", "b", "a", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/CharsKt")
/* renamed from: nw0  reason: default package */
/* loaded from: classes3.dex */
public class nw0 {
    public static int a(int i) {
        if (new IntRange(2, 36).v(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }

    public static final int b(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final boolean c(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    public static String d(char c, Locale locale) {
        z65.h(locale, "locale");
        String e = e(c, locale);
        if (e.length() > 1) {
            if (c != 329) {
                char charAt = e.charAt(0);
                z65.f(e, "null cannot be cast to non-null type java.lang.String");
                String substring = e.substring(1);
                z65.g(substring, "substring(...)");
                z65.f(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                z65.g(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return e;
        }
        String valueOf = String.valueOf(c);
        z65.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        z65.g(upperCase, "toUpperCase(...)");
        if (!z65.c(e, upperCase)) {
            return e;
        }
        return String.valueOf(Character.toTitleCase(c));
    }

    public static final String e(char c, Locale locale) {
        z65.h(locale, "locale");
        String valueOf = String.valueOf(c);
        z65.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        z65.g(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
