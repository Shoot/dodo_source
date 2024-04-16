package defpackage;

import defpackage.b32;
import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
/* renamed from: gf0  reason: default package */
/* loaded from: classes3.dex */
class gf0 implements ProviderConfiguration {
    private static Permission g = new ProviderConfigurationPermission("BC", ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);
    private static Permission h = new ProviderConfigurationPermission("BC", ConfigurableProvider.EC_IMPLICITLY_CA);
    private static Permission i = new ProviderConfigurationPermission("BC", ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);
    private static Permission j = new ProviderConfigurationPermission("BC", ConfigurableProvider.DH_DEFAULT_PARAMS);
    private static Permission k = new ProviderConfigurationPermission("BC", ConfigurableProvider.ACCEPTABLE_EC_CURVES);
    private static Permission l = new ProviderConfigurationPermission("BC", ConfigurableProvider.ADDITIONAL_EC_PARAMETERS);
    private volatile ib3 c;
    private volatile Object d;
    private ThreadLocal a = new ThreadLocal();
    private ThreadLocal b = new ThreadLocal();
    private volatile Set e = new HashSet();
    private volatile Map f = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Object obj) {
        ThreadLocal threadLocal;
        ib3 ib3Var;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(g);
            }
            if (!(obj instanceof ib3) && obj != null) {
                ib3Var = EC5Util.convertSpec((ECParameterSpec) obj);
            } else {
                ib3Var = (ib3) obj;
            }
            if (ib3Var == null) {
                threadLocal = this.a;
            } else {
                this.a.set(ib3Var);
                return;
            }
        } else if (str.equals(ConfigurableProvider.EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(h);
            }
            if (!(obj instanceof ib3) && obj != null) {
                this.c = EC5Util.convertSpec((ECParameterSpec) obj);
                return;
            } else {
                this.c = (ib3) obj;
                return;
            }
        } else if (str.equals(ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(i);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            threadLocal = this.b;
            if (obj != null) {
                threadLocal.set(obj);
                return;
            }
        } else if (str.equals(ConfigurableProvider.DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(j);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
            }
            this.d = obj;
            return;
        } else if (str.equals(ConfigurableProvider.ACCEPTABLE_EC_CURVES)) {
            if (securityManager != null) {
                securityManager.checkPermission(k);
            }
            this.e = (Set) obj;
            return;
        } else if (str.equals(ConfigurableProvider.ADDITIONAL_EC_PARAMETERS)) {
            if (securityManager != null) {
                securityManager.checkPermission(l);
            }
            this.f = (Map) obj;
            return;
        } else {
            return;
        }
        threadLocal.remove();
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Set getAcceptableNamedCurves() {
        return Collections.unmodifiableSet(this.e);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Map getAdditionalECParameters() {
        return Collections.unmodifiableMap(this.f);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DHParameterSpec getDHDefaultParameters(int i2) {
        Object obj = this.b.get();
        if (obj == null) {
            obj = this.d;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i2) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i3 = 0; i3 != dHParameterSpecArr.length; i3++) {
                if (dHParameterSpecArr[i3].getP().bitLength() == i2) {
                    return dHParameterSpecArr[i3];
                }
            }
        }
        h72 h72Var = (h72) b32.d(b32.a.d, i2);
        if (h72Var != null) {
            return new u62(h72Var);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DSAParameterSpec getDSADefaultParameters(int i2) {
        b82 b82Var = (b82) b32.d(b32.a.e, i2);
        if (b82Var != null) {
            return new DSAParameterSpec(b82Var.b(), b82Var.c(), b82Var.a());
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public ib3 getEcImplicitlyCa() {
        ib3 ib3Var = (ib3) this.a.get();
        if (ib3Var != null) {
            return ib3Var;
        }
        return this.c;
    }
}
