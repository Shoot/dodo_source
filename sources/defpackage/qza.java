package defpackage;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: StringExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "Ljava/util/Locale;", "locale", "a", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: qza  reason: default package */
/* loaded from: classes4.dex */
public final class qza {
    public static final String a(String str, Locale locale) {
        String valueOf;
        z65.h(str, "<this>");
        z65.h(locale, "locale");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = nw0.d(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            z65.g(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    public static final Date b(String str) {
        z65.h(str, "<this>");
        String d = d(str);
        SimpleDateFormat c = c(d.length());
        if (c == null) {
            return null;
        }
        try {
            c.setLenient(false);
            return c.parse(d);
        } catch (ParseException unused) {
            return null;
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat c(int i) {
        if (i != 4) {
            if (i != 6) {
                return null;
            }
            return new SimpleDateFormat("MMyyyy");
        }
        return new SimpleDateFormat("MMyy");
    }

    public static final String d(String str) {
        z65.h(str, "<this>");
        char[] charArray = str.toCharArray();
        z65.g(charArray, "toCharArray(...)");
        ArrayList<Character> arrayList = new ArrayList();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                arrayList.add(Character.valueOf(c));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch2 : arrayList) {
            sb.append(ch2.charValue());
            z65.g(sb, "append(...)");
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }
}
