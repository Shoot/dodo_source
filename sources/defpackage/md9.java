package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RemoteConfigService.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0017"}, d2 = {"Lmd9;", "Lld9;", "", "f", e.a, "", Action.KEY_ATTRIBUTE, "", "b", "a", "", c.a, DateTokenConverter.CONVERTER_KEY, "Lzc9;", "Lzc9;", "remoteConfig", "", "J", "cacheExpiration", "Lmh0;", "buildInfo", "<init>", "(Lzc9;Lmh0;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: md9  reason: default package */
/* loaded from: classes4.dex */
public final class md9 implements ld9 {
    private static final a c = new a(null);
    private static final long d = TimeUnit.HOURS.toSeconds(12);
    private static volatile boolean e = true;
    private final zc9 a;
    private final long b;

    /* compiled from: RemoteConfigService.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lmd9$a;", "", "", "CACHE_EXPIRATION_SECONDS", "J", "", "CACHE_EXPIRATION_ZERO_TIME", "I", "", "canActivate", "Z", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: md9$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public md9(zc9 zc9Var, mh0 mh0Var) {
        Number valueOf;
        z65.h(zc9Var, "remoteConfig");
        z65.h(mh0Var, "buildInfo");
        this.a = zc9Var;
        if (mh0Var.i()) {
            valueOf = 0;
        } else {
            valueOf = Long.valueOf(d);
        }
        this.b = valueOf.longValue();
    }

    private final void f() {
        if (e) {
            this.a.e();
        }
    }

    @Override // defpackage.ld9
    public String a(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        e = false;
        return this.a.a(str);
    }

    @Override // defpackage.ld9
    public boolean b(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        e = false;
        return this.a.b(str);
    }

    @Override // defpackage.ld9
    public Map<String, Boolean> c() {
        return this.a.f();
    }

    @Override // defpackage.ld9
    public Map<String, String> d() {
        return this.a.c();
    }

    @Override // defpackage.ld9
    public void e() {
        this.a.g();
        this.a.e();
        this.a.d(this.b);
        f();
    }
}
