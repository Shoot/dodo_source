package defpackage;

import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: CardTypeFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lyp0;", "", "", "number", "intervalStart", "intervalEnd", "", "b", "numStr", "Lwp0;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yp0  reason: default package */
/* loaded from: classes2.dex */
public final class yp0 {
    public static final yp0 a = new yp0();

    private yp0() {
    }

    private final boolean b(String str, String str2, String str3) {
        int min = Math.min(str.length(), str2.length());
        int min2 = Math.min(str.length(), str3.length());
        String substring = str.substring(0, min);
        z65.g(substring, "substring(...)");
        int parseInt = Integer.parseInt(substring);
        String substring2 = str2.substring(0, min);
        z65.g(substring2, "substring(...)");
        if (parseInt < Integer.parseInt(substring2)) {
            return false;
        }
        String substring3 = str.substring(0, min2);
        z65.g(substring3, "substring(...)");
        int parseInt2 = Integer.parseInt(substring3);
        String substring4 = str3.substring(0, min2);
        z65.g(substring4, "substring(...)");
        if (parseInt2 > Integer.parseInt(substring4)) {
            return false;
        }
        return true;
    }

    public final wp0 a(String str) {
        z65.h(str, "numStr");
        if (str.length() == 0) {
            return zp0.p;
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<Pair<String, String>, wp0> entry : zp0.b.b().entrySet()) {
            if (b(str, entry.getKey().c(), entry.getKey().d())) {
                hashSet.add(entry.getValue());
            }
        }
        if (hashSet.size() > 1) {
            return zp0.q;
        }
        if (hashSet.size() == 1) {
            Object next = hashSet.iterator().next();
            z65.g(next, "next(...)");
            return (wp0) next;
        }
        return zp0.p;
    }
}
