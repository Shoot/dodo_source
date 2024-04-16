package defpackage;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: CurrentLocaleProviderImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lj32;", "Li32;", "Ljava/util/Locale;", c.a, "", DateTokenConverter.CONVERTER_KEY, "b", "get", "a", "Lwl5;", "Lwl5;", "languageService", "Ljo;", "Ljo;", "appResourceLocalesFactory", "", e.a, "()Z", "getUseSystemLocale$annotations", "()V", "useSystemLocale", "<init>", "(Lwl5;Ljo;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: j32  reason: default package */
/* loaded from: classes4.dex */
public final class j32 implements i32 {
    private final wl5 a;
    private final jo b;

    public j32(wl5 wl5Var, jo joVar) {
        z65.h(wl5Var, "languageService");
        z65.h(joVar, "appResourceLocalesFactory");
        this.a = wl5Var;
        this.b = joVar;
    }

    private final Locale b() {
        tl5 a = this.a.a();
        if (a == null) {
            a = this.a.c();
        }
        return ul5.b(a);
    }

    private final Locale c() {
        return this.b.a().getValue();
    }

    private final List<Locale> d() {
        return this.b.c().getValue();
    }

    @Override // defpackage.i32
    public List<Locale> a() {
        List<Locale> e;
        if (!e()) {
            e = jc1.e(b());
            return e;
        }
        return d();
    }

    public final boolean e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i32
    public Locale get() {
        if (e()) {
            return c();
        }
        return b();
    }
}
