package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
/* compiled from: SignerFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lpka;", "", "", "algorithm", "Lnka;", "a", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pka  reason: default package */
/* loaded from: classes4.dex */
public interface pka {
    public static final a a = a.a;

    /* compiled from: SignerFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¨\u0006\n"}, d2 = {"Lpka$a;", "", "", "privateKey", "", "password", "Lpka;", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pka$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final pka a(byte[] bArr, String str) {
            z65.h(bArr, "privateKey");
            z65.h(str, "password");
            return new qka(new InputStreamReader(new ByteArrayInputStream(bArr)), str);
        }
    }

    nka a(String str);
}
