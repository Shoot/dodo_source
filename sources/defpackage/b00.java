package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AuthorizationConfig.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0011"}, d2 = {"Lb00;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "defaultTimeWindow", "<init>", "(J)V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b00  reason: default package */
/* loaded from: classes4.dex */
public final class b00 {
    public static final a b = new a(null);
    private final long a;

    /* compiled from: AuthorizationConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lb00$a;", "", "", "PROD_VERIFY_PIN_INTERVAL_MILLS", "J", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b00$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b00(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b00) && this.a == ((b00) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ax1.a(this.a);
    }

    public String toString() {
        long j = this.a;
        return "AuthorizationConfig(defaultTimeWindow=" + j + ")";
    }
}
