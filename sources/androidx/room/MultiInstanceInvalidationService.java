package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.support.api.entity.core.CommonCode;
import defpackage.gs4;
import im.threads.business.transport.MessageAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: MultiInstanceInvalidationService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/IBinder;", "onBind", "", "a", "I", c.a, "()I", DateTokenConverter.CONVERTER_KEY, "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Lfs4;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Lgs4$a;", "Lgs4$a;", "binder", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int a;
    private final Map<Integer, String> b = new LinkedHashMap();
    private final RemoteCallbackList<fs4> c = new b();
    private final gs4.a d = new a();

    /* compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016J'\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Lgs4$a;", "Lfs4;", "callback", "", Action.NAME_ATTRIBUTE, "", "U", MessageAttributes.CLIENT_ID, "", "E1", "", "tables", "E0", "(I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends gs4.a {
        a() {
        }

        @Override // defpackage.gs4
        public void E0(int i, String[] strArr) {
            z65.h(strArr, "tables");
            RemoteCallbackList<fs4> a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                String str = multiInstanceInvalidationService.b().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i2);
                    z65.f(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = multiInstanceInvalidationService.b().get(Integer.valueOf(intValue));
                    if (i != intValue && z65.c(str, str2)) {
                        try {
                            multiInstanceInvalidationService.a().getBroadcastItem(i2).N(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                Unit unit = Unit.a;
            }
        }

        @Override // defpackage.gs4
        public void E1(fs4 fs4Var, int i) {
            z65.h(fs4Var, "callback");
            RemoteCallbackList<fs4> a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                multiInstanceInvalidationService.a().unregister(fs4Var);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(i));
            }
        }

        @Override // defpackage.gs4
        public int U(fs4 fs4Var, String str) {
            z65.h(fs4Var, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<fs4> a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(fs4Var, Integer.valueOf(c))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c), str);
                        i = c;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }
    }

    /* compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Lfs4;", "callback", "", "cookie", "", "a", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends RemoteCallbackList<fs4> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(fs4 fs4Var, Object obj) {
            z65.h(fs4Var, "callback");
            z65.h(obj, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList<fs4> a() {
        return this.c;
    }

    public final Map<Integer, String> b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final void d(int i) {
        this.a = i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return this.d;
    }
}
