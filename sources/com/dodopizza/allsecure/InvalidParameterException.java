package com.dodopizza.allsecure;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* compiled from: InvalidParameterException.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0004\n\u0010B/\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/allsecure/InvalidParameterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/dodopizza/allsecure/InvalidParameterException$c;", "a", "Lcom/dodopizza/allsecure/InvalidParameterException$c;", "getPanError", "()Lcom/dodopizza/allsecure/InvalidParameterException$c;", "panError", "Lcom/dodopizza/allsecure/InvalidParameterException$a;", "b", "Lcom/dodopizza/allsecure/InvalidParameterException$a;", "getCvvError", "()Lcom/dodopizza/allsecure/InvalidParameterException$a;", "cvvError", "Lcom/dodopizza/allsecure/InvalidParameterException$b;", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/allsecure/InvalidParameterException$b;", "getMonthError", "()Lcom/dodopizza/allsecure/InvalidParameterException$b;", "monthError", DateTokenConverter.CONVERTER_KEY, "getYearError", "yearError", "<init>", "(Lcom/dodopizza/allsecure/InvalidParameterException$c;Lcom/dodopizza/allsecure/InvalidParameterException$a;Lcom/dodopizza/allsecure/InvalidParameterException$b;Lcom/dodopizza/allsecure/InvalidParameterException$b;)V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class InvalidParameterException extends Exception {
    private final c a;
    private final a b;
    private final b c;
    private final b d;

    /* compiled from: InvalidParameterException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/allsecure/InvalidParameterException$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public enum a {
        EMPTY,
        INVALID_FORMAT
    }

    /* compiled from: InvalidParameterException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/allsecure/InvalidParameterException$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public enum b {
        EMPTY,
        INVALID_EXPIRATION_DATE,
        EXPIRED
    }

    /* compiled from: InvalidParameterException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/allsecure/InvalidParameterException$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public enum c {
        EMPTY,
        INVALID_LENGTH,
        INVALID_LUHN
    }

    public InvalidParameterException(c cVar, a aVar, b bVar, b bVar2) {
        super("Invalid card parameter");
        this.a = cVar;
        this.b = aVar;
        this.c = bVar;
        this.d = bVar2;
    }
}
