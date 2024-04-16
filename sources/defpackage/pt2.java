package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\t\n\u000b\fB\u0013\b\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpt2;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", CrashHianalyticsData.TIME, "<init>", "(Ljava/lang/Long;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lpt2$a;", "Lpt2$b;", "Lpt2$c;", "Lpt2$d;", "Lpt2$e;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pt2  reason: default package */
/* loaded from: classes4.dex */
public abstract class pt2 implements Serializable {
    private final Long a;

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"Lpt2$a;", "Lpt2;", "Ljava/io/Serializable;", "", "b", "Z", "()Z", "isWorkload", "", CrashHianalyticsData.TIME, "<init>", "(Ljava/lang/Long;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pt2$a */
    /* loaded from: classes4.dex */
    public static final class a extends pt2 implements Serializable {
        private final boolean b;

        public a(Long l, boolean z) {
            super(l, null);
            this.b = z;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"Lpt2$b;", "Lpt2;", "Ljava/io/Serializable;", "Ld41;", "b", "Ld41;", "()Ld41;", "error", "", CrashHianalyticsData.TIME, "<init>", "(Ljava/lang/Long;Ld41;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pt2$b */
    /* loaded from: classes4.dex */
    public static final class b extends pt2 implements Serializable {
        private final d41 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l, d41 d41Var) {
            super(l, null);
            z65.h(d41Var, "error");
            this.b = d41Var;
        }

        public final d41 b() {
            return this.b;
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpt2$c;", "Lpt2;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pt2$c */
    /* loaded from: classes4.dex */
    public static final class c extends pt2 implements Serializable {
        public static final c b = new c();

        private c() {
            super(null, null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpt2$d;", "Lpt2;", "Ljava/io/Serializable;", "", CrashHianalyticsData.TIME, "<init>", "(Ljava/lang/Long;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pt2$d */
    /* loaded from: classes4.dex */
    public static final class d extends pt2 implements Serializable {
        public d(Long l) {
            super(l, null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpt2$e;", "Lpt2;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pt2$e */
    /* loaded from: classes4.dex */
    public static final class e extends pt2 implements Serializable {
        public static final e b = new e();

        private e() {
            super(null, null);
        }
    }

    public /* synthetic */ pt2(Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(l);
    }

    public final Long a() {
        return this.a;
    }

    private pt2(Long l) {
        this.a = l;
    }
}
