package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn4;
import defpackage.xk3;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
import kotlin.time.a;
/* compiled from: -UtilJvm.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0000*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0000\u001a+\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u001a \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\u001a\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0012\u0010\u001f\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000\u001a\u0012\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001eH\u0000\u001a\u0014\u0010\"\u001a\u00020\u0002*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0000\u001a\f\u0010%\u001a\u00020$*\u00020#H\u0000\u001a\u001c\u0010(\u001a\u00020\u0002*\u00020&2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0015H\u0000\u001a\u001c\u0010*\u001a\u00020\u0002*\u00020&2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0015H\u0000\u001a\f\u0010,\u001a\u00020\u0000*\u00020+H\u0000\u001a\u0014\u0010.\u001a\u00020\u0002*\u00020+2\u0006\u0010-\u001a\u00020\u000fH\u0000\u001a\f\u00100\u001a\u00020\u0013*\u00020/H\u0000\u001a\u001e\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u00101*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0000\u001a/\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u001012\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0001¢\u0006\u0004\b4\u00105\u001a\f\u00107\u001a\u000206*\u00020+H\u0000\u001a\f\u00108\u001a\u00020\u0000*\u00020\u0013H\u0000\u001a\f\u00109\u001a\u00020\u0000*\u00020\u0017H\u0000\"\u0014\u0010<\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010@\u001a\u00020=8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010C\u001a\u00020A8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010B\"\u0014\u0010G\u001a\u00020D8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010I\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010H\"\u0014\u0010K\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010J\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"", Action.NAME_ATTRIBUTE, "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "q", "Lsq4;", "includeDefaultPort", "w", "format", "", "", "args", "j", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lfh0;", "Ljava/nio/charset/Charset;", "default", "o", "", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "", "f", "Lkotlin/time/a;", "g", "(Ljava/lang/String;J)I", "", "Ldn4;", "Lgn4;", "t", Image.TYPE_SMALL, "other", e.a, "Lxk3;", "Lxk3$c;", c.a, "Lpqa;", "timeUnit", "p", "timeout", "i", "Ljava/net/Socket;", "n", KustoStorage.KustoTable.COLUMN_SOURCE, Image.TYPE_MEDIUM, "Lik9;", "k", "T", "y", "elements", "l", "([Ljava/lang/Object;)Ljava/util/List;", "", Image.TYPE_HIGH, "v", "u", "a", "Lgn4;", "EMPTY_HEADERS", "Lji9;", "b", "Lji9;", "EMPTY_REQUEST", "Lkk9;", "Lkk9;", "EMPTY_RESPONSE", "Ljava/util/TimeZone;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/TimeZone;", "UTC", "Z", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: cec  reason: default package */
/* loaded from: classes3.dex */
public final class cec {
    public static final gn4 a = zdc.m();
    public static final ji9 b = zdc.n();
    public static final kk9 c = zdc.o();
    public static final TimeZone d;
    public static final boolean e;
    public static final String f;

    static {
        String p0;
        String q0;
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        z65.e(timeZone);
        d = timeZone;
        e = false;
        String name = b77.class.getName();
        z65.g(name, "getName(...)");
        p0 = m0b.p0(name, "okhttp3.");
        q0 = m0b.q0(p0, "Client");
        f = q0;
    }

    public static final xk3.c c(final xk3 xk3Var) {
        z65.h(xk3Var, "<this>");
        return new xk3.c() { // from class: bec
            @Override // defpackage.xk3.c
            public final xk3 a(cm0 cm0Var) {
                xk3 d2;
                d2 = cec.d(xk3.this, cm0Var);
                return d2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xk3 d(xk3 xk3Var, cm0 cm0Var) {
        z65.h(xk3Var, "$this_asFactory");
        z65.h(cm0Var, "it");
        return xk3Var;
    }

    public static final boolean e(sq4 sq4Var, sq4 sq4Var2) {
        z65.h(sq4Var, "<this>");
        z65.h(sq4Var2, "other");
        if (z65.c(sq4Var.k(), sq4Var2.k()) && sq4Var.r() == sq4Var2.r() && z65.c(sq4Var.w(), sq4Var2.w())) {
            return true;
        }
        return false;
    }

    public static final int f(String str, long j, TimeUnit timeUnit) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(timeUnit, "unit");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            long millis = timeUnit.toMillis(j);
            if (millis <= 2147483647L) {
                if (millis == 0 && i > 0) {
                    throw new IllegalArgumentException((str + " too small").toString());
                }
                return (int) millis;
            }
            throw new IllegalArgumentException((str + " too large").toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final int g(String str, long j) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        if (!a.I(j)) {
            long u = a.u(j);
            if (u <= 2147483647L) {
                if (u == 0 && a.J(j)) {
                    throw new IllegalArgumentException((str + " too small").toString());
                }
                return (int) u;
            }
            throw new IllegalArgumentException((str + " too large").toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void h(Socket socket) {
        z65.h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (z65.c(e3.getMessage(), "bio == null")) {
                return;
            }
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final boolean i(pqa pqaVar, int i, TimeUnit timeUnit) {
        z65.h(pqaVar, "<this>");
        z65.h(timeUnit, "timeUnit");
        try {
            return p(pqaVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String j(String str, Object... objArr) {
        z65.h(str, "format");
        z65.h(objArr, "args");
        pza pzaVar = pza.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        z65.g(format, "format(...)");
        return format;
    }

    public static final long k(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        String d2 = ik9Var.q().d("Content-Length");
        if (d2 == null) {
            return -1L;
        }
        return zdc.G(d2, -1L);
    }

    @SafeVarargs
    public static final <T> List<T> l(T... tArr) {
        List o;
        z65.h(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        o = kc1.o(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(o);
        z65.g(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final boolean m(Socket socket, fh0 fh0Var) {
        z65.h(socket, "<this>");
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !fh0Var.U0();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final String n(Socket socket) {
        z65.h(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            z65.g(hostName, "getHostName(...)");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    public static final Charset o(fh0 fh0Var, Charset charset) throws IOException {
        z65.h(fh0Var, "<this>");
        z65.h(charset, "default");
        int W0 = fh0Var.W0(zdc.p());
        if (W0 != -1) {
            if (W0 != 0) {
                if (W0 != 1) {
                    if (W0 != 2) {
                        if (W0 != 3) {
                            if (W0 == 4) {
                                return rw0.a.b();
                            }
                            throw new AssertionError();
                        }
                        return rw0.a.a();
                    }
                    return rw0.e;
                }
                return rw0.d;
            }
            return rw0.b;
        }
        return charset;
    }

    public static final boolean p(pqa pqaVar, int i, TimeUnit timeUnit) throws IOException {
        long j;
        z65.h(pqaVar, "<this>");
        z65.h(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (pqaVar.timeout().e()) {
            j = pqaVar.timeout().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        pqaVar.timeout().d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            yg0 yg0Var = new yg0();
            while (pqaVar.read(yg0Var, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
                yg0Var.b();
            }
            if (j == Long.MAX_VALUE) {
                pqaVar.timeout().a();
            } else {
                pqaVar.timeout().d(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                pqaVar.timeout().a();
            } else {
                pqaVar.timeout().d(nanoTime + j);
            }
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                pqaVar.timeout().a();
            } else {
                pqaVar.timeout().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static final ThreadFactory q(final String str, final boolean z) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return new ThreadFactory() { // from class: aec
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread r;
                r = cec.r(str, z, runnable);
                return r;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread r(String str, boolean z, Runnable runnable) {
        z65.h(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final List<dn4> s(gn4 gn4Var) {
        IntRange q;
        int w;
        z65.h(gn4Var, "<this>");
        q = i.q(0, gn4Var.size());
        w = lc1.w(q, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            int b2 = ((q55) it).b();
            arrayList.add(new dn4(gn4Var.h(b2), gn4Var.u(b2)));
        }
        return arrayList;
    }

    public static final gn4 t(List<dn4> list) {
        z65.h(list, "<this>");
        gn4.a aVar = new gn4.a();
        for (dn4 dn4Var : list) {
            aVar.d(dn4Var.a().z0(), dn4Var.b().z0());
        }
        return aVar.f();
    }

    public static final String u(int i) {
        String hexString = Integer.toHexString(i);
        z65.g(hexString, "toHexString(...)");
        return hexString;
    }

    public static final String v(long j) {
        String hexString = Long.toHexString(j);
        z65.g(hexString, "toHexString(...)");
        return hexString;
    }

    public static final String w(sq4 sq4Var, boolean z) {
        boolean O;
        String k;
        z65.h(sq4Var, "<this>");
        O = m0b.O(sq4Var.k(), ":", false, 2, null);
        if (O) {
            k = '[' + sq4Var.k() + ']';
        } else {
            k = sq4Var.k();
        }
        if (z || sq4Var.r() != vj1.d(sq4Var.w())) {
            return k + CoreConstants.COLON_CHAR + sq4Var.r();
        }
        return k;
    }

    public static /* synthetic */ String x(sq4 sq4Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return w(sq4Var, z);
    }

    public static final <T> List<T> y(List<? extends T> list) {
        List I0;
        z65.h(list, "<this>");
        I0 = sc1.I0(list);
        List<T> unmodifiableList = Collections.unmodifiableList(I0);
        z65.g(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
