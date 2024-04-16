package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextIndent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u001e\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Libb;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lwcb;", "a", "J", "b", "()J", "firstLine", c.a, "restLine", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ibb  reason: default package */
/* loaded from: classes.dex */
public final class ibb {
    public static final a c = new a(null);
    private static final ibb d = new ibb(0, 0, 3, null);
    private final long a;
    private final long b;

    /* compiled from: TextIndent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Libb$a;", "", "Libb;", "None", "Libb;", "a", "()Libb;", "getNone$annotations", "()V", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ibb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ibb a() {
            return ibb.d;
        }
    }

    public /* synthetic */ ibb(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibb)) {
            return false;
        }
        ibb ibbVar = (ibb) obj;
        if (wcb.e(this.a, ibbVar.a) && wcb.e(this.b, ibbVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (wcb.i(this.a) * 31) + wcb.i(this.b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) wcb.j(this.a)) + ", restLine=" + ((Object) wcb.j(this.b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private ibb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ ibb(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? xcb.e(0) : j, (i & 2) != 0 ? xcb.e(0) : j2, null);
    }
}
