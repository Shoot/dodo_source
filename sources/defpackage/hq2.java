package defpackage;

import com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback;
import defpackage.ez4;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DefaultInAppStoriesErrorCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0016"}, d2 = {"Lhq2;", "Lcom/inappstory/sdk/stories/outercallbacks/common/errors/ErrorCallback;", "Lez4;", "errorType", "", "a", "", "feed", "loadListError", "loadOnboardingError", "loadSingleError", "cacheError", "readerError", "emptyLinkError", "sessionError", "noConnection", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hq2  reason: default package */
/* loaded from: classes2.dex */
public abstract class hq2 implements ErrorCallback {
    private final Logger a = LoggerFactory.getLogger(getClass());

    public abstract void a(ez4 ez4Var);

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void cacheError() {
        this.a.warn("Failed with stories' cache!");
        a(ez4.a.a);
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void emptyLinkError() {
        this.a.warn("Story has empty link!");
        a(ez4.b.a);
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void loadListError(String str) {
        Logger logger = this.a;
        logger.warn("Failed to load stories list! " + str);
        if (str == null) {
            str = "";
        }
        a(new ez4.c(str));
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void loadOnboardingError(String str) {
        Logger logger = this.a;
        logger.warn("Failed to load onboarding! " + str);
        if (str == null) {
            str = "";
        }
        a(new ez4.e(str));
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void loadSingleError() {
        this.a.warn("Failed to load single story!");
        a(ez4.h.a);
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void noConnection() {
        this.a.warn("Connection error! Failed to load stories!");
        a(ez4.d.a);
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void readerError() {
        this.a.warn("Failed with stories' reader!");
        a(ez4.f.a);
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback
    public void sessionError() {
        this.a.warn("Failed with stories' session!");
        a(ez4.g.a);
    }
}
