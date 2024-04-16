package im.threads.business.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.logger.LoggerEdna;
import kotlin.Metadata;
/* compiled from: MetadataBusiness.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lim/threads/business/utils/MetadataBusiness;", "", "()V", "DATASTORE_URL", "", "NEW_CHAT_CENTER_API", "SERVER_BASE_URL", "THREADS_GATE_PROVIDER_UID", "THREADS_GATE_URL", "getDatastoreUrl", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getMetaData", "Landroid/os/Bundle;", "getNewChatCenterApi", "", "getServerBaseUrl", "getThreadsGateProviderUid", "getThreadsGateUrl", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetadataBusiness {
    private static final String DATASTORE_URL = "im.threads.getDatastoreUrl";
    public static final MetadataBusiness INSTANCE = new MetadataBusiness();
    private static final String NEW_CHAT_CENTER_API = "im.threads.newChatCenterApi";
    private static final String SERVER_BASE_URL = "im.threads.getServerUrl";
    private static final String THREADS_GATE_PROVIDER_UID = "im.threads.threadsGateProviderUid";
    private static final String THREADS_GATE_URL = "im.threads.threadsGateUrl";

    private MetadataBusiness() {
    }

    public static final String getDatastoreUrl(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bundle metaData = INSTANCE.getMetaData(context);
        if (metaData != null && metaData.containsKey(DATASTORE_URL)) {
            return metaData.getString(DATASTORE_URL);
        }
        return null;
    }

    public static final boolean getNewChatCenterApi(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bundle metaData = INSTANCE.getMetaData(context);
        if (metaData != null && metaData.containsKey(NEW_CHAT_CENTER_API)) {
            return metaData.getBoolean(NEW_CHAT_CENTER_API);
        }
        return false;
    }

    public static final String getServerBaseUrl(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bundle metaData = INSTANCE.getMetaData(context);
        if (metaData != null && metaData.containsKey(SERVER_BASE_URL)) {
            return metaData.getString(SERVER_BASE_URL);
        }
        return null;
    }

    public static final String getThreadsGateProviderUid(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bundle metaData = INSTANCE.getMetaData(context);
        if (metaData != null && metaData.containsKey(THREADS_GATE_PROVIDER_UID)) {
            return metaData.getString(THREADS_GATE_PROVIDER_UID);
        }
        return null;
    }

    public static final String getThreadsGateUrl(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bundle metaData = INSTANCE.getMetaData(context);
        if (metaData != null && metaData.containsKey(THREADS_GATE_URL)) {
            return metaData.getString(THREADS_GATE_URL);
        }
        return null;
    }

    public final Bundle getMetaData(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            z65.g(applicationInfo, "context.packageManager.g…T_META_DATA\n            )");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            LoggerEdna.error("Failed to load self applicationInfo - that's really weird. " + e);
            return null;
        }
    }
}
