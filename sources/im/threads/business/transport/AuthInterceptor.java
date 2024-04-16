package im.threads.business.transport;

import defpackage.k65;
import im.threads.business.utils.ClientUseCase;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: AuthInterceptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lim/threads/business/transport/AuthInterceptor;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "Lim/threads/business/transport/AuthHeadersProvider;", "authHeadersProvider", "Lim/threads/business/transport/AuthHeadersProvider;", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/utils/ClientUseCase;", "<init>", "(Lim/threads/business/transport/AuthHeadersProvider;Lim/threads/business/utils/ClientUseCase;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class AuthInterceptor implements k65 {
    private final AuthHeadersProvider authHeadersProvider;
    private final ClientUseCase clientUseCase;

    public AuthInterceptor(AuthHeadersProvider authHeadersProvider, ClientUseCase clientUseCase) {
        z65.h(authHeadersProvider, "authHeadersProvider");
        z65.h(clientUseCase, "clientUseCase");
        this.authHeadersProvider = authHeadersProvider;
        this.clientUseCase = clientUseCase;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        z65.h(aVar, "chain");
        return aVar.b(this.authHeadersProvider.getRequestWithHeaders(this.clientUseCase.getUserInfo(), aVar.request()));
    }
}
