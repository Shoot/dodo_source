package ru.dodopizza.app.domain.authorization;

import kotlin.Metadata;
/* compiled from: exceptions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/dodopizza/app/domain/authorization/WrongCredentialsException;", "Lru/dodopizza/app/domain/authorization/AuthorizationException;", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WrongCredentialsException extends AuthorizationException {
    public WrongCredentialsException() {
        super("Credentials are not valid", null, 2, null);
    }
}
