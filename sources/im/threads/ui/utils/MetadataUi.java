package im.threads.ui.utils;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.utils.MetadataBusiness;
import kotlin.Metadata;
/* compiled from: MetadataUi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lim/threads/ui/utils/MetadataUi;", "", "()V", "ATTACHMENT_ENABLED", "", "getAttachmentEnabled", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Boolean;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetadataUi {
    private static final String ATTACHMENT_ENABLED = "im.threads.attachmentEnabled";
    public static final MetadataUi INSTANCE = new MetadataUi();

    private MetadataUi() {
    }

    public static final Boolean getAttachmentEnabled(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bundle metaData = MetadataBusiness.INSTANCE.getMetaData(context);
        if (metaData != null && metaData.containsKey(ATTACHMENT_ENABLED)) {
            return Boolean.valueOf(metaData.getBoolean(ATTACHMENT_ENABLED));
        }
        return null;
    }
}
