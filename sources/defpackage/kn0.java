package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import defpackage.lx1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CancellationExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Llx1;", "b", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "Lrn5;", c.a, "()Lorg/slf4j/Logger;", "logger", "general"}, k = 2, mv = {1, 9, 0})
/* renamed from: kn0  reason: default package */
/* loaded from: classes.dex */
public final class kn0 {
    private static final rn5 a;

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"kn0$a", "Lkotlin/coroutines/a;", "Llx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "N", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kn0$a */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.a implements lx1 {
        public a(lx1.a aVar) {
            super(aVar);
        }

        @Override // defpackage.lx1
        public void N(CoroutineContext coroutineContext, Throwable th) {
            if (th instanceof CancellationException) {
                kn0.a().error("Uncaught CancellationException", th);
                return;
            }
            throw th;
        }
    }

    /* compiled from: CancellationExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kn0$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("CancellationExceptionHandler");
        }
    }

    static {
        rn5 b2;
        b2 = yn5.b(b.a);
        a = b2;
    }

    public static final /* synthetic */ Logger a() {
        return c();
    }

    public static final lx1 b() {
        return new a(lx1.J);
    }

    private static final Logger c() {
        return (Logger) a.getValue();
    }
}
