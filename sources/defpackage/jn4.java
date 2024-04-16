package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import defpackage.gn4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HeadersReader.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0011"}, d2 = {"Ljn4;", "", "", "b", "Lgn4;", "a", "Lfh0;", "Lfh0;", "getSource", "()Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "J", "headerLimit", "<init>", "(Lfh0;)V", c.a, "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: jn4  reason: default package */
/* loaded from: classes3.dex */
public final class jn4 {
    public static final a c = new a(null);
    private final fh0 a;
    private long b;

    /* compiled from: HeadersReader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljn4$a;", "", "", "HEADER_LIMIT", "I", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jn4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public jn4(fh0 fh0Var) {
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = fh0Var;
        this.b = 262144L;
    }

    public final gn4 a() {
        gn4.a aVar = new gn4.a();
        while (true) {
            String b = b();
            if (b.length() == 0) {
                return aVar.f();
            }
            aVar.c(b);
        }
    }

    public final String b() {
        String V = this.a.V(this.b);
        this.b -= V.length();
        return V;
    }
}
