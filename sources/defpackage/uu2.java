package defpackage;

import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Luu2;", "Lwk7;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Luu2$a;", "Luu2$b;", "Luu2$c;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uu2  reason: default package */
/* loaded from: classes4.dex */
public abstract class uu2 extends wk7 implements Serializable {

    /* compiled from: OrderTypeState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Luu2$a;", "Luu2;", "Ljava/io/Serializable;", "Lou2;", e.a, "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "a", "b", com.huawei.hms.opendevice.c.a, "Luu2$a$a;", "Luu2$a$b;", "Luu2$a$c;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uu2$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends uu2 implements Serializable {
        private final ou2 e;

        /* compiled from: OrderTypeState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luu2$a$a;", "Luu2$a;", "Ljava/io/Serializable;", "Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: uu2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0694a extends a implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0694a(ou2 ou2Var) {
                super(ou2Var, null);
                z65.h(ou2Var, "deliverablePlace");
            }
        }

        /* compiled from: OrderTypeState.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"Luu2$a$b;", "Luu2$a;", "Ljava/io/Serializable;", "Ld41;", "f", "Ld41;", "()Ld41;", "error", "Lou2;", "deliverablePlace", "<init>", "(Lou2;Ld41;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: uu2$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a implements Serializable {
            private final d41 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ou2 ou2Var, d41 d41Var) {
                super(ou2Var, null);
                z65.h(ou2Var, "deliverablePlace");
                z65.h(d41Var, "error");
                this.f = d41Var;
            }

            public final d41 f() {
                return this.f;
            }
        }

        /* compiled from: OrderTypeState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luu2$a$c;", "Luu2$a;", "Ljava/io/Serializable;", "Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: uu2$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends a implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ou2 ou2Var) {
                super(ou2Var, null);
                z65.h(ou2Var, "deliverablePlace");
            }
        }

        public /* synthetic */ a(ou2 ou2Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(ou2Var);
        }

        public final ou2 e() {
            return this.e;
        }

        private a(ou2 ou2Var) {
            super(null);
            this.e = ou2Var;
        }
    }

    /* compiled from: OrderTypeState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Luu2$b;", "Luu2;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uu2$b */
    /* loaded from: classes4.dex */
    public static final class b extends uu2 implements Serializable {
        public static final b e = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: OrderTypeState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Luu2$c;", "Luu2;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uu2$c */
    /* loaded from: classes4.dex */
    public static final class c extends uu2 implements Serializable {
        public static final c e = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ uu2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private uu2() {
        super(null);
    }
}
