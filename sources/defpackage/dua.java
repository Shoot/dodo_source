package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.dto.StateDto;
/* compiled from: StateAnalyzer.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0007H'J\b\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Ldua;", "", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", c.a, "Lru/dodopizza/backend/domain/state/dto/StateDto;", "stateDto", DateTokenConverter.CONVERTER_KEY, "", "b", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dua  reason: default package */
/* loaded from: classes4.dex */
public interface dua {
    void a();

    void b();

    StateEntity c();

    StateEntity d(StateDto stateDto);
}
