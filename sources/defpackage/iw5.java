package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GeoLocationProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Liw5;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Liw5$b;", "Liw5$a;", "Liw5$c;", "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: iw5  reason: default package */
/* loaded from: classes2.dex */
public abstract class iw5 {

    /* compiled from: GeoLocationProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Liw5$a;", "Liw5;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: iw5$a */
    /* loaded from: classes2.dex */
    public static final class a extends iw5 {
        private final Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(null);
            z65.h(exc, "exception");
            this.a = exc;
        }

        public final Exception a() {
            return this.a;
        }
    }

    /* compiled from: GeoLocationProvider.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Liw5$b;", "Liw5;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lgj9;", "a", "Lgj9;", "()Lgj9;", "resolvableApiException", "<init>", "(Lgj9;)V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: iw5$b */
    /* loaded from: classes2.dex */
    public static final class b extends iw5 {
        private final gj9 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gj9 gj9Var) {
            super(null);
            z65.h(gj9Var, "resolvableApiException");
            this.a = gj9Var;
        }

        public final gj9 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof b) || !z65.c(this.a, ((b) obj).a)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public int hashCode() {
            gj9 gj9Var = this.a;
            if (gj9Var != null) {
                return gj9Var.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Resolvable(resolvableApiException=" + this.a + ")";
        }
    }

    /* compiled from: GeoLocationProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liw5$c;", "Liw5;", "<init>", "()V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: iw5$c */
    /* loaded from: classes2.dex */
    public static final class c extends iw5 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private iw5() {
    }

    public /* synthetic */ iw5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
