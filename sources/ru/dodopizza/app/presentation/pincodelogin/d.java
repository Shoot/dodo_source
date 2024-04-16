package ru.dodopizza.app.presentation.pincodelogin;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.pincodelogin.d;
/* compiled from: PinCodeSmsHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0006R\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lru/dodopizza/app/presentation/pincodelogin/d$a;", "onPinCodeReceivedListener", "", "f", "", "pinCode", DateTokenConverter.CONVERTER_KEY, e.a, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lorg/slf4j/Logger;", "logger", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/app/presentation/pincodelogin/d$a;", "listener", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d {
    public static final d a = new d();
    private static final Logger b = LoggerFactory.getLogger("PinCodeSmsHelper");
    private static a c;

    /* compiled from: PinCodeSmsHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/d$a;", "", "", "pinCode", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    /* compiled from: PinCodeSmsHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Void;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<Void, Unit> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(Void r2) {
            d.b.debug("Successfully started receiving pin code sms");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
            a(r1);
            return Unit.a;
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Exception exc) {
        z65.h(exc, e.a);
        b.warn("Failed to start receiving pin code sms.", (Throwable) exc);
    }

    public final void d(String str) {
        z65.h(str, "pinCode");
        a aVar = c;
        if (aVar != null) {
            aVar.a(str);
        }
        c = null;
    }

    public final void e() {
        c = null;
    }

    public final void f(Context context, a aVar) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(aVar, "onPinCodeReceivedListener");
        c = aVar;
        y6b<Void> y = aoa.a(context).y();
        final b bVar = b.a;
        y.g(new a97() { // from class: p68
            @Override // defpackage.a97
            public final void onSuccess(Object obj) {
                d.g(Function1.this, obj);
            }
        }).e(new a87() { // from class: q68
            @Override // defpackage.a87
            public final void onFailure(Exception exc) {
                d.h(exc);
            }
        });
    }
}
