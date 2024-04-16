package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.stories.callbacks.IShowStoryCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: InfoStoryLauncher.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Le15;", "Ld15;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "storyId", "Lkotlin/Function0;", "", "onSuccess", "onFailure", "bf", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e15  reason: default package */
/* loaded from: classes2.dex */
public final class e15 implements d15 {
    private final Logger a = LoggerFactory.getLogger("InfoStoryLauncherImpl");

    /* compiled from: InfoStoryLauncher.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"e15$a", "Lcom/inappstory/sdk/stories/callbacks/IShowStoryCallback;", "", "onShow", "onError", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e15$a */
    /* loaded from: classes2.dex */
    public static final class a implements IShowStoryCallback {
        final /* synthetic */ Function0<Unit> a;
        final /* synthetic */ e15 b;
        final /* synthetic */ String c;
        final /* synthetic */ Function0<Unit> d;

        a(Function0<Unit> function0, e15 e15Var, String str, Function0<Unit> function02) {
            this.a = function0;
            this.b = e15Var;
            this.c = str;
            this.d = function02;
        }

        @Override // com.inappstory.sdk.stories.callbacks.IShowStoryCallback
        public void onError() {
            Logger logger = this.b.a;
            String str = this.c;
            logger.warn("Failed to show info story with id: " + str);
            this.d.invoke();
        }

        @Override // com.inappstory.sdk.stories.callbacks.IShowStoryCallback
        public void onShow() {
            this.a.invoke();
        }
    }

    @Override // defpackage.d15
    public void bf(Context context, String str, Function0<Unit> function0, Function0<Unit> function02) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "storyId");
        z65.h(function0, "onSuccess");
        z65.h(function02, "onFailure");
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            inAppStoryManager.showStory(str, context, AppearanceManager.getCommonInstance(), new a(function0, this, str, function02));
        }
    }
}
