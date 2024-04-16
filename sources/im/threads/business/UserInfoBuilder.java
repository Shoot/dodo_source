package im.threads.business;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: UserInfoBuilder.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J$\u0010&\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010(\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003J\u0012\u0010)\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010*\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00038F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\b¨\u0006+"}, d2 = {"Lim/threads/business/UserInfoBuilder;", "", MessageAttributes.CLIENT_ID, "", "(Ljava/lang/String;)V", "<set-?>", "appMarker", "getAppMarker", "()Ljava/lang/String;", "authMethod", "Lim/threads/business/AuthMethod;", "getAuthMethod", "()Lim/threads/business/AuthMethod;", "setAuthMethod", "(Lim/threads/business/AuthMethod;)V", "authSchema", "getAuthSchema", "authToken", "getAuthToken", "clientData", "getClientData", "getClientId", "setClientId", "clientIdEncrypted", "", "getClientIdEncrypted", "()Z", "setClientIdEncrypted", "(Z)V", "clientIdSignature", "getClientIdSignature", "userName", "getUserName", "equals", "other", "hashCode", "", "setAppMarker", "setAuthData", "setClientData", "setClientIdSignature", "setData", "setUserName", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserInfoBuilder {
    private String appMarker;
    private AuthMethod authMethod;
    private String authSchema;
    private String authToken;
    private String clientData;
    private String clientId;
    private boolean clientIdEncrypted;
    private String clientIdSignature;
    private String userName;

    public UserInfoBuilder(String str) {
        boolean y;
        z65.h(str, MessageAttributes.CLIENT_ID);
        this.clientId = str;
        y = l0b.y(str);
        if (!y) {
            this.authMethod = AuthMethod.HEADERS;
            return;
        }
        throw new IllegalArgumentException("clientId must not be empty".toString());
    }

    public static /* synthetic */ UserInfoBuilder setAuthData$default(UserInfoBuilder userInfoBuilder, String str, String str2, AuthMethod authMethod, int i, Object obj) {
        if ((i & 4) != 0) {
            authMethod = AuthMethod.HEADERS;
        }
        return userInfoBuilder.setAuthData(str, str2, authMethod);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(UserInfoBuilder.class, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type im.threads.business.UserInfoBuilder");
        UserInfoBuilder userInfoBuilder = (UserInfoBuilder) obj;
        if (z65.c(this.clientId, userInfoBuilder.clientId) && z65.c(this.authToken, userInfoBuilder.authToken) && z65.c(this.authSchema, userInfoBuilder.authSchema) && z65.c(this.clientData, userInfoBuilder.clientData) && z65.c(this.clientIdSignature, userInfoBuilder.clientIdSignature) && z65.c(this.userName, userInfoBuilder.userName) && z65.c(getAppMarker(), userInfoBuilder.getAppMarker()) && this.clientIdEncrypted == userInfoBuilder.clientIdEncrypted) {
            return true;
        }
        return false;
    }

    public final String getAppMarker() {
        boolean y;
        String str = this.appMarker;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                return this.appMarker;
            }
        }
        return null;
    }

    public final AuthMethod getAuthMethod() {
        return this.authMethod;
    }

    public final String getAuthSchema() {
        return this.authSchema;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getClientData() {
        return this.clientData;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final boolean getClientIdEncrypted() {
        return this.clientIdEncrypted;
    }

    public final String getClientIdSignature() {
        return this.clientIdSignature;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = this.clientId.hashCode() * 31;
        String str = this.authToken;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 31;
        String str2 = this.authSchema;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.clientData;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.clientIdSignature;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str5 = this.userName;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String appMarker = getAppMarker();
        if (appMarker != null) {
            i6 = appMarker.hashCode();
        }
        return ((i11 + i6) * 31) + a91.a(this.clientIdEncrypted);
    }

    public final UserInfoBuilder setAppMarker(String str) {
        this.appMarker = str;
        return this;
    }

    public final UserInfoBuilder setAuthData(String str, String str2, AuthMethod authMethod) {
        z65.h(authMethod, "authMethod");
        this.authToken = str;
        this.authSchema = str2;
        this.authMethod = authMethod;
        return this;
    }

    public final void setAuthMethod(AuthMethod authMethod) {
        z65.h(authMethod, "<set-?>");
        this.authMethod = authMethod;
    }

    public final UserInfoBuilder setClientData(String str) {
        this.clientData = str;
        return this;
    }

    public final void setClientId(String str) {
        z65.h(str, "<set-?>");
        this.clientId = str;
    }

    public final UserInfoBuilder setClientIdEncrypted(boolean z) {
        this.clientIdEncrypted = z;
        return this;
    }

    public final UserInfoBuilder setClientIdSignature(String str) {
        this.clientIdSignature = str;
        return this;
    }

    public final UserInfoBuilder setData(String str) {
        this.clientData = str;
        return this;
    }

    public final UserInfoBuilder setUserName(String str) {
        this.userName = str;
        return this;
    }

    /* renamed from: setClientIdEncrypted  reason: collision with other method in class */
    public final void m9setClientIdEncrypted(boolean z) {
        this.clientIdEncrypted = z;
    }
}
