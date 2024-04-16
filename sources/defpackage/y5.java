package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import defpackage.s5;
import kotlin.Metadata;
/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Ly5;", "Ls5;", "Landroid/net/Uri;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", DateTokenConverter.CONVERTER_KEY, "Ls5$a;", e.a, "", "resultCode", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: y5  reason: default package */
/* loaded from: classes.dex */
public class y5 extends s5<Uri, Boolean> {
    public Intent d(Context context, Uri uri) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(uri, "input");
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        z65.g(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return putExtra;
    }

    @Override // defpackage.s5
    /* renamed from: e */
    public final s5.a<Boolean> b(Context context, Uri uri) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(uri, "input");
        return null;
    }

    @Override // defpackage.s5
    /* renamed from: f */
    public final Boolean c(int i, Intent intent) {
        boolean z;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
