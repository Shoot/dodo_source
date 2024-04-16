package im.threads.business.utils;

import im.threads.business.UserInfoBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ClientUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\b¨\u0006\u000f"}, d2 = {"Lim/threads/business/utils/ClientUseCase;", "", "()V", "cleanUserInfoFromRam", "", "getTagNewClientId", "", "getUserInfo", "Lim/threads/business/UserInfoBuilder;", "initClientId", "isClientIdNotEmpty", "", "saveUserInfo", "userInfo", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClientUseCase {
    public static final Companion Companion = new Companion(null);
    private static UserInfoBuilder ramUserInfo;
    private static String tagNewClientId;

    /* compiled from: ClientUseCase.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lim/threads/business/utils/ClientUseCase$Companion;", "", "()V", "ramUserInfo", "Lim/threads/business/UserInfoBuilder;", "tagNewClientId", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void cleanUserInfoFromRam() {
        ramUserInfo = null;
        tagNewClientId = null;
    }

    public final String getTagNewClientId() {
        return tagNewClientId;
    }

    public final UserInfoBuilder getUserInfo() {
        return ramUserInfo;
    }

    public final void initClientId() {
        String str;
        UserInfoBuilder userInfo = getUserInfo();
        String tagNewClientId2 = getTagNewClientId();
        if (userInfo != null) {
            str = userInfo.getClientId();
        } else {
            str = null;
        }
        if (z65.c(tagNewClientId2, str)) {
            tagNewClientId = "";
        }
    }

    public final boolean isClientIdNotEmpty() {
        String str;
        UserInfoBuilder userInfoBuilder = ramUserInfo;
        if (userInfoBuilder != null) {
            str = userInfoBuilder.getClientId();
        } else {
            str = null;
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    public final void saveUserInfo(UserInfoBuilder userInfoBuilder) {
        ramUserInfo = userInfoBuilder;
        tagNewClientId = (userInfoBuilder == null || (r1 = userInfoBuilder.getClientId()) == null) ? "" : "";
    }
}
