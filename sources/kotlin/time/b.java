package kotlin.time;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.ranges.f;
import kotlin.ranges.i;
/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002\u001a\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "Ll93;", "unit", "Lkotlin/time/a;", Image.TYPE_HIGH, "(ILl93;)J", "", "i", "(JLl93;)J", "millis", "g", "normalNanos", "f", "(J)J", "normalMillis", e.a, "normalValue", "unitDiscriminator", DateTokenConverter.CONVERTER_KEY, "(JI)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(long j, int i) {
        return a.k((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j) {
        return a.k((j << 1) + 1);
    }

    private static final long f(long j) {
        return a.k(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j) {
        return j * 1000000;
    }

    public static final long h(int i, l93 l93Var) {
        z65.h(l93Var, "unit");
        if (l93Var.compareTo(l93.e) <= 0) {
            return f(c.b(i, l93Var, l93.b));
        }
        return i(i, l93Var);
    }

    public static final long i(long j, l93 l93Var) {
        long m;
        z65.h(l93Var, "unit");
        l93 l93Var2 = l93.b;
        long b = c.b(4611686018426999999L, l93Var2, l93Var);
        if (!new f(-b, b).t(j)) {
            m = i.m(c.a(j, l93Var, l93.d), -4611686018427387903L, 4611686018427387903L);
            return e(m);
        }
        return f(c.b(j, l93Var, l93Var2));
    }
}
