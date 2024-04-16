package defpackage;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
/* renamed from: df0  reason: default package */
/* loaded from: classes3.dex */
public class df0 extends Provider implements ConfigurableProvider {
    private static String a = "BouncyCastle Post-Quantum Security Provider v1.69";
    public static String b = "BCPQC";
    public static final ProviderConfiguration c = null;
    private static final Map d = new HashMap();
    private static final String[] e = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    /* renamed from: df0$a */
    /* loaded from: classes3.dex */
    class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            df0.this.e();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: df0$b */
    /* loaded from: classes3.dex */
    public static class b implements PrivilegedAction {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public df0() {
        super(b, 1.67d, a);
        AccessController.doPrivileged(new a());
    }

    private void c(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class d2 = d(df0.class, str + strArr[i] + "$Mappings");
            if (d2 != null) {
                try {
                    ((AlgorithmProvider) d2.newInstance()).configure(this);
                } catch (Exception e2) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e2);
                }
            }
        }
    }

    static Class d(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c("org.bouncycastle.pqc.jcajce.provider.", e);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (!containsKey(str3)) {
                put(str3, map.get(str2));
            } else {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(k kVar, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = d;
        synchronized (map) {
            map.put(kVar, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(k kVar) {
        return (AsymmetricKeyInfoConverter) d.get(kVar);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        synchronized (c) {
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, k kVar, String str2) {
        if (!containsKey(str + "." + str2)) {
            throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
        }
        addAlgorithm(str + "." + kVar, str2);
        addAlgorithm(str + ".OID." + kVar, str2);
    }
}
