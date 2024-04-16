package im.threads.business.transport;

import defpackage.hi9;
import im.threads.business.AuthMethod;
import im.threads.business.UserInfoBuilder;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AuthHeadersProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t¨\u0006\u0010"}, d2 = {"Lim/threads/business/transport/AuthHeadersProvider;", "", "Lim/threads/business/UserInfoBuilder;", "userInfo", "", "getCookiesString", "Lhi9;", "request", "getRequestWithHeaders", "Ljava/net/URLConnection;", "urlConnection", "", "setHeadersToUrlConnection", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class AuthHeadersProvider {
    public static final Companion Companion = new Companion(null);
    private static final String authSchemaHeaderKey = "X-Auth-Schema";
    private static final String authorizationHeaderKey = "Authorization";
    private static final String cookieHeaderKey = "Cookie";

    /* compiled from: AuthHeadersProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lim/threads/business/transport/AuthHeadersProvider$Companion;", "", "()V", "authSchemaHeaderKey", "", "authorizationHeaderKey", "cookieHeaderKey", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final String getCookiesString(UserInfoBuilder userInfoBuilder) {
        AuthMethod authMethod;
        StringBuilder sb = new StringBuilder();
        if (userInfoBuilder != null) {
            authMethod = userInfoBuilder.getAuthMethod();
        } else {
            authMethod = null;
        }
        if (authMethod == AuthMethod.COOKIES) {
            String authToken = userInfoBuilder.getAuthToken();
            String authSchema = userInfoBuilder.getAuthSchema();
            sb.append("Authorization=" + authToken);
            if (authSchema != null && authSchema.length() != 0) {
                sb.append("; X-Auth-Schema=" + authSchema);
            }
        }
        String sb2 = sb.toString();
        z65.g(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public final hi9 getRequestWithHeaders(UserInfoBuilder userInfoBuilder, hi9 hi9Var) {
        String str;
        z65.h(hi9Var, "request");
        String cookiesString = getCookiesString(userInfoBuilder);
        if (cookiesString.length() > 0) {
            return hi9Var.i().a(cookieHeaderKey, cookiesString).b();
        }
        String str2 = null;
        if (userInfoBuilder != null) {
            str = userInfoBuilder.getAuthToken();
        } else {
            str = null;
        }
        if (userInfoBuilder != null) {
            str2 = userInfoBuilder.getAuthSchema();
        }
        hi9.a i = hi9Var.i();
        if (str != null && str.length() != 0) {
            i.a(authorizationHeaderKey, str);
            if (str2 != null && str2.length() != 0) {
                i.a(authSchemaHeaderKey, str2);
            }
            return i.b();
        }
        return hi9Var;
    }

    public final void setHeadersToUrlConnection(UserInfoBuilder userInfoBuilder, URLConnection uRLConnection) {
        String str;
        z65.h(uRLConnection, "urlConnection");
        String cookiesString = getCookiesString(userInfoBuilder);
        if (cookiesString.length() > 0) {
            uRLConnection.setRequestProperty(cookieHeaderKey, cookiesString);
            return;
        }
        String str2 = null;
        if (userInfoBuilder != null) {
            str = userInfoBuilder.getAuthToken();
        } else {
            str = null;
        }
        if (userInfoBuilder != null) {
            str2 = userInfoBuilder.getAuthSchema();
        }
        if (str != null && str.length() != 0) {
            uRLConnection.setRequestProperty(authorizationHeaderKey, str);
            if (str2 != null && str2.length() != 0) {
                uRLConnection.setRequestProperty(authSchemaHeaderKey, str2);
            }
        }
    }
}
