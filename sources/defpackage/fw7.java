package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.jw7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.clientcard.ClientCardAPI;
import ru.dodopizza.backend.domain.clientcard.dto.RemoveCardRequestDto;
/* compiled from: PaymentServiceFacade.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00103\u001a\u000201¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J>\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J \u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J(\u0010\"\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0016J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102¨\u00066"}, d2 = {"Lfw7;", "Lew7;", "", "cardId", "", "b", "", "Ljw7;", "paymentWays", c.a, "a", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lys7;", "paymentData", "Los7;", "g", "paymentId", "Lxo0;", "cardCredentials", "", "saveCard", "Loh3;", "encryptionData", "", "providerData", "Lqs7;", Image.TYPE_HIGH, "cryptogram", "i", e.a, "Lrs7;", "paymentAuthorization3DS", "paRes", "md", "j", "f", "Lqw7;", "Lqw7;", "paymentWayRepository", "Lsp0;", "Lsp0;", "cardRepository", "Lru/dodopizza/backend/domain/clientcard/ClientCardAPI;", "Lru/dodopizza/backend/domain/clientcard/ClientCardAPI;", "clientCardAPI", "Lvo0;", DateTokenConverter.CONVERTER_KEY, "Lvo0;", "chargeService", "Ltw7;", "Ltw7;", "paymentWayService", "<init>", "(Lqw7;Lsp0;Lru/dodopizza/backend/domain/clientcard/ClientCardAPI;Lvo0;Ltw7;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fw7  reason: default package */
/* loaded from: classes2.dex */
public final class fw7 implements ew7 {
    private final qw7 a;
    private final sp0 b;
    private final ClientCardAPI c;
    private final vo0 d;
    private final tw7 e;

    public fw7(qw7 qw7Var, sp0 sp0Var, ClientCardAPI clientCardAPI, vo0 vo0Var, tw7 tw7Var) {
        z65.h(qw7Var, "paymentWayRepository");
        z65.h(sp0Var, "cardRepository");
        z65.h(clientCardAPI, "clientCardAPI");
        z65.h(vo0Var, "chargeService");
        z65.h(tw7Var, "paymentWayService");
        this.a = qw7Var;
        this.b = sp0Var;
        this.c = clientCardAPI;
        this.d = vo0Var;
        this.e = tw7Var;
    }

    @Override // defpackage.tw7
    public Collection<jw7> a() {
        return this.e.a();
    }

    @Override // defpackage.up0
    public void b(String str) {
        Object obj;
        z65.h(str, "cardId");
        try {
            this.c.removeCard(new RemoveCardRequestDto(str));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.a.b()) {
                if (obj2 instanceof jw7.g) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                p60 i = ((jw7.g) next).i();
                if (i != null) {
                    obj = i.getId();
                }
                if (z65.c(obj, str)) {
                    obj = next;
                    break;
                }
            }
            jw7.g gVar = (jw7.g) obj;
            if (gVar != null) {
                this.a.c(gVar.getId());
            }
            this.b.c(str);
        } catch (Exception unused) {
            throw new IllegalStateException("Can't remove card " + str + ", maybe card already removed");
        }
    }

    @Override // defpackage.tw7
    public void c(Collection<? extends jw7> collection) {
        z65.h(collection, "paymentWays");
        this.e.c(collection);
    }

    @Override // defpackage.vo0
    public qs7 e(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        return this.d.e(str, str2);
    }

    @Override // defpackage.vo0
    public qs7 f(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        return this.d.f(str, str2);
    }

    @Override // defpackage.vo0
    public os7 g(String str, ys7 ys7Var) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(ys7Var, "paymentData");
        return this.d.g(str, ys7Var);
    }

    @Override // defpackage.vo0
    public qs7 h(String str, xo0 xo0Var, boolean z, oh3 oh3Var, Map<String, String> map) {
        z65.h(str, "paymentId");
        z65.h(xo0Var, "cardCredentials");
        z65.h(map, "providerData");
        return this.d.h(str, xo0Var, z, oh3Var, map);
    }

    @Override // defpackage.vo0
    public qs7 i(String str, String str2, boolean z) {
        z65.h(str, "paymentId");
        z65.h(str2, "cryptogram");
        return this.d.i(str, str2, z);
    }

    @Override // defpackage.vo0
    public void j(String str, rs7 rs7Var, String str2, String str3) {
        z65.h(str, "paymentId");
        z65.h(rs7Var, "paymentAuthorization3DS");
        z65.h(str2, "paRes");
        z65.h(str3, "md");
        this.d.j(str, rs7Var, str2, str3);
    }
}
