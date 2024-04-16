package ru.dodopizza.app.domain.authorization;

import kotlin.Metadata;
/* compiled from: exceptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/app/domain/authorization/TooManyRequestsException;", "Lru/dodopizza/app/domain/authorization/AuthorizationException;", "delayTime", "", "(J)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TooManyRequestsException extends AuthorizationException {
    public TooManyRequestsException(long j) {
        super("Too many authorization attempts within " + j, null, 2, null);
    }
}
