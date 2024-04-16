package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lx5;", "Ls5;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", DateTokenConverter.CONVERTER_KEY, "", "resultCode", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, e.a, "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: x5  reason: default package */
/* loaded from: classes.dex */
public final class x5 extends s5<Intent, ActivityResult> {
    public static final a a = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lx5$a;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: x5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.s5
    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(intent, "input");
        return intent;
    }

    @Override // defpackage.s5
    /* renamed from: e */
    public ActivityResult c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
