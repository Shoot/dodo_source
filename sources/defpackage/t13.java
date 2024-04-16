package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeviceIdProvider.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0017R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0010\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lt13;", "Ls13;", "", "b", "", c.a, "a", "Landroid/content/Context;", "Landroid/content/Context;", "appContext", "Lu13;", "Lu13;", "repository", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "deviceId", "<init>", "(Landroid/content/Context;Lu13;)V", e.a, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t13  reason: default package */
/* loaded from: classes4.dex */
public final class t13 implements s13 {
    public static final a e = new a(null);
    private final Context a;
    private final u13 b;
    private final Logger c;
    private String d;

    /* compiled from: DeviceIdProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lt13$a;", "", "", "EMPTY_AD_ID", "Ljava/lang/String;", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t13$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public t13(Context context, u13 u13Var) {
        z65.h(context, "appContext");
        z65.h(u13Var, "repository");
        this.a = context;
        this.b = u13Var;
        this.c = LoggerFactory.getLogger("DeviceIdProvider");
        this.d = new String();
    }

    @SuppressLint({"WifiManagerPotentialLeak"})
    private final String b() {
        AdvertisingIdClient.Info info;
        if (Build.VERSION.SDK_INT < 23) {
            Object systemService = this.a.getSystemService("wifi");
            z65.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            String macAddress = ((WifiManager) systemService).getConnectionInfo().getMacAddress();
            if (macAddress != null && macAddress.length() > 0) {
                this.c.info("AdId from MAC: " + macAddress);
                return macAddress;
            }
        }
        String str = null;
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
        } catch (Exception e2) {
            this.c.error("Can`t get advertising Id from gsm", (Throwable) e2);
            info = null;
        }
        if (info != null) {
            str = info.getId();
        }
        if (str == null) {
            str = "";
        }
        if (c(str)) {
            this.c.info("AdId from gsm: " + str);
            return str;
        }
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "toString(...)");
        this.c.info("AdId from random: " + uuid);
        return uuid;
    }

    private final boolean c(String str) {
        if (str.length() > 0 && !str.equals("00000000-0000-0000-0000-000000000000")) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s13
    public String a() {
        if (this.d.length() > 0) {
            return this.d;
        }
        if (c(this.b.a())) {
            String a2 = this.b.a();
            this.d = a2;
            Logger logger = this.c;
            logger.info("AdId from pref: " + a2);
            return this.d;
        }
        String b = b();
        this.b.b(b);
        this.d = b;
        return b;
    }
}
