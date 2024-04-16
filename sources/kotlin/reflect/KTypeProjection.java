package kotlin.reflect;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;
/* compiled from: KTypeProjection.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "", "toString", "", "hashCode", "other", "", "equals", "Loe5;", "a", "Loe5;", "getVariance", "()Loe5;", "variance", "Lne5;", MessageAttributes.TYPE, "<init>", "(Loe5;Lne5;)V", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class KTypeProjection {
    public static final a b = new a(null);
    public static final KTypeProjection c = new KTypeProjection(null, null);
    private final oe5 a;

    /* compiled from: KTypeProjection.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/KTypeProjection$a;", "", "Lkotlin/reflect/KTypeProjection;", "star", "Lkotlin/reflect/KTypeProjection;", "getStar$annotations", "()V", "<init>", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[oe5.values().length];
            try {
                iArr[oe5.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oe5.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oe5.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeProjection(oe5 oe5Var, ne5 ne5Var) {
        String str;
        this.a = oe5Var;
        if (oe5Var == null) {
            return;
        }
        if (oe5Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + oe5Var + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof KTypeProjection) && this.a == ((KTypeProjection) obj).a && z65.c(null, null)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        oe5 oe5Var = this.a;
        if (oe5Var == null) {
            hashCode = 0;
        } else {
            hashCode = oe5Var.hashCode();
        }
        return hashCode * 31;
    }

    public String toString() {
        int i;
        oe5 oe5Var = this.a;
        if (oe5Var == null) {
            i = -1;
        } else {
            i = b.$EnumSwitchMapping$0[oe5Var.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + ((Object) null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "in " + ((Object) null);
            }
            return "null";
        }
        return Marker.ANY_MARKER;
    }
}
