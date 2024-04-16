package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzo7;", "Ljava/io/Serializable;", "", "R", "()Ljava/lang/Boolean;", "isTakeaway", "", "g0", "()Ljava/lang/Integer;", "tableNumber", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lzo7$a;", "Lzo7$b;", "Lzo7$c;", "Lzo7$d;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zo7  reason: default package */
/* loaded from: classes4.dex */
public interface zo7 extends Serializable {

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Lzo7$a;", "Lzo7;", "Ljava/io/Serializable;", "", "a", "I", "g0", "()Ljava/lang/Integer;", "tableNumber", "", "b", "Ljava/lang/Void;", "()Ljava/lang/Void;", "isTakeaway", "<init>", "(I)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo7$a */
    /* loaded from: classes4.dex */
    public static final class a implements zo7, Serializable {
        private final int a;
        private final Void b;

        public a(int i) {
            this.a = i;
        }

        @Override // defpackage.zo7
        public /* bridge */ /* synthetic */ Boolean R() {
            return (Boolean) a();
        }

        public Void a() {
            return this.b;
        }

        @Override // defpackage.zo7
        public Integer g0() {
            return Integer.valueOf(this.a);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lzo7$b;", "Lzo7;", "Ljava/io/Serializable;", "", "b", "Ljava/lang/Void;", "()Ljava/lang/Void;", "isTakeaway", com.huawei.hms.opendevice.c.a, "a", "tableNumber", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo7$b */
    /* loaded from: classes4.dex */
    public static final class b implements zo7, Serializable {
        private static final Void b = null;
        private static final Void c = null;
        public static final b a = new b();
        public static final int d = 8;

        private b() {
        }

        @Override // defpackage.zo7
        public /* bridge */ /* synthetic */ Boolean R() {
            return (Boolean) b();
        }

        public Void a() {
            return c;
        }

        public Void b() {
            return b;
        }

        @Override // defpackage.zo7
        public /* bridge */ /* synthetic */ Integer g0() {
            return (Integer) a();
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lzo7$c;", "Lzo7;", "Ljava/io/Serializable;", "", "b", "Ljava/lang/Void;", "()Ljava/lang/Void;", "isTakeaway", com.huawei.hms.opendevice.c.a, "a", "tableNumber", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo7$c */
    /* loaded from: classes4.dex */
    public static final class c implements zo7, Serializable {
        private static final Void b = null;
        private static final Void c = null;
        public static final c a = new c();
        public static final int d = 8;

        private c() {
        }

        @Override // defpackage.zo7
        public /* bridge */ /* synthetic */ Boolean R() {
            return (Boolean) b();
        }

        public Void a() {
            return c;
        }

        public Void b() {
            return b;
        }

        @Override // defpackage.zo7
        public /* bridge */ /* synthetic */ Integer g0() {
            return (Integer) a();
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzo7$d;", "Lzo7;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "R", "()Ljava/lang/Boolean;", "isTakeaway", "", "b", "Ljava/lang/Void;", "()Ljava/lang/Void;", "tableNumber", "<init>", "(Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo7$d */
    /* loaded from: classes4.dex */
    public static final class d implements zo7, Serializable {
        private final boolean a;
        private final Void b;

        public d(boolean z) {
            this.a = z;
        }

        @Override // defpackage.zo7
        public Boolean R() {
            return Boolean.valueOf(this.a);
        }

        public Void a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.a == ((d) obj).a) {
                return true;
            }
            return false;
        }

        @Override // defpackage.zo7
        public /* bridge */ /* synthetic */ Integer g0() {
            return (Integer) a();
        }

        public int hashCode() {
            return a91.a(this.a);
        }

        public String toString() {
            boolean z = this.a;
            return "Takeaway(isTakeaway=" + z + ")";
        }
    }

    Boolean R();

    Integer g0();
}
