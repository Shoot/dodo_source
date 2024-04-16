package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
/* compiled from: DeferredSocketAdapter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0017"}, d2 = {"Lss2;", "Leqa;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", e.a, "", "b", "a", "", "hostname", "", "Lvr8;", "protocols", "", DateTokenConverter.CONVERTER_KEY, c.a, "Lss2$a;", "Lss2$a;", "socketAdapterFactory", "Leqa;", "delegate", "<init>", "(Lss2$a;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ss2  reason: default package */
/* loaded from: classes3.dex */
public final class ss2 implements eqa {
    private final a a;
    private eqa b;

    /* compiled from: DeferredSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lss2$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Leqa;", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ss2$a */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        eqa b(SSLSocket sSLSocket);
    }

    public ss2(a aVar) {
        z65.h(aVar, "socketAdapterFactory");
        this.a = aVar;
    }

    private final synchronized eqa e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.eqa
    public boolean a(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.eqa
    public boolean b() {
        return true;
    }

    @Override // defpackage.eqa
    public String c(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        eqa e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.eqa
    public void d(SSLSocket sSLSocket, String str, List<? extends vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        eqa e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }
}
