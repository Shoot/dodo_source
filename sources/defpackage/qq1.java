package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConnectionListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0016"}, d2 = {"Lqq1;", "", "Lqo9;", "route", "Lcm0;", "call", "", DateTokenConverter.CONVERTER_KEY, "Ljava/io/IOException;", "Lokio/IOException;", "failure", c.a, "Loq1;", "connection", "b", "f", e.a, "g", Image.TYPE_HIGH, "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: qq1  reason: default package */
/* loaded from: classes3.dex */
public abstract class qq1 {
    public static final b a = new b(null);
    private static final qq1 b = new a();

    /* compiled from: ConnectionListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qq1$a", "Lqq1;", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qq1$a */
    /* loaded from: classes3.dex */
    public static final class a extends qq1 {
        a() {
        }
    }

    /* compiled from: ConnectionListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lqq1$b;", "", "Lqq1;", "NONE", "Lqq1;", "a", "()Lqq1;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qq1$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qq1 a() {
            return qq1.b;
        }
    }

    public void b(oq1 oq1Var, qo9 qo9Var, cm0 cm0Var) {
        z65.h(oq1Var, "connection");
        z65.h(qo9Var, "route");
        z65.h(cm0Var, "call");
    }

    public void c(qo9 qo9Var, cm0 cm0Var, IOException iOException) {
        z65.h(qo9Var, "route");
        z65.h(cm0Var, "call");
        z65.h(iOException, "failure");
    }

    public void d(qo9 qo9Var, cm0 cm0Var) {
        z65.h(qo9Var, "route");
        z65.h(cm0Var, "call");
    }

    public void e(oq1 oq1Var, cm0 cm0Var) {
        z65.h(oq1Var, "connection");
        z65.h(cm0Var, "call");
    }

    public void f(oq1 oq1Var) {
        z65.h(oq1Var, "connection");
    }

    public void g(oq1 oq1Var, cm0 cm0Var) {
        z65.h(oq1Var, "connection");
        z65.h(cm0Var, "call");
    }

    public void h(oq1 oq1Var) {
        z65.h(oq1Var, "connection");
    }
}
