package ru.dodopizza.backend.client.common.error;

import kotlin.Metadata;
/* compiled from: APIRequestExecuteException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/client/common/error/APIRequestExecuteException;", "Lru/dodopizza/backend/client/common/error/APIException;", "cause", "", "(Ljava/lang/Throwable;)V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIRequestExecuteException extends APIException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APIRequestExecuteException(Throwable th) {
        super(th);
        z65.h(th, "cause");
    }
}
