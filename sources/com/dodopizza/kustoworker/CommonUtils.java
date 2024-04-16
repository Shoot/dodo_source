package com.dodopizza.kustoworker;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CommonUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dodopizza/kustoworker/CommonUtils;", "", "()V", "GOLDFISH", "", "RANCHU", "getCpuArchitecture", "isEmulator", "", "isRooted", "Architecture", "Done", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class CommonUtils {
    private static final String GOLDFISH = "goldfish";
    public static final CommonUtils INSTANCE = new CommonUtils();
    private static final String RANCHU = "ranchu";

    /* compiled from: CommonUtils.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0080\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/kustoworker/CommonUtils$Architecture;", "", "(Ljava/lang/String;I)V", "X86_32", "X86_64", "ARM_UNKNOWN", "PPC", "PPC64", "ARMV6", "ARMV7", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ARMV7S", "ARM64", "Companion", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        public static final Companion Companion;
        private static final Map<String, Architecture> matcher;

        /* compiled from: CommonUtils.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/kustoworker/CommonUtils$Architecture$Companion;", "", "()V", "matcher", "", "", "Lcom/dodopizza/kustoworker/CommonUtils$Architecture;", "value", "getValue", "()Lcom/dodopizza/kustoworker/CommonUtils$Architecture;", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Architecture getValue() {
                String str = Build.CPU_ABI;
                if (TextUtils.isEmpty(str)) {
                    return Architecture.UNKNOWN;
                }
                z65.g(str, "arch");
                Locale locale = Locale.US;
                z65.g(locale, "Locale.US");
                if (str != null) {
                    String lowerCase = str.toLowerCase(locale);
                    z65.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    Architecture architecture = (Architecture) Architecture.matcher.get(lowerCase);
                    if (architecture == null) {
                        return Architecture.UNKNOWN;
                    }
                    return architecture;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }

        static {
            Map<String, Architecture> k;
            Architecture architecture = X86_32;
            Architecture architecture2 = ARMV6;
            Architecture architecture3 = ARMV7;
            Architecture architecture4 = ARM64;
            Companion = new Companion(null);
            k = g86.k(lnb.a("armeabi-v7a", architecture3), lnb.a("armeabi", architecture2), lnb.a("arm64-v8a", architecture4), lnb.a("x86", architecture));
            matcher = k;
        }
    }

    /* compiled from: CommonUtils.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dodopizza/kustoworker/CommonUtils$Done;", "", "()V", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Done {
        public static final Done INSTANCE = new Done();

        private Done() {
        }
    }

    private CommonUtils() {
    }

    public final String getCpuArchitecture() {
        return Architecture.Companion.getValue().toString();
    }

    public final boolean isEmulator() {
        boolean O;
        boolean O2;
        boolean O3;
        String str = Build.PRODUCT;
        z65.g(str, "Build.PRODUCT");
        String str2 = Build.VERSION.SDK;
        z65.g(str2, "SDK");
        O = m0b.O(str, str2, false, 2, null);
        if (!O) {
            String str3 = Build.HARDWARE;
            z65.g(str3, "Build.HARDWARE");
            O2 = m0b.O(str3, GOLDFISH, false, 2, null);
            if (!O2) {
                z65.g(str3, "Build.HARDWARE");
                O3 = m0b.O(str3, RANCHU, false, 2, null);
                if (!O3) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isRooted() {
        boolean O;
        boolean isEmulator = isEmulator();
        String str = Build.TAGS;
        if (!isEmulator && str != null) {
            O = m0b.O(str, "test-keys", false, 2, null);
            if (O) {
                return true;
            }
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (isEmulator || !file.exists()) {
            return false;
        }
        return true;
    }
}
