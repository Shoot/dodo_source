package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RoutePlanner.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\b\rJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0014\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lvo9;", "", "", "isCanceled", "Lvo9$b;", DateTokenConverter.CONVERTER_KEY, "Lu79;", "failedConnection", "a", "Lsq4;", RemoteMessageConst.Notification.URL, e.a, "Lx6;", "b", "()Lx6;", "address", "Lgr;", c.a, "()Lgr;", "deferredPlans", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: vo9  reason: default package */
/* loaded from: classes3.dex */
public interface vo9 {

    /* compiled from: RoutePlanner.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lvo9$a;", "", "Lvo9$b;", "a", "", "b", "", "toString", "", "hashCode", "other", "", "equals", "Lvo9$b;", DateTokenConverter.CONVERTER_KEY, "()Lvo9$b;", "plan", c.a, "nextPlan", "Ljava/lang/Throwable;", e.a, "()Ljava/lang/Throwable;", "throwable", "f", "()Z", "isSuccess", "<init>", "(Lvo9$b;Lvo9$b;Ljava/lang/Throwable;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vo9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final b a;
        private final b b;
        private final Throwable c;

        public a(b bVar, b bVar2, Throwable th) {
            z65.h(bVar, "plan");
            this.a = bVar;
            this.b = bVar2;
            this.c = th;
        }

        public final b a() {
            return this.b;
        }

        public final Throwable b() {
            return this.c;
        }

        public final b c() {
            return this.b;
        }

        public final b d() {
            return this.a;
        }

        public final Throwable e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            if (this.b == null && this.c == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            b bVar = this.b;
            int i = 0;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            Throwable th = this.c;
            if (th != null) {
                i = th.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(b bVar, b bVar2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i & 2) != 0 ? null : bVar2, (i & 4) != 0 ? null : th);
        }
    }

    /* compiled from: RoutePlanner.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0007H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lvo9$b;", "", "Lvo9$a;", Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, "Lu79;", "a", "", "cancel", "f", "", "g", "()Z", "isReady", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vo9$b */
    /* loaded from: classes3.dex */
    public interface b {
        u79 a();

        void cancel();

        a d();

        b f();

        boolean g();

        a h();
    }

    boolean a(u79 u79Var);

    x6 b();

    gr<b> c();

    b d() throws IOException;

    boolean e(sq4 sq4Var);

    boolean isCanceled();
}
