package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LandingStateManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0003\n\u0007\fB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0017"}, d2 = {"Lpl5;", "", "", "phoneNumber", "", DateTokenConverter.CONVERTER_KEY, "Lpl5$b;", "b", "", "timestamp", "a", e.a, com.huawei.hms.opendevice.c.a, "Lkgb;", "Lkgb;", "timeLeftResolver", "Lpl5$c;", "Lpl5$c;", "lastRequestTimestamp", "Ljava/lang/String;", "lastPhoneNumber", "<init>", "(Lkgb;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pl5  reason: default package */
/* loaded from: classes4.dex */
public final class pl5 {
    public static final a d = new a(null);
    private final kgb a;
    private c b;
    private String c;

    /* compiled from: LandingStateManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lpl5$a;", "", "", "ONE_MINUTE_IN_MILLIS", "J", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pl5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LandingStateManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\tB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lpl5$b;", "", "", "a", "J", "()J", "timeLeft", "<init>", "(J)V", "b", "Lpl5$b$a;", "Lpl5$b$b;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pl5$b */
    /* loaded from: classes4.dex */
    public static abstract class b {
        private final long a;

        /* compiled from: LandingStateManager.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpl5$b$a;", "Lpl5$b;", "", "timeLeft", "<init>", "(J)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: pl5$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b {
            public a(long j) {
                super(j, null);
            }
        }

        /* compiled from: LandingStateManager.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpl5$b$b;", "Lpl5$b;", "", "timeLeft", "<init>", "(J)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: pl5$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0478b extends b {
            public C0478b(long j) {
                super(j, null);
            }
        }

        public /* synthetic */ b(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        public final long a() {
            return this.a;
        }

        private b(long j) {
            this.a = j;
        }
    }

    /* compiled from: LandingStateManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lpl5$c;", "", "<init>", "()V", "a", "b", "Lpl5$c$a;", "Lpl5$c$b;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pl5$c */
    /* loaded from: classes4.dex */
    public static abstract class c {

        /* compiled from: LandingStateManager.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpl5$c$a;", "Lpl5$c;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: pl5$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: LandingStateManager.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lpl5$c$b;", "Lpl5$c;", "", "a", "J", "()J", CrashHianalyticsData.TIME, "<init>", "(J)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: pl5$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends c {
            private final long a;

            public b(long j) {
                super(null);
                this.a = j;
            }

            public final long a() {
                return this.a;
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public pl5(kgb kgbVar) {
        z65.h(kgbVar, "timeLeftResolver");
        this.a = kgbVar;
        this.b = c.a.a;
    }

    private final b a(long j) {
        long a2 = this.a.a(j, 60000L);
        if (a2 <= 0) {
            this.b = new c.b(this.a.b());
            return new b.a(60000L);
        }
        return new b.C0478b(a2);
    }

    private final b b() {
        this.b = new c.b(this.a.b());
        return new b.a(60000L);
    }

    private final void d(String str) {
        if (!z65.c(this.c, str)) {
            this.b = c.a.a;
            this.c = str;
        }
    }

    public final synchronized void c() {
        this.b = c.a.a;
        this.c = null;
    }

    public final synchronized b e(String str) {
        b a2;
        try {
            z65.h(str, "phoneNumber");
            d(str);
            c cVar = this.b;
            if (cVar instanceof c.a) {
                a2 = b();
            } else if (cVar instanceof c.b) {
                a2 = a(((c.b) cVar).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }
}
