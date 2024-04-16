package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ForwardingFileSystem.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016R\u0017\u0010\"\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lt54;", "Liu3;", "Lnr7;", "path", "", "functionName", "parameterName", "r", Image.TYPE_SMALL, "Lbu3;", Image.TYPE_MEDIUM, "dir", "", "k", Action.FILE_ATTRIBUTE, "Lwt3;", "n", "Lpqa;", "q", "", "mustCreate", "Lzma;", "p", "mustExist", "b", "", "g", KustoStorage.KustoTable.COLUMN_SOURCE, "target", c.a, "i", "toString", e.a, "Liu3;", "delegate", "()Liu3;", "<init>", "(Liu3;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: t54  reason: default package */
/* loaded from: classes3.dex */
public abstract class t54 extends iu3 {
    private final iu3 e;

    public t54(iu3 iu3Var) {
        z65.h(iu3Var, "delegate");
        this.e = iu3Var;
    }

    @Override // defpackage.iu3
    public zma b(nr7 nr7Var, boolean z) throws IOException {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return this.e.b(r(nr7Var, "appendingSink", Action.FILE_ATTRIBUTE), z);
    }

    @Override // defpackage.iu3
    public void c(nr7 nr7Var, nr7 nr7Var2) throws IOException {
        z65.h(nr7Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(nr7Var2, "target");
        this.e.c(r(nr7Var, "atomicMove", KustoStorage.KustoTable.COLUMN_SOURCE), r(nr7Var2, "atomicMove", "target"));
    }

    @Override // defpackage.iu3
    public void g(nr7 nr7Var, boolean z) throws IOException {
        z65.h(nr7Var, "dir");
        this.e.g(r(nr7Var, "createDirectory", "dir"), z);
    }

    @Override // defpackage.iu3
    public void i(nr7 nr7Var, boolean z) throws IOException {
        z65.h(nr7Var, "path");
        this.e.i(r(nr7Var, "delete", "path"), z);
    }

    @Override // defpackage.iu3
    public List<nr7> k(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, "dir");
        nr7 r = r(nr7Var, StatisticManager.LIST, "dir");
        ArrayList arrayList = new ArrayList();
        for (nr7 nr7Var2 : this.e.k(r)) {
            arrayList.add(s(nr7Var2, StatisticManager.LIST));
        }
        oc1.A(arrayList);
        return arrayList;
    }

    @Override // defpackage.iu3
    public bu3 m(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, "path");
        bu3 m = this.e.m(r(nr7Var, "metadataOrNull", "path"));
        if (m == null) {
            return null;
        }
        if (m.e() == null) {
            return m;
        }
        return bu3.b(m, false, false, s(m.e(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // defpackage.iu3
    public wt3 n(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return this.e.n(r(nr7Var, "openReadOnly", Action.FILE_ATTRIBUTE));
    }

    @Override // defpackage.iu3
    public zma p(nr7 nr7Var, boolean z) throws IOException {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return this.e.p(r(nr7Var, "sink", Action.FILE_ATTRIBUTE), z);
    }

    @Override // defpackage.iu3
    public pqa q(nr7 nr7Var) throws IOException {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return this.e.q(r(nr7Var, KustoStorage.KustoTable.COLUMN_SOURCE, Action.FILE_ATTRIBUTE));
    }

    public nr7 r(nr7 nr7Var, String str, String str2) {
        z65.h(nr7Var, "path");
        z65.h(str, "functionName");
        z65.h(str2, "parameterName");
        return nr7Var;
    }

    public nr7 s(nr7 nr7Var, String str) {
        z65.h(nr7Var, "path");
        z65.h(str, "functionName");
        return nr7Var;
    }

    public String toString() {
        return bc9.b(getClass()).d() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
