package defpackage;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GeoLocationProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lke4;", "", "<init>", "()V", "a", "b", "Lke4$b;", "Lke4$a;", "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: ke4  reason: default package */
/* loaded from: classes2.dex */
public abstract class ke4 {

    /* compiled from: GeoLocationProvider.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lke4$a;", "Lke4;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: ke4$a */
    /* loaded from: classes2.dex */
    public static final class a extends ke4 {
        private final Throwable a;

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

    /* compiled from: GeoLocationProvider.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lke4$b;", "Lke4;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/location/Location;", "a", "Landroid/location/Location;", "()Landroid/location/Location;", "location", "<init>", "(Landroid/location/Location;)V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: ke4$b */
    /* loaded from: classes2.dex */
    public static final class b extends ke4 {
        private final Location a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Location location) {
            super(null);
            z65.h(location, "location");
            this.a = location;
        }

        public final Location a() {
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

    private ke4() {
    }

    public /* synthetic */ ke4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
