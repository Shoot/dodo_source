package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
/* compiled from: FastServiceLoader.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J3\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ldp3;", "", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", "", "b", "", Action.NAME_ATTRIBUTE, "a", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", RemoteMessageConst.Notification.URL, e.a, "Ljava/io/BufferedReader;", "r", "f", "Lu46;", c.a, "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: dp3  reason: default package */
/* loaded from: classes3.dex */
public final class dp3 {
    public static final dp3 a = new dp3();

    private dp3() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> F0;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            F0 = sc1.F0(ServiceLoader.load(cls, classLoader));
            return F0;
        }
    }

    private final List<String> e(URL url) {
        boolean J;
        String K0;
        String P0;
        String K02;
        String url2 = url.toString();
        J = l0b.J(url2, "jar", false, 2, null);
        if (J) {
            K0 = m0b.K0(url2, "jar:file:", null, 2, null);
            P0 = m0b.P0(K0, '!', null, 2, null);
            K02 = m0b.K0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(P0, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(K02)), "UTF-8"));
                List<String> f = a.f(bufferedReader);
                aa1.a(bufferedReader, null);
                jarFile.close();
                return f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        vl3.a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
        try {
            List<String> f2 = a.f(bufferedReader2);
            aa1.a(bufferedReader2, null);
            return f2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                aa1.a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> F0;
        String Q0;
        CharSequence R0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                F0 = sc1.F0(linkedHashSet);
                return F0;
            }
            Q0 = m0b.Q0(readLine, "#", null, 2, null);
            R0 = m0b.R0(Q0);
            String obj = R0.toString();
            for (int i = 0; i < obj.length(); i++) {
                char charAt = obj.charAt(i);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final List<u46> c() {
        u46 u46Var;
        if (!ep3.a()) {
            return b(u46.class, u46.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            u46 u46Var2 = null;
            try {
                u46Var = (u46) u46.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, u46.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                u46Var = null;
            }
            if (u46Var != null) {
                arrayList.add(u46Var);
            }
            try {
                u46Var2 = (u46) u46.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, u46.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (u46Var2 != null) {
                arrayList.add(u46Var2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return b(u46.class, u46.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set K0;
        int w;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        z65.g(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            pc1.C(arrayList, a.e(url));
        }
        K0 = sc1.K0(arrayList);
        if (!K0.isEmpty()) {
            Set<String> set = K0;
            w = lc1.w(set, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (String str : set) {
                arrayList2.add(a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
