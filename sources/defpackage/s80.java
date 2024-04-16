package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: BaseUrlService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Ls80;", "Lp80;", "", "a", "", DateTokenConverter.CONVERTER_KEY, "", "g", "baseUrl", Image.TYPE_HIGH, "Lmh0;", "Lmh0;", "buildInfo", "Lq80;", "b", "Lq80;", "baseUrlRepository", "Lxj3;", c.a, "Lxj3;", "environmentResolver", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "f", "()Lorg/slf4j/Logger;", "logger", e.a, "()Ljava/lang/String;", "currentBaseUrl", "<init>", "(Lmh0;Lq80;Lxj3;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s80  reason: default package */
/* loaded from: classes.dex */
public final class s80 implements p80 {
    private final mh0 a;
    private final q80 b;
    private final xj3 c;
    private final rn5 d;
    private final rn5 e;

    /* compiled from: BaseUrlService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: s80$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String a = s80.this.b.a();
            if (a == null) {
                return s80.this.c.c().b();
            }
            return a;
        }
    }

    /* compiled from: BaseUrlService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: s80$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("BaseUrlServiceImpl");
        }
    }

    public s80(mh0 mh0Var, q80 q80Var, xj3 xj3Var) {
        rn5 b2;
        rn5 b3;
        z65.h(mh0Var, "buildInfo");
        z65.h(q80Var, "baseUrlRepository");
        z65.h(xj3Var, "environmentResolver");
        this.a = mh0Var;
        this.b = q80Var;
        this.c = xj3Var;
        b2 = yn5.b(b.a);
        this.d = b2;
        b3 = yn5.b(new a());
        this.e = b3;
    }

    private final String e() {
        return (String) this.e.getValue();
    }

    private final Logger f() {
        return (Logger) this.d.getValue();
    }

    @Override // defpackage.p80
    public synchronized String a() {
        return e();
    }

    public final synchronized Collection<String> d() {
        Set b2;
        Set a2;
        try {
            b2 = rfa.b();
            b2.add(e());
            if (!this.a.i()) {
                b2.add(this.c.c().b());
                b2.add(this.c.a().b());
            }
            a2 = rfa.a(b2);
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized boolean g() {
        String b2 = this.b.b();
        if (b2 == null) {
            return false;
        }
        Logger f = f();
        f.warn("Restored base url from BlockStore: " + b2);
        this.b.d(b2);
        return !z65.c(e(), b2);
    }

    public final synchronized boolean h(String str) {
        z65.h(str, "baseUrl");
        Logger f = f();
        f.warn("Set base url to " + str);
        this.b.c(str);
        this.b.d(str);
        return !z65.c(e(), str);
    }
}
