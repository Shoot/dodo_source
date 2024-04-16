package defpackage;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocationResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcw5;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lcw5$d;", "Lcw5$a;", "Lcw5$b;", "Lcw5$c;", "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: cw5  reason: default package */
/* loaded from: classes2.dex */
public abstract class cw5 {

    /* compiled from: LocationResult.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcw5$a;", "Lcw5;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: cw5$a */
    /* loaded from: classes2.dex */
    public static final class a extends cw5 {
        private final Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(null);
            z65.h(th, "throwable");
            this.a = th;
        }

        public final Throwable a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof a) || !z65.c(this.a, ((a) obj).a)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Failure(throwable=" + this.a + ")";
        }
    }

    /* compiled from: LocationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw5$b;", "Lcw5;", "<init>", "()V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: cw5$b */
    /* loaded from: classes2.dex */
    public static final class b extends cw5 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: LocationResult.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcw5$c;", "Lcw5;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lgj9;", "a", "Lgj9;", "()Lgj9;", "resolvableApiException", "<init>", "(Lgj9;)V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: cw5$c */
    /* loaded from: classes2.dex */
    public static final class c extends cw5 {
        private final gj9 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gj9 gj9Var) {
            super(null);
            z65.h(gj9Var, "resolvableApiException");
            this.a = gj9Var;
        }

        public final gj9 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof c) || !z65.c(this.a, ((c) obj).a)) {
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
            return "ProvidersDisabled(resolvableApiException=" + this.a + ")";
        }
    }

    /* compiled from: LocationResult.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcw5$d;", "Lcw5;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/location/Location;", "a", "Landroid/location/Location;", "()Landroid/location/Location;", "location", "<init>", "(Landroid/location/Location;)V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: cw5$d */
    /* loaded from: classes2.dex */
    public static final class d extends cw5 {
        private final Location a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Location location) {
            super(null);
            z65.h(location, "location");
            this.a = location;
        }

        public final Location a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof d) || !z65.c(this.a, ((d) obj).a)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public int hashCode() {
            Location location = this.a;
            if (location != null) {
                return location.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(location=" + this.a + ")";
        }
    }

    private cw5() {
    }

    public /* synthetic */ cw5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
