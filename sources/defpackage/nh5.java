package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoAnalyticLocalityResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lnh5;", "", "", "isoName", "", DateTokenConverter.CONVERTER_KEY, e.a, "Ljv5;", "a", "Ljv5;", "localityService", "b", "Ljava/lang/String;", "_displayedCountryIsoName", "()Ljava/lang/String;", "currentCountryIsoName", "countryIsoName", c.a, "localityName", "<init>", "(Ljv5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: nh5  reason: default package */
/* loaded from: classes3.dex */
public final class nh5 {
    private static final a c = new a(null);
    private final jv5 a;
    private volatile String b;

    /* compiled from: KustoAnalyticLocalityResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnh5$a;", "", "", "UNDEFINED_LOCALITY", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nh5$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nh5(jv5 jv5Var) {
        z65.h(jv5Var, "localityService");
        this.a = jv5Var;
    }

    private final String b() {
        return ey1.a(String.valueOf(this.a.a()));
    }

    public final String a() {
        String str = this.b;
        if (str == null) {
            return b();
        }
        return str;
    }

    public final String c() {
        String str;
        if (this.b != null && !z65.c(this.b, b())) {
            return "undefined";
        }
        dt5 i = this.a.i();
        if (i != null) {
            str = i.getName();
        } else {
            str = null;
        }
        return (String) mh5.c(str, "undefined");
    }

    public final void d(String str) {
        z65.h(str, "isoName");
        this.b = str;
    }

    public final void e() {
        this.b = null;
    }
}
