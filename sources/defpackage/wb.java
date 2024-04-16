package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AllSecureAcquirer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lwb;", "Ll4;", "Lxo0;", "cardCredentials", "", "a", "Lzo0;", "cardEncryptor", "<init>", "(Lzo0;)V", DateTokenConverter.CONVERTER_KEY, "allsecure_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: wb  reason: default package */
/* loaded from: classes.dex */
public final class wb extends l4 {
    public static final a d = new a(null);

    /* compiled from: AllSecureAcquirer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lwb$a;", "", "", "ACQUIRER_CODE", "Ljava/lang/String;", "<init>", "()V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: wb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(zo0 zo0Var) {
        super("AllSecure", zo0Var);
        z65.h(zo0Var, "cardEncryptor");
    }

    @Override // defpackage.l4
    public boolean a(xo0 xo0Var) {
        z65.h(xo0Var, "cardCredentials");
        return true;
    }
}
