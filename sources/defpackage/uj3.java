package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EnvironmentManager.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\f\u001a\u00020\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007J!\u0010\u0012\u001a\u00020\u00052\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0010\"\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006'"}, d2 = {"Luj3;", "", "", "Lrj3;", "updatedList", "", "i", "", "environmentsInString", "g", "environments", "f", DateTokenConverter.CONVERTER_KEY, e.a, "newEnvironmentName", com.huawei.hms.opendevice.c.a, "", "removingEnvironments", Image.TYPE_HIGH, "([Ljava/lang/String;)V", "Ls80;", "a", "Ls80;", "baseUrlService", "Lxj3;", "b", "Lxj3;", "environmentResolver", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Ljava/util/List;", "devEnvironments", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Ls80;Lxj3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ApplySharedPref"})
/* renamed from: uj3  reason: default package */
/* loaded from: classes4.dex */
public final class uj3 {
    public static final a e = new a(null);
    private static final int f;
    private static final int g;
    private final s80 a;
    private final xj3 b;
    private final SharedPreferences c;
    private final List<rj3> d;

    /* compiled from: EnvironmentManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Luj3$a;", "", "", "START_PATTERN_INDEX", "I", "b", "()I", "END_PATTERN_INDEX", "a", "", "DEFAULT_STAND_PATTERN", "Ljava/lang/String;", "DEV_ENVIRONMENTS_KEY", "EMPTY", "ENVIRONMENTS_DELIMITER", "PAIR_DELIMITER", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uj3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return uj3.g;
        }

        public final int b() {
            return uj3.f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnvironmentManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrj3;", "environment", "", "a", "(Lrj3;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: uj3$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<rj3, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(rj3 rj3Var) {
            z65.h(rj3Var, "environment");
            String a2 = rj3Var.a();
            String b = rj3Var.b();
            return a2 + "->" + b + "||";
        }
    }

    /* compiled from: EnvironmentManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrj3;", "environment", "", "a", "(Lrj3;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: uj3$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<rj3, Boolean> {
        final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String[] strArr) {
            super(1);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(rj3 rj3Var) {
            boolean A;
            z65.h(rj3Var, "environment");
            A = yr.A(this.a, rj3Var.b());
            return Boolean.valueOf(A);
        }
    }

    static {
        int Z;
        int Z2;
        Z = m0b.Z("https://mapi-gateway.dev-{окружение}.dodois.dev", "{", 0, false, 6, null);
        f = Z;
        Z2 = m0b.Z("https://mapi-gateway.dev-{окружение}.dodois.dev", "}", 0, false, 6, null);
        g = Z2 + 1;
    }

    public uj3(Context context, s80 s80Var, xj3 xj3Var) {
        Set L0;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(s80Var, "baseUrlService");
        z65.h(xj3Var, "environmentResolver");
        this.a = s80Var;
        this.b = xj3Var;
        SharedPreferences b2 = g.b(context);
        this.c = b2;
        String string = b2.getString("dev_environments_key", "");
        z65.e(string);
        L0 = sc1.L0(xj3Var.b(), g(string));
        this.d = new ArrayList(L0);
    }

    private final String f(List<rj3> list) {
        String i0;
        i0 = sc1.i0(list, "", null, null, 0, null, b.a, 30, null);
        return i0;
    }

    private final List<rj3> g(String str) {
        List y0;
        int w;
        List y02;
        y0 = m0b.y0(str, new String[]{"||"}, false, 0, 6, null);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : y0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (String str2 : arrayList) {
            y02 = m0b.y0(str2, new String[]{"->"}, false, 0, 6, null);
            arrayList2.add(new rj3((String) y02.get(0), (String) y02.get(1)));
        }
        return arrayList2;
    }

    private final void i(List<rj3> list) {
        this.c.edit().putString("dev_environments_key", f(list)).commit();
    }

    public final void c(String str) {
        boolean J;
        String str2;
        z65.h(str, "newEnvironmentName");
        J = l0b.J(str, "http", false, 2, null);
        if (J) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        this.d.add(new rj3(str, str2));
        i(this.d);
    }

    public final rj3 d() {
        Object obj;
        String a2 = this.a.a();
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((rj3) obj).b(), a2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (rj3) mh5.c(obj, new rj3(a2, a2));
    }

    public final List<rj3> e() {
        return this.d;
    }

    public final void h(String... strArr) {
        z65.h(strArr, "removingEnvironments");
        pc1.I(this.d, new c(strArr));
        i(this.d);
    }
}
