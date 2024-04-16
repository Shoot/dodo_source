package defpackage;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Android10SocketAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0011"}, d2 = {"Lbe;", "Leqa;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "b", "", c.a, "hostname", "", "Lvr8;", "protocols", "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NewApi"})
/* renamed from: be  reason: default package */
/* loaded from: classes3.dex */
public final class be implements eqa {
    public static final a a = new a(null);

    /* compiled from: Android10SocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lbe$a;", "", "Leqa;", "a", "", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: be$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final eqa a() {
            if (b()) {
                return new be();
            }
            return null;
        }

        public final boolean b() {
            if (xb8.a.h() && Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.eqa
    public boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        z65.h(sSLSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // defpackage.eqa
    public boolean b() {
        return a.b();
    }

    @Override // defpackage.eqa
    @SuppressLint({"NewApi"})
    public String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        z65.h(sSLSocket, "sslSocket");
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (z65.c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // defpackage.eqa
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) xb8.a.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
