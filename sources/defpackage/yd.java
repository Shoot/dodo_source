package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Android10Platform.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lyd;", "Lxb8;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lvr8;", "protocols", "", e.a, Image.TYPE_HIGH, "closer", "", "i", "message", "stackTrace", Image.TYPE_MEDIUM, "", "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Leu0;", c.a, "Leqa;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "socketAdapters", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: yd  reason: default package */
/* loaded from: classes3.dex */
public final class yd extends xb8 {
    public static final a e = new a(null);
    private static final boolean f;
    private final List<eqa> d;

    /* compiled from: Android10Platform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lyd$a;", "", "Lxb8;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yd$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xb8 a() {
            if (b()) {
                return new yd();
            }
            return null;
        }

        public final boolean b() {
            return yd.f;
        }
    }

    static {
        boolean z;
        if (xb8.a.h() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        f = z;
    }

    public yd() {
        List q;
        q = kc1.q(be.a.a(), new ss2(ui.f.d()), new ss2(br1.a.a()), new ss2(hf0.a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : q) {
            if (((eqa) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.xb8
    public eu0 c(X509TrustManager x509TrustManager) {
        z65.h(x509TrustManager, "trustManager");
        vf a2 = vf.d.a(x509TrustManager);
        if (a2 == null) {
            return super.c(x509TrustManager);
        }
        return a2;
    }

    @Override // defpackage.xb8
    public void e(SSLSocket sSLSocket, String str, List<? extends vr8> list) {
        Object obj;
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((eqa) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        eqa eqaVar = (eqa) obj;
        if (eqaVar != null) {
            eqaVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.xb8
    public String h(SSLSocket sSLSocket) {
        Object obj;
        z65.h(sSLSocket, "sslSocket");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((eqa) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        eqa eqaVar = (eqa) obj;
        if (eqaVar == null) {
            return null;
        }
        return eqaVar.c(sSLSocket);
    }

    @Override // defpackage.xb8
    public Object i(String str) {
        z65.h(str, "closer");
        if (Build.VERSION.SDK_INT >= 30) {
            CloseGuard a2 = vd.a();
            a2.open(str);
            return a2;
        }
        return super.i(str);
    }

    @Override // defpackage.xb8
    @SuppressLint({"NewApi"})
    public boolean j(String str) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        z65.h(str, "hostname");
        networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }

    @Override // defpackage.xb8
    public void m(String str, Object obj) {
        z65.h(str, "message");
        if (Build.VERSION.SDK_INT >= 30) {
            z65.f(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            td.a(obj).warnIfOpen();
            return;
        }
        super.m(str, obj);
    }
}
