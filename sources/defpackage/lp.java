package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.AppearanceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AppearanceManagerProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Llp;", "Lkp;", "Lcom/inappstory/sdk/AppearanceManager;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lp  reason: default package */
/* loaded from: classes2.dex */
public final class lp implements kp {
    public static final a b = new a(null);
    public static final int c = 8;
    private final Context a;

    /* compiled from: AppearanceManagerProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Llp$a;", "", "", "STORIES_PREVIEW_MARGIN", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lp$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public lp(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    @Override // defpackage.kp
    public AppearanceManager a() {
        AppearanceManager appearanceManager = new AppearanceManager();
        appearanceManager.csListItemInterface(new i63(this.a));
        appearanceManager.csListItemMargin(8);
        appearanceManager.csCoverQuality(2);
        appearanceManager.csStoryReaderAnimation(1);
        return appearanceManager;
    }
}
