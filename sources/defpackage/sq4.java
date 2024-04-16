package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HttpUrl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u001a\u0018\u0000 52\u00020\u0001:\u0002\u0017\u001cBc\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0*\u0012\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010*\u0012\b\u00104\u001a\u0004\u0018\u00010\b\u0012\u0006\u00106\u001a\u00020\b¢\u0006\u0004\bB\u0010CJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\bJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016R\u0017\u0010\u001b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010!\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010$\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0017\u0010)\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0007¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0019\u00104\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b3\u0010\u0018\u001a\u0004\b0\u0010\u001aR\u001a\u00106\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b5\u0010\u001aR\u0011\u00109\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010:\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010;\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010<\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0*8G¢\u0006\u0006\u001a\u0004\b\"\u0010.R\u0013\u0010>\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u0013\u0010@\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b?\u0010\u001aR\u0013\u0010A\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006D"}, d2 = {"Lsq4;", "", "Ljava/net/URL;", "y", "()Ljava/net/URL;", "Ljava/net/URI;", "x", "()Ljava/net/URI;", "", Action.NAME_ATTRIBUTE, "t", "u", ElementGenerator.TYPE_LINK, "v", "Lsq4$a;", Image.TYPE_MEDIUM, "n", "other", "", "equals", "", "hashCode", "toString", "a", "Ljava/lang/String;", "w", "()Ljava/lang/String;", "scheme", "b", "z", "username", c.a, "p", "password", DateTokenConverter.CONVERTER_KEY, "k", "host", e.a, "I", "r", "()I", "port", "", "f", "Ljava/util/List;", "q", "()Ljava/util/List;", "pathSegments", "g", "i", "queryNamesAndValues", Image.TYPE_HIGH, "fragment", "j", RemoteMessageConst.Notification.URL, "l", "()Z", "isHttps", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", Image.TYPE_SMALL, SearchIntents.EXTRA_QUERY, "encodedFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: sq4  reason: default package */
/* loaded from: classes3.dex */
public final class sq4 {
    public static final b j = new b(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final List<String> f;
    private final List<String> g;
    private final String h;
    private final String i;

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u000f\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J!\u0010!\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010*\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010-\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R,\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u00107\u001a\u0004\b;\u00109\"\u0004\b<\u0010=R$\u0010@\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b6\u0010%\"\u0004\b?\u0010'¨\u0006C"}, d2 = {"Lsq4$a;", "", "", "scheme", "t", "username", "B", "password", "p", "host", "n", "", "port", "q", SearchIntents.EXTRA_QUERY, "r", "encodedQuery", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, "value", "b", "encodedName", "encodedValue", "a", "fragment", e.a, Image.TYPE_SMALL, "()Lsq4$a;", "Lsq4;", c.a, "toString", "base", "input", "o", "(Lsq4;Ljava/lang/String;)Lsq4$a;", "Ljava/lang/String;", Image.TYPE_MEDIUM, "()Ljava/lang/String;", "A", "(Ljava/lang/String;)V", "j", "x", "encodedUsername", "g", "v", "encodedPassword", "k", "y", "I", "l", "()I", "z", "(I)V", "", "f", "Ljava/util/List;", Image.TYPE_HIGH, "()Ljava/util/List;", "encodedPathSegments", "i", "w", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "u", "encodedFragment", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sq4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private String a;
        private String d;
        private List<String> g;
        private String h;
        private String b = "";
        private String c = "";
        private int e = -1;
        private final List<String> f = ic1.r("");

        public final void A(String str) {
            this.a = str;
        }

        public final a B(String str) {
            z65.h(str, "username");
            return vj1.a.x(this, str);
        }

        public final a a(String str, String str2) {
            z65.h(str, "encodedName");
            return vj1.a.a(this, str, str2);
        }

        public final a b(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            return vj1.a.b(this, str, str2);
        }

        public final sq4 c() {
            return vj1.a.c(this);
        }

        public final a d(String str) {
            return vj1.a.e(this, str);
        }

        public final a e(String str) {
            return vj1.a.g(this, str);
        }

        public final String f() {
            return this.h;
        }

        public final String g() {
            return this.c;
        }

        public final List<String> h() {
            return this.f;
        }

        public final List<String> i() {
            return this.g;
        }

        public final String j() {
            return this.b;
        }

        public final String k() {
            return this.d;
        }

        public final int l() {
            return this.e;
        }

        public final String m() {
            return this.a;
        }

        public final a n(String str) {
            z65.h(str, "host");
            return vj1.a.i(this, str);
        }

        public final a o(sq4 sq4Var, String str) {
            z65.h(str, "input");
            return vj1.a.l(this, sq4Var, str);
        }

        public final a p(String str) {
            z65.h(str, "password");
            return vj1.a.m(this, str);
        }

        public final a q(int i) {
            return vj1.a.n(this, i);
        }

        public final a r(String str) {
            return vj1.a.o(this, str);
        }

        public final a s() {
            String str;
            String str2;
            String str3 = this.d;
            String str4 = null;
            if (str3 != null) {
                str = new ec9("[\"<>^`{|}]").i(str3, "");
            } else {
                str = null;
            }
            this.d = str;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.f;
                list.set(i, tq4.b(tq4.a, list.get(i), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List<String> list2 = this.g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = tq4.b(tq4.a, str5, 0, 0, "\\^`{|}", true, true, true, false, 67, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.h;
            if (str6 != null) {
                str4 = tq4.b(tq4.a, str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null);
            }
            this.h = str4;
            return this;
        }

        public final a t(String str) {
            z65.h(str, "scheme");
            return vj1.a.s(this, str);
        }

        public String toString() {
            return vj1.a.w(this);
        }

        public final void u(String str) {
            this.h = str;
        }

        public final void v(String str) {
            z65.h(str, "<set-?>");
            this.c = str;
        }

        public final void w(List<String> list) {
            this.g = list;
        }

        public final void x(String str) {
            z65.h(str, "<set-?>");
            this.b = str;
        }

        public final void y(String str) {
            this.d = str;
        }

        public final void z(int i) {
            this.e = i;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lsq4$b;", "", "", "scheme", "", "a", "Lsq4;", "b", "(Ljava/lang/String;)Lsq4;", c.a, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sq4$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(String str) {
            z65.h(str, "scheme");
            return vj1.d(str);
        }

        public final sq4 b(String str) {
            z65.h(str, "<this>");
            return vj1.a.t(str);
        }

        public final sq4 c(String str) {
            z65.h(str, "<this>");
            return vj1.a.u(str);
        }
    }

    public sq4(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        z65.h(str, "scheme");
        z65.h(str2, "username");
        z65.h(str3, "password");
        z65.h(str4, "host");
        z65.h(list, "pathSegments");
        z65.h(str6, RemoteMessageConst.Notification.URL);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = list;
        this.g = list2;
        this.h = str5;
        this.i = str6;
    }

    public static final sq4 h(String str) {
        return j.b(str);
    }

    public static final sq4 o(String str) {
        return j.c(str);
    }

    public final String a() {
        return vj1.a.z(this);
    }

    public final String b() {
        return vj1.a.A(this);
    }

    public final String c() {
        return vj1.a.B(this);
    }

    public final List<String> d() {
        return vj1.a.C(this);
    }

    public final String e() {
        return vj1.a.D(this);
    }

    public boolean equals(Object obj) {
        return vj1.a.f(this, obj);
    }

    public final String f() {
        return vj1.a.E(this);
    }

    public final String g() {
        return this.h;
    }

    public int hashCode() {
        return vj1.a.h(this);
    }

    public final List<String> i() {
        return this.g;
    }

    public final String j() {
        return this.i;
    }

    public final String k() {
        return this.d;
    }

    public final boolean l() {
        return z65.c(this.a, "https");
    }

    public final a m() {
        return vj1.a.j(this);
    }

    public final a n(String str) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        return vj1.a.k(this, str);
    }

    public final String p() {
        return this.c;
    }

    public final List<String> q() {
        return this.f;
    }

    public final int r() {
        return this.e;
    }

    public final String s() {
        return vj1.a.F(this);
    }

    public final String t(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return vj1.a.p(this, str);
    }

    public String toString() {
        return vj1.a.v(this);
    }

    public final String u() {
        return vj1.a.q(this);
    }

    public final sq4 v(String str) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        return vj1.a.r(this, str);
    }

    public final String w() {
        return this.a;
    }

    public final URI x() {
        String aVar = m().s().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new ec9("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").i(aVar, ""));
                z65.e(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL y() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String z() {
        return this.b;
    }
}
