package defpackage;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"Ljava/util/Locale;", "locale", "Ldc;", "a", "b", "profile_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: hd  reason: default package */
/* loaded from: classes2.dex */
public final class hd {

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hd$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ Locale a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Locale locale) {
            super(1);
            this.a = locale;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "language_selected", this.a.getLanguage().toString(), false, 4, null);
        }
    }

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hd$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ Locale a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Locale locale) {
            super(1);
            this.a = locale;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "language_selected", this.a.getLanguage().toString(), false, 4, null);
        }
    }

    public static final dc a(Locale locale) {
        z65.h(locale, "locale");
        return ec.a("android_language_list_shown", new a(locale));
    }

    public static final dc b(Locale locale) {
        z65.h(locale, "locale");
        return ec.a("android_switch_language_click", new b(locale));
    }
}
