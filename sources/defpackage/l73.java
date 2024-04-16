package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.i73;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Dp.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0014\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R#\u0010\n\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004\u0088\u0001\f\u0092\u0001\u00020\u000bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Ll73;", "", "Li73;", e.a, "(J)F", "getWidth-D9Ej5fM$annotations", "()V", "width", DateTokenConverter.CONVERTER_KEY, "getHeight-D9Ej5fM$annotations", "height", "", "packedValue", c.a, "(J)J", "a", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: l73  reason: default package */
/* loaded from: classes.dex */
public final class l73 {
    public static final a a = new a(null);
    private static final long b;
    private static final long c;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Ll73$a;", "", "Ll73;", "Zero", "J", "b", "()J", "Unspecified", "a", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: l73$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return l73.c;
        }

        public final long b() {
            return l73.b;
        }
    }

    static {
        float f = 0;
        b = k73.a(i73.o(f), i73.o(f));
        i73.a aVar = i73.b;
        c = k73.a(aVar.b(), aVar.b());
    }

    public static final float d(long j) {
        if (j != c) {
            gz3 gz3Var = gz3.a;
            return i73.o(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float e(long j) {
        if (j != c) {
            gz3 gz3Var = gz3.a;
            return i73.o(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static long c(long j) {
        return j;
    }
}
