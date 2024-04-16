package defpackage;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.payment.card.secure3d.Secure3DWebView;
/* compiled from: Secure3DWebView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Llpb;", "", "Lkotlin/Function1;", "Lj62;", "", "lambda", "b", "a", "Lj62;", "authListener", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiThreadHandler", "<init>", "(Lj62;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: lpb  reason: default package */
/* loaded from: classes4.dex */
public final class lpb {
    private final j62 a;
    private final Handler b;

    public lpb(j62 j62Var) {
        z65.h(j62Var, "authListener");
        this.a = j62Var;
        this.b = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, lpb lpbVar) {
        z65.h(function1, "$lambda");
        z65.h(lpbVar, "this$0");
        function1.invoke(lpbVar.a);
    }

    public final void b(final Function1<? super j62, Unit> function1) {
        z65.h(function1, "lambda");
        if (z65.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            function1.invoke(this.a);
        } else {
            this.b.post(new Runnable() { // from class: kpb
                @Override // java.lang.Runnable
                public final void run() {
                    lpb.c(Function1.this, this);
                }
            });
        }
    }

    public /* synthetic */ lpb(j62 j62Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.a : j62Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Secure3DWebView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, d2 = {"Llpb$a;", "Lj62;", "", "jsonUrl", "", e.a, "Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView;", "view", DateTokenConverter.CONVERTER_KEY, "", "progress", "b", "errorCode", "description", "failingUrl", "a", "finalizationUrl", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lpb$a */
    /* loaded from: classes4.dex */
    public static final class a implements j62 {
        public static final a a = new a();

        private a() {
        }

        @Override // defpackage.j62
        public void a(int i, String str, String str2) {
            z65.h(str, "description");
            z65.h(str2, "failingUrl");
        }

        @Override // defpackage.j62
        public void c(String str) {
            z65.h(str, "finalizationUrl");
        }

        @Override // defpackage.j62
        public void d(Secure3DWebView secure3DWebView) {
            z65.h(secure3DWebView, "view");
        }

        @Override // defpackage.j62
        public void e(String str) {
            z65.h(str, "jsonUrl");
        }

        @Override // defpackage.j62
        public void b(int i) {
        }
    }
}
