package defpackage;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MeasurementManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0018B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lic6;", "", "Lju2;", "deletionRequest", "", "a", "(Lju2;Lcv1;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", c.a, "(Landroid/net/Uri;Landroid/view/InputEvent;Lcv1;)Ljava/lang/Object;", "trigger", DateTokenConverter.CONVERTER_KEY, "(Landroid/net/Uri;Lcv1;)Ljava/lang/Object;", "Ly3c;", "request", e.a, "(Ly3c;Lcv1;)Ljava/lang/Object;", "Lz3c;", "f", "(Lz3c;Lcv1;)Ljava/lang/Object;", "", "b", "(Lcv1;)Ljava/lang/Object;", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ic6  reason: default package */
/* loaded from: classes.dex */
public abstract class ic6 {
    public static final b a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeasurementManager.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0002J\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0010H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0006H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001dH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lic6$a;", "Lic6;", "Lju2;", "request", "Landroid/adservices/measurement/DeletionRequest;", "k", "Ly3c;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", "l", "Lz3c;", "Landroid/adservices/measurement/WebTriggerRegistrationRequest;", Image.TYPE_MEDIUM, "deletionRequest", "", "a", "(Lju2;Lcv1;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", c.a, "(Landroid/net/Uri;Landroid/view/InputEvent;Lcv1;)Ljava/lang/Object;", "trigger", DateTokenConverter.CONVERTER_KEY, "(Landroid/net/Uri;Lcv1;)Ljava/lang/Object;", e.a, "(Ly3c;Lcv1;)Ljava/lang/Object;", "f", "(Lz3c;Lcv1;)Ljava/lang/Object;", "", "b", "(Lcv1;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0})
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* renamed from: ic6$a */
    /* loaded from: classes.dex */
    public static final class a extends ic6 {
        private final MeasurementManager b;

        public a(MeasurementManager measurementManager) {
            z65.h(measurementManager, "mMeasurementManager");
            this.b = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(ju2 ju2Var) {
            zb6.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(y3c y3cVar) {
            wb6.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(z3c z3cVar) {
            yb6.a();
            throw null;
        }

        @Override // defpackage.ic6
        public Object a(ju2 ju2Var, cv1<? super Unit> cv1Var) {
            cv1 c;
            Object d;
            Object d2;
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            this.b.deleteRegistrations(k(ju2Var), new hc6(), im7.a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }

        @Override // defpackage.ic6
        public Object b(cv1<? super Integer> cv1Var) {
            cv1 c;
            Object d;
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            this.b.getMeasurementApiStatus(new hc6(), im7.a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            return s;
        }

        @Override // defpackage.ic6
        public Object c(Uri uri, InputEvent inputEvent, cv1<? super Unit> cv1Var) {
            cv1 c;
            Object d;
            Object d2;
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            this.b.registerSource(uri, inputEvent, new hc6(), im7.a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }

        @Override // defpackage.ic6
        public Object d(Uri uri, cv1<? super Unit> cv1Var) {
            cv1 c;
            Object d;
            Object d2;
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            this.b.registerTrigger(uri, new hc6(), im7.a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }

        @Override // defpackage.ic6
        public Object e(y3c y3cVar, cv1<? super Unit> cv1Var) {
            cv1 c;
            Object d;
            Object d2;
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            this.b.registerWebSource(l(y3cVar), new hc6(), im7.a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }

        @Override // defpackage.ic6
        public Object f(z3c z3cVar, cv1<? super Unit> cv1Var) {
            cv1 c;
            Object d;
            Object d2;
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            this.b.registerWebTrigger(m(z3cVar), new hc6(), im7.a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                defpackage.z65.h(r2, r0)
                java.lang.Class r0 = defpackage.gc6.a()
                java.lang.Object r2 = defpackage.he.a(r2, r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                defpackage.z65.g(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = defpackage.xb6.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ic6.a.<init>(android.content.Context):void");
        }
    }

    /* compiled from: MeasurementManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lic6$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lic6;", "a", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ic6$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final ic6 a(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            h6 h6Var = h6.a;
            sb.append(h6Var.a());
            Log.d("MeasurementManager", sb.toString());
            if (h6Var.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(ju2 ju2Var, cv1<? super Unit> cv1Var);

    public abstract Object b(cv1<? super Integer> cv1Var);

    public abstract Object c(Uri uri, InputEvent inputEvent, cv1<? super Unit> cv1Var);

    public abstract Object d(Uri uri, cv1<? super Unit> cv1Var);

    public abstract Object e(y3c y3cVar, cv1<? super Unit> cv1Var);

    public abstract Object f(z3c z3cVar, cv1<? super Unit> cv1Var);
}
