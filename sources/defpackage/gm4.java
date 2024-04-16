package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ch.qos.logback.core.joran.action.Action;
import defpackage.sk9;
import kotlin.Metadata;
/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\"\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/os/Handler;", "", Action.NAME_ATTRIBUTE, "Lfm4;", "b", "(Landroid/os/Handler;Ljava/lang/String;)Lfm4;", "Landroid/os/Looper;", "", "async", "a", "Lfm4;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
/* renamed from: gm4  reason: default package */
/* loaded from: classes3.dex */
public final class gm4 {
    public static final fm4 a;
    private static volatile Choreographer choreographer;

    static {
        Object b;
        fm4 fm4Var = null;
        try {
            sk9.a aVar = sk9.b;
            b = sk9.b(new em4(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        if (!sk9.f(b)) {
            fm4Var = b;
        }
        a = fm4Var;
    }

    public static final Handler a(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                if (invoke != null) {
                    return (Handler) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public static final fm4 b(Handler handler, String str) {
        return new em4(handler, str);
    }
}
