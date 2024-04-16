package defpackage;

import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: CardUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Laq0;", "", "", "cardNumber", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: aq0  reason: default package */
/* loaded from: classes4.dex */
public final class aq0 {
    public static final aq0 a = new aq0();

    private aq0() {
    }

    public final String a(String str) {
        int h;
        z65.h(str, "cardNumber");
        h = i.h(str.length(), 6);
        String substring = str.substring(0, h);
        z65.g(substring, "substring(...)");
        return substring;
    }
}
