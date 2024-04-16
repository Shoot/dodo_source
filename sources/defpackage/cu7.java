package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentMethodState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\t\n\u000bB\u0013\b\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcu7;", "Ljava/io/Serializable;", "Ljw7;", "a", "Ljw7;", "()Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lcu7$a;", "Lcu7$b;", "Lcu7$c;", "Lcu7$d;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cu7  reason: default package */
/* loaded from: classes4.dex */
public abstract class cu7 implements Serializable {
    private final jw7 a;

    /* compiled from: PaymentMethodState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcu7$a;", "Lcu7;", "Ljava/io/Serializable;", "Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cu7$a */
    /* loaded from: classes4.dex */
    public static final class a extends cu7 implements Serializable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jw7 jw7Var) {
            super(jw7Var, null);
            z65.h(jw7Var, "paymentWay");
        }
    }

    /* compiled from: PaymentMethodState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcu7$b;", "Lcu7;", "Ljava/io/Serializable;", "Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cu7$b */
    /* loaded from: classes4.dex */
    public static final class b extends cu7 implements Serializable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jw7 jw7Var) {
            super(jw7Var, null);
            z65.h(jw7Var, "paymentWay");
        }
    }

    /* compiled from: PaymentMethodState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcu7$c;", "Lcu7;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cu7$c */
    /* loaded from: classes4.dex */
    public static final class c extends cu7 implements Serializable {
        public static final c b = new c();

        private c() {
            super(null, null);
        }
    }

    /* compiled from: PaymentMethodState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcu7$d;", "Lcu7;", "Ljava/io/Serializable;", "Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcu7$d$a;", "Lcu7$d$b;", "Lcu7$d$c;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cu7$d */
    /* loaded from: classes4.dex */
    public static abstract class d extends cu7 implements Serializable {

        /* compiled from: PaymentMethodState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcu7$d$a;", "Lcu7$d;", "Ljava/io/Serializable;", "Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: cu7$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends d implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jw7 jw7Var) {
                super(jw7Var, null);
                z65.h(jw7Var, "paymentWay");
            }
        }

        /* compiled from: PaymentMethodState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcu7$d$b;", "Lcu7$d;", "Ljava/io/Serializable;", "Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: cu7$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends d implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jw7 jw7Var) {
                super(jw7Var, null);
                z65.h(jw7Var, "paymentWay");
            }
        }

        /* compiled from: PaymentMethodState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcu7$d$c;", "Lcu7$d;", "Ljava/io/Serializable;", "Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: cu7$d$c */
        /* loaded from: classes4.dex */
        public static final class c extends d implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(jw7 jw7Var) {
                super(jw7Var, null);
                z65.h(jw7Var, "paymentWay");
            }
        }

        public /* synthetic */ d(jw7 jw7Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(jw7Var);
        }

        private d(jw7 jw7Var) {
            super(jw7Var, null);
        }
    }

    public /* synthetic */ cu7(jw7 jw7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(jw7Var);
    }

    public final jw7 a() {
        return this.a;
    }

    private cu7(jw7 jw7Var) {
        this.a = jw7Var;
    }
}
