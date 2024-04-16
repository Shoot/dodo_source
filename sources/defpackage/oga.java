package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Shadow.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\nB(\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R)\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR)\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0013\u0010\rR \u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0012\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Loga;", "", "other", "", "equals", "", "hashCode", "", "toString", "Luc1;", "a", "J", c.a, "()J", "getColor-0d7_KjU$annotations", "()V", RemoteMessageConst.Notification.COLOR, "Ls67;", "b", DateTokenConverter.CONVERTER_KEY, "getOffset-F1C5BW0$annotations", "offset", "", "F", "()F", "getBlurRadius$annotations", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: oga  reason: default package */
/* loaded from: classes.dex */
public final class oga {
    public static final a d = new a(null);
    private static final oga e = new oga(0, 0, 0.0f, 7, null);
    private final long a;
    private final long b;
    private final float c;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Loga$a;", "", "Loga;", "None", "Loga;", "a", "()Loga;", "getNone$annotations", "()V", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: oga$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oga a() {
            return oga.e;
        }
    }

    public /* synthetic */ oga(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    public final float b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oga)) {
            return false;
        }
        oga ogaVar = (oga) obj;
        if (uc1.l(this.a, ogaVar.a) && s67.i(this.b, ogaVar.b) && this.c == ogaVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((uc1.r(this.a) * 31) + s67.n(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) uc1.s(this.a)) + ", offset=" + ((Object) s67.r(this.b)) + ", blurRadius=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private oga(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public /* synthetic */ oga(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yc1.d(4278190080L) : j, (i & 2) != 0 ? s67.b.c() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }
}
