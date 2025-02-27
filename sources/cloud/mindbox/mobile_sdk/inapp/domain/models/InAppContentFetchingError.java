package cloud.mindbox.mobile_sdk.inapp.domain.models;

import com.bumptech.glide.load.engine.GlideException;
import kotlin.Metadata;
/* compiled from: InAppDataError.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcloud/mindbox/mobile_sdk/inapp/domain/models/InAppContentFetchingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lcom/bumptech/glide/load/engine/GlideException;", "(Lcom/bumptech/glide/load/engine/GlideException;)V", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppContentFetchingError extends Exception {
    public InAppContentFetchingError(GlideException glideException) {
        super(glideException);
    }
}
