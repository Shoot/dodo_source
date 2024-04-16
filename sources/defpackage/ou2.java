package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliverablePlace.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lou2;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lou2$b;", "Lou2$c;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ou2  reason: default package */
/* loaded from: classes4.dex */
public abstract class ou2 implements Serializable {
    public static final a a = new a(null);
    private static final ou2 b = ru2.b(w6.n);

    /* compiled from: DeliverablePlace.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lou2$a;", "", "Lou2;", "DEFAULT", "Lou2;", "a", "()Lou2;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ou2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ou2 a() {
            return ou2.b;
        }
    }

    /* compiled from: DeliverablePlace.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lou2$b;", "Lou2;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lw6;", com.huawei.hms.opendevice.c.a, "Lw6;", "b", "()Lw6;", "address", "<init>", "(Lw6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ou2$b */
    /* loaded from: classes4.dex */
    public static final class b extends ou2 implements Serializable {
        private final w6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w6 w6Var) {
            super(null);
            z65.h(w6Var, "address");
            this.c = w6Var;
        }

        public final w6 b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.c, ((b) obj).c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            w6 w6Var = this.c;
            return "DeliverableAddress(address=" + w6Var + ")";
        }
    }

    /* compiled from: DeliverablePlace.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lou2$c;", "Lou2;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", com.huawei.hms.opendevice.c.a, "Le91;", "b", "()Le91;", "clientDeliveryLocation", "<init>", "(Le91;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ou2$c */
    /* loaded from: classes4.dex */
    public static final class c extends ou2 implements Serializable {
        private final e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e91 e91Var) {
            super(null);
            z65.h(e91Var, "clientDeliveryLocation");
            this.c = e91Var;
        }

        public final e91 b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && z65.c(this.c, ((c) obj).c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            e91 e91Var = this.c;
            return "DeliverableLocation(clientDeliveryLocation=" + e91Var + ")";
        }
    }

    private ou2() {
    }

    public /* synthetic */ ou2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
