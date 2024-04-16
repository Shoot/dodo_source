package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public final class AFd1hSDK extends AFd1kSDK<Map<String, String>> {
    @Nullable
    public AFa1zSDK AFLogger;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String afErrorLogForExcManagerOnly;
    private final AFc1pSDK afWarnLog;
    private final boolean getLevel;
    private final UUID onAppOpenAttributionNative;

    /* loaded from: classes.dex */
    public interface AFa1zSDK {
        void AFInAppEventParameterName(String str);

        void AFInAppEventType(Map<String, String> map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1hSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFd1wSDK.ONELINK, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, uuid.toString());
        boolean z = false;
        this.afWarnLog = aFc1xSDK.AFKeystoreWrapper();
        this.onAppOpenAttributionNative = uuid;
        if (!AFb1nSDK.AFInAppEventParameterName(uri.getHost()) && !AFb1nSDK.AFInAppEventParameterName(uri.getPath())) {
            try {
                try {
                    Object invoke = ((Class) AFb1mSDK.values(KeyEvent.keyCodeFromString(""), (char) (55782 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getPressedStateDuration() >> 16) + 36)).getMethod("values", null).invoke(((Class) AFb1mSDK.values((-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) (55781 - TextUtils.indexOf((CharSequence) "", '0')), ImageFormat.getBitsPerPixel(0) + 37)).getDeclaredConstructor(Uri.class).newInstance(uri), null);
                    try {
                        boolean booleanValue = ((Boolean) ((Class) AFb1mSDK.values(37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (7321 - (ViewConfiguration.getLongPressTimeout() >> 16)), KeyEvent.normalizeMetaState(0) + 51)).getMethod("AFInAppEventParameterName", null).invoke(invoke, null)).booleanValue();
                        try {
                            z = ((Boolean) ((Class) AFb1mSDK.values(36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 7321), 52 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getMethod("AFInAppEventType", null).invoke(invoke, null)).booleanValue();
                            String[] split = uri.getPath().split("/");
                            if (booleanValue && split.length == 3) {
                                this.AFLogger$LogLevel = split[1];
                                this.AFVersionDeclaration = split[2];
                                this.afErrorLogForExcManagerOnly = uri.toString();
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }
        this.getLevel = z;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final AFc1oSDK<Map<String, String>> AFInAppEventParameterName(@NonNull String str) {
        return this.afWarnLog.AFInAppEventType(this.AFLogger$LogLevel, this.AFVersionDeclaration, this.onAppOpenAttributionNative, str);
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final long AFInAppEventType() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final void AFKeystoreWrapper() {
        ResponseNetwork responseNetwork;
        super.AFKeystoreWrapper();
        AFa1zSDK aFa1zSDK = this.AFLogger;
        if (aFa1zSDK != null) {
            if (this.AFInAppEventType == AFc1aSDK.SUCCESS && (responseNetwork = ((AFd1kSDK) this).afDebugLog) != null) {
                aFa1zSDK.AFInAppEventType((Map) responseNetwork.getBody());
                return;
            }
            Throwable afDebugLog = afDebugLog();
            String str = "Can't get OneLink data";
            if (afDebugLog instanceof ParsingException) {
                if (((ParsingException) afDebugLog).getRawResponse().isSuccessful()) {
                    aFa1zSDK.AFInAppEventParameterName("Can't parse one link data");
                    return;
                }
                String str2 = this.afErrorLogForExcManagerOnly;
                if (str2 != null) {
                    str = str2;
                }
                aFa1zSDK.AFInAppEventParameterName(str);
                return;
            }
            String str3 = this.afErrorLogForExcManagerOnly;
            if (str3 != null) {
                str = str3;
            }
            aFa1zSDK.AFInAppEventParameterName(str);
        }
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final boolean AFLogger() {
        return false;
    }

    public final boolean AFLogger$LogLevel() {
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return null;
    }

    public final boolean afWarnLog() {
        if (!TextUtils.isEmpty(this.AFLogger$LogLevel) && !TextUtils.isEmpty(this.AFVersionDeclaration) && !this.AFLogger$LogLevel.equals("app")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final boolean getLevel() {
        return false;
    }
}
