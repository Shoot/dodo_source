package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.analytics.kusto.KustoAnalyticsImpl;
import com.huawei.hms.opendevice.c;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¨\u0006\b"}, d2 = {"Loh5;", "", "", "", "eventParams", "", "a", "b", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: oh5  reason: default package */
/* loaded from: classes.dex */
public interface oh5 {
    public static final b a = b.a;

    /* compiled from: KustoAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u000f\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0016\u0010\u001a¨\u0006\u001e"}, d2 = {"Loh5$a;", "", "Loh5;", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/io/File;", "Ljava/io/File;", "cacheDirectory", "Lai5;", "b", "Lai5;", "getMetaDataCollector", "()Lai5;", "(Lai5;)V", "metaDataCollector", "", c.a, "J", "getTimeoutToSendEventsMillis", "()J", "(J)V", "timeoutToSendEventsMillis", "<init>", "(Ljava/io/File;Lai5;J)V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: oh5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final File a;
        private ai5 b;
        private long c;

        public a(File file, ai5 ai5Var, long j) {
            z65.h(file, "cacheDirectory");
            z65.h(ai5Var, "metaDataCollector");
            this.a = file;
            this.b = ai5Var;
            this.c = j;
        }

        public final oh5 a() {
            return new KustoAnalyticsImpl(this.a, this.b, new rh5(this.c));
        }

        public final void b(ai5 ai5Var) {
            z65.h(ai5Var, "<set-?>");
            this.b = ai5Var;
        }

        public final void c(long j) {
            this.c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ax1.a(this.c);
        }

        public String toString() {
            return "Builder(cacheDirectory=" + this.a + ", metaDataCollector=" + this.b + ", timeoutToSendEventsMillis=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(File file, ai5 ai5Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(file, (i & 2) != 0 ? lg3.a : ai5Var, (i & 4) != 0 ? 1000L : j);
        }
    }

    /* compiled from: KustoAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\u0002¨\u0006\f"}, d2 = {"Loh5$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Loh5$a;", "", "builder", "Loh5;", "a", "<init>", "()V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: oh5$b */
    /* loaded from: classes.dex */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        public final oh5 a(Context context, Function1<? super a, Unit> function1) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(function1, "builder");
            a aVar = new a(qh5.a(context), null, 0L, 6, null);
            function1.invoke(aVar);
            return aVar.a();
        }
    }

    void a(Map<String, ? extends Object> map);
}
