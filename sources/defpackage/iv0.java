package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChangeLocationResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Liv0;", "Ljava/io/Serializable;", "", "a", "Z", "()Z", "languageIsChanged", "<init>", "(Z)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Liv0$a;", "Liv0$b;", "Liv0$c;", "Liv0$d;", "Liv0$e;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iv0  reason: default package */
/* loaded from: classes4.dex */
public abstract class iv0 implements Serializable {
    private final boolean a;

    /* compiled from: ChangeLocationResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Liv0$a;", "Liv0;", "Le91;", "b", "Le91;", "()Le91;", "clientDeliveryLocation", "", "languageIsChanged", "<init>", "(Le91;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iv0$a */
    /* loaded from: classes4.dex */
    public static final class a extends iv0 {
        private final e91 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e91 e91Var, boolean z) {
            super(z, null);
            z65.h(e91Var, "clientDeliveryLocation");
            this.b = e91Var;
        }

        public final e91 b() {
            return this.b;
        }
    }

    /* compiled from: ChangeLocationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liv0$b;", "Liv0;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iv0$b */
    /* loaded from: classes4.dex */
    public static final class b extends iv0 {
        public static final b b = new b();

        private b() {
            super(false, null);
        }
    }

    /* compiled from: ChangeLocationResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liv0$c;", "Liv0;", "", "languageIsChanged", "<init>", "(Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iv0$c */
    /* loaded from: classes4.dex */
    public static final class c extends iv0 {
        public c(boolean z) {
            super(z, null);
        }
    }

    /* compiled from: ChangeLocationResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Liv0$d;", "Liv0;", "Ldt5;", "b", "Ldt5;", com.huawei.hms.opendevice.c.a, "()Ldt5;", "locality", "", "Ljava/lang/String;", "()Ljava/lang/String;", "language", "<init>", "(Ldt5;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iv0$d */
    /* loaded from: classes4.dex */
    public static final class d extends iv0 {
        private final dt5 b;
        private final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(dt5 dt5Var, String str) {
            super(false, null);
            z65.h(dt5Var, "locality");
            z65.h(str, "language");
            this.b = dt5Var;
            this.c = str;
        }

        public final String b() {
            return this.c;
        }

        public final dt5 c() {
            return this.b;
        }
    }

    /* compiled from: ChangeLocationResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Liv0$e;", "Liv0;", "Ldt5;", "b", "Ldt5;", "getNewLocality", "()Ldt5;", "newLocality", "", "languageIsChanged", "<init>", "(Ldt5;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iv0$e */
    /* loaded from: classes4.dex */
    public static final class e extends iv0 {
        private final dt5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(dt5 dt5Var, boolean z) {
            super(z, null);
            z65.h(dt5Var, "newLocality");
            this.b = dt5Var;
        }
    }

    public /* synthetic */ iv0(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    private iv0(boolean z) {
        this.a = z;
    }
}
