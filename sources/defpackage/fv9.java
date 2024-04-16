package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ScaleFactor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004\u0088\u0001\f\u0092\u0001\u00020\u000bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lfv9;", "", "", "b", "(J)F", "getScaleX$annotations", "()V", "scaleX", c.a, "getScaleY$annotations", "scaleY", "", "packedValue", "a", "(J)J", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fv9  reason: default package */
/* loaded from: classes.dex */
public final class fv9 {
    public static final a a = new a(null);
    private static final long b = gv9.a(Float.NaN, Float.NaN);

    /* compiled from: ScaleFactor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfv9$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fv9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final float b(long j) {
        if (j != b) {
            gz3 gz3Var = gz3.a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final float c(long j) {
        if (j != b) {
            gz3 gz3Var = gz3.a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static long a(long j) {
        return j;
    }
}
