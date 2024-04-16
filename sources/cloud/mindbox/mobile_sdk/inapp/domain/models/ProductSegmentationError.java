package cloud.mindbox.mobile_sdk.inapp.domain.models;

import com.android.volley.VolleyError;
import kotlin.Metadata;
/* compiled from: InAppDataError.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcloud/mindbox/mobile_sdk/inapp/domain/models/ProductSegmentationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "volleyError", "Lcom/android/volley/VolleyError;", "(Lcom/android/volley/VolleyError;)V", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProductSegmentationError extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSegmentationError(VolleyError volleyError) {
        super(volleyError);
        z65.h(volleyError, "volleyError");
    }
}
