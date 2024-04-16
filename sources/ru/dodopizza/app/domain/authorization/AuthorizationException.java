package ru.dodopizza.app.domain.authorization;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: exceptions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/domain/authorization/AuthorizationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "causeMessage", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class AuthorizationException extends RuntimeException {
    public /* synthetic */ AuthorizationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationException(String str, Throwable th) {
        super(str, th);
        z65.h(str, "causeMessage");
    }
}
