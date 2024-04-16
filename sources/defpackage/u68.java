package defpackage;

import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MapController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lu68;", "", "<init>", "()V", "a", "b", "Lu68$a;", "Lu68$b;", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u68  reason: default package */
/* loaded from: classes2.dex */
public abstract class u68 {

    /* compiled from: MapController.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lu68$a;", "Lu68;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/google/android/gms/maps/model/LatLng;", "a", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "latLng", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u68$a */
    /* loaded from: classes2.dex */
    public static final class a extends u68 {
        private final LatLng a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LatLng latLng) {
            super(null);
            z65.h(latLng, "latLng");
            this.a = latLng;
        }

        public final LatLng a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            LatLng latLng = this.a;
            return "Idle(latLng=" + latLng + ")";
        }
    }

    /* compiled from: MapController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu68$b;", "Lu68;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u68$b */
    /* loaded from: classes2.dex */
    public static final class b extends u68 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private u68() {
    }

    public /* synthetic */ u68(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
