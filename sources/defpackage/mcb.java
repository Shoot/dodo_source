package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextSelectionColors.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lmcb;", "", "other", "", "equals", "", "hashCode", "", "toString", "Luc1;", "a", "J", "getHandleColor-0d7_KjU", "()J", "handleColor", "b", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mcb  reason: default package */
/* loaded from: classes.dex */
public final class mcb {
    private final long a;
    private final long b;

    public /* synthetic */ mcb(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public final long a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcb)) {
            return false;
        }
        mcb mcbVar = (mcb) obj;
        if (uc1.l(this.a, mcbVar.a) && uc1.l(this.b, mcbVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (uc1.r(this.a) * 31) + uc1.r(this.b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) uc1.s(this.a)) + ", selectionBackgroundColor=" + ((Object) uc1.s(this.b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private mcb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
