package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderReceivingTypeVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lei7;", "", "", "g", "()Z", "isSelected", "a", "b", com.huawei.hms.opendevice.c.a, "Lei7$a;", "Lei7$b;", "Lei7$c;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ei7  reason: default package */
/* loaded from: classes2.dex */
public interface ei7 {

    /* compiled from: OrderReceivingTypeVO.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\nB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lei7$a;", "Lei7;", "", "a", "Z", "g", "()Z", "isSelected", "<init>", "(Z)V", "b", "Lei7$a$a;", "Lei7$a$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ei7$a */
    /* loaded from: classes2.dex */
    public static abstract class a implements ei7 {
        private final boolean a;

        /* compiled from: OrderReceivingTypeVO.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lei7$a$a;", "Lei7$a;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ei7$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0304a extends a {
            public static final C0304a b = new C0304a();

            private C0304a() {
                super(false, null);
            }
        }

        /* compiled from: OrderReceivingTypeVO.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lei7$a$b;", "Lei7$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "I", "a", "()I", "tableNumber", "<init>", "(I)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ei7$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends a {
            private final int b;

            public b(int i) {
                super(true, null);
                this.b = i;
            }

            public final int a() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.b == ((b) obj).b) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.b;
            }

            public String toString() {
                int i = this.b;
                return "Selected(tableNumber=" + i + ")";
            }
        }

        public /* synthetic */ a(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        @Override // defpackage.ei7
        public boolean g() {
            return this.a;
        }

        private a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: OrderReceivingTypeVO.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lei7$b;", "Lei7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "g", "()Z", "isSelected", "<init>", "(Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ei7$b */
    /* loaded from: classes2.dex */
    public static final class b implements ei7 {
        private final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        @Override // defpackage.ei7
        public boolean g() {
            return this.a;
        }

        public int hashCode() {
            return a91.a(this.a);
        }

        public String toString() {
            boolean z = this.a;
            return "PickUpInRestaurant(isSelected=" + z + ")";
        }
    }

    /* compiled from: OrderReceivingTypeVO.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lei7$c;", "Lei7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "g", "()Z", "isSelected", "<init>", "(Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ei7$c */
    /* loaded from: classes2.dex */
    public static final class c implements ei7 {
        private final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.a == ((c) obj).a) {
                return true;
            }
            return false;
        }

        @Override // defpackage.ei7
        public boolean g() {
            return this.a;
        }

        public int hashCode() {
            return a91.a(this.a);
        }

        public String toString() {
            boolean z = this.a;
            return "Takeaway(isSelected=" + z + ")";
        }
    }

    boolean g();
}
