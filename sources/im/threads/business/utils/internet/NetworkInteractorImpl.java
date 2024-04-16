package im.threads.business.utils.internet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: NetworkInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lim/threads/business/utils/internet/NetworkInteractorImpl;", "Lim/threads/business/utils/internet/NetworkInteractor;", "()V", "hasNoInternet", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkInteractorImpl implements NetworkInteractor {
    @Override // im.threads.business.utils.internet.NetworkInteractor
    public boolean hasNoInternet(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Object systemService = context.getSystemService("connectivity");
        z65.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3)) {
                z = true;
            }
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type == 9) {
                            z = activeNetworkInfo.isConnected();
                        }
                    } else {
                        z = activeNetworkInfo.isConnected();
                    }
                } else {
                    z = activeNetworkInfo.isConnected();
                }
            }
        }
        return !z;
    }
}
