package defpackage;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: result.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmt2;", "", "<init>", "()V", "a", "b", "Lmt2$a;", "Lmt2$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mt2  reason: default package */
/* loaded from: classes4.dex */
public abstract class mt2 {

    /* compiled from: result.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lmt2$a;", "Lmt2;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", CrashHianalyticsData.TIME, "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "title", "", c.a, "Z", "()Z", "isSuggested", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mt2$a */
    /* loaded from: classes4.dex */
    public static final class a extends mt2 {
        private final Long a;
        private final String b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l, String str, boolean z) {
            super(null);
            z65.h(str, "title");
            this.a = l;
            this.b = str;
            this.c = z;
        }

        public final Long a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }
    }

    /* compiled from: result.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt2$b;", "Lmt2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mt2$b */
    /* loaded from: classes4.dex */
    public static final class b extends mt2 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private mt2() {
    }

    public /* synthetic */ mt2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
