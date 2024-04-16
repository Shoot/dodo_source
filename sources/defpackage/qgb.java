package defpackage;

import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: TimeProfiler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lqgb;", "", "", "event", "", "showInLog", "", "a", "", "b", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "stamps", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qgb  reason: default package */
/* loaded from: classes4.dex */
public final class qgb {
    public static final qgb a = new qgb();
    private static final HashMap<String, Long> b = new HashMap<>();

    private qgb() {
    }

    public static final void a(String str, boolean z) {
        z65.h(str, "event");
        b.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static final long b(String str) {
        z65.h(str, "event");
        HashMap<String, Long> hashMap = b;
        Long l = hashMap.get(str);
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            hashMap.remove(str);
            return currentTimeMillis;
        }
        return -1L;
    }
}
