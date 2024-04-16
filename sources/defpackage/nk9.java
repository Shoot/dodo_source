package defpackage;

import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lnk9;", "Lwk7;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", "Lnk9$a;", "Lnk9$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nk9  reason: default package */
/* loaded from: classes4.dex */
public abstract class nk9 extends wk7 implements Serializable {

    /* compiled from: OrderTypeState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnk9$a;", "Lnk9;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nk9$a */
    /* loaded from: classes4.dex */
    public static final class a extends nk9 implements Serializable {
        public static final a e = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: OrderTypeState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lnk9$b;", "Lnk9;", "Ljava/io/Serializable;", "Ld88;", e.a, "Ld88;", "()Ld88;", "pizzeria", "<init>", "(Ld88;)V", "a", "b", com.huawei.hms.opendevice.c.a, "Lnk9$b$a;", "Lnk9$b$b;", "Lnk9$b$c;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nk9$b */
    /* loaded from: classes4.dex */
    public static abstract class b extends nk9 implements Serializable {
        private final d88 e;

        /* compiled from: OrderTypeState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnk9$b$a;", "Lnk9$b;", "Ljava/io/Serializable;", "Ld88;", "pizzeria", "<init>", "(Ld88;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: nk9$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d88 d88Var) {
                super(d88Var, null);
                z65.h(d88Var, "pizzeria");
            }
        }

        /* compiled from: OrderTypeState.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"Lnk9$b$b;", "Lnk9$b;", "Ljava/io/Serializable;", "Ld41;", "f", "Ld41;", "()Ld41;", "error", "Ld88;", "pizzeria", "<init>", "(Ld88;Ld41;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: nk9$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0456b extends b implements Serializable {
            private final d41 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0456b(d88 d88Var, d41 d41Var) {
                super(d88Var, null);
                z65.h(d88Var, "pizzeria");
                z65.h(d41Var, "error");
                this.f = d41Var;
            }

            public final d41 f() {
                return this.f;
            }
        }

        /* compiled from: OrderTypeState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnk9$b$c;", "Lnk9$b;", "Ljava/io/Serializable;", "Ld88;", "pizzeria", "<init>", "(Ld88;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: nk9$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends b implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d88 d88Var) {
                super(d88Var, null);
                z65.h(d88Var, "pizzeria");
            }
        }

        public /* synthetic */ b(d88 d88Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(d88Var);
        }

        public final d88 e() {
            return this.e;
        }

        private b(d88 d88Var) {
            super(null);
            this.e = d88Var;
        }
    }

    public /* synthetic */ nk9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private nk9() {
        super(null);
    }
}
