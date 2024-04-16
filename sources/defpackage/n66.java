package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.rg4;
import defpackage.u68;
import im.threads.ui.fragments.ChatFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: MapController.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u00036:?B\u0007¢\u0006\u0004\bY\u0010ZJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ$\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0016\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0016\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\b\u0010 \u001a\u00020\u0006H\u0004J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0013J\u001a\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u0010H\u0016J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0006J\b\u0010,\u001a\u0004\u0018\u00010!J\u000f\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b.\u0010/J\u0006\u00100\u001a\u00020\u0006J\u000e\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u0015R\u001c\u00108\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R \u0010F\u001a\b\u0012\u0004\u0012\u00020B0A8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020B0G8\u0006¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bI\u0010JR\"\u0010R\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u0016\u0010X\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, d2 = {"Ln66;", "", "Ln66$b;", "coordinate", "", "duration", "", "g", "(Ln66$b;Ljava/lang/Integer;)V", "Lrg4;", "deliveryMap", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "p", "Lkotlin/Function1;", "Lm86;", "", "listener", "v", "Lcom/google/android/gms/maps/model/LatLng;", "position", "Landroid/graphics/drawable/Drawable;", RemoteMessageConst.Notification.ICON, "", RemoteMessageConst.Notification.TAG, DateTokenConverter.CONVERTER_KEY, "marker", e.a, "i", "topPadding", "bottomPadding", "x", "D", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "y", "z", "latLng", "A", "pinStatusChange", "B", Image.TYPE_SMALL, "t", "E", "k", "", "l", "()Ljava/lang/Float;", "F", "drawable", "Lsb0;", Image.TYPE_MEDIUM, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "Lorg/slf4j/Logger;", "logger", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "changePinStatus", com.huawei.hms.opendevice.c.a, "Lrg4;", "Lfr6;", "Lu68;", "Lfr6;", "o", "()Lfr6;", "pinStatusMutableFlow", "Loz3;", "Loz3;", "n", "()Loz3;", "pinStatusFlow", "f", "Ln66$b;", "getLastCoordinate", "()Ln66$b;", "u", "(Ln66$b;)V", "lastCoordinate", "Ln66$c;", "Ln66$c;", "paddings", Image.TYPE_HIGH, "Z", "neededMinPadding", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n66 */
/* loaded from: classes2.dex */
public class n66 {
    public static final a i = new a(null);
    private final Logger a = LoggerFactory.getLogger(n66.class);
    private final AtomicBoolean b = new AtomicBoolean(false);
    private rg4 c;
    private final fr6<u68> d;
    private final oz3<u68> e;
    private b f;
    private c g;
    private boolean h;

    /* compiled from: MapController.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Ln66$a;", "", "", "INITIAL_PIN_MOVING_SPEED", "I", "MAP_PADDING", "MIN_DISPLAY_METRICS", "MIN_MAP_PADDING", "", "STREET_MAP_SCALE", "F", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n66$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MapController.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b4\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Ln66$b;", "", "", "neededMinPadding", "Lum0;", "a", "<init>", "()V", "b", "Ln66$b$a;", "Ln66$b$b;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n66$b */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: MapController.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Ln66$b$a;", "Ln66$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "Lcom/google/android/gms/maps/model/LatLngBounds;", "b", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "<init>", "(Lcom/google/android/gms/maps/model/LatLngBounds;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: n66$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends b {
            private final LatLngBounds a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LatLngBounds latLngBounds) {
                super(null);
                z65.h(latLngBounds, "latLngBounds");
                this.a = latLngBounds;
            }

            public final LatLngBounds b() {
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
                LatLngBounds latLngBounds = this.a;
                return "LatLngBoundsCoordinate(latLngBounds=" + latLngBounds + ")";
            }
        }

        /* compiled from: MapController.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Ln66$b$b;", "Ln66$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/google/android/gms/maps/model/LatLng;", "a", "Lcom/google/android/gms/maps/model/LatLng;", "b", "()Lcom/google/android/gms/maps/model/LatLng;", "latLng", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: n66$b$b */
        /* loaded from: classes2.dex */
        public static final class C0451b extends b {
            private final LatLng a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0451b(LatLng latLng) {
                super(null);
                z65.h(latLng, "latLng");
                this.a = latLng;
            }

            public final LatLng b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0451b) && z65.c(this.a, ((C0451b) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                LatLng latLng = this.a;
                return "LatLngCoordinate(latLng=" + latLng + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final um0 a(boolean z) {
            um0 a2;
            if (this instanceof C0451b) {
                um0 b = vm0.b(((C0451b) this).b(), 15.0f);
                z65.g(b, "newLatLngZoom(...)");
                return b;
            } else if (this instanceof a) {
                if (z) {
                    a2 = vm0.a(((a) this).b(), 150);
                } else {
                    a2 = vm0.a(((a) this).b(), 300);
                }
                z65.e(a2);
                return a2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: MapController.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Ln66$c;", "", "", "a", "I", "b", "()I", "top", "bottom", "<init>", "(II)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n66$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final int a;
        private final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n66$d */
    /* loaded from: classes2.dex */
    public static final class d implements oz3<u68> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ n66 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: n66$d$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ n66 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.geo.feature.common.map.MapController$special$$inlined$filter$1$2", f = "MapController.kt", l = {223}, m = "emit")
            /* renamed from: n66$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C0452a extends ev1 {
                /* synthetic */ Object a;
                int b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0452a(cv1 cv1Var) {
                    super(cv1Var);
                    a.this = r1;
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, n66 n66Var) {
                this.a = pz3Var;
                this.b = n66Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.n66.d.a.C0452a
                    if (r0 == 0) goto L13
                    r0 = r6
                    n66$d$a$a r0 = (defpackage.n66.d.a.C0452a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    n66$d$a$a r0 = new n66$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    r2 = r5
                    u68 r2 = (defpackage.u68) r2
                    n66 r2 = r4.b
                    java.util.concurrent.atomic.AtomicBoolean r2 = r2.j()
                    boolean r2 = r2.get()
                    if (r2 == 0) goto L4e
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.n66.d.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public d(oz3 oz3Var, n66 n66Var) {
            this.a = oz3Var;
            this.b = n66Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super u68> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public n66() {
        fr6<u68> a2 = mua.a(new u68.a(new LatLng(0.0d, 0.0d)));
        this.d = a2;
        this.e = new d(a2, this);
        this.f = new b.C0451b(new LatLng(0.0d, 0.0d));
        this.g = new c(0, 0);
    }

    public static /* synthetic */ void C(n66 n66Var, LatLng latLng, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            n66Var.B(latLng, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLocationWithAnimation");
    }

    public static /* synthetic */ m86 f(n66 n66Var, LatLng latLng, Drawable drawable, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            return n66Var.d(latLng, drawable, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
    }

    private final void g(b bVar, Integer num) {
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            this.f = bVar;
            D();
            um0 a2 = bVar.a(this.h);
            if (num != null) {
                rg4Var.c(a2, num.intValue(), null);
            } else {
                rg4Var.b(a2);
            }
        }
    }

    static /* synthetic */ void h(n66 n66Var, b bVar, Integer num, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            n66Var.g(bVar, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateCamera");
    }

    public static final void q(n66 n66Var, rg4 rg4Var) {
        u68 value;
        LatLng latLng;
        z65.h(n66Var, "this$0");
        z65.h(rg4Var, "$deliveryMap");
        fr6<u68> fr6Var = n66Var.d;
        do {
            value = fr6Var.getValue();
            latLng = rg4Var.e().a;
            z65.g(latLng, "target");
        } while (!fr6Var.d(value, new u68.a(latLng)));
    }

    public static final void r(n66 n66Var, int i2) {
        z65.h(n66Var, "this$0");
        if (i2 == 1) {
            n66Var.b.set(true);
        }
        fr6<u68> fr6Var = n66Var.d;
        do {
        } while (!fr6Var.d(fr6Var.getValue(), u68.b.a));
    }

    public static final boolean w(Function1 function1, m86 m86Var) {
        z65.h(function1, "$tmp0");
        z65.h(m86Var, "p0");
        return ((Boolean) function1.invoke(m86Var)).booleanValue();
    }

    public final void A(LatLng latLng) {
        z65.h(latLng, "latLng");
        this.b.set(false);
        g(new b.C0451b(latLng), Integer.valueOf((int) ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY));
    }

    public void B(LatLng latLng, boolean z) {
        z65.h(latLng, "latLng");
        this.b.set(z);
        h(this, new b.C0451b(latLng), null, 2, null);
    }

    public final void D() {
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            rg4Var.s(0, this.g.b(), 0, this.g.a());
        }
    }

    public final void E() {
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            rg4Var.b(vm0.c());
        }
    }

    public final void F() {
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            rg4Var.b(vm0.d());
        }
    }

    public final m86 d(LatLng latLng, Drawable drawable, String str) {
        m86 m86Var;
        z65.h(latLng, "position");
        z65.h(drawable, RemoteMessageConst.Notification.ICON);
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            m86Var = rg4Var.a(new MarkerOptions().G(latLng).C(m(drawable)));
        } else {
            m86Var = null;
        }
        if (str != null && m86Var != null) {
            m86Var.k(str);
        }
        return m86Var;
    }

    public final void e(m86 m86Var, Drawable drawable) {
        z65.h(m86Var, "marker");
        z65.h(drawable, RemoteMessageConst.Notification.ICON);
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            rg4Var.a(new MarkerOptions().G(m86Var.a()).C(m(drawable)));
        }
    }

    public void i() {
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            rg4Var.d();
        }
    }

    public final AtomicBoolean j() {
        return this.b;
    }

    public final LatLngBounds k() {
        gp8 h;
        VisibleRegion a2;
        rg4 rg4Var = this.c;
        if (rg4Var != null && (h = rg4Var.h()) != null && (a2 = h.a()) != null) {
            return a2.e;
        }
        return null;
    }

    public final Float l() {
        CameraPosition e;
        rg4 rg4Var = this.c;
        if (rg4Var != null && (e = rg4Var.e()) != null) {
            return Float.valueOf(e.b);
        }
        return null;
    }

    public final sb0 m(Drawable drawable) {
        z65.h(drawable, "drawable");
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        z65.g(createBitmap, "createBitmap(...)");
        canvas.setBitmap(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        sb0 b2 = tb0.b(createBitmap);
        z65.g(b2, "fromBitmap(...)");
        return b2;
    }

    public final oz3<u68> n() {
        return this.e;
    }

    public final fr6<u68> o() {
        return this.d;
    }

    public void p(final rg4 rg4Var, Context context) {
        z65.h(rg4Var, "deliveryMap");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int min = Math.min(context.getResources().getDisplayMetrics().heightPixels, context.getResources().getDisplayMetrics().widthPixels);
        boolean z = false;
        rg4Var.i().b(false);
        if (min < 1000) {
            z = true;
        }
        this.h = z;
        rg4Var.m(new rg4.c() { // from class: l66
            @Override // defpackage.rg4.c
            public final void b() {
                n66.q(n66.this, rg4Var);
            }
        });
        rg4Var.n(new rg4.d() { // from class: m66
            @Override // defpackage.rg4.d
            public final void a(int i2) {
                n66.r(n66.this, i2);
            }
        });
        this.c = rg4Var;
    }

    public final boolean s() {
        Float f;
        CameraPosition e;
        rg4 rg4Var = this.c;
        Float f2 = null;
        if (rg4Var != null && (e = rg4Var.e()) != null) {
            f = Float.valueOf(e.b);
        } else {
            f = null;
        }
        rg4 rg4Var2 = this.c;
        if (rg4Var2 != null) {
            f2 = Float.valueOf(rg4Var2.f());
        }
        return !z65.b(f, f2);
    }

    public final boolean t() {
        Float f;
        CameraPosition e;
        rg4 rg4Var = this.c;
        Float f2 = null;
        if (rg4Var != null && (e = rg4Var.e()) != null) {
            f = Float.valueOf(e.b);
        } else {
            f = null;
        }
        rg4 rg4Var2 = this.c;
        if (rg4Var2 != null) {
            f2 = Float.valueOf(rg4Var2.g());
        }
        return !z65.b(f, f2);
    }

    public final void u(b bVar) {
        z65.h(bVar, "<set-?>");
        this.f = bVar;
    }

    public final void v(final Function1<? super m86, Boolean> function1) {
        z65.h(function1, "listener");
        rg4 rg4Var = this.c;
        if (rg4Var != null) {
            rg4Var.q(new rg4.g() { // from class: k66
                @Override // defpackage.rg4.g
                public final boolean a(m86 m86Var) {
                    boolean w;
                    w = n66.w(Function1.this, m86Var);
                    return w;
                }
            });
        }
    }

    public final void x(int i2, int i3) {
        this.g = new c(i2, i3);
        D();
    }

    public final void y(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "bounds");
        this.b.set(false);
        g(new b.a(latLngBounds), Integer.valueOf((int) ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY));
    }

    public void z(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "bounds");
        this.b.set(true);
        h(this, new b.a(latLngBounds), null, 2, null);
    }
}
