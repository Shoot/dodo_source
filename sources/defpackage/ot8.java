package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PushObserver.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lot8;", "", "", "streamId", "", "Ldn4;", "requestHeaders", "", "b", "responseHeaders", "last", c.a, "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "byteCount", DateTokenConverter.CONVERTER_KEY, "Lfk3;", "errorCode", "", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ot8  reason: default package */
/* loaded from: classes3.dex */
public interface ot8 {
    public static final a a = a.a;
    public static final ot8 b = new a.C0470a();

    /* compiled from: PushObserver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lot8$a;", "", "Lot8;", "CANCEL", "Lot8;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ot8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* compiled from: PushObserver.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lot8$a$a;", "Lot8;", "", "streamId", "", "Ldn4;", "requestHeaders", "", "b", "responseHeaders", "last", c.a, "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "byteCount", DateTokenConverter.CONVERTER_KEY, "Lfk3;", "errorCode", "", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ot8$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0470a implements ot8 {
            @Override // defpackage.ot8
            public void a(int i, fk3 fk3Var) {
                z65.h(fk3Var, "errorCode");
            }

            @Override // defpackage.ot8
            public boolean b(int i, List<dn4> list) {
                z65.h(list, "requestHeaders");
                return true;
            }

            @Override // defpackage.ot8
            public boolean c(int i, List<dn4> list, boolean z) {
                z65.h(list, "responseHeaders");
                return true;
            }

            @Override // defpackage.ot8
            public boolean d(int i, fh0 fh0Var, int i2, boolean z) throws IOException {
                z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
                fh0Var.skip(i2);
                return true;
            }
        }

        private a() {
        }
    }

    void a(int i, fk3 fk3Var);

    boolean b(int i, List<dn4> list);

    boolean c(int i, List<dn4> list, boolean z);

    boolean d(int i, fh0 fh0Var, int i2, boolean z) throws IOException;
}
