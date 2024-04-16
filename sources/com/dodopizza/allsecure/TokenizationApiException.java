package com.dodopizza.allsecure;

import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: TokenizationApiException.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/allsecure/TokenizationApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/dodopizza/allsecure/TokenizationApiException$a;", "a", "Lcom/dodopizza/allsecure/TokenizationApiException$a;", MessageAttributes.TYPE, "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Lcom/dodopizza/allsecure/TokenizationApiException$a;Ljava/lang/String;)V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TokenizationApiException extends Exception {
    private final a a;
    private final String b;

    /* compiled from: TokenizationApiException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/allsecure/TokenizationApiException$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public enum a {
        INVALID_PUBLIC_INTEGRATION_KEY,
        INVALID_TOKEN_KEY,
        INVALID_RESPONSE
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizationApiException(a aVar, String str) {
        super(aVar + ' ' + str);
        z65.h(aVar, MessageAttributes.TYPE);
        z65.h(str, "message");
        this.a = aVar;
        this.b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b;
    }
}
