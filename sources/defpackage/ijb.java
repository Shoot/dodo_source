package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AnalyticsExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lijb;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, "Lijb$a;", "Lijb$b;", "Lijb$c;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ijb  reason: default package */
/* loaded from: classes4.dex */
public abstract class ijb {
    private final String a;

    /* compiled from: AnalyticsExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lijb$a;", "Lijb;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ijb$a */
    /* loaded from: classes4.dex */
    public static final class a extends ijb {
        public static final a b = new a();

        private a() {
            super("added", null);
        }
    }

    /* compiled from: AnalyticsExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lijb$b;", "Lijb;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ijb$b */
    /* loaded from: classes4.dex */
    public static final class b extends ijb {
        public static final b b = new b();

        private b() {
            super("deleted", null);
        }
    }

    /* compiled from: AnalyticsExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lijb$c;", "Lijb;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ijb$c */
    /* loaded from: classes4.dex */
    public static final class c extends ijb {
        public static final c b = new c();

        private c() {
            super("in_recipe", null);
        }
    }

    public /* synthetic */ ijb(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private ijb(String str) {
        this.a = str;
    }
}
