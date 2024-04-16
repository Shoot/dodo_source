package defpackage;

import defpackage.xb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AllSecureEncryptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lzb;", "Lzo0;", "Lxo0;", "cardCredentials", "", "publicKey", "", "encryptionData", "a", "Lxb$a;", "Lxb$a;", "api", "<init>", "(Lxb$a;)V", "b", "allsecure_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: zb  reason: default package */
/* loaded from: classes.dex */
public final class zb implements zo0 {
    public static final a b = new a(null);
    private final xb.a a;

    /* compiled from: AllSecureEncryptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lzb$a;", "", "", "PUBLIC_KEY", "Ljava/lang/String;", "<init>", "()V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: zb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zb(xb.a aVar) {
        z65.h(aVar, "api");
        this.a = aVar;
    }

    @Override // defpackage.zo0
    public String a(xo0 xo0Var, String str, Map<String, String> map) {
        z65.h(xo0Var, "cardCredentials");
        z65.h(str, "publicKey");
        z65.h(map, "encryptionData");
        return this.a.d(map.get("publicKey")).a().d(new yo0(xo0Var.d(), "CARD HOLDER", xo0Var.a(), xo0Var.b(), xo0Var.c())).a();
    }
}
