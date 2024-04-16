package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: NetworkTypeChecker.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\u000b*\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u0010\u001a\u00020\u000b*\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\u000b*\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u0012\u001a\u00020\u000b*\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0017"}, d2 = {"Lpw6;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/NetworkInfo;", "b", "Landroid/net/NetworkCapabilities;", "a", "", MessageAttributes.TYPE, "subType", "", DateTokenConverter.CONVERTER_KEY, "downStreamBandwidthKbps", c.a, "f", "g", "i", "j", e.a, Image.TYPE_HIGH, "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pw6  reason: default package */
/* loaded from: classes4.dex */
public final class pw6 {
    public static final pw6 a = new pw6();

    private pw6() {
    }

    private final NetworkCapabilities a(Context context) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            activeNetwork = connectivityManager.getActiveNetwork();
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        }
        return null;
    }

    private final NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager;
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    private final boolean c(int i) {
        if (i < 300) {
            return true;
        }
        return false;
    }

    private final boolean d(int i, int i2) {
        if (i != 0) {
            return false;
        }
        if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 7) {
            return false;
        }
        return true;
    }

    private final boolean f(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return true;
        }
        if (networkCapabilities.hasTransport(1)) {
            return false;
        }
        if (!networkCapabilities.hasTransport(0)) {
            return true;
        }
        return c(networkCapabilities.getLinkDownstreamBandwidthKbps());
    }

    private final boolean g(NetworkInfo networkInfo) {
        Boolean bool;
        if (networkInfo != null) {
            bool = Boolean.valueOf(networkInfo.isConnected());
        } else {
            bool = null;
        }
        if (z65.c(bool, Boolean.TRUE)) {
            return d(networkInfo.getType(), networkInfo.getSubtype());
        }
        return true;
    }

    private final boolean i(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            return false;
        }
        return true;
    }

    private final boolean j(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (Build.VERSION.SDK_INT > 28) {
            return f(a(context));
        }
        return g(b(context));
    }

    public final boolean h(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (Build.VERSION.SDK_INT > 28) {
            return i(a(context));
        }
        return j(b(context));
    }
}
