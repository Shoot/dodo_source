package defpackage;

import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: ServerDateTimeParser.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/TimeZone;", "a", "Ljava/util/TimeZone;", "()Ljava/util/TimeZone;", "TIME_ZONE_UTC", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: hda  reason: default package */
/* loaded from: classes4.dex */
public final class hda {
    private static final TimeZone a;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        z65.g(timeZone, "getTimeZone(...)");
        a = timeZone;
    }

    public static final TimeZone a() {
        return a;
    }
}
