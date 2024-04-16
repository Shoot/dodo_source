package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import defpackage.b3c;
import kotlin.Metadata;
/* compiled from: GooglePaymentsClientWrapper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lfh4;", "", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "isReadyToPayRequest", "", "env", "", "a", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fh4  reason: default package */
/* loaded from: classes2.dex */
public interface fh4 {
    public static final a a = a.a;

    /* compiled from: GooglePaymentsClientWrapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lfh4$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "env", "Lex7;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fh4$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final ex7 a(Context context, String str) {
            int i;
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(str, "env");
            b3c.a.C0064a c0064a = new b3c.a.C0064a();
            if (z65.c(str, "PRODUCTION")) {
                i = 1;
            } else {
                i = 3;
            }
            ex7 a2 = b3c.a(context, c0064a.b(i).c(1).a());
            z65.g(a2, "getPaymentsClient(...)");
            return a2;
        }
    }

    boolean a(IsReadyToPayRequest isReadyToPayRequest, String str);
}
