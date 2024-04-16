package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DurationUnitJvm.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Ll93;", "", "Ljava/util/concurrent/TimeUnit;", "a", "Ljava/util/concurrent/TimeUnit;", "i", "()Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: l93  reason: default package */
/* loaded from: classes3.dex */
public final class l93 {
    public static final l93 b = new l93("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final l93 c = new l93("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final l93 d = new l93("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final l93 e = new l93("SECONDS", 3, TimeUnit.SECONDS);
    public static final l93 f = new l93("MINUTES", 4, TimeUnit.MINUTES);
    public static final l93 g = new l93("HOURS", 5, TimeUnit.HOURS);
    public static final l93 h = new l93("DAYS", 6, TimeUnit.DAYS);
    private static final /* synthetic */ l93[] i;
    private static final /* synthetic */ kj3 j;
    private final TimeUnit a;

    static {
        l93[] a = a();
        i = a;
        j = lj3.a(a);
    }

    private l93(String str, int i2, TimeUnit timeUnit) {
        this.a = timeUnit;
    }

    private static final /* synthetic */ l93[] a() {
        return new l93[]{b, c, d, e, f, g, h};
    }

    public static l93 valueOf(String str) {
        return (l93) Enum.valueOf(l93.class, str);
    }

    public static l93[] values() {
        return (l93[]) i.clone();
    }

    public final TimeUnit i() {
        return this.a;
    }
}
