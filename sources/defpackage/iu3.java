package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nr7;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileSystem.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H&J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0007H&J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0002J\u001a\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0007H&J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0002J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0007H&J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H&J\u001a\u0010 \u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0007H&J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006$"}, d2 = {"Liu3;", "", "Lnr7;", "path", "Lbu3;", "l", Image.TYPE_MEDIUM, "", "j", "dir", "", "k", Action.FILE_ATTRIBUTE, "Lwt3;", "n", "Lpqa;", "q", "mustCreate", "Lzma;", "p", "o", "mustExist", "b", "a", "", "g", "f", e.a, DateTokenConverter.CONVERTER_KEY, KustoStorage.KustoTable.COLUMN_SOURCE, "target", c.a, "i", Image.TYPE_HIGH, "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: iu3  reason: default package */
/* loaded from: classes3.dex */
public abstract class iu3 {
    public static final a a = new a(null);
    public static final iu3 b;
    public static final nr7 c;
    public static final iu3 d;

    /* compiled from: FileSystem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Liu3$a;", "", "Liu3;", "RESOURCES", "Liu3;", "SYSTEM", "Lnr7;", "SYSTEM_TEMPORARY_DIRECTORY", "Lnr7;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iu3$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        iu3 jd5Var;
        try {
            Class.forName("java.nio.file.Files");
            jd5Var = new xy6();
        } catch (ClassNotFoundException unused) {
            jd5Var = new jd5();
        }
        b = jd5Var;
        nr7.a aVar = nr7.b;
        String property = System.getProperty("java.io.tmpdir");
        z65.g(property, "getProperty(...)");
        c = nr7.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = wj9.class.getClassLoader();
        z65.g(classLoader, "getClassLoader(...)");
        d = new wj9(classLoader, false, null, 4, null);
    }

    public final zma a(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return b(nr7Var, false);
    }

    public abstract zma b(nr7 nr7Var, boolean z) throws IOException;

    public abstract void c(nr7 nr7Var, nr7 nr7Var2) throws IOException;

    public final void d(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, "dir");
        e(nr7Var, false);
    }

    public final void e(nr7 nr7Var, boolean z) throws IOException {
        z65.h(nr7Var, "dir");
        f.a(this, nr7Var, z);
    }

    public final void f(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, "dir");
        g(nr7Var, false);
    }

    public abstract void g(nr7 nr7Var, boolean z) throws IOException;

    public final void h(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, "path");
        i(nr7Var, false);
    }

    public abstract void i(nr7 nr7Var, boolean z) throws IOException;

    public final boolean j(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, "path");
        return f.b(this, nr7Var);
    }

    public abstract List<nr7> k(nr7 nr7Var) throws IOException;

    public final bu3 l(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, "path");
        return f.c(this, nr7Var);
    }

    public abstract bu3 m(nr7 nr7Var) throws IOException;

    public abstract wt3 n(nr7 nr7Var) throws IOException;

    public final zma o(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return p(nr7Var, false);
    }

    public abstract zma p(nr7 nr7Var, boolean z) throws IOException;

    public abstract pqa q(nr7 nr7Var) throws IOException;
}
