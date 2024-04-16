package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: InAppRepositoryImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\""}, d2 = {"Lxy4;", "Lwy4;", "", "operation", "Lfx4;", "inApp", "", "g", "", DateTokenConverter.CONVERTER_KEY, "", Image.TYPE_HIGH, "Loz3;", "Ltx4;", "i", "id", "a", "inAppId", "f", "b", e.a, "", c.a, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcfa;", "Lcfa;", "sessionStorageManager", "Laz4;", "Laz4;", "inAppSerializationManager", "<init>", "(Landroid/content/Context;Lcfa;Laz4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xy4  reason: default package */
/* loaded from: classes.dex */
public final class xy4 implements wy4 {
    private final Context a;
    private final cfa b;
    private final az4 c;

    public xy4(Context context, cfa cfaVar, az4 az4Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(cfaVar, "sessionStorageManager");
        z65.h(az4Var, "inAppSerializationManager");
        this.a = context;
        this.b = cfaVar;
        this.c = az4Var;
    }

    @Override // defpackage.wy4
    public void a(String str) {
        Set<String> j;
        boolean y;
        z65.h(str, "id");
        az4 az4Var = this.c;
        j = tfa.j(h(), str);
        String c = az4Var.c(j);
        y = l0b.y(c);
        if (!y) {
            nk6.a.A(c);
        }
    }

    @Override // defpackage.wy4
    public void b(String str) {
        boolean y;
        z65.h(str, "inAppId");
        String b = this.c.b(str);
        y = l0b.y(b);
        if (!y) {
            tj6.a.k(this.a, b);
        }
    }

    @Override // defpackage.wy4
    public boolean c() {
        return this.b.g();
    }

    @Override // defpackage.wy4
    public List<fx4> d(String str) {
        List<fx4> l;
        z65.h(str, "operation");
        HashMap<String, List<fx4>> e = this.b.e();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        z65.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        List<fx4> list = e.get(lowerCase);
        if (list == null) {
            l = kc1.l();
            return l;
        }
        return list;
    }

    @Override // defpackage.wy4
    public void e() {
        this.b.k(true);
    }

    @Override // defpackage.wy4
    public void f(String str) {
        boolean y;
        z65.h(str, "inAppId");
        String b = this.c.b(str);
        y = l0b.y(b);
        if (!y) {
            tj6.a.l(this.a, b);
        }
    }

    @Override // defpackage.wy4
    public void g(String str, fx4 fx4Var) {
        z65.h(str, "operation");
        z65.h(fx4Var, "inApp");
        HashMap<String, List<fx4>> e = this.b.e();
        List<fx4> list = this.b.e().get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(fx4Var);
        e.put(str, list);
    }

    @Override // defpackage.wy4
    public Set<String> h() {
        return this.c.a(nk6.a.l());
    }

    @Override // defpackage.wy4
    public oz3<tx4> i() {
        return tj6.a.j();
    }
}
