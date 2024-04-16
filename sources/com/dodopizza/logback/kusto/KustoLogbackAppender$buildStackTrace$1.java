package com.dodopizza.logback.kusto;

import ch.qos.logback.classic.spi.StackTraceElementProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: KustoLogbackAppender.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "element", "Lch/qos/logback/classic/spi/StackTraceElementProxy;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes2.dex */
final class KustoLogbackAppender$buildStackTrace$1 extends ej5 implements Function1<StackTraceElementProxy, CharSequence> {
    public static final KustoLogbackAppender$buildStackTrace$1 INSTANCE = new KustoLogbackAppender$buildStackTrace$1();

    KustoLogbackAppender$buildStackTrace$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(StackTraceElementProxy stackTraceElementProxy) {
        z65.g(stackTraceElementProxy, "element");
        String sTEAsString = stackTraceElementProxy.getSTEAsString();
        z65.g(sTEAsString, "element.steAsString");
        return sTEAsString;
    }
}
