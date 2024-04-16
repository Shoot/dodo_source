package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FormBody.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0007\u0011B%\b\u0000\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, d2 = {"Lg54;", "Lji9;", "Leh0;", "sink", "", "countBytes", "", "a", "Lqc6;", "contentType", "contentLength", "", "writeTo", "", "", "Ljava/util/List;", "encodedNames", "b", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", c.a, "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: g54  reason: default package */
/* loaded from: classes3.dex */
public final class g54 extends ji9 {
    public static final b c = new b(null);
    private static final qc6 d = qc6.e.a("application/x-www-form-urlencoded");
    private final List<String> a;
    private final List<String> b;

    /* compiled from: FormBody.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0012"}, d2 = {"Lg54$a;", "", "", Action.NAME_ATTRIBUTE, "value", "a", "b", "Lg54;", c.a, "Ljava/nio/charset/Charset;", "Ljava/nio/charset/Charset;", "charset", "", "Ljava/util/List;", "names", "values", "<init>", "(Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: g54$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final Charset a;
        private final List<String> b;
        private final List<String> c;

        public a() {
            this(null, 1, null);
        }

        public final a a(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            id5 id5Var = id5.a;
            this.b.add(id5.b(id5Var, str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.a, 91, null));
            this.c.add(id5.b(id5Var, str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.a, 91, null));
            return this;
        }

        public final a b(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            id5 id5Var = id5.a;
            this.b.add(id5.b(id5Var, str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.a, 83, null));
            this.c.add(id5.b(id5Var, str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.a, 83, null));
            return this;
        }

        public final g54 c() {
            return new g54(this.b, this.c);
        }

        public a(Charset charset) {
            this.a = charset;
            this.b = new ArrayList();
            this.c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    /* compiled from: FormBody.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lg54$b;", "", "Lqc6;", "CONTENT_TYPE", "Lqc6;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: g54$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g54(List<String> list, List<String> list2) {
        z65.h(list, "encodedNames");
        z65.h(list2, "encodedValues");
        this.a = cec.y(list);
        this.b = cec.y(list2);
    }

    private final long a(eh0 eh0Var, boolean z) {
        yg0 d2;
        if (z) {
            d2 = new yg0();
        } else {
            z65.e(eh0Var);
            d2 = eh0Var.d();
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                d2.V0(38);
            }
            d2.a0(this.a.get(i));
            d2.V0(61);
            d2.a0(this.b.get(i));
        }
        if (z) {
            long P = d2.P();
            d2.b();
            return P;
        }
        return 0L;
    }

    @Override // defpackage.ji9
    public long contentLength() {
        return a(null, true);
    }

    @Override // defpackage.ji9
    public qc6 contentType() {
        return d;
    }

    @Override // defpackage.ji9
    public void writeTo(eh0 eh0Var) throws IOException {
        z65.h(eh0Var, "sink");
        a(eh0Var, false);
    }
}
