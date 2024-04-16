package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Placeholder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR \u0010\u0014\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Ljb8;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lwcb;", "a", "J", c.a, "()J", "width", "b", "height", "Lob8;", "I", "()I", "placeholderVerticalAlign", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jb8  reason: default package */
/* loaded from: classes.dex */
public final class jb8 {
    private final long a;
    private final long b;
    private final int c;

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb8)) {
            return false;
        }
        jb8 jb8Var = (jb8) obj;
        if (wcb.e(this.a, jb8Var.a) && wcb.e(this.b, jb8Var.b) && ob8.i(this.c, jb8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((wcb.i(this.a) * 31) + wcb.i(this.b)) * 31) + ob8.j(this.c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) wcb.j(this.a)) + ", height=" + ((Object) wcb.j(this.b)) + ", placeholderVerticalAlign=" + ((Object) ob8.k(this.c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
