package defpackage;

import kotlin.Metadata;
/* compiled from: NotificationTextFilter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"La37;", "Ly27;", "", "text", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a37  reason: default package */
/* loaded from: classes3.dex */
public final class a37 implements y27 {
    @Override // defpackage.y27
    public String a(String str) {
        z65.h(str, "text");
        StringBuilder sb = new StringBuilder("");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!(Character.isHighSurrogate(charAt) | Character.isLowSurrogate(charAt))) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }
}
